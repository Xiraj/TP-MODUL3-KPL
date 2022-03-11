import java.util.Scanner;
public class MainDoorMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DoorMachine pintu = new DoorMachine();
        System.out.println(pintu.getState());
        System.out.print("Perintah : ");
        String c = input.nextLine();
        pintu.pintu(c);
        System.out.println(pintu.getState());
        System.out.print("Perintah : ");
        c = input.nextLine();
        pintu.pintu(c);
        System.out.println(pintu.getState());
        input.close();
    }

}