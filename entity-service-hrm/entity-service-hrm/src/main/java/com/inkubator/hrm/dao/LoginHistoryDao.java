/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkubator.hrm.dao;

import com.inkubator.datacore.dao.IDAO;
import com.inkubator.hrm.entity.LoginHistory;
import com.inkubator.hrm.web.model.LoginHistoryChartModel;
import com.inkubator.hrm.web.search.LoginHistorySearchParameter;
import java.util.Date;
import java.util.List;
import org.hibernate.criterion.Order;

/**
 *
 * @author Deni Husni Fahri Rizal
 * @version 1
 * @since 17 February 2014
 */
public interface LoginHistoryDao extends IDAO<LoginHistory> {

    public List<LoginHistory> getByParam(LoginHistorySearchParameter searchParameter,
            int firstResult, int maxResults, Order order);

    public Long getTotalLoginHistoryByParam(LoginHistorySearchParameter searchParameter);

    public Long getTotalLogin();

    public Long getTotalLoginByParam(Date dateFrom, Date dateUntil);

    public Long getTotalLoginByParam(String userId, Date dateFrom, Date dateUntil);

}
