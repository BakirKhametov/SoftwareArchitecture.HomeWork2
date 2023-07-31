package classes.rewards.gold;

import classes.iGameItem;
/*
класс Золото
 */
public class gold implements iGameItem {
    @Override
    public void open() {
        System.out.println("You got the gold!");
    }
}
