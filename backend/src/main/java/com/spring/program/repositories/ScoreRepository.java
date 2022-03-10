package com.spring.program.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.program.entities.Score;
import com.spring.program.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
