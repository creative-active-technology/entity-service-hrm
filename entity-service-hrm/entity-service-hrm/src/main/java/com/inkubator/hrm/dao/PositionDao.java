/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkubator.hrm.dao;

import com.inkubator.datacore.dao.IDAO;
import com.inkubator.hrm.entity.Position;
import com.inkubator.hrm.web.search.PositionSearchParameter;
import java.util.List;
import org.hibernate.criterion.Order;

/**
 *
 * @author Deni Husni FR
 */
public interface PositionDao extends IDAO<Position> {

    public List<Position> getByParam(PositionSearchParameter searchParameter, int firstResult, int maxResults, Order order);

    public Long getTotalPositionByParam(PositionSearchParameter searchParameter);
}
