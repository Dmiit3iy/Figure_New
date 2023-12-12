package org.dmiit3iy.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@Data
@NoArgsConstructor

public class Rectangle extends Figure {

    private double y;

    public Rectangle(long id, double figureSize, double y) {
        super(id, figureSize);
        this.y = y;
    }

    @Override
    public double square() {
        return figureSize * y;
    }

    @Override
    public double perimeter() {
        return 2 * (figureSize + y);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " - длины сторон прямоугольника: " + figureSize + ", " + y;
    }
}
