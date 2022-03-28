public class Product {

    public Product(int id,String name,String descreption,double price,int stockAmount){
        System.out.println("Yapici blog calisti");
        this.id=id;
        this.name=name;
        this.descreption=descreption;
        this.price=price;
        this.stockAmount=stockAmount;
    }
    public Product(){

    }

    //attribute veya filed
   private int id;
    String name;
    String descreption;
    double price;
    int stockAmount;
    String kod;


    // getter
    public int getId(){
        return id;
    }
    //setter
    public void setId(int id){
        this.id=id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescreption() {
        return descreption;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;
    }


}
