package src;

public class Car {
    //Fields (data - state of your object)
    private String make;
    private String model;
    private int year;
    private int mileage;

    private boolean hasInsurance;
    private int numOfWrecks;
    private String plateNumber;


    //Constructors
    /**
     * Constructor of the Car class
     * The user must provide all the information when creating a Car object
     * All the information shouldn't be subject to change
     * @param make this is the company that makes the car
     * @param model this is the name of the specific vehicles design
     * @param year this is the year the car was created
     * @param mileage this is the number of miles on the car when it was made into an object
     */
    public Car(String make, String model, int year, int mileage){
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }
    /**
     Constructor of the Car class
     * The user must provide all the information when creating a Car object
     * Only the insurance, number of wrecks, and plate number should be subject to change
     * @param make this is the company that makes the car
     * @param model this is the name of the specific vehicles design
     * @param year this is the year the car was created
     * @param mileage this is the number of miles on the car when it was made into an object
     * @param hasInsurance this tells if the var has insurance
     * @param numOfWrecks this tells the number of wrecks that a car has been in
     * @param plateNumber this tells the plate number of the car
     */
    public Car(String make, String model, int year, int mileage,
               boolean hasInsurance, int numOfWrecks, String plateNumber){
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.hasInsurance = hasInsurance;
        this.numOfWrecks = numOfWrecks;
        this.plateNumber = plateNumber;
    }

    //Methods (behavior - how we modify and access data fields)
    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    public int getYear(){
        return this.year;
    }

    public int getMileage(){
        return this.mileage;
    }

    public boolean getInsuranceStatus(){
        return this.hasInsurance;
    }

    public int getNumOfWrecks(){
        return this.numOfWrecks;
    }

    public String getPlateNumber(){
        return this.plateNumber;
    }

    //Increases mileage (this impacts the data field)
    public void drive (int mileage) {
        this.mileage += mileage;
    }

    public static void main(String[] args){
        Car carCallie = new Car("Nissan", "Altima", 2012, 75000);
        Car carCallieS = new Car("Nissan", "Altima", 2012, 75000,
                true, 0, "ABC123");
        System.out.println("This is it: " + carCallie.toString());
    }
}
