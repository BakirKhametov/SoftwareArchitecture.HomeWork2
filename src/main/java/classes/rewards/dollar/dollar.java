package classes.rewards.dollar;

import classes.iGameItem;

/*
класс доллар
 */
public class dollar implements iGameItem {
    @Override
    public void open() {
        System.out.println("You got the dollar!");
    }
}
