package com.spring.program.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.program.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
