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
 * ApprovalActivity generated by hbm2java
 */
@Entity
@Table(name="approval_activity"
    ,catalog="hrm"
)
public class ApprovalActivity  implements java.io.Serializable {


     private long id;
     private Integer version;
     private ApprovalDefinition approvalDefinition;
     private String approvalRequest;
     private Integer approvalStatus;
     private Date approvalTime;
     private String approvedBy;
     private String approvalCommment;
     private Integer approvalCount;
     private Integer rejectCount;
     private String pendingData;

    public ApprovalActivity() {
    }

	
    public ApprovalActivity(long id) {
        this.id = id;
    }
    public ApprovalActivity(long id, ApprovalDefinition approvalDefinition, String approvalRequest, Integer approvalStatus, Date approvalTime, String approvedBy, String approvalCommment, Integer approvalCount, Integer rejectCount, String pendingData) {
       this.id = id;
       this.approvalDefinition = approvalDefinition;
       this.approvalRequest = approvalRequest;
       this.approvalStatus = approvalStatus;
       this.approvalTime = approvalTime;
       this.approvedBy = approvedBy;
       this.approvalCommment = approvalCommment;
       this.approvalCount = approvalCount;
       this.rejectCount = rejectCount;
       this.pendingData = pendingData;
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
    @JoinColumn(name="approval_def_id")
    public ApprovalDefinition getApprovalDefinition() {
        return this.approvalDefinition;
    }
    
    public void setApprovalDefinition(ApprovalDefinition approvalDefinition) {
        this.approvalDefinition = approvalDefinition;
    }

    
    @Column(name="approval_request", length=45)
    public String getApprovalRequest() {
        return this.approvalRequest;
    }
    
    public void setApprovalRequest(String approvalRequest) {
        this.approvalRequest = approvalRequest;
    }

    
    @Column(name="approval_status")
    public Integer getApprovalStatus() {
        return this.approvalStatus;
    }
    
    public void setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="approval_time", length=19)
    public Date getApprovalTime() {
        return this.approvalTime;
    }
    
    public void setApprovalTime(Date approvalTime) {
        this.approvalTime = approvalTime;
    }

    
    @Column(name="approved_by", length=45)
    public String getApprovedBy() {
        return this.approvedBy;
    }
    
    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    
    @Column(name="approval_commment", length=65535)
    public String getApprovalCommment() {
        return this.approvalCommment;
    }
    
    public void setApprovalCommment(String approvalCommment) {
        this.approvalCommment = approvalCommment;
    }

    
    @Column(name="approval_count")
    public Integer getApprovalCount() {
        return this.approvalCount;
    }
    
    public void setApprovalCount(Integer approvalCount) {
        this.approvalCount = approvalCount;
    }

    
    @Column(name="reject_count")
    public Integer getRejectCount() {
        return this.rejectCount;
    }
    
    public void setRejectCount(Integer rejectCount) {
        this.rejectCount = rejectCount;
    }

    
    @Column(name="pending_data", length=65535)
    public String getPendingData() {
        return this.pendingData;
    }
    
    public void setPendingData(String pendingData) {
        this.pendingData = pendingData;
    }




}


