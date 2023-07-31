package org.example;
import classes.iGameItem;
import classes.itemGenerator;
import classes.rewards.coin.coinFactory;
import classes.rewards.crystal.crystalFactory;
import classes.rewards.dollar.dollarFactory;
import classes.rewards.gold.goldFactory;
import classes.rewards.health.healthFactory;
import classes.rewards.platinum.platinumFactory;
import classes.rewards.power.powerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;



public class Main {
    public static void main(String[] args) throws Exception{

        /*
       Создание фабрик
         */
        itemGenerator coinFactory = new coinFactory();
        itemGenerator crystalFactory = new crystalFactory();
        itemGenerator dollarFactory = new dollarFactory();
        itemGenerator goldFactory = new goldFactory();
        itemGenerator healthFactory = new healthFactory();
        itemGenerator platinumFactory = new platinumFactory();
        itemGenerator powerFactory =new platinumFactory();

        /*
        Открытие фабрик
         */
        coinFactory.openReward();
        crystalFactory.openReward();
        dollarFactory.openReward();
        goldFactory.openReward();
        healthFactory.openReward();
        platinumFactory.openReward();
        powerFactory.openReward();

        /*
        Создание рандомайзера
         */
        Random rnd = ThreadLocalRandom.current();

        /*
        Создание хранилища фабрик
         */
        List <itemGenerator> fabricList = new ArrayList<>();
         fabricList.add(coinFactory);
         fabricList.add(crystalFactory);
         fabricList.add(dollarFactory);
         fabricList.add(goldFactory);
         fabricList.add(healthFactory);
         fabricList.add(platinumFactory);
         fabricList.add(powerFactory);

         /*
         Вывод через цикл рандомных фабричных наград
          */
        for (int i=0; i<20; i++) {
            int index = Math.abs(rnd.nextInt()%2==0?0:1);
            fabricList.get(index).openReward();
        }

    }
}