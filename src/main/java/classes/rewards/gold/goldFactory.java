package classes.rewards.gold;

import classes.iGameItem;
import classes.itemGenerator;
/*
класс наследник - фабрика золота
 */
public class goldFactory extends itemGenerator {
    @Override
    public iGameItem createItem() {
        return new gold();
    }
}
