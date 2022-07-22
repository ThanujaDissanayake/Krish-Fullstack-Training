package BuilderPattern;
public class BuilderApplication {

    public static void main(String[] args){
        //Create Builder object
        Product.Builder builder=new Product.Builder("SEK8908");

        //Calling method by chaining
        Product product=builder.name("Canon").price(9470.00).isSold(false).build();

        System.out.println(product);
    }
}
