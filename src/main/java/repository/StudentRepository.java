package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity1.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
