/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.inkubator.hrm.web.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Deni Husni FR
 */
public class LoginHistoryChartModel implements Serializable{
    private String weekofLogin;
    private Long totalLogin;

    public String getWeekofLogin() {
        return weekofLogin;
    }

    public void setWeekofLogin(String weekofLogin) {
        this.weekofLogin = weekofLogin;
    }

    public Long getTotalLogin() {
        return totalLogin;
    }

    public void setTotalLogin(Long totalLogin) {
        this.totalLogin = totalLogin;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.weekofLogin);
        hash = 29 * hash + Objects.hashCode(this.totalLogin);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LoginHistoryChartModel other = (LoginHistoryChartModel) obj;
        if (!Objects.equals(this.weekofLogin, other.weekofLogin)) {
            return false;
        }
        if (!Objects.equals(this.totalLogin, other.totalLogin)) {
            return false;
        }
        return true;
    }
    
    
}
