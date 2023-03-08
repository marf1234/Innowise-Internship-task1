package org.example.entities;

import org.example.ballCharacterization.BallColor;

public class FootballBall extends Ball{
    public FootballBall () {
        super("Wilson", 0.3, 100, BallColor.RED);
    }
    public FootballBall(String manufacturer, double diameter, double price, BallColor ballColor) {
        super(manufacturer, diameter, price, ballColor);
    }
}
