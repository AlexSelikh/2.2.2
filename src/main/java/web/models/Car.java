package web.models;




public class Car {
    private String manufacture;
    private String model;

    private int series;


    public Car(String manufacture, String model, int series) {
        this.manufacture = manufacture;
        this.model = model;
        this.series = series;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacture= " + manufacture +
                " model= " + model +
                " series= " + series;
    }
}
