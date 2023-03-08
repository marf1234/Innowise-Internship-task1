package innowise.internship.task1.ballFactory;

import innowise.internship.task1.ballCharacterization.BallType;
import innowise.internship.task1.entities.BasketballBall;
import innowise.internship.task1.entities.FootballBall;
import innowise.internship.task1.entities.Ball;
import innowise.internship.task1.entities.BaseballBall;

public class BallFactoryImplementation implements BallFactory {
    @Override
    public Ball createBall(BallType type) {
        return switch (type) {
            case FOOTBALL -> new FootballBall();
            case BASKETBALL -> new BasketballBall();
            case BASEBALL -> new BaseballBall();
        };
    }
}
