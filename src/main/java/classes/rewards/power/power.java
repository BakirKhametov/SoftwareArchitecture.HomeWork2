package classes.rewards.power;

import classes.iGameItem;
/*
класс  повышения силы
 */
public class power implements iGameItem {
    @Override
    public void open() {
        System.out.println("You got the power boost!");
    }
}
