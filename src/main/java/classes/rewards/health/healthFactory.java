package classes.rewards.health;

import classes.iGameItem;
import classes.itemGenerator;

/*
класс наследник - фабрика здоровья
 */
public class healthFactory extends itemGenerator {
    @Override
    public iGameItem createItem() {
        return new health();
    }
}
