package com.luv2code.cruddemo.dao;

import java.util.List;

import com.luv2code.cruddemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;


@Repository
public class StudentDAOImpl implements StudentDAO{

    // define field for entity manager
    private EntityManager entityManager;
    

    // inject entity manager using constructor injection
    @Autowired    
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    
    // implent save method
    @Override
    @Transactional
    public void save(Student theStudent) {
       entityManager.persist(theStudent);
    }


    @Override
    public Student findById(Integer id) {
        //                        (entity class, primary key)
        return entityManager.find(null, id);
    }


    @Override
    public List<Student> findAll() {
        // create query
        TypedQuery<Student> theQuery = entityManager.createQuery("From Student order by lastName", Student.class);

        // return query results
        return theQuery.getResultList();
    }


    @Override
    public List<Student> findByLastName(String theLastName) {
        // create query
        TypedQuery<Student> theQuery = entityManager.createQuery("From Student WHERE lastName=:theData", Student.class);

        // set query parameters
        theQuery.setParameter("theData", theLastName);

        // return query results
        return theQuery.getResultList();
    }


    @Override
    @Transactional
    public void update(Student theStudent) {
        entityManager.merge(theStudent);
    }


    @Override
    @Transactional
    public void delete(Integer id) {
        // retrieve the student
        Student theStudent = entityManager.find(Student.class, id);

        //delete the student
        entityManager.remove(theStudent);
    }


    @Override
    @Transactional
    public int deleteAll() {
        
        int numRowsDeleted = entityManager.createQuery("DELETE FROM Student").executeUpdate();

        return numRowsDeleted;
    }
    
}
