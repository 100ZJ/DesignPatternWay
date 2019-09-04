package com.heu.observer.mutilPlay;

/**
 * 具体目标类
 */
public class ConcreteAllyControlCenter extends AllyControlCenter {

    public ConcreteAllyControlCenter(String allyName) {
        System.out.println(allyName + "联盟组建成功！");
        System.out.println("----------------------------");
        this.allyName = allyName;
    }

    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allyName + "联盟紧急通知，盟友" + name + "遭受敌人攻击！");
        //遍历观察者集合，调用每一个盟友（自己除外）的支援方法
        for(Object obs : players) {
            if (!((Observer)obs).getName().equalsIgnoreCase(name)) {
                ((Observer)obs).help();
            }
        }
    }
}
