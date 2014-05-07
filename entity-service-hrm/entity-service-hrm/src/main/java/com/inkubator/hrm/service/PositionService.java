/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkubator.hrm.service;

import com.inkubator.datacore.service.IService;
import com.inkubator.hrm.entity.Position;
import com.inkubator.hrm.web.search.PositionSearchParameter;
import java.util.List;
import org.hibernate.criterion.Order;

/**
 *
 * @author Deni Husni FR
 */
public interface PositionService extends IService<Position> {

    public List<Position> getByParam(PositionSearchParameter searchParameter, int firstResult, int maxResults, Order order) throws Exception;

    public Long getTotalPositionByParam(PositionSearchParameter searchParameter) throws Exception;
}
