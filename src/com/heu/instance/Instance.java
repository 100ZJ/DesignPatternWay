package com.heu.instance;

import java.util.*;

public class Instance {


}

class LoadBalancer {

    //˽�о�̬��Ա�������洢Ψһʵ��
    private static LoadBalancer instance = null;
    //����������
    private List serverList = null;

    //˽�й��캯��
    private LoadBalancer() {
        serverList = new ArrayList();
    }

    public static LoadBalancer getLoadBalancer() {
        if(instance == null) {
            instance = new LoadBalancer();
        }
        return instance;
    }

    //���ӷ�����
    public void addServer(String server) {
        serverList.add(server);
    }
    //ɾ��������
    public void removeServer(String server) {
        serverList.remove(server);
    }

    //ʹ��Random�������ȡ������
    public String getSever() {
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return (String) serverList.get(i);
    }

}

class Client {
    /**
     * ��Ȼ�������ĸ�LoadBalancer���󣬵�������ʵ������ͬһ������
     * ��ˣ�ͨ��ʹ�õ���ģʽ����ȷ��LoadBalancer�����Ψһ�ԡ�
     * @param args
     */
    public static void main(String[] args) {

        //�����ĸ�LoadBalancer����
        LoadBalancer balancer1,balancer2,balancer3,balancer4;
        balancer1 = LoadBalancer.getLoadBalancer();
        balancer2 = LoadBalancer.getLoadBalancer();
        balancer3 = LoadBalancer.getLoadBalancer();
        balancer4 = LoadBalancer.getLoadBalancer();

        //�жϷ��������ؾ����Ƿ���ͬ
        if(balancer1 == balancer2 && balancer2 == balancer3 && balancer3 == balancer4) {
            System.out.println("���������ؾ���������Ψһ�ԣ�");
        }

        //���ӷ�����
        balancer1.addServer("server 1");
        balancer2.addServer("server 2");
        balancer3.addServer("server 3");
        balancer4.addServer("server 4");

        for(int i = 0; i < 10; i++) {
            String server = balancer1.getSever();
            System.out.println("�ַ��������������� " + server);
        }

    }
}








