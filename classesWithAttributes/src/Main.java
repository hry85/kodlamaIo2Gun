public class Main {

    public static void main(String[] args) {
        Product product=new Product(1,"Laptop","Asus Laptop",5000,3);
//        product.setName("Laptop");
//        product.setId(1);
//        product.setDescreption("Asus Laptop");
//        product.setPrice(5000);
//        product.setStockAmount(3);

        ProductManager productManager=new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());



    }
}
