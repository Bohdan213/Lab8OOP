package ua.edu.ucu.apps.demo.flowers.Item;

import lombok.Getter;

@Getter
abstract public class Item {
    private String description;
    abstract public double price();
}
