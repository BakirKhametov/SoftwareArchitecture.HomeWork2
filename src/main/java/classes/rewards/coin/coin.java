package classes.rewards.coin;

import classes.iGameItem;
/*
класс монет
 */
public class coin implements iGameItem {
    @Override
    public void open() {
        System.out.println("You got the coin!");
    }
}
