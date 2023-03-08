package innowise.internship.task1.ballSorter;

import innowise.internship.task1.entities.Ball;

public class BallComparatorByDiameter implements BallComparator{
    @Override
    public int compare(Ball ball1, Ball ball2) {
        return Double.compare(ball1.getDiameter(), ball2.getDiameter());
    }
}
