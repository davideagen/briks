
package com.biw.briks.core.enums;

public enum FormElementType
{
  TEXT_BOX( "text_box" ), 
  TEXT_AREA( "text_area" ),
  ;

  private final String type;

  private FormElementType( final String type )
  {
    this.type = type;
  }

  @Override
  public String toString()
  {
    return type;
  }
}