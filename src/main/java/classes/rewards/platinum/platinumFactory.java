package classes.rewards.platinum;

import classes.iGameItem;
import classes.itemGenerator;

/*
класс наследник - фабрика платины
 */
public class platinumFactory extends itemGenerator {
    @Override
    public iGameItem createItem() {
        return new platinum();
    }
}
