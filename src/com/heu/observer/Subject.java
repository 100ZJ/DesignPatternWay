package com.heu.observer;

/**
 * Subject接口定义主题的订阅、取消订阅等方法。Subject的实现类即真正的主题（仅一个实现）、数据的持有者，
 * 使用ArrayList集合来记录实现了Observer接口的订阅者（多个实现）。观察者持有Subject的引用，方便注册订阅、取消订阅。
 */
public interface Subject {

    /**
     * 注册观察者
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * 删除观察者
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * 当主题状态发生改变时，这个方法需要被调用，以通知所有观察者
     */
    public void notifyObserver();

}
