
package com.biw.briks.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table( name = "APPLICATION" )
public class Application extends BaseEntity
{
  private static final long serialVersionUID = 1L;

  @Id
  @SequenceGenerator( name = "APP_ID_GENERATOR", sequenceName = "APP_SEQ", allocationSize = 1 )
  @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "APP_ID_GENERATOR" )
  private Long id;

  @Column( name = "NAME" )
  private String name;
  @Column( name = "DESCRIPTION" )
  private String description;
  @Column( name = "ORG_ID" )
  private Long orgId;

  // bi-directional many-to-one association to Organization
  //@JsonBackReference( value = "organizationApplications" )
  @ManyToOne( fetch = FetchType.LAZY )
  @JoinColumn( name = "ORG_ID", referencedColumnName = "id", insertable = false, updatable = false )
  private Organization organization;

  // bi-directional one-to-many association to Form
  //@JsonManagedReference( value = "applicationForms" )
  @OneToMany( mappedBy = "application", fetch = FetchType.LAZY, cascade = CascadeType.ALL )
  private Set<Form> forms;

  public Long getAppId()
  {
    return id;
  }

  public void setAppId( Long appId )
  {
    this.id = appId;
  }

  public String getName()
  {
    return name;
  }

  public void setName( String name )
  {
    this.name = name;
  }

  public String getDescription()
  {
    return description;
  }

  public void setDescription( String description )
  {
    this.description = description;
  }

  public Long getOrgId()
  {
    return orgId;
  }

  public void setOrgId( Long orgId )
  {
    this.orgId = orgId;
  }

  public Organization getOrganization()
  {
    return organization;
  }

  public void setOrganization( Organization organization )
  {
    this.organization = organization;
  }

  public Set<Form> getForms()
  {
    return forms;
  }

  public void setForms( Set<Form> forms )
  {
    this.forms = forms;
  }

}
