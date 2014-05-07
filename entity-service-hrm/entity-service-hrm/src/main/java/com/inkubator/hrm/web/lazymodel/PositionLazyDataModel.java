/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkubator.hrm.web.lazymodel;

import com.inkubator.hrm.entity.Position;
import com.inkubator.hrm.service.PositionService;
import com.inkubator.hrm.web.search.PositionSearchParameter;
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
public class PositionLazyDataModel extends LazyDataModel<Position> implements Serializable {

    private static final Logger LOGGER = Logger.getLogger(PositionLazyDataModel.class);
    private final PositionSearchParameter positionSearchParameter;
    private final PositionService positionService;
    private List<Position> positions = new ArrayList<>();
    private Integer jumlahData;

    public PositionLazyDataModel(PositionSearchParameter positionSearchParameter, PositionService positionService) {
        this.positionSearchParameter = positionSearchParameter;
        this.positionService = positionService;
    }

    @Override
    public List<Position> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {
        LOGGER.info("Step Load Lazy data Model");

        if (sortField != null) {
            if (sortOrder == SortOrder.ASCENDING) {
                try {
                    positions = positionService.getByParam(positionSearchParameter, first, pageSize, Order.asc(sortField));
                    jumlahData = Integer.parseInt(String.valueOf(positionService.getTotalPositionByParam(positionSearchParameter)));
                } catch (Exception ex) {
                    LOGGER.error("Error", ex);
                }
            } else {
                try {
                    positions = positionService.getByParam(positionSearchParameter, first, pageSize, Order.desc(sortField));
                    jumlahData = Integer.parseInt(String.valueOf(positionService.getTotalPositionByParam(positionSearchParameter)));
                } catch (Exception ex) {
                    LOGGER.error("Error", ex);
                }
            }
        } else {
            try {
                positions = positionService.getByParam(positionSearchParameter, first, pageSize, Order.desc("id"));
                jumlahData = Integer.parseInt(String.valueOf(positionService.getTotalPositionByParam(positionSearchParameter)));
            } catch (Exception ex) {
                LOGGER.error("Error", ex);
            }
        }
        LOGGER.info("Success Load Lazy data Model");
        setPageSize(pageSize);
        setRowCount(jumlahData);
        return positions;
    }

    @Override
    public Object getRowKey(Position position) {
        return position.getId();
    }

    @Override
    public Position getRowData(String id) {
        for (Position position : positions) {
            if (id.equals(String.valueOf(position.getId()))) {
                return position;
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
