package SecondPract;

import SecondPract.tryToGuess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class secondPract {
    public static void main(String[] args) throws IOException {
        tryToGuess myClass = new tryToGuess();
            while (myClass.getCount() <= 2) {
                System.out.println("Input your number: ");
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(System.in));
                // Reading data using readLine
                String readNumber = reader.readLine();
                int number = Integer.parseInt(readNumber);
                if (myClass.getNumber() == number) {
                    myClass.youWon();
                }
                myClass.setCount(myClass.getCount()+1);
            }
            myClass.youLost();
    }
}