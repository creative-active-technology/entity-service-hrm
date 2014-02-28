/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkubator.hrm.dao.impl;

import com.inkubator.datacore.dao.impl.IDAOImpl;
import com.inkubator.hrm.dao.ProscessToApproveDao;
import com.inkubator.hrm.entity.ProscessToApprove;
import com.inkubator.hrm.web.search.ProscessToApproveSearchParameter;
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
 * @author Deni Husni FR
 */
@Repository
@Lazy
public class ProscessToApproveDaoImpl extends IDAOImpl<ProscessToApprove> implements ProscessToApproveDao {

    @Override
    public Class<ProscessToApprove> getEntityClass() {
        return ProscessToApprove.class;
    }

    @Override
    public List<ProscessToApprove> getByParam(ProscessToApproveSearchParameter searchParameter, int firstResult, int maxResults, Order order) {
        Criteria criteria = getCurrentSession().createCriteria(getEntityClass());
        doSearchProscessToApproveByParam(searchParameter, criteria);
        criteria.addOrder(order);
        criteria.setFirstResult(firstResult);
        criteria.setMaxResults(maxResults);
        return criteria.list();
    }

    @Override
    public Long getTotalLoginHistoryByParam(ProscessToApproveSearchParameter searchParameter) {
        Criteria criteria = getCurrentSession().createCriteria(getEntityClass());
        doSearchProscessToApproveByParam(searchParameter, criteria);
        return (Long) criteria.setProjection(Projections.rowCount()).uniqueResult();
    }

    public void doSearchProscessToApproveByParam(ProscessToApproveSearchParameter approveSearchParameter, Criteria criteria) {
        if (approveSearchParameter.getProcessApproval() != null) {
            criteria.add(Restrictions.like("code", approveSearchParameter.getProcessApproval(), MatchMode.ANYWHERE));
        }
    }
}
