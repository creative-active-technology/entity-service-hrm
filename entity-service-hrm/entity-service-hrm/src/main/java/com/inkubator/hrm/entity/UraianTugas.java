package com.inkubator.hrm.entity;
// Generated Mar 6, 2014 12:14:43 PM by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * UraianTugas generated by hbm2java
 */
@Entity
@Table(name="uraian_tugas"
    ,catalog="hrm"
)
public class UraianTugas  implements java.io.Serializable {


     private long id;
     private Integer version;
     private Position position;
     private String uraianTugas;
     private Double faktorNilai;
     private Integer skalaPrioritas;
     private Double skalaNilai;
     private String createdBy;
     private Date createdOn;
     private String updatedBy;
     private Date updatedOn;

    public UraianTugas() {
    }

	
    public UraianTugas(long id) {
        this.id = id;
    }
    public UraianTugas(long id, Position position, String uraianTugas, Double faktorNilai, Integer skalaPrioritas, Double skalaNilai, String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
       this.id = id;
       this.position = position;
       this.uraianTugas = uraianTugas;
       this.faktorNilai = faktorNilai;
       this.skalaPrioritas = skalaPrioritas;
       this.skalaNilai = skalaNilai;
       this.createdBy = createdBy;
       this.createdOn = createdOn;
       this.updatedBy = updatedBy;
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

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="position_id")
    public Position getPosition() {
        return this.position;
    }
    
    public void setPosition(Position position) {
        this.position = position;
    }

    
    @Column(name="uraian_tugas", length=65535)
    public String getUraianTugas() {
        return this.uraianTugas;
    }
    
    public void setUraianTugas(String uraianTugas) {
        this.uraianTugas = uraianTugas;
    }

    
    @Column(name="faktor_nilai", precision=22, scale=0)
    public Double getFaktorNilai() {
        return this.faktorNilai;
    }
    
    public void setFaktorNilai(Double faktorNilai) {
        this.faktorNilai = faktorNilai;
    }

    
    @Column(name="skala_prioritas")
    public Integer getSkalaPrioritas() {
        return this.skalaPrioritas;
    }
    
    public void setSkalaPrioritas(Integer skalaPrioritas) {
        this.skalaPrioritas = skalaPrioritas;
    }

    
    @Column(name="skala_nilai", precision=22, scale=0)
    public Double getSkalaNilai() {
        return this.skalaNilai;
    }
    
    public void setSkalaNilai(Double skalaNilai) {
        this.skalaNilai = skalaNilai;
    }

    
    @Column(name="created_by", length=45)
    public String getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_on", length=19)
    public Date getCreatedOn() {
        return this.createdOn;
    }
    
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    
    @Column(name="updated_by", length=45)
    public String getUpdatedBy() {
        return this.updatedBy;
    }
    
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
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


