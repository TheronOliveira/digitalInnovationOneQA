package com.github.theronoliveira.apiRestCidades.countries.repositories;

import com.github.theronoliveira.apiRestCidades.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
