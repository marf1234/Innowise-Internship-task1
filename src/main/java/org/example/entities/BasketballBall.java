package org.example.entities;

import org.example.ballCharacterization.Color;

public class BasketballBall extends Ball{
    public BasketballBall(String manufacturer, double diameter, double price, Color color) {
        super(manufacturer, diameter, price, color);
    }
    public BasketballBall () {
        super("Raduga", 0.4, 120,Color.BLACK);
    }
}
