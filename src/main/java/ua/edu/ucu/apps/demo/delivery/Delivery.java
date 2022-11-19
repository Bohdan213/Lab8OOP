package ua.edu.ucu.apps.demo.delivery;

import ua.edu.ucu.apps.demo.flowers.Item.Item;

import java.util.List;

public interface Delivery {
    public void deliver(List<Item> items);
}
