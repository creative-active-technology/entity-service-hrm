/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkubator.hrm.dao.impl;

import com.inkubator.datacore.dao.impl.IDAOImpl;
import com.inkubator.hrm.dao.PositionDao;
import com.inkubator.hrm.entity.Department;
import com.inkubator.hrm.entity.Position;
import com.inkubator.hrm.entity.Position;
import com.inkubator.hrm.web.search.PositionSearchParameter;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Deni Husni FR
 */
@Repository
@Lazy
public class PositionDaoImpl extends IDAOImpl<Position> implements PositionDao {

    @Override
    public Class<Position> getEntityClass() {
        return Position.class;
    }

    @Override
    public List<Position> getByParam(PositionSearchParameter searchParameter, int firstResult, int maxResults, Order order) {
        Criteria criteria = getCurrentSession().createCriteria(getEntityClass());
        doSearchPositiontByParam(searchParameter, criteria);
        criteria.setFetchMode("posBiaya", FetchMode.JOIN);
        criteria.setFetchMode("department", FetchMode.JOIN);
        criteria.setFetchMode("golonganJabatan", FetchMode.JOIN);
        criteria.setFetchMode("educationLevel", FetchMode.JOIN);
        criteria.setFetchMode("skJabatan", FetchMode.JOIN);
        criteria.setFetchMode("grade", FetchMode.JOIN);
        criteria.addOrder(order);
        criteria.setFirstResult(firstResult);
        criteria.setMaxResults(maxResults);
        return criteria.list();
    }

    @Override
    public Long getTotalPositionByParam(PositionSearchParameter searchParameter) {
        Criteria criteria = getCurrentSession().createCriteria(getEntityClass());
        doSearchPositiontByParam(searchParameter, criteria);
        return (Long) criteria.setProjection(Projections.rowCount()).uniqueResult();
    }

    private void doSearchPositiontByParam(PositionSearchParameter searchParameter, Criteria criteria) {
        if (searchParameter.getCostCenterName() != null) {

            criteria.add(Restrictions.eq("po.posBiayaName", searchParameter.getCostCenterName()));
        }
        if (searchParameter.getCostCenterCode() != null || searchParameter.getCostCenterName() != null) {
            criteria.createAlias("posBiaya", "po", JoinType.INNER_JOIN);
        }
        if (searchParameter.getCostCenterCode() != null) {
            criteria.add(Restrictions.eq("po.posBiayaCode", searchParameter.getCostCenterCode()));
        }

        if (searchParameter.getDepartementName() != null) {
            criteria.createAlias("department", "d", JoinType.INNER_JOIN);
            criteria.add(Restrictions.eq("d.departmentName", searchParameter.getDepartementName()));
        }
        if (searchParameter.getEducationName() != null) {
            criteria.createAlias("educationLevel", "ed", JoinType.INNER_JOIN);
            criteria.add(Restrictions.eq("ed.pendidikanLevelName", searchParameter.getEducationName()));
        }
        if (searchParameter.getNomorSk() != null) {
            criteria.createAlias("skJabatan", "sk", JoinType.INNER_JOIN);
            criteria.add(Restrictions.eq("sk.skNomor", searchParameter.getNomorSk()));
        }

        if (searchParameter.getParentCode() != null) {
            criteria.add(Restrictions.eq("position.positionCode", searchParameter.getParentCode()));
        }
        if (searchParameter.getPositionCode() != null) {
            criteria.add(Restrictions.eq("positionCode", searchParameter.getPositionCode()));
        }

        if (searchParameter.getGradeName() != null) {
            criteria.createAlias("grade", "gd", JoinType.INNER_JOIN);
            criteria.add(Restrictions.eq("gd.gradeName", searchParameter.getGradeName()));
        }
        if (searchParameter.getGolonganJabatanName() != null) {
            criteria.createAlias("golonganJabatan", "gj", JoinType.INNER_JOIN);
            criteria.add(Restrictions.eq("gj.golonganJabatanCode", searchParameter.getGolonganJabatanName()));
        }
    }

}
