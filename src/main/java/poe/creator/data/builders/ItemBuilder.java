package poe.creator.data.builders;

import poe.creator.data.models.Item;

public abstract class ItemBuilder {

    private Item item;

    public ItemBuilder initialize() {
        this.item = new Item();
        return this;
    }

    public abstract Item setBase();
    public abstract Item setType();
    public abstract Item setPrefix();
    public abstract Item setSuffix();

    public Item build() {
        return item;
    }
}
