/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkubator.hrm.web.search;

import com.inkubator.hrm.entity.ProscessToApprove;
import com.inkubator.webcore.util.SearchParameter;
import org.primefaces.model.LazyDataModel;

/**
 *
 * @author Deni Husni FR
 */
public class ProscessToApproveSearchParameter extends SearchParameter {

    private String processApproval;
    private LazyDataModel<ProscessToApprove> lazyDataModel;
    

    public String getProcessApproval() {
        return processApproval;
    }

    public void setProcessApproval(String processApproval) {
        this.processApproval = processApproval;
    }

}
