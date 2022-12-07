package com.school.repositories;

import com.school.entities.Student;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "students", path = "students")
public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {
    List<Student> findByName(@Param("name") String name);
}
