package curs7.newpackage.HomeworkCurs7;

public class Instagram implements Advertisement{
    private int priceOfAdvertisement = 0;
    private int daysOfAdvertisement;
    private int pricePerDay;
    private String advertisementProduct;


    public double priceOfAdvertisement(){
        if ( advertisementProduct == "Product") {
            pricePerDay = 70;
        } else if (advertisementProduct == "Service") {
            pricePerDay = 65;
        } else {
            System.out.println ("Only two options : product and service!");
        }
        for ( int i = 0; i <= daysOfAdvertisement; i++){
            priceOfAdvertisement += pricePerDay;
        }
        return priceOfAdvertisement;
    }

    public String advertisedProduct(){
        return advertisedProduct();
    }
}
