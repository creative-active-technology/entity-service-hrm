/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkubator.hrm.dao.impl;

import com.inkubator.datacore.dao.impl.IDAOImpl;
import com.inkubator.hrm.dao.LoginHistoryDao;
import com.inkubator.hrm.entity.LoginHistory;
import com.inkubator.hrm.web.search.LoginHistorySearchParameter;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Deni Husni Fahri Rizal
 * @version 1
 * @since 17 February 2014
 */
@Repository(value = "loginHistoryDao")
@Lazy
public class LoginHistoryDaoImpl extends IDAOImpl<LoginHistory> implements LoginHistoryDao {

    @Override
    public Class<LoginHistory> getEntityClass() {
        return LoginHistory.class;
    }

    @Override
    public List<LoginHistory> getByParam(LoginHistorySearchParameter searchParameter, final int firstResult, final int maxResults, Order order) {
        System.out.println(" Ini nilai "+firstResult+"sdfsfdsf "+maxResults);
        Criteria criteria = getCurrentSession().createCriteria(getEntityClass());
        doSearchLoginHistoryByParam(searchParameter, criteria);
        criteria.addOrder(order);
        criteria.setFirstResult(firstResult);
        criteria.setMaxResults(maxResults);
        return criteria.list();
    }

    @Override
    public Long getTotalLoginHistoryByParam(LoginHistorySearchParameter searchParameter) {
        Criteria criteria = getCurrentSession().createCriteria(getEntityClass());
        doSearchLoginHistoryByParam(searchParameter, criteria);
        return (Long) criteria.setProjection(Projections.rowCount()).uniqueResult();
    }

    private void doSearchLoginHistoryByParam(LoginHistorySearchParameter loginHistorySearchParameter, Criteria criteria) {
        if (loginHistorySearchParameter.getUserName() != null) {
            criteria.add(Restrictions.like("userName", loginHistorySearchParameter.getUserName(), MatchMode.ANYWHERE));
        }
        criteria.add(Restrictions.isNotNull("id"));
    }

    @Override
    public Long getTotalLogin() {
        Criteria criteria = getCurrentSession().createCriteria(getEntityClass());
        return (Long) criteria.setProjection(Projections.rowCount()).uniqueResult();

    }

    @Override
    public Long getTotalLoginByParam(Date dateFrom, Date dateUntil) {
        Criteria criteria = getCurrentSession().createCriteria(getEntityClass());
        criteria.add(Restrictions.between("loginDate", dateFrom, dateUntil));
        return (Long) criteria.setProjection(Projections.rowCount()).uniqueResult();
    }

    @Override
    public Long getTotalLoginByParam(String userId, Date dateFrom, Date dateUntil) {
        Criteria criteria = getCurrentSession().createCriteria(getEntityClass());
        criteria.add(Restrictions.between("loginDate", dateFrom, dateUntil));
        criteria.add(Restrictions.eq("userName", userId));
        return (Long) criteria.setProjection(Projections.rowCount()).uniqueResult();
    }

}
