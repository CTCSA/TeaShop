/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory_Method_Pattern;

/**
 *
 * @author ckc
 */
public class Main {
    public static void Main(String[] args){
    BeverageStores greenStore = new BeverageStores(new GreenTeaFactory());
    System.out.println("A 客人點了綠茶");
    greenStore.BeverageOrders();

    BeverageStores blackStore = new BeverageStores(new BlackTeaFactory());
    System.out.println("B 客人點了紅茶");
    blackStore.BeverageOrders();

    Console.Read();
}
}
