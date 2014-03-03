/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkubator.hrm.service.impl;

import com.inkubator.common.CommonUtilConstant;
import com.inkubator.common.util.DateFormatter;
import com.inkubator.common.util.DateTimeUtil;
import com.inkubator.datacore.service.impl.IServiceImpl;
import com.inkubator.hrm.dao.LoginHistoryDao;
import com.inkubator.hrm.entity.LoginHistory;
import com.inkubator.hrm.service.LoginHistoryService;
import com.inkubator.hrm.web.model.LoginHistoryChartModel;
import com.inkubator.hrm.web.search.LoginHistorySearchParameter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.hibernate.criterion.Order;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Deni Husni Fahri Rizal
 * @version 1
 * @since 17 February 2014
 */
@Service(value = "loginHistoryService")
@Lazy
public class LoginHistoryServiceImpl extends IServiceImpl implements LoginHistoryService {

    @Autowired
    private LoginHistoryDao loginHistoryDao;

    public LoginHistory getEntiyByPK(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LoginHistory getEntiyByPK(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LoginHistory getEntiyByPK(Long id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED,
            isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
    public void save(LoginHistory entity) throws Exception {
        this.loginHistoryDao.save(entity);
//         PushContext pushContext = PushContextFactory.getDefault().getPushContext();
    }

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED,
            isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
    public void update(LoginHistory entity) throws Exception {
        LoginHistory loginHistory = this.loginHistoryDao.getEntiyByPK(entity.getId());
        loginHistory.setLogOutDate(new Date());
        this.loginHistoryDao.update(loginHistory);
    }

    public void saveOrUpdate(LoginHistory enntity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LoginHistory saveData(LoginHistory entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LoginHistory updateData(LoginHistory entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LoginHistory saveOrUpdateData(LoginHistory entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LoginHistory getEntityByPkIsActive(String id, Integer isActive) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LoginHistory getEntityByPkIsActive(String id, Byte isActive) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LoginHistory getEntityByPkIsActive(String id, Boolean isActive) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LoginHistory getEntityByPkIsActive(Integer id, Integer isActive) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LoginHistory getEntityByPkIsActive(Integer id, Byte isActive) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LoginHistory getEntityByPkIsActive(Integer id, Boolean isActive) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LoginHistory getEntityByPkIsActive(Long id, Integer isActive) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LoginHistory getEntityByPkIsActive(Long id, Byte isActive) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public LoginHistory getEntityByPkIsActive(Long id, Boolean isActive) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void delete(LoginHistory entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void softDelete(LoginHistory entity) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Long getTotalData() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Long getTotalDataIsActive(Boolean isActive) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Long getTotalDataIsActive(Integer isActive) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Long getTotalDataIsActive(Byte isActive) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<LoginHistory> getAllData() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<LoginHistory> getAllData(Boolean isActive) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<LoginHistory> getAllData(Integer isActive) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<LoginHistory> getAllData(Byte isActive) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<LoginHistory> getAllDataPageAble(int firstResult, int maxResults, Order order) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<LoginHistory> getAllDataPageAbleIsActive(int firstResult, int maxResults, Order order, Boolean isActive) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<LoginHistory> getAllDataPageAbleIsActive(int firstResult, int maxResults, Order order, Integer isActive) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<LoginHistory> getAllDataPageAbleIsActive(int firstResult, int maxResults, Order order, Byte isActive) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS,
            isolation = Isolation.REPEATABLE_READ, timeout = 50)
    public List<LoginHistory> getByParam(LoginHistorySearchParameter searchParameter, int firstResult, int maxResults, Order order) throws Exception {
        return this.loginHistoryDao.getByParam(searchParameter, firstResult, maxResults, order);
    }

    @Override
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS,
            isolation = Isolation.READ_COMMITTED, timeout = 30)
    public Long getTotalLoginHistoryByParam(LoginHistorySearchParameter searchParameter) throws Exception {
        return this.loginHistoryDao.getTotalLoginHistoryByParam(searchParameter);
    }

    @Override
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS,
            isolation = Isolation.READ_COMMITTED, timeout = 30)
    public Long getTotalLogin() throws Exception {
        return this.loginHistoryDao.getTotalLogin();
    }

    @Override
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS,
            isolation = Isolation.READ_COMMITTED, timeout = 30)
    public Long getToalLoginThisYear() throws Exception {
        String tahun = DateFormatter.getDateAsStringsDefaultLocale(new Date(), CommonUtilConstant.DEFAULT_ONLY_YEAR_FORMAT);
        Date firtsYear = null;
        try {
            firtsYear = DateFormatter.getDateWithDefaultLocale("01-01-" + tahun, CommonUtilConstant.DEFAULT_DATE_SHORT_PATTERN);
        } catch (ParseException ex) {
            LOGGER.error("Error", ex);
        }
        return this.loginHistoryDao.getTotalLoginByParam(firtsYear, new Date());
    }

    @Override
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS,
            isolation = Isolation.READ_COMMITTED, timeout = 30)
    public Long getTotalLoginThisMonth() throws Exception {
        Date firtsMonth = null;
        try {
            String bulanTahun = DateFormatter.getDateAsStringsDefaultLocale(new Date(), CommonUtilConstant.DEFAULT_ONLY_YEAR_AND_MONTH_SHORT_FORMAT);
            firtsMonth = DateFormatter.getDateWithDefaultLocale("01-" + bulanTahun, CommonUtilConstant.DEFAULT_DATE_SHORT_PATTERN);
        } catch (ParseException ex) {
            LOGGER.error("Error", ex);
        }
        return this.loginHistoryDao.getTotalLoginByParam(firtsMonth, new Date());
    }

    @Override
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS,
            isolation = Isolation.READ_COMMITTED, timeout = 30)
    public Long getTotalLoginThisWeek() throws Exception {
        String day = new SimpleDateFormat("EE", Locale.ENGLISH).format(new Date());
        Date firtstDateOfWeek = null;
        int factorPengurang;
        if (day.equalsIgnoreCase("Sun")) {
            factorPengurang = 0;
        } else if (day.equals("Mon")) {
            factorPengurang = -1;
        } else if (day.equals("Tue")) {
            factorPengurang = -2;
        } else if (day.equals("Wed")) {
            factorPengurang = -3;
        } else if (day.equals("Thu")) {
            factorPengurang = -4;
        } else if (day.equals("Fri")) {
            factorPengurang = -5;
        } else {
            factorPengurang = -6;
        }
        if (factorPengurang == 0) {
            String justDate = DateFormatter.getDateAsStringsDefaultLocale(new Date(), CommonUtilConstant.DEFAULT_DATE_SHORT_PATTERN);
            try {
                firtstDateOfWeek = DateFormatter.getDateWithDefaultLocale(justDate + " 00:00:00", CommonUtilConstant.DEFAULT_FULL_DATE_SHORT_PATTERN);
            } catch (ParseException ex) {
                LOGGER.error("Error", ex);
            }
        } else {
            firtstDateOfWeek = DateTimeUtil.getDateFrom(new Date(), factorPengurang, CommonUtilConstant.DATE_FORMAT_DAY);
        }
        return this.loginHistoryDao.getTotalLoginByParam(firtstDateOfWeek, new Date());
    }

    @Override
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS,
            isolation = Isolation.READ_COMMITTED, timeout = 30)
    public Long getTotalLoginThisDay() throws Exception {
        String justDate = DateFormatter.getDateAsStringsDefaultLocale(new Date(), CommonUtilConstant.DEFAULT_DATE_SHORT_PATTERN);
        Date firstSeconThisDay = null;
        try {
            firstSeconThisDay = DateFormatter.getDateWithDefaultLocale(justDate + " 00:00:00", CommonUtilConstant.DEFAULT_FULL_DATE_SHORT_PATTERN);
        } catch (ParseException ex) {
            LOGGER.error("Error", ex);
        }
        return this.loginHistoryDao.getTotalLoginByParam(firstSeconThisDay, new Date());
    }

    @Override
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS,
            isolation = Isolation.REPEATABLE_READ, timeout = 50)
    public List<LoginHistoryChartModel> getHistoryChartModel(LoginHistorySearchParameter loginHistorySearchParameter, Date dateFrom, Date dataUntil) throws Exception {
        LoginHistoryChartModel loginHistoryChartModel = new LoginHistoryChartModel();
        DateTime dateTime = new DateTime();
        Date today = new Date();
        String bulanIni = new SimpleDateFormat("MMMM").format(today);

        return null;
    }
}
