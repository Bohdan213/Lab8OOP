package ua.edu.ucu.apps.demo.flowers.Item.ItemDecor;

import lombok.AllArgsConstructor;
import ua.edu.ucu.apps.demo.flowers.Item.Item;

@AllArgsConstructor
public class PaperDecorator extends ItemDecorator{
    private Item item;

    public double price() {
        return 13 + item.price();
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " with paper decorator";
    }

}
