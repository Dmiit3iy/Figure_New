package org.dmiit3iy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CircleRepository extends JpaRepository<CircleRepository,Long> {
}
