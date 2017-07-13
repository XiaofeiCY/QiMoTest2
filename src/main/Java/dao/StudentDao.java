package dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by XFXF on 2017/7/5.
 */
public class StudentDao extends HibernateDaoSupport{

    public List findAll(){
        String queryString = "from Student ";
        return getHibernateTemplate().find(queryString);
    }

    public void delete(int id){
        Student stuno = getHibernateTemplate().get(Student.class,id);
        getHibernateTemplate().delete(stuno);
    }

    public Student update(int id){
        return getHibernateTemplate().get(Student.class,id);
    }

    public void updateone(Student stuno){
        getHibernateTemplate().update(stuno);
    }

    public void AddNewOne(Student stuno){
        getHibernateTemplate().save(stuno);
    }
}
