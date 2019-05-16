package tnSpringHibernate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * The configuration file, packet scanning with entities(beans)
 */
@Configuration
@EnableWebMvc //<mvc:annotation-driven />
@ComponentScan("tnSpringHibernate")
public class WebConfig implements WebMvcConfigurer {

    /*@Bean
    public Shop shopBean() {
        return new Shop();
    }*/
    /*@Bean
    public Delivery deliveryBean() {
        return new Delivery();
    }*/


    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    /**
     * Package definition with jsp pages.
     * @return
     */
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/pages/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }

    /**
     * Controller definition without implementation, for redirection to view.
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("helloworld");
    }

    /**
     * Definition of a package with statics
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        /*registry.addResourceHandler("/static/**")
                .addResourceLocations("/static/");
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("/resources/");*/
    }

}

