package innowise.internship.task1.ballFactory;

import innowise.internship.task1.ballCharacterization.BallType;
import innowise.internship.task1.entities.Ball;

public interface BallFactory {
    Ball createBall (BallType type);

}
