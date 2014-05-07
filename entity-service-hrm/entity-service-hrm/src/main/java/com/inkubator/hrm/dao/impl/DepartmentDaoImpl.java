/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkubator.hrm.dao.impl;

import com.inkubator.datacore.dao.impl.IDAOImpl;
import com.inkubator.hrm.dao.DepartmentDao;
import com.inkubator.hrm.entity.Department;
import com.inkubator.hrm.web.search.DepartmentSearchParameter;
import java.util.List;
import org.hibernate.Criteria;
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
public class DepartmentDaoImpl extends IDAOImpl<Department> implements DepartmentDao {

    @Override
    public Class<Department> getEntityClass() {
        return Department.class;
    }

    @Override
    public List<Department> getByParam(DepartmentSearchParameter searchParameter, int firstResult, int maxResults, Order order) {
        Criteria criteria = getCurrentSession().createCriteria(getEntityClass());
        doSearchDepartmentByParam(searchParameter, criteria);
        criteria.addOrder(order);
        criteria.setFirstResult(firstResult);
        criteria.setMaxResults(maxResults);
        return criteria.list();
    }

    @Override
    public Long getTotalDepartmentByParam(DepartmentSearchParameter searchParameter) {
        Criteria criteria = getCurrentSession().createCriteria(getEntityClass());
        doSearchDepartmentByParam(searchParameter, criteria);
        return (Long) criteria.setProjection(Projections.rowCount()).uniqueResult();
    }

    private void doSearchDepartmentByParam(DepartmentSearchParameter departmentSearchParameter, Criteria criteria) {
        if (departmentSearchParameter.getDepartmentCode() != null) {
            criteria.add(Restrictions.eq("departmentCode", departmentSearchParameter.getDepartmentCode()));
        }
        if (departmentSearchParameter.getDepartmentName() != null) {
            criteria.add(Restrictions.eq("departmentName", departmentSearchParameter.getDepartmentName()));
        }
        criteria.add(Restrictions.isNotNull("id"));
    }

}
