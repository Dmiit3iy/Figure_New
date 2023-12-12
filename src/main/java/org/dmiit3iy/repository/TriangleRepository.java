package org.dmiit3iy.repository;

import org.dmiit3iy.model.Triangle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TriangleRepository extends JpaRepository<Triangle, Long> {
}
