package org.dmiit3iy.service;

import org.dmiit3iy.model.Circle;

import java.util.List;

public interface CircleService {
    void add(Circle circle);
    List<Circle> get();
}
