package builder;

public class Car {

    // required
    private Double value;

    //Optional
    private String color;
    private String brand;
    private String type;

    private Car(CarBuilder carBuilder){
        this.color = carBuilder.color;
        this.brand = carBuilder.brand;
        this.type = carBuilder.type;
    }
    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public Double getValue() {
        return value;
    }

    public static class CarBuilder{
        // required
        private Double value;

        //Optional
        private String color;
        private String brand;
        private String type;

        public CarBuilder(Double value){
            this.value = value;
        }

        public CarBuilder color(String color){
            System.out.println("color called");
            this.color = color;
            return this;
        }

        public CarBuilder brand(String brand){
            System.out.println("brand called");
            this.brand = brand;
            return this;
        }

        public CarBuilder type(String type){
            System.out.println("type called");
            this.type = type;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }
}
