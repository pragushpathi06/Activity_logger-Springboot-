package com.student.dashboard.repository;



import com.student.dashboard.model.Student_personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Student_personalRespository extends JpaRepository<Student_personal,Integer> {

}
