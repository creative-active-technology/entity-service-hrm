/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.inkubator.hrm.web.search;

import com.inkubator.webcore.util.SearchParameter;

/**
 *
 * @author Deni Husni FR
 */
public class PositionSearchParameter extends SearchParameter{
    private String positionCode;
    private String parentCode;
    private String departementName;
    private String educationName;
    private String nomorSk;
    private String costCenterCode;
    private String costCenterName;
    private String gradeName;
    private String golonganJabatanName;
    

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getDepartementName() {
        return departementName;
    }

    public void setDepartementName(String departementName) {
        this.departementName = departementName;
    }

    public String getEducationName() {
        return educationName;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName;
    }

    public String getNomorSk() {
        return nomorSk;
    }

    public void setNomorSk(String nomorSk) {
        this.nomorSk = nomorSk;
    }

    public String getCostCenterCode() {
        return costCenterCode;
    }

    public void setCostCenterCode(String costCenterCode) {
        this.costCenterCode = costCenterCode;
    }

    public String getCostCenterName() {
        return costCenterName;
    }

    public void setCostCenterName(String costCenterName) {
        this.costCenterName = costCenterName;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public String getGolonganJabatanName() {
        return golonganJabatanName;
    }

    public void setGolonganJabatanName(String golonganJabatanName) {
        this.golonganJabatanName = golonganJabatanName;
    }
    
    
}
