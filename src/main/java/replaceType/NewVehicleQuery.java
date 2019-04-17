package replaceType;

public class NewVehicleQuery {
    public String brand;
    public String description;

    public NewVehicleQuery(String brand, String description) {
        this.brand = brand;
        this.description = description;
    }

    public String getBrandDescription() {
        return brand + " " + description;
    }

    public void setBrandDescription(String brandDescription) {
        this.brand = brandDescription.split(" ")[0];
        this.description = brandDescription.split(" ")[1];
    }
}
