package com.javarush.dao;


import com.javarush.domain.Task;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class TaskDAO {

    private final SessionFactory sessionFactory;

    public TaskDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public List<Task> getAll(int offset, int limit) {

    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public int getAllCount() {

    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Task getById(int id) {

    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Task edit(Task task) {
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void delete(Task task) {

    }

private Session getSession() {
        return sessionFactory.getCurrentSession();
}

}
