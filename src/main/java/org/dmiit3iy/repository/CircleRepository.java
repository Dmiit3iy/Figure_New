package org.dmiit3iy.repository;

import org.dmiit3iy.model.Circle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CircleRepository extends JpaRepository<Circle,Long> {
}
