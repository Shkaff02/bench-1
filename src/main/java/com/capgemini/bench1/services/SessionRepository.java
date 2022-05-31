package com.capgemini.bench1.services;


import com.capgemini.bench1.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
