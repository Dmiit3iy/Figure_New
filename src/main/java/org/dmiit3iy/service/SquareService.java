package org.dmiit3iy.service;

import org.dmiit3iy.model.Square;

import java.util.List;

public interface SquareService {
    void add(Square square);
    List<Square> get();
}
