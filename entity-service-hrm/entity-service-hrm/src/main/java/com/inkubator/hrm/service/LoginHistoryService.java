/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkubator.hrm.service;

import com.inkubator.datacore.service.IService;
import com.inkubator.hrm.entity.LoginHistory;
import com.inkubator.hrm.web.search.LoginHistorySearchParameter;
import java.util.List;
import org.hibernate.criterion.Order;

/**
 * @author Deni Husni Fahri Rizal
 * @version 1
 * @since 17 February 2014
 */
public interface LoginHistoryService extends IService<LoginHistory> {

    public List<LoginHistory> getByParam(LoginHistorySearchParameter searchParameter, int firstResult, int maxResults, Order order) throws Exception;

    public Long getTotalLoginHistoryByParam(LoginHistorySearchParameter searchParameter) throws Exception;
}