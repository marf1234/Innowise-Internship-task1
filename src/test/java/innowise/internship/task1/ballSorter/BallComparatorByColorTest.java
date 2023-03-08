package innowise.internship.task1.ballSorter;

import innowise.internship.task1.ballCharacterization.BallColor;
import innowise.internship.task1.entities.Ball;
import innowise.internship.task1.entities.FootballBall;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BallComparatorByColorTest {

    private BallComparatorByColor comparator;

    @BeforeEach
    public void init() {
        comparator = new BallComparatorByColor();
    }

    @Test
    public void comparedShouldBeGreaterThanZero() {

        Ball ball1 = new FootballBall("Adidas", 30, 20, BallColor.WHITE);
        Ball ball2 = new FootballBall("Wilson", 30, 120, BallColor.BLACK);

        Assertions.assertTrue(comparator.compare(ball1, ball2) > 0);
    }


    @Test
    public void compareShouldReturnZero() {
        Ball ball1 = new FootballBall("Adidas", 30, 20, BallColor.WHITE);
        Ball ball2 = new FootballBall("Wilson", 30, 120, BallColor.WHITE);

        Assertions.assertEquals(0, comparator.compare(ball1, ball2));

    }
}