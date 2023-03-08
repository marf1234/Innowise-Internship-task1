package org.example.ballSorter;

import org.example.entities.Ball;

import java.util.List;

public class BallSorter {

    public static void quickSort(List<Ball> balls, BallComparator comparator) {

    }

    private static void startQuickSortIteration(List<Ball> balls, int lowerLimit, int upperLimit,
                                                BallComparator comparator) {
        if (balls.size() == 0 || lowerLimit >= upperLimit) {
            return;
        }

        int middle = lowerLimit + (upperLimit - lowerLimit) / 2;
        Ball supportElement = balls.get(middle);

        int i = lowerLimit;
        int j = upperLimit;
        while (i <= j) {
            while (comparator.compare(balls.get(i), supportElement) < 0) {
                i++;
            }
            while (comparator.compare(balls.get(j), supportElement) > 0) {
                j--;
            }
            if (i <= j) {
                Ball temp = balls.get(i);
                balls.set(i, balls.get(j));
                balls.set(j, temp);
                i++;
                j--;
            }
        }

        if (lowerLimit < j) {
            startQuickSortIteration(balls, lowerLimit, j, comparator);
        }
        if (upperLimit > i) {
            startQuickSortIteration(balls, i, upperLimit, comparator);
        }
    }
}
