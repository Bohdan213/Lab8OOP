package ua.edu.ucu.apps.demo.flowers.Item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.demo.flowers.Item.flower.Flower;
import ua.edu.ucu.apps.demo.flowers.Item.flower.FlowerBucket;
import ua.edu.ucu.apps.demo.flowers.Item.flower.FlowerType;

import java.util.List;


@RequestMapping(path="api/v1/Item")
@RestController
public class ItemController {
    public ItemService itemService;
    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }
    @GetMapping
    public List<Item> getItem() {
        return itemService.findAll();
    }
}
