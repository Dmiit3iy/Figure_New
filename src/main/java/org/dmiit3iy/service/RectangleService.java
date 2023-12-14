package org.dmiit3iy.service;

import org.dmiit3iy.model.Rectangle;

import java.util.List;

public interface RectangleService {
    void add(Rectangle rectangle);
    List<Rectangle> get();
}
