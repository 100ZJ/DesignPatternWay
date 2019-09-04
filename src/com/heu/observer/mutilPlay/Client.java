package com.heu.observer.mutilPlay;

public class Client {

    public static void main(String[] args) {
        AllyControlCenter acc = new ConcreteAllyControlCenter("������");

        Observer player1 = new Player("�����ӳ�");
        acc.join(player1);

        Observer player2 = new Player("������");
        acc.join(player2);

        Observer player3 = new Player("����");
        acc.join(player3);

        Observer player4 = new Player("�̾���");
        acc.join(player4);

        Observer player5 = new Player("֩����");
        acc.join(player5);

        player5.beAttacked(acc);

    }





}
