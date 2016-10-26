
package com.biw.briks.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table( name = "FORM_ELEMENT_VALUE" )
public class FormElementValue extends BaseEntity
{
  private static final long serialVersionUID = 1L;

  @Id
  @SequenceGenerator( name = "FORM_ELEMENT_VALUE_ID_GENERATOR", sequenceName = "FORM_ELEMENT_VALUE_SEQ", allocationSize = 1 )
  @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "FORM_ELEMENT_VALUE_ID_GENERATOR" )
  private Long id;

  @Column( name = "LABEL" )
  private String label = null ;
  @Column( name = "VALUE" )
  private String value = null ;
  @Column( name = "DISPLAY_ORDER" )
  private int order = 0 ;
  
  @ManyToOne( fetch = FetchType.LAZY )
  @JoinColumn( name = "FORM_ELEMENT_ID", referencedColumnName = "id", insertable = false, updatable = false )
  private FormElement formElement;

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

  public String getValue()
  {
    return value;
  }

  public void setValue( String value )
  {
    this.value = value;
  }

  public int getOrder()
  {
    return order;
  }

  public void setOrder( int order )
  {
    this.order = order;
  }

  public FormElement getFormElement()
  {
    return formElement;
  }

  public void setFormElement( FormElement formElement )
  {
    this.formElement = formElement;
  }
}

