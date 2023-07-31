package classes.rewards.health;

import classes.iGameItem;
/*
класс здоровье
 */
public class health implements iGameItem {
    @Override
    public void open() {
        System.out.println("You got the health points!");
    }
}
