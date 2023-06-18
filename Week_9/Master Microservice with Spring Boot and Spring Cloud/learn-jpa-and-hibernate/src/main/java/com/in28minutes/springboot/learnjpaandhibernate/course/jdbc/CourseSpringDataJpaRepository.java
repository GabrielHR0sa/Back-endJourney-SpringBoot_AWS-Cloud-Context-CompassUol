package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

}
