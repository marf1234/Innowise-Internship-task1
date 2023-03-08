package innowise.internship.task1.entities;

import innowise.internship.task1.ballCharacterization.BallColor;

public class Ball {
    public String manufacturer;
    public double diameter;
    public double price;
    public BallColor ballColor;

    public Ball(String manufacturer, double diameter, double price, BallColor ballColor) {
        this.manufacturer = manufacturer;
        this.diameter = diameter;
        this.price = price;
        this.ballColor = ballColor;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BallColor getColor() {
        return ballColor;
    }

    public void setColor(BallColor ballColor) {
        this.ballColor = ballColor;
    }


}
