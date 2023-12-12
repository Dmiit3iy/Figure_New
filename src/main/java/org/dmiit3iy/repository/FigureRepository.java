package org.dmiit3iy.repository;

import org.dmiit3iy.model.Figure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FigureRepository extends JpaRepository<Figure,Long> {
}
