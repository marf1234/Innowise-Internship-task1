package innowise.internship.task1.ballFactory;

import innowise.internship.task1.ballCharacterization.BallType;
import innowise.internship.task1.entities.BaseballBall;
import innowise.internship.task1.entities.BasketballBall;
import innowise.internship.task1.entities.FootballBall;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallFactoryImplementationTest {
    private BallFactoryImplementation ballFactory;
    @BeforeEach
    public void init() {
        ballFactory = new BallFactoryImplementation();
    }
    @Test
    public void createdBallShouldBeFootballBall(){
        Assertions.assertTrue(ballFactory.createBall(BallType.FOOTBALL) instanceof FootballBall);
    }
    @Test
    public void createBallShouldBeBasketBall(){
        Assertions.assertTrue(ballFactory.createBall(BallType.BASKETBALL) instanceof BasketballBall);
    }
    @Test
    public void createBallShouldBaseBall(){
        Assertions.assertTrue(ballFactory.createBall(BallType.BASEBALL) instanceof BaseballBall);
    }
}