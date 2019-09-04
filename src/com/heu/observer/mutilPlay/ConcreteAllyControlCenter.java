package com.heu.observer.mutilPlay;

/**
 * ����Ŀ����
 */
public class ConcreteAllyControlCenter extends AllyControlCenter {

    public ConcreteAllyControlCenter(String allyName) {
        System.out.println(allyName + "�����齨�ɹ���");
        System.out.println("----------------------------");
        this.allyName = allyName;
    }

    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allyName + "���˽���֪ͨ������" + name + "���ܵ��˹�����");
        //�����۲��߼��ϣ�����ÿһ�����ѣ��Լ����⣩��֧Ԯ����
        for(Object obs : players) {
            if (!((Observer)obs).getName().equalsIgnoreCase(name)) {
                ((Observer)obs).help();
            }
        }
    }
}
