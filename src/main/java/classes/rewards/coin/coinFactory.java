package classes.rewards.coin;

import classes.iGameItem;
import classes.itemGenerator;


/*
класс наследник - фабрика монет
 */

public class coinFactory extends itemGenerator {
    @Override
    public iGameItem createItem() {
        return new coin();
    }
}
