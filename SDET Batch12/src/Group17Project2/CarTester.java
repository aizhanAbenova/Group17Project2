package Group17Project2;

public class CarTester {
    public static void main(String[] args) {
         //Create a Class Car that would have the following fields:
        // carPrice and color and method calculateSalePrice() which should be returning a price of the car.
        //Create 2 sub classes: Sedan and Truck.
        // The Truck class has field as weight and has its own implementation of  calculateSalePrice()
        // method in which returned price calculated as following: if weight>2000 then returned price car should
        // include 10% discount, otherwise 20% discount.
        //The Sedan class has field as length and also does it is own
        // implementation of calculateSalePrice(): if length of sedan is >20
        // feet then returned car price should include 5% discount, otherwise 10% discount
        Car obj = new Car(5000, "blue");
        obj.calculateSalePrice();
        Sedan obj1 = new Sedan(4000, 100);
        obj1.calculateSalePrice();
        Truck obj2 = new Truck(4500, 3000);
        obj2.calculateSalePrice();
    }
}