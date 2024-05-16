package com.student.dashboard.repository;

import com.student.dashboard.model.Student_details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Student_detailsRespository  extends JpaRepository<Student_details,Integer> {

}
