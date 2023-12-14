package org.dmiit3iy.service;

import org.dmiit3iy.model.Triangle;

import java.util.List;

public interface TriangleService {
    void add(Triangle triangle);
    List<Triangle> get();
}
