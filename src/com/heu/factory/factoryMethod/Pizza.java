package com.heu.factory.factoryMethod;


import java.util.ArrayList;
import java.util.List;

/**
 * ����pizza��
 */
public abstract class Pizza {

    public String name;//����
    public String dough;//����
    public String sause;//����
    public List<String> toppings = new ArrayList<String>(); //����

    public void prepare() {
        System.out.println("Preparing "+name);
        System.out.println("Tossing dough");
        System.out.println("Adding sause");
        System.out.println("Adding toppings");

        for(int i = 0; i < toppings.size(); i++) {
            System.out.println("  " + toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        String a = "1_2_3__";
        String[] arr = a.split("_");
        System.out.println(arr.length);
        for(int i = 0; i < arr.length; i++) {
//            if(!"".equals(arr[i])) {
//
//                System.out.println(arr[i]);
//            }
            System.out.println(arr[i]);

        }
    }

}
