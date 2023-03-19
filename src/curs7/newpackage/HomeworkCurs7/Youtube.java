package curs7.newpackage.HomeworkCurs7;

public class Youtube implements Advertisement {
    private int priceOfAdvertisement = 0;
    private int daysOfAdvertisement;
    private int pricePerDay;
    private String advertisedProduct;

    public double priceOfAdvertisement(){
        if(advertisedProduct == "Product") {
            pricePerDay = 50;
        } else if(advertisedProduct == "Service") {
            pricePerDay = 40;
        } else {
            System.out.println("Only two options: product and service!");
        }
        for(int i=0; i <= daysOfAdvertisement; i++){
            priceOfAdvertisement += pricePerDay;
        }
        System.out.println("Total price for advertisemen is $" + priceOfAdvertisement);
        return priceOfAdvertisement;
    }

    public String getAdvertisedProduct(){
        return advertisedProduct;
    }
}
