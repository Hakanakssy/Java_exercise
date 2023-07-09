package classes.src;

/**
 * new_main
 */     
public class new_main {

    public static void main(String[] args) {
        product urun = new product();
        urun.setname("laptop") ;
        urun.setId(1);
        urun.setdescription("Asus laptop");
        urun.setprice(5000.0);
        urun.setstockAmount(3); 
        System.out.println(urun.name);

        ProductManager productManager =new ProductManager();
        productManager.add(urun);
    }
    
}