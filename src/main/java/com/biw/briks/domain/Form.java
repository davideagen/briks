
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

@Entity
@Table( name = "FORM" )
public class Form extends BaseEntity
{
  private static final long serialVersionUID = 1L;

  @Id
  @SequenceGenerator( name = "FORM_ID_GENERATOR", sequenceName = "FORM_SEQ", allocationSize = 1 )
  @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "FORM_ID_GENERATOR" )
  private Long id;

  @Column( name = "NAME" )
  private String name;
  @Column( name = "DESCRIPTION" )
  private String description;
  @Column( name = "APP_ID" )
  private Long appId;

  @ManyToOne( fetch = FetchType.LAZY )
  @JoinColumn( name = "APP_ID", referencedColumnName = "id", insertable = false, updatable = false )
  private Application application;

  @OneToMany( mappedBy = "form", fetch = FetchType.LAZY, cascade = CascadeType.ALL )
  private Set<FormSet> formSets;
  
  public Long getFormId()
  {
    return id;
  }

  public void setFormId( Long formId )
  {
    this.id = formId;
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

  public Long getAppId()
  {
    return appId;
  }

  public void setAppId( Long appId )
  {
    this.appId = appId;
  }

  public Application getApplication()
  {
    return application;
  }

  public void setApplication( Application application )
  {
    this.application = application;
  }

}
