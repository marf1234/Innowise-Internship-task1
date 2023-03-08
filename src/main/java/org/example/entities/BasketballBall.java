package org.example.entities;

import org.example.ballCharacterization.BallColor;

public class BasketballBall extends Ball{
    public BasketballBall(String manufacturer, double diameter, double price, BallColor ballColor) {
        super(manufacturer, diameter, price, ballColor);
    }
    public BasketballBall () {
        super("Raduga", 0.4, 120, BallColor.BLACK);
    }
}
