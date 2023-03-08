package innowise.internship.task1.ballSorter;

import innowise.internship.task1.entities.Ball;

public class BallVomparatorByColor implements BallComparator{
    @Override
    public int compare(Ball ball1, Ball ball2) {
        return ball1.getColor().compareTo(ball2.getColor());
    }
}
