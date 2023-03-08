package org.example.ballFactory;

import org.example.ballCharacterization.BallType;
import org.example.entities.Ball;
import org.example.entities.BaseballBall;
import org.example.entities.BasketballBall;
import org.example.entities.FootballBall;

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
