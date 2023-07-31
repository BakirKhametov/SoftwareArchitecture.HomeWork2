package classes.rewards.power;

import classes.iGameItem;
import classes.itemGenerator;

/*
класс наследник - фабрика повышения силы
 */
public class powerFactory extends itemGenerator {
    @Override
    public iGameItem createItem() {
        return new power();
    }
}
