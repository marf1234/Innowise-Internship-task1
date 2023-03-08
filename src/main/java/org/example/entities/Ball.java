package org.example.entities;

import org.example.ballCharacterization.Color;

public class Ball {
    public String manufacturer;
    public double diameter;
    public double price;
    public Color color;

    public Ball(String manufacturer, double diameter, double price, Color color) {
        this.manufacturer = manufacturer;
        this.diameter = diameter;
        this.price = price;
        this.color = color;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


}
