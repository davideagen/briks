
package com.biw.briks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.biw.briks.domain.Organization;
import com.biw.briks.repository.OrganizationRepository;

@Component
public class OrganizationService
{

  @Autowired
  OrganizationRepository orgRepository;

  public Organization findByOrgId( Long orgId )
  {
    return orgRepository.findOne( orgId );
  }

  public Organization findByOrgName( String orgName )
  {
    return orgRepository.findByOrgName( orgName );
  }

  public Organization findByOrgCode( String orgCode )
  {
    return orgRepository.findByOrgCode( orgCode );
  }
}
