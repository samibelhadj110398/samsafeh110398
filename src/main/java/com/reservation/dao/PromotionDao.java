package com.reservation.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reservation.model.Promotion;

@Repository

public interface PromotionDao extends CrudRepository<Promotion, Long> {

}
