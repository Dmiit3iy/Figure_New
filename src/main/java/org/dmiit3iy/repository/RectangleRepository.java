package org.dmiit3iy.repository;

import org.dmiit3iy.model.Rectangle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RectangleRepository extends JpaRepository<Rectangle,Long> {
}
