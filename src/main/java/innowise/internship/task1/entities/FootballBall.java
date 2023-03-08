package innowise.internship.task1.entities;

import innowise.internship.task1.ballCharacterization.BallColor;

public class FootballBall extends Ball{
    public FootballBall () {
        super("Wilson", 0.3, 100, BallColor.RED);
    }
    public FootballBall(String manufacturer, double diameter, double price, BallColor ballColor) {
        super(manufacturer, diameter, price, ballColor);
    }
}
