import java.util.Scanner;
public class MainKodePos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Kelurahan : ");
        String kl = input.nextLine();
        System.out.println(KodePos.getKodePos(kl));
        input.close();
    }
}