package tnSpringHibernate.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * TODO: realization
 */

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    // @Autowired
    // private UserService userService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/form/add", "/shops", "/registration").permitAll()
                .anyRequest().authenticated()
                .and()
                .httpBasic()
                .and()
                .csrf();
       /* http.formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
            .logout()
                .permitAll(); */

        /* http.addFilterAfter(new CustomFilter(),
                BasicAuthenticationFilter.class); */
    }

}
