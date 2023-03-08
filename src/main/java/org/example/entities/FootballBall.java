package org.example.entities;

import org.example.ballCharacterization.Color;

public class FootballBall extends Ball{
    public FootballBall () {
        super("Wilson", 0.3, 100,Color.RED);
    }
    public FootballBall(String manufacturer, double diameter, double price, Color color) {
        super(manufacturer, diameter, price, color);
    }
}
