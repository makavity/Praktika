package com.practice.praktika.repository;

import com.practice.praktika.entity.WeatherEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherRepo extends CrudRepository<WeatherEntity, Long> {

}
