import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        Check check = new Check();

        System.out.print("Enter car name : ");
        String[] carNames = scan.next().split(",");
        check.inputCheck(carNames);
        System.out.print("Enter rounds : ");
        int round = scan.nextInt();
        check.roundCheck(round);

        Car[] cars = new Car[carNames.length];
        for (int i = 0; i < carNames.length; i++) {
            cars[i] = new Car(carNames[i]);
        }

        Game game = new Game();
        game.run(cars, round);

    }
}
