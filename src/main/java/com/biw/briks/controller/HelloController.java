
package com.biw.briks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.biw.briks.domain.Organization;
import com.biw.briks.service.OrganizationService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api( value = "Hello Service", description = "Just a simple Hello world service" )
@RequestMapping( value = "/services/" )
public class HelloController
{

  @Autowired
  OrganizationService orgDAO;

  @ApiOperation( value = "Audience Criteria Options", notes = "Audience Criteria Options" )
  @RequestMapping( value = "/hello", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
  public HelloWorldResponse hello()
  {
    Organization organization = orgDAO.findByOrgId( 1L );
    return new HelloWorldResponse();
  }

}
