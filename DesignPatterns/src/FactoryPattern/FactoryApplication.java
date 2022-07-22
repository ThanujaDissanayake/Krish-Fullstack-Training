package FactoryPattern;

public class FactoryApplication {

    public static void main(String args[]){
        ShoppingCard card1=CardFactory.createSCard("Platinum");
        System.out.println("You got "+ card1.getDiscount()+"% for your purchase");

        ShoppingCard card2=CardFactory.createSCard("Silver");
        System.out.println("You got "+ card2.getDiscount()+"% for your purchase");
    }
}
