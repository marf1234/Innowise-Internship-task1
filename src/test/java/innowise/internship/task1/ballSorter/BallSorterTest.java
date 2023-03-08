package innowise.internship.task1.ballSorter;

import innowise.internship.task1.ballCharacterization.BallColor;
import innowise.internship.task1.entities.Ball;
import innowise.internship.task1.entities.BaseballBall;
import innowise.internship.task1.entities.BasketballBall;
import innowise.internship.task1.entities.FootballBall;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BallSorterTest {

    @Test
    public void quickSortShouldSortList() {
        List<Ball> ballsList = new ArrayList<>();
        List<Ball> expectedBallsList = new ArrayList<>();
        Ball ball1 = new BaseballBall("Adidas", 0.1, 20, BallColor.WHITE);
        Ball ball2 = new FootballBall("Wilson", 30, 120, BallColor.BLACK);
        Ball ball3 = new BasketballBall("Raduga", 40, 80, BallColor.GREEN);
        Ball ball4 = new FootballBall("Reebok", 30, 40, BallColor.YELLOW);
        Ball ball5 = new FootballBall("Puma", 30, 220, BallColor.WHITE);
        ballsList.add(ball3);
        ballsList.add(ball5);
        ballsList.add(ball1);
        ballsList.add(ball4);
        ballsList.add(ball2);
        expectedBallsList.add(ball1);
        expectedBallsList.add(ball2);
        expectedBallsList.add(ball3);
        expectedBallsList.add(ball4);
        expectedBallsList.add(ball5);

        BallSorter.quickSort(ballsList, new BallComparatorByDiameter());

        Assertions.assertIterableEquals(expectedBallsList, ballsList);

    }

    @Test
    public void heapSortShouldSortList() {
        List<Ball> ballsList = new ArrayList<>();
        List<Ball> expectedBallsList = new ArrayList<>();
        Ball ball1 = new BaseballBall("Adidas", 0.1, 20, BallColor.WHITE);
        Ball ball2 = new FootballBall("Wilson", 30, 120, BallColor.BLACK);
        Ball ball3 = new BasketballBall("Raduga", 40, 80, BallColor.GREEN);
        Ball ball4 = new FootballBall("Reebok", 30, 40, BallColor.YELLOW);
        Ball ball5 = new FootballBall("Puma", 30, 220, BallColor.WHITE);
        ballsList.add(ball3);
        ballsList.add(ball5);
        ballsList.add(ball1);
        ballsList.add(ball4);
        ballsList.add(ball2);
        expectedBallsList.add(ball1);
        expectedBallsList.add(ball2);
        expectedBallsList.add(ball3);
        expectedBallsList.add(ball4);
        expectedBallsList.add(ball5);

        BallSorter.heapSort(ballsList, new BallComparatorByDiameter());

        Assertions.assertIterableEquals(expectedBallsList, ballsList);
    }
}