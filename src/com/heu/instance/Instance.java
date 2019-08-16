package com.heu.instance;

import java.util.*;

public class Instance {


}

class LoadBalancer {

    //私有静态成员变量，存储唯一实例
    private static LoadBalancer instance = null;
    //服务器集合
    private List serverList = null;

    //私有构造函数
    private LoadBalancer() {
        serverList = new ArrayList();
    }

    public static LoadBalancer getLoadBalancer() {
        if(instance == null) {
            instance = new LoadBalancer();
        }
        return instance;
    }

    //增加服务器
    public void addServer(String server) {
        serverList.add(server);
    }
    //删除服务器
    public void removeServer(String server) {
        serverList.remove(server);
    }

    //使用Random类随机获取服务器
    public String getSever() {
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return (String) serverList.get(i);
    }

}

class Client {
    /**
     * 虽然创建了四个LoadBalancer对象，但是它们实际上是同一个对象，
     * 因此，通过使用单例模式可以确保LoadBalancer对象的唯一性。
     * @param args
     */
    public static void main(String[] args) {

        //创建四个LoadBalancer对象
        LoadBalancer balancer1,balancer2,balancer3,balancer4;
        balancer1 = LoadBalancer.getLoadBalancer();
        balancer2 = LoadBalancer.getLoadBalancer();
        balancer3 = LoadBalancer.getLoadBalancer();
        balancer4 = LoadBalancer.getLoadBalancer();

        //判断服务器负载均衡是否相同
        if(balancer1 == balancer2 && balancer2 == balancer3 && balancer3 == balancer4) {
            System.out.println("服务器负载均衡器具有唯一性！");
        }

        //增加服务器
        balancer1.addServer("server 1");
        balancer2.addServer("server 2");
        balancer3.addServer("server 3");
        balancer4.addServer("server 4");

        for(int i = 0; i < 10; i++) {
            String server = balancer1.getSever();
            System.out.println("分发请求至服务器： " + server);
        }

    }
}








