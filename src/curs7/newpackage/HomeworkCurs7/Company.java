package curs7.newpackage.HomeworkCurs7;

public class Company {

    private Advertisement prefferedType;
    private int daysOfAdvertisement;
    private String typeOfProduct;

    public void setPreferredType(Advertisement preferredType){
        this.preferredType = preferredType;
    }

    public void setDaysOfAdvertisement(int daysOfAdvertisement) {
        this.daysOfAdvertisement = daysOfAdvertisement;
    }
    public String setTypeOfProduct(String type) {
        typeOfProduct = type;
        if (type == "product" && type = "service"){
            return type;
        }
        return "Only two options: product and service!";
    }
}
