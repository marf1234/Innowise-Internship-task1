package innowise.internship.task1.entities;

import innowise.internship.task1.ballCharacterization.BallColor;

public class BasketballBall extends Ball {
    public BasketballBall(String manufacturer, double diameter, double price, BallColor ballColor) {
        super(manufacturer, diameter, price, ballColor);
    }

    public BasketballBall() {
        super("Raduga", 0.4, 120, BallColor.BLACK);
    }
}
