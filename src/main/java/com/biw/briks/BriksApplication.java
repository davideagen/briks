
package com.biw.briks;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BriksApplication
{

  private static final Logger LOGGER = LoggerFactory.getLogger( BriksApplication.class );

  public static void main( String[] args )
  {
    LOGGER.info( "Starting Briks application" );
    ConfigurableApplicationContext ctx = SpringApplication.run( BriksApplication.class, args );

    LOGGER.debug( "Let's inspect the beans provided by Spring Boot:" );

    String[] beanNames = ctx.getBeanDefinitionNames();
    Arrays.sort( beanNames );
    for ( String beanName : beanNames )
    {
      LOGGER.debug( beanName );
    }
  }

}