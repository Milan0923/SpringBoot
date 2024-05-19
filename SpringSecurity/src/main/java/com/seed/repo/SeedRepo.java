package com.seed.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seed.model.Seed;

@Repository
public interface SeedRepo extends JpaRepository<Seed, String> {

}
