package com.seed.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seed.model.CityInfo;

@Repository
public interface CityRepo extends JpaRepository<CityInfo, String>{

}
