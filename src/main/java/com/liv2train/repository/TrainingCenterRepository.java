package com.liv2train.repository;

import com.liv2train.domian.TrainingCenter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingCenterRepository extends CrudRepository<TrainingCenter,Long> {
}
