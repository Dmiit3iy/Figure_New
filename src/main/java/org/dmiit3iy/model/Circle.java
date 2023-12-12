package org.dmiit3iy.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@Data
@NoArgsConstructor
public class Circle extends Figure {
    public Circle(long id, double figureSize) {
        super(id, figureSize);
    }

    @Override
    public double square() {
        return Math.PI * Math.pow(getFigureSize(), 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * getFigureSize();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " - радиус: " + figureSize;
    }
}
