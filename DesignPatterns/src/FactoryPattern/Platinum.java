package FactoryPattern;
public class Platinum extends ShoppingCard{

   Platinum(){
        this.discount=30.00;
    }
    public double getDiscount(){
        return this.discount;
    }

}
