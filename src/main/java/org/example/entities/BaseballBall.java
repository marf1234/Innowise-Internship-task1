package org.example.entities;

import org.example.ballCharacterization.Color;

public class BaseballBall extends Ball{

    public BaseballBall(String manufacturer, double diameter, double price, Color color) {
        super(manufacturer, diameter, price, color);
    }
    public BaseballBall () {
        super("Adidas", 0.1, 20,Color.WHITE);
    }
}
