
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
@Table( name = "FORM_SET" )
public class FormSet extends BaseEntity
{
  private static final long serialVersionUID = 1L;

  @Id
  @SequenceGenerator( name = "FORM_SET_ID_GENERATOR", sequenceName = "FORM_SET_SEQ", allocationSize = 1 )
  @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "FORM_SET_ID_GENERATOR" )
  private Long id;

  @Column( name = "LABEL" )
  private String label;
  
  @Column( name = "DISPLAY_ORDER" )// "ORDER" is a resevrved word
  private int order;
  
  @Column( name = "FORM_ID" )
  private Long formId;

  //@JsonBackReference( value = "applicationForms" )
  @ManyToOne( fetch = FetchType.LAZY )
  @JoinColumn( name = "FORM_ID", referencedColumnName = "id", insertable = false, updatable = false )
  private Form form;
  
  //@JsonManagedReference( value = "applicationForms" )
  @OneToMany( mappedBy = "formSet", fetch = FetchType.LAZY, cascade = CascadeType.ALL )
  private Set<FormElement> formElements;

  public Long getId()
  {
    return id;
  }

  public void setId( Long id )
  {
    this.id = id;
  }

  public String getLabel()
  {
    return label;
  }

  public void setLabel( String label )
  {
    this.label = label;
  }

  public int getOrder()
  {
    return order;
  }

  public void setOrder( int order )
  {
    this.order = order;
  }

  public Form getForm()
  {
    return form;
  }

  public void setForm( Form form )
  {
    this.form = form;
  }

  public Set<FormElement> getFormElements()
  {
    return formElements;
  }

  public void setFormElements( Set<FormElement> formElements )
  {
    this.formElements = formElements;
  }

  public Long getFormId()
  {
    return formId;
  }

  public void setFormId( Long formId )
  {
    this.formId = formId;
  }
}
