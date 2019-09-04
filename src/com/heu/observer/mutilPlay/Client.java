package com.heu.observer.mutilPlay;

public class Client {

    public static void main(String[] args) {
        AllyControlCenter acc = new ConcreteAllyControlCenter("复仇者");

        Observer player1 = new Player("美国队长");
        acc.join(player1);

        Observer player2 = new Player("钢铁侠");
        acc.join(player2);

        Observer player3 = new Player("雷神");
        acc.join(player3);

        Observer player4 = new Player("绿巨人");
        acc.join(player4);

        Observer player5 = new Player("蜘蛛侠");
        acc.join(player5);

        player5.beAttacked(acc);

    }





}
