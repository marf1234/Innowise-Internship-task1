package org.example.entities;

import org.example.ballCharacterization.BallColor;

public class BaseballBall extends Ball{

    public BaseballBall(String manufacturer, double diameter, double price, BallColor ballColor) {
        super(manufacturer, diameter, price, ballColor);
    }
    public BaseballBall () {
        super("Adidas", 0.1, 20, BallColor.WHITE);
    }
}
