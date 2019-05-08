package tnSpringHibernate.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * The configuration file loads the file with the application-context.xml files.
 */
@Configuration
@ImportResource({"classpath:application-context.xml"})
public class XmlConfig {
}
