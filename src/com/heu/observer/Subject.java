package com.heu.observer;

/**
 * Subject�ӿڶ�������Ķ��ġ�ȡ�����ĵȷ�����Subject��ʵ���༴���������⣨��һ��ʵ�֣������ݵĳ����ߣ�
 * ʹ��ArrayList��������¼ʵ����Observer�ӿڵĶ����ߣ����ʵ�֣����۲��߳���Subject�����ã�����ע�ᶩ�ġ�ȡ�����ġ�
 */
public interface Subject {

    /**
     * ע��۲���
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * ɾ���۲���
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * ������״̬�����ı�ʱ�����������Ҫ�����ã���֪ͨ���й۲���
     */
    public void notifyObserver();

}
