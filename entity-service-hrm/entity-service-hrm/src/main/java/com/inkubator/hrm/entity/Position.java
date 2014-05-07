package com.inkubator.hrm.entity;
// Generated Mar 6, 2014 12:14:43 PM by Hibernate Tools 3.6.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * Position generated by hbm2java
 */
@Entity
@Table(name = "position", catalog = "hrm"
)
public class Position implements java.io.Serializable {

    private long id;
    private Integer version;
    private SkJabatan skJabatan;
    private Position position;
    private EducationLevel educationLevel;
    private PosBiaya posBiaya;
    private GolonganJabatan golonganJabatan;
    private Department department;
    private Grade grade;
    private String positionCode;
    private String level;
    private String mainJob;
    private String desciprtion;
    private String createdBy;
    private Date createdOn;
    private String updatedBy;
    private Date updatedOn;
    private Set<Position> positions = new HashSet<Position>(0);
    private Set<PhysicalAbilityPosition> physicalAbilityPositions = new HashSet<PhysicalAbilityPosition>(0);
    private Set<UraianTugas> uraianTugases = new HashSet<UraianTugas>(0);

    public Position() {
    }

    public Position(long id) {
        this.id = id;
    }

    public Position(long id, SkJabatan skJabatan, Position position, EducationLevel educationLevel, PosBiaya posBiaya, GolonganJabatan golonganJabatan, Department department, Grade grade, String positionCode, String level, String mainJob, String desciprtion, String createdBy, Date createdOn, String updatedBy, Date updatedOn, Set<Position> positions, Set<PhysicalAbilityPosition> physicalAbilityPositions, Set<UraianTugas> uraianTugases) {
        this.id = id;
        this.skJabatan = skJabatan;
        this.position = position;
        this.educationLevel = educationLevel;
        this.posBiaya = posBiaya;
        this.golonganJabatan = golonganJabatan;
        this.department = department;
        this.grade = grade;
        this.positionCode = positionCode;
        this.level = level;
        this.mainJob = mainJob;
        this.desciprtion = desciprtion;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.updatedBy = updatedBy;
        this.updatedOn = updatedOn;
        this.positions = positions;
        this.physicalAbilityPositions = physicalAbilityPositions;
        this.uraianTugases = uraianTugases;
    }

    @Id

    @Column(name = "id", unique = true, nullable = false)
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Version
    @Column(name = "version")
    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sk_id")
    public SkJabatan getSkJabatan() {
        return this.skJabatan;
    }

    public void setSkJabatan(SkJabatan skJabatan) {
        this.skJabatan = skJabatan;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    public Position getPosition() {
        return this.position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "education_id")
    public EducationLevel getEducationLevel() {
        return this.educationLevel;
    }

    public void setEducationLevel(EducationLevel educationLevel) {
        this.educationLevel = educationLevel;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cost_center_id")
    public PosBiaya getPosBiaya() {
        return this.posBiaya;
    }

    public void setPosBiaya(PosBiaya posBiaya) {
        this.posBiaya = posBiaya;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gol_jabatan_id")
    public GolonganJabatan getGolonganJabatan() {
        return this.golonganJabatan;
    }

    public void setGolonganJabatan(GolonganJabatan golonganJabatan) {
        this.golonganJabatan = golonganJabatan;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "grade_id")
    public Grade getGrade() {
        return this.grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Column(name = "position_code", length = 8)
    public String getPositionCode() {
        return this.positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode;
    }

    @Column(name = "level", length = 45)
    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Column(name = "main_job", length = 45)
    public String getMainJob() {
        return this.mainJob;
    }

    public void setMainJob(String mainJob) {
        this.mainJob = mainJob;
    }

    @Column(name = "desciprtion", length = 65535)
    public String getDesciprtion() {
        return this.desciprtion;
    }

    public void setDesciprtion(String desciprtion) {
        this.desciprtion = desciprtion;
    }

    @Column(name = "created_by", length = 45)
    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_on", length = 19)
    public Date getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @Column(name = "updated_by", length = 45)
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_on", length = 19)
    public Date getUpdatedOn() {
        return this.updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "position")
    public Set<Position> getPositions() {
        return this.positions;
    }

    public void setPositions(Set<Position> positions) {
        this.positions = positions;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "position")
    public Set<PhysicalAbilityPosition> getPhysicalAbilityPositions() {
        return this.physicalAbilityPositions;
    }

    public void setPhysicalAbilityPositions(Set<PhysicalAbilityPosition> physicalAbilityPositions) {
        this.physicalAbilityPositions = physicalAbilityPositions;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "position")
    public Set<UraianTugas> getUraianTugases() {
        return this.uraianTugases;
    }

    public void setUraianTugases(Set<UraianTugas> uraianTugases) {
        this.uraianTugases = uraianTugases;
    }

}