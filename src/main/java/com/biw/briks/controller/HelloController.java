
package com.biw.briks.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api( value = "Hello Service", description = "Just a simple Hello world service" )
@RequestMapping( value = "/services/" )
public class HelloController
{

  @ApiOperation( value = "Audience Criteria Options", notes = "Audience Criteria Options" )
  @RequestMapping( value = "/hello", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
  public HelloWorldResponse hello()
  {
    return new HelloWorldResponse();
  }
  
}
