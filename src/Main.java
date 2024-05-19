import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Avtomobilin  benzin tutumunu  daxil edin:");
        Scanner scanner = new Scanner(System.in);
        int tutum = scanner.nextInt();
        System.out.print("ne qeder benzin  elave etmek istediyinizi daxil edin:");
        int addFuel = scanner.nextInt();
         Car car =new Car(tutum);
         car.addFuel(addFuel);
    }
}