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
public class BlackTea {
        public void AddMaterial()
    {
        System.out.println("店員:加入綠茶包");
    }

    public void Brew()
    {
        System.out.println("店員:沖泡");
    }

    public void PouredCup()
    {
        System.out.println("店員:將紅茶裝杯");
    }
}
