package classes.rewards.crystal;

import classes.iGameItem;
import classes.itemGenerator;

/*
класс наследник - фабрика кристалов
 */
public class crystalFactory extends itemGenerator {
    @Override
    public iGameItem createItem() {
        return new crystal();
    }
}
