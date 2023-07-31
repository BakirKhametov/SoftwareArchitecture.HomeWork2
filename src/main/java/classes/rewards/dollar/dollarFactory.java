package classes.rewards.dollar;

import classes.iGameItem;
import classes.itemGenerator;

/*
класс наследник - фабрика долларов
 */
public class dollarFactory extends itemGenerator {
    @Override
    public iGameItem createItem() {
        return new dollar();
    }
}
