package org.example.ballFactory;

import org.example.ballCharacterization.BallType;
import org.example.entities.Ball;

public interface BallFactory {
    Ball createBall (BallType type);

}
