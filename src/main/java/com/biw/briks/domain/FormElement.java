
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

import com.biw.briks.core.enums.FormElementType;

@Entity
@Table( name = "FORM_ELEMENT" )
public class FormElement extends BaseEntity
{
  private static final long serialVersionUID = 1L;

  @Id
  @SequenceGenerator( name = "FORM_ELEMENT_ID_GENERATOR", sequenceName = "FORM_ELEMENT_SEQ", allocationSize = 1 )
  @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "FORM_ELEMENT_ID_GENERATOR" )
  private Long id;

  @Column( name = "ELEMENT_TYPE" )
  private FormElementType type = null ;
  @Column( name = "LABEL" )
  private String label = null ;
  @Column( name = "NAME" )
  private String name = null ;
  @Column( name = "DISPLAY_ORDER" )
  private int order = 0 ;
  
  // bi-directional many-to-one association to Application
  //@JsonBackReference( value = "applicationForms" )
  @ManyToOne( fetch = FetchType.LAZY )
  @JoinColumn( name = "FORM_SET_ID", referencedColumnName = "id", insertable = false, updatable = false )
  private FormSet formSet;
  
  @OneToMany( mappedBy = "formElement", fetch = FetchType.LAZY, cascade = CascadeType.ALL )
  private Set<FormElementValue> formElementValues;

  public Long getId()
  {
    return id;
  }

  public void setId( Long id )
  {
    this.id = id;
  }

  public FormSet getFormSet()
  {
    return formSet;
  }

  public void setFormSet( FormSet formSet )
  {
    this.formSet = formSet;
  }
}

