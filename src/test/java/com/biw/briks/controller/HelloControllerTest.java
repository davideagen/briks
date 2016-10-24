
package com.biw.briks.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.biw.briks.BriksApplication;

@RunWith( SpringRunner.class )
@SpringBootTest( webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = BriksApplication.class )
public class HelloControllerTest
{

  @Autowired
  private TestRestTemplate restTemplate;

  @Test
  public void helloWorldTest()
  {
    ResponseEntity<HelloWorldResponse> fact = restTemplate.getForEntity( "/briks/service/hello", HelloWorldResponse.class );
    assertNotNull( fact.getBody() );
    assertEquals( fact.getBody().getMessage(), "Hello World !!!" );
  }

}