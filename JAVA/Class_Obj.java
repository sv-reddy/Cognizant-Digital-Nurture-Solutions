public class Class_Obj {
    public class Car{
        String make;
        String model;
        int year;
        Car(String make,String model,int year){
            this.make = make;
            this.model = model;
            this.year= year;
        }
        public void displayDetails(){
            System.out.println("The make of car is " + make);
            System.out.println("The model of car is " + model);
            System.out.println("The year of car is " + year);
        }
    }
    public static void main(String[] args) {
        Class_Obj outer = new Class_Obj(); 
        Car c1 = outer.new Car("BMW", "5 series", 2024);
        Car c2 = outer.new Car("Ferrari", "SF90 Spider", 2025);
        c1.displayDetails();
        c2.displayDetails();
    }
}
