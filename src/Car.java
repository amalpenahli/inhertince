public class Car extends Vehicle{
    public double fuelCapacity;

    public Car( double fuelCapacity) {
        //super(brand, model, milage);
        this.fuelCapacity = fuelCapacity;
    }

    public void addFuel(int litr) {
            double a= fuelCapacity-litr;
          if (litr<fuelCapacity) {
              System.out.println(a+ "litr benzin elave edilmelidir");
          } else if (fuelCapacity == litr) {
              System.out.println("dolub");
          }else{
              System.out.println("hecmden artiq");
          }

    }
}
