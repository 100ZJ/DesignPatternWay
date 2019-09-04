package com.heu.observer.mutilPlay;

import java.util.ArrayList;

/**
 * Ŀ����
 */
public abstract class AllyControlCenter {

    protected String allyName; //ս������

    protected ArrayList<Observer> players = new ArrayList<Observer>();//����һ���������ڴ洢ս�ӳ�Ա

    public String getAllyName() {
        return allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    //ע�᷽��
    public void join(Observer observer) {
        System.out.println(observer.getName() + "����" + this.allyName + "���ˣ�");
        players.add(observer);
    }

    //ע������
    public void quit(Observer observer) {
        System.out.println(observer.getName() + "�˳�" + this.allyName + "���ˣ�");
        players.remove(observer);
    }

    //��������֪ͨ����
    public abstract void notifyObserver(String name);


}
