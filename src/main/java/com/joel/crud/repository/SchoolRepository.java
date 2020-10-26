package com.joel.crud.repository;

import com.joel.crud.model.School;
import com.joel.crud.model.SignInResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {

}
