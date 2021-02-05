import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

    public void run(Car[] cars, int round) {
        printGameResult(cars, round);
        printWinner(cars);
    }

    public void printGameResult(Car[] cars, int round) {
        Random random = new Random();
        for (int i = 0; i < round; i++) {
            for (Car car : cars) {
                car.checkGoStraight(random.nextInt(10));
                System.out.println(car.getName() + " : " + printBar(car.getPosition()));
            }
            System.out.println();
        }
    }

    public String printBar(int position) {
        String bar = "";
        for (int i = 0; i < position; i++) {
            bar = bar + "-";
        }
        return bar;
    }

    public int getMaxPosition(Car[] cars) {
        int max = cars[0].getPosition();
        for (Car car : cars) {
            if (car.getPosition() >= max) {
                max = car.getPosition();
            }
        }
        return max;
    }

    public void printWinner(Car[] cars) {
        List<String> winner = new ArrayList<>();
        int max = getMaxPosition(cars);

        for (Car car : cars) {
            if (car.getPosition() == max) {
                winner.add(car.getName());
            }
        }

        System.out.print("Winner : ");
        for (String name : winner) {
            System.out.print(name + " ");
        }

    }

}
