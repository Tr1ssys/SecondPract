package SecondPract;

import java.util.concurrent.ThreadLocalRandom;

public class tryToGuess {
    private int count = 0;
    private int number = 0;

    public int getCount() {
        return count;
    }

    public int getNumber() {
        return number;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public tryToGuess(){
        int number = ThreadLocalRandom.current().nextInt(0, 10 + 1);
        this.number = number;
    }
    public void youWon(){
        System.out.println("Yay, you won!!!");
        System.exit(1);
    }
    public void youLost(){
        System.out.println("Ehh, maybe try one more time?");
        System.exit(0);
    }
}

