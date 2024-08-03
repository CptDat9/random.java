import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giới hạn trên cho số ngẫu nhiên: ");
        int upperBound = scanner.nextInt();
        int randomNumber = rand.nextInt(upperBound);
        System.out.println("Số ngẫu nhiên là: " + randomNumber);
        scanner.close();
    }
}
