package com.inkubator.hrm.entity;
// Generated Mar 6, 2014 12:14:43 PM by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * LoginHistory generated by hbm2java
 */
@Entity
@Table(name="login_history"
    ,catalog="hrm"
)
public class LoginHistory  implements java.io.Serializable {


     private long id;
     private String userName;
     private Date loginDate;
     private Date logOutDate;
     private String ipAddress;
     private String bahasa;

    public LoginHistory() {
    }

	
    public LoginHistory(long id) {
        this.id = id;
    }
    public LoginHistory(long id, String userName, Date loginDate, Date logOutDate, String ipAddress, String bahasa) {
       this.id = id;
       this.userName = userName;
       this.loginDate = loginDate;
       this.logOutDate = logOutDate;
       this.ipAddress = ipAddress;
       this.bahasa = bahasa;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

    
    @Column(name="USER_NAME", length=45)
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="LOGIN_DATE", length=19)
    public Date getLoginDate() {
        return this.loginDate;
    }
    
    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="LOG_OUT_DATE", length=19)
    public Date getLogOutDate() {
        return this.logOutDate;
    }
    
    public void setLogOutDate(Date logOutDate) {
        this.logOutDate = logOutDate;
    }

    
    @Column(name="IP_ADDRESS", length=45)
    public String getIpAddress() {
        return this.ipAddress;
    }
    
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    
    @Column(name="BAHASA", length=5)
    public String getBahasa() {
        return this.bahasa;
    }
    
    public void setBahasa(String bahasa) {
        this.bahasa = bahasa;
    }




}


