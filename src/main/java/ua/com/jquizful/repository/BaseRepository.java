package ua.com.jquizful.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

/**
 * Created by Александр on 13.08.2015.
 */
public abstract class BaseRepository {

    @Autowired
    protected SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

}
