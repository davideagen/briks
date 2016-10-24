
package com.biw.briks.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.biw.briks.controller.HelloController.HelloWorldResponse;

@RunWith( SpringRunner.class )
@SpringBootTest
public class HelloControllerTest
{

  @Autowired
  private TestRestTemplate restTemplate;

  @Test
  public void helloWorldTest()
  {
    HelloWorldResponse body = this.restTemplate.getForObject( "/sevices/hello", HelloWorldResponse.class );
    assertThat( body.getMessage() ).isEqualTo( "Hello World" );
  }

}