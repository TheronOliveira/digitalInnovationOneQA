package com.github.theronoliveira.apiRestCidades.staties.repositories;

import com.github.theronoliveira.apiRestCidades.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
