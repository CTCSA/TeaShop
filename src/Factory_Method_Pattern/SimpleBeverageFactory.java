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
public class SimpleBeverageFactory {
        public IBeverageProvide CreateBeverage(String pBeverageType)
    {
        IBeverageProvide beverage;
        if (pBeverageType == "GreenTea")
            return  new GreenTea();
        if (pBeverageType == "BlackTea")
            return  new BlackTea();
        else
            return null;
    }
}
