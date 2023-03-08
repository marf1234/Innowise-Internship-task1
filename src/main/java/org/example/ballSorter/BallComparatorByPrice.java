package org.example.ballSorter;

import org.example.entities.Ball;

public class BallComparatorByPrice implements BallComparator {
    @Override
    public int compare(Ball ball1, Ball ball2) {
        return Double.compare(ball1.getDiameter(),ball2.getDiameter());
    }
}
