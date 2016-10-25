
package com.biw.briks.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@XmlRootElement
@MappedSuperclass
@EntityListeners( { AuditingEntityListener.class } )
public class BaseEntity implements Serializable
{

  @Transient
  private Long createdUserId;

  @CreatedDate
  @Column( name = "date_created" )
  @Temporal( TemporalType.TIMESTAMP )
  private Date dateCreated;

  @LastModifiedDate
  @Column( name = "date_modified" )
  @Temporal( TemporalType.TIMESTAMP )
  private Date dateModified;

  @CreatedBy
  @Column( name = "created_by" )
  private Long createdBy;

  @LastModifiedBy
  @Column( name = "modified_by" )
  private Long modifiedBy;

  @Column( name = "version" )
  @Version
  private Long version;

  public Long getCreatedUserId()
  {
    return createdUserId;
  }

  public void setCreatedUserId( Long createdUserId )
  {
    this.createdUserId = createdUserId;
  }

  public Date getDateCreated()
  {
    return dateCreated;
  }

  public void setDateCreated( Date dateCreated )
  {
    this.dateCreated = dateCreated;
  }

  public Date getDateModified()
  {
    return dateModified;
  }

  public void setDateModified( Date dateModified )
  {
    this.dateModified = dateModified;
  }

  public Long getCreatedBy()
  {
    return createdBy;
  }

  public void setCreatedBy( Long createdBy )
  {
    this.createdBy = createdBy;
  }

  public Long getModifiedBy()
  {
    return modifiedBy;
  }

  public void setModifiedBy( Long modifiedBy )
  {
    this.modifiedBy = modifiedBy;
  }

  public Long getVersion()
  {
    return version;
  }

  public void setVersion( Long version )
  {
    this.version = version;
  }
}