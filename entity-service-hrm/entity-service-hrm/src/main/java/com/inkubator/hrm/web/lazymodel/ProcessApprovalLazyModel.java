/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkubator.hrm.web.lazymodel;

import com.inkubator.hrm.entity.ProscessToApprove;
import com.inkubator.hrm.service.HrmRoleService;
import com.inkubator.hrm.service.ProscessToApproveService;
import com.inkubator.hrm.web.search.HrmRoleSearchParameter;
import com.inkubator.hrm.web.search.ProscessToApproveSearchParameter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.hibernate.criterion.Order;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

/**
 *
 * @author Deni Husni FR
 */
public class ProcessApprovalLazyModel extends LazyDataModel<ProscessToApprove> implements Serializable {

    private static final Logger LOGGER = Logger.getLogger(ProcessApprovalLazyModel.class);
    private final ProscessToApproveSearchParameter proscessToApproveSearchParameter;
    private final ProscessToApproveService proscessToApproveService;
    private List<ProscessToApprove> hrmRoles = new ArrayList<>();
    private Integer jumlahData;

    public ProcessApprovalLazyModel(ProscessToApproveSearchParameter proscessToApproveSearchParameter, ProscessToApproveService proscessToApproveService) {
        this.proscessToApproveSearchParameter = proscessToApproveSearchParameter;
        this.proscessToApproveService = proscessToApproveService;
    }

    @Override
    public List<ProscessToApprove> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {
        LOGGER.info("Step Load Lazy data Model");

        if (sortField != null) {
            if (sortOrder == SortOrder.ASCENDING) {
                try {
                    hrmRoles = proscessToApproveService.getByParam(proscessToApproveSearchParameter, first, pageSize, Order.asc(sortField));
                    jumlahData = Integer.parseInt(String.valueOf(proscessToApproveService.getTotalLoginHistoryByParam(proscessToApproveSearchParameter)));
                } catch (Exception ex) {
                    LOGGER.error("Error", ex);
                }
            } else {
                try {
                    hrmRoles = proscessToApproveService.getByParam(proscessToApproveSearchParameter, first, pageSize, Order.desc(sortField));
                    jumlahData = Integer.parseInt(String.valueOf(proscessToApproveService.getTotalLoginHistoryByParam(proscessToApproveSearchParameter)));
                } catch (Exception ex) {
                    LOGGER.error("Error", ex);
                }
            }
        } else {
            try {
                hrmRoles = proscessToApproveService.getByParam(proscessToApproveSearchParameter, first, pageSize, Order.desc("code"));
                jumlahData = Integer.parseInt(String.valueOf(proscessToApproveService.getTotalLoginHistoryByParam(proscessToApproveSearchParameter)));
            } catch (Exception ex) {
                LOGGER.error("Error", ex);
            }
        }
//            jumlahData = Integer.parseInt(String.valueOf(loginHistoryService.getTotalLoginHistoryByParam(loginHistorySearchParameter)));
        LOGGER.info("Success Load Lazy data Model");
        setPageSize(pageSize);
        setRowCount(jumlahData);
        return hrmRoles;
    }

    @Override
    public Object getRowKey(ProscessToApprove proscessToApprove) {
        return proscessToApprove.getId();
    }

    @Override
    public ProscessToApprove getRowData(String id) {
        for (ProscessToApprove proscessToApprove : hrmRoles) {
            if (id.equals(String.valueOf(proscessToApprove.getId()))) {
                return proscessToApprove;
            }
        }
        return null;
    }

    @Override
    public void setRowIndex(int rowIndex) {
        if (rowIndex == -1 || getPageSize() == 0) {
            super.setRowIndex(-1);
        } else {
            super.setRowIndex(rowIndex % getPageSize());
        }
    }
}
