public class Check {
    public void inputCheck(String[] carNames) {
        isOverTwo(carNames);
        isFiveDigit(carNames);
    }

    public void roundCheck(int round) {
        isZero(round);
    }

    public void isOverTwo(String[] carNames) {
        if (carNames.length <= 1) {
            throw new IllegalArgumentException();
        }
    }

    public void isFiveDigit(String[] carNames) {
        for (String carName : carNames) {
            if (carName.length() > 5) {
                throw new IllegalArgumentException();
            }
        }
    }

    public void isZero(int round) {
        if (round == 0) {
            throw new IllegalArgumentException();
        }
    }
}
