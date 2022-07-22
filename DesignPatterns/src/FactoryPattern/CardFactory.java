package FactoryPattern;

public class CardFactory {
    public static ShoppingCard createSCard(String cardType){
        switch (cardType){
            case "Platinum":
                return new Platinum();
            case "Silver":
                return new Silver();
            default:
                return null;
        }
    }
}
