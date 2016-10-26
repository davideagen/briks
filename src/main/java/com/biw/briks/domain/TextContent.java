
package com.biw.briks.domain;

import java.util.Locale;

public class TextContent
{
  private Locale locale = Locale.getDefault();
  private String text = null;

  public Locale getLocale()
  {
    return locale;
  }

  public void setLocale( Locale locale )
  {
    this.locale = locale;
  }

  public String getText()
  {
    return text;
  }

  public void setText( String text )
  {
    this.text = text;
  }
}