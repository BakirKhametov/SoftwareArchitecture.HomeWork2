package classes.rewards.platinum;

import classes.iGameItem;

/*
класс платина
 */
public class platinum implements iGameItem {
    @Override
    public void open() {
        System.out.println("You got the platinum!");
    }
}
