package FactoryPattern;
public class Silver extends ShoppingCard{

    Silver(){
        this.discount=25.00;
    }
    public double getDiscount(){
        return this.discount;
    }

}
