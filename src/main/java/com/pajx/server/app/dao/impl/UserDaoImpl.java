package com.pajx.server.app.dao.impl;


import com.pajx.server.app.base.BaseDaoImpl;
import com.pajx.server.app.dao.IUserDao;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.type.StringType;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by taller on 15/1/9.
 */
@Repository
public  class UserDaoImpl extends BaseDaoImpl implements IUserDao {

    @Override
    public List getByUsername(String username) {
        StringBuffer sb = new StringBuffer();
        sb.append("select u.ACCOUNT,u.PASSWORD,u.ISU_STATUS_FLAG from SYS_INSIDE_USER u where u.ACCOUNT='");
        sb.append(username).append("'");
        SQLQuery query=this.getCurrentSession().createSQLQuery(sb.toString());
        return query.list();
    }

    @Override
    public List getSql(String sql) {
        return null;
    }
}
