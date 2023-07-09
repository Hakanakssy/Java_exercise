package classes.src;

// to new_main
public class product {

    public product(){

    }

    public product (int id, String name, String descripiton){

    }

    // attiribute field
    private int id;
    String name;
    private String description;
    private Double price;
    private int stockAmount;
    private String renk;
    private String kod;

    // getter
    public int getId() {
        return id;
    }

    // setter
    public void setId(int id) {
        this.id = id;
    }
    

    //getter
    public String getname() {
        return name;
    }
    //setter
    public void setname(String name) {
        this.name = name;
    }

    //getter
    public String getdescription() {
        return description;
    }
    //setter
    public void setdescription(String description) {
        this.description = description;
    }

    //getter
    public Double getprice() {
        return price;
    }
    //setter
    public void setprice(Double price) {
        this.price = price;
    }

    //getter
    public int getstockAmount() {
        return stockAmount;
    }
    //setter
    public void setstockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    //getter
    public String getrenk() {
        return renk;
    }
    //setter
    public void setrenk(String renk) {
        this.renk = renk;
    }

    //getter
    public String getkod() {
        return kod;
    }
    //setter
    public void setkod(String kod) {
        this.kod = kod;
    }

}

