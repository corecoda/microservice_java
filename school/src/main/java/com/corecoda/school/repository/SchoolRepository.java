package com.corecoda.school.repository;

import com.corecoda.school.entities.School;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SchoolRepository extends JpaRepository<School, Integer> {
}
