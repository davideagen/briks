
package com.biw.briks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biw.briks.domain.Organization;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long>
{

  public Organization findByOrgName( String orgName );

  public Organization findByOrgCode( String orgCode );
}
