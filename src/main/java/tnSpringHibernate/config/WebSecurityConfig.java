package tnSpringHibernate.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import tnSpringHibernate.listeners.ModelResponse;
import tnSpringHibernate.listeners.RestExceptionHandler;

/**
 * TODO: realization
 */

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private RestExceptionHandler restExceptionHandler;

    // @Autowired
    // private UserService userService;

    @Bean
    RestExceptionHandler customException() {
        return new RestExceptionHandler();
    }

    @Autowired
    private ModelResponse modelResponse;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // http.exceptionHandling().accessDeniedHandler((AccessDeniedHandler) new ModelResponse().responseEntity(null, "Success", null, null));
        http.authorizeRequests()
                .antMatchers("/shops").authenticated()
                .anyRequest().authenticated()
                .and()
                .httpBasic()
                .and()
                .csrf().disable();
       /* http.formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
            .logout()
                .permitAll(); */

        /* http.addFilterAfter(new CustomFilter(),
                BasicAuthenticationFilter.class); */
    }

    @Configuration
    protected static class AuthenticationConfiguration extends
            GlobalAuthenticationConfigurerAdapter {

        @Override
        public void init(AuthenticationManagerBuilder auth) throws Exception {
            auth
                    .inMemoryAuthentication()
                    .withUser("user").password(encoder().encode("password")).roles("USER");
        }

    }

    @Bean
    public static PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

}
