
package com.biw.briks.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table( name = "ORGANIZATION" )
public class Organization extends BaseEntity
{
  private static final long serialVersionUID = 1L;

  @Id
  @SequenceGenerator( name = "ORG_ID_GENERATOR", sequenceName = "ORG_SEQ", allocationSize = 1 )
  @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "ORG_ID_GENERATOR" )
  private Long id;

  @Column( name = "ORG_NAME" )
  private String orgName;
  @Column( name = "ORG_CODE" )
  private String orgCode;

  // bi-directional one-to-many association to Application
  @JsonManagedReference( value = "organizationApplications" )
  @OneToMany( mappedBy = "organization", fetch = FetchType.LAZY, cascade = CascadeType.ALL )
  private Set<Application> applications;

  public Long getOrgId()
  {
    return id;
  }

  public void setOrgId( Long orgId )
  {
    this.id = orgId;
  }

  public String getOrgName()
  {
    return orgName;
  }

  public void setOrgName( String orgName )
  {
    this.orgName = orgName;
  }

  public String getOrgCode()
  {
    return orgCode;
  }

  public void setOrgCode( String orgCode )
  {
    this.orgCode = orgCode;
  }

  public Set<Application> getApplications()
  {
    return applications;
  }

  public void setApplications( Set<Application> applications )
  {
    this.applications = applications;
  }

}
