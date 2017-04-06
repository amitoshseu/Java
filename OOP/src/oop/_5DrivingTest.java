
package oop;

/**
 *
 * @author amitoshseu
 */
public class _5DrivingTest {
   /* A car has a certain fule efficiency or mileage and a certain amount of fule in the 
    * gas tank and the initial fuel level is 0. Simulate driving the car for a certain distance, 
    * reducing the amoutn of gasoline in the fuel tank. Also find a way to get the current amount
    * of fuel in the gas tank and also fill gas in the tank. 
    * Ensure that you take the car's mileage into account for all this 
   */
    
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.fuelCapacity=20;
        myCar.amountOfFuel=12;
        myCar.addGas(8);
        System.out.println(myCar.amountOfFuel);
        myCar.mileage = 15;
        myCar.drive(10);
    }
}

    class Car
    {
        double mileage;
        double amountOfFuel; //10
        double fuelCapacity; //15
        
        public void drive(double distance)
        {
            /* ask the user how long he want to drive
             * calculate fuel needed for the user s trip
             * if fuel is sufficient, drive and reduce fuel in the tank
             * if fuel is NOT sufficient, tell the user he cannot make the trip
             * amount of fuel needed = distance to be covered/mileage
             */
           double fuelNeeded = distance/mileage;
           if(amountOfFuel>=fuelNeeded)
           {
               amountOfFuel = amountOfFuel-fuelNeeded;
               System.out.println("You travelled " + distance + "kilometers");
           }
           else
           {
               System.out.println("You dont have sufficient fuel for the trip");
           }
        }
        
        public void addGas(double amount)
        {
            /*
             * I already have 10 liters in my tank
             * my fuel capacity is 15 liters
             * 1 find the remaining capacity in your fuel tank
             * 2 check if amoutn of fuel you are trying to add exceeds the ramaing capacity
             *      if yes fill the fuel tank completely
             *      if no fill the fuel tank with the amount specified
             */
            double emptySpace = fuelCapacity-amountOfFuel; //5
            if(amount<emptySpace)
            {
                amountOfFuel = amountOfFuel + amount; 
                System.out.println(amount+ "liters was added succesfully");
            }else
            {
                amountOfFuel = fuelCapacity; //15
                System.out.println("Now your tank is full");
            }
            
        }
        
        public double getFuelLevel()
        {
            return amountOfFuel;
        }
    }

