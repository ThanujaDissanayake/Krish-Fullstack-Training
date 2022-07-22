package BuilderPattern;
public class Product {

    private String productCode;
    private String name;
    private double price;
    private boolean isSold;

    public Product(Builder builder){
        this.productCode=builder.productCode;
        this.name=builder.name;
        this.isSold=builder.isSold;
        this.price=builder.price;
    }


    public String toString(){
        return "Product: productCode-"+productCode+" name-"+name+" price-"+price;
    }



    static class Builder{

        private String productCode;
        private String name;
        private double price;
        private boolean isSold;

        //To enforce must have a product object.
        public Builder(String productCode){
            this.productCode=productCode;
        }

        public Builder name(String name){
            this.name=name;
            return this;
        }

        public Builder price(double price){
            this.price=price;
            return this;
        }

        public Builder isSold(boolean isSold){
            this.isSold=isSold;
            return this;
        }

        //Create build Method

        public Product build(){
            return new Product(this);
        }
    }
}
