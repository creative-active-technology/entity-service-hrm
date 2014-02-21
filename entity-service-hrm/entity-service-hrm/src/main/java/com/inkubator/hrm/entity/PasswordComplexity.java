package com.inkubator.hrm.entity;
// Generated Feb 20, 2014 2:53:00 PM by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

/**
 * PasswordComplexity generated by hbm2java
 */
@Entity
@Table(name="password_complexity"
    ,catalog="hrm"
    , uniqueConstraints = @UniqueConstraint(columnNames="code") 
)
public class PasswordComplexity  implements java.io.Serializable {


     private long id;
     private Integer version;
     private String code;
     private Integer hasNumber;
     private Integer hasSpecialCharacter;
     private Integer hasUpperCase;
     private Integer hasLowerCase;
     private Integer minCharacter;
     private Integer maxCharacter;
     private String createdBy;
     private String updatedBy;
     private Date createdOn;
     private Date updatedOn;

    public PasswordComplexity() {
    }

	
    public PasswordComplexity(long id) {
        this.id = id;
    }
    public PasswordComplexity(long id, String code, Integer hasNumber, Integer hasSpecialCharacter, Integer hasUpperCase, Integer hasLowerCase, Integer minCharacter, Integer maxCharacter, String createdBy, String updatedBy, Date createdOn, Date updatedOn) {
       this.id = id;
       this.code = code;
       this.hasNumber = hasNumber;
       this.hasSpecialCharacter = hasSpecialCharacter;
       this.hasUpperCase = hasUpperCase;
       this.hasLowerCase = hasLowerCase;
       this.minCharacter = minCharacter;
       this.maxCharacter = maxCharacter;
       this.createdBy = createdBy;
       this.updatedBy = updatedBy;
       this.createdOn = createdOn;
       this.updatedOn = updatedOn;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

    @Version
    @Column(name="version")
    public Integer getVersion() {
        return this.version;
    }
    
    public void setVersion(Integer version) {
        this.version = version;
    }

    
    @Column(name="code", unique=true, length=45)
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    
    @Column(name="has_number")
    public Integer getHasNumber() {
        return this.hasNumber;
    }
    
    public void setHasNumber(Integer hasNumber) {
        this.hasNumber = hasNumber;
    }

    
    @Column(name="has_special_character")
    public Integer getHasSpecialCharacter() {
        return this.hasSpecialCharacter;
    }
    
    public void setHasSpecialCharacter(Integer hasSpecialCharacter) {
        this.hasSpecialCharacter = hasSpecialCharacter;
    }

    
    @Column(name="has_upper_case")
    public Integer getHasUpperCase() {
        return this.hasUpperCase;
    }
    
    public void setHasUpperCase(Integer hasUpperCase) {
        this.hasUpperCase = hasUpperCase;
    }

    
    @Column(name="has_lower_case")
    public Integer getHasLowerCase() {
        return this.hasLowerCase;
    }
    
    public void setHasLowerCase(Integer hasLowerCase) {
        this.hasLowerCase = hasLowerCase;
    }

    
    @Column(name="min_character")
    public Integer getMinCharacter() {
        return this.minCharacter;
    }
    
    public void setMinCharacter(Integer minCharacter) {
        this.minCharacter = minCharacter;
    }

    
    @Column(name="max_character")
    public Integer getMaxCharacter() {
        return this.maxCharacter;
    }
    
    public void setMaxCharacter(Integer maxCharacter) {
        this.maxCharacter = maxCharacter;
    }

    
    @Column(name="created_by", length=45)
    public String getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    
    @Column(name="updated_by", length=45)
    public String getUpdatedBy() {
        return this.updatedBy;
    }
    
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_on", length=19)
    public Date getCreatedOn() {
        return this.createdOn;
    }
    
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="updated_on", length=19)
    public Date getUpdatedOn() {
        return this.updatedOn;
    }
    
    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }




}


