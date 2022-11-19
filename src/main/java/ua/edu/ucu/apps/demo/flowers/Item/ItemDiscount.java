package ua.edu.ucu.apps.demo.flowers.Item;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ItemDiscount extends Item {
    private Item item;
    private double discount;

    public double price() {
        return item.price() * (1 - discount);
    }
}
