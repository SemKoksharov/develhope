package Es3_Encapsulation;


public class Car {
    private String brand;
    private String model;
    private float engineSize;
    private String carLicensePlateNumber;

    public Car(String brand, String model, float engineSize, String carLicensePlateNumber) {
        this.brand = brand;
        this.model = model;
        this.engineSize = engineSize;
        this.carLicensePlateNumber = carLicensePlateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineSize() {
        return engineSize;
    }

    public String getCarLicensePlateNumber() {
        return carLicensePlateNumber;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    public void setCarLicensePlateNumber(String carLicensePlateNumber) {
        this.carLicensePlateNumber = carLicensePlateNumber;
    }
}
