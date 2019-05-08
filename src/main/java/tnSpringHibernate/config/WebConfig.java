package tnSpringHibernate.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import tnSpringHibernate.models.Delivery;

/**
 * The configuration file, packet scanning with entities(beans)
 */
@Configuration
@EnableWebMvc //<mvc:annotation-driven />
@ComponentScan("tnSpringHibernate.models")
public class WebConfig implements WebMvcConfigurer {

    /*@Bean
    public Delivery deliveryBean() {
        return new Delivery();
    }*/

    /*
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }*/

    /**
     * Package definition with jsp pages.
     * @return
     */
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/templates/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }

    /**
     * Controller definition without implementation, for redirection to view.
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("myhome");
    }

    /**
     * Definition of a package with statics
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**")
                .addResourceLocations("/static/");
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("/resources/");
    }

}

