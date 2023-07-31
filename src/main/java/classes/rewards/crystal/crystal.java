package classes.rewards.crystal;

import classes.iGameItem;

/*
класс кристал
 */
public class crystal implements iGameItem {
    @Override
    public void open() {
        System.out.println("You got the crystal!");
    }
}
