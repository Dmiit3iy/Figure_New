package org.dmiit3iy.repository;

import org.dmiit3iy.model.Square;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SquareRepository extends JpaRepository<Square,Long> {
}
