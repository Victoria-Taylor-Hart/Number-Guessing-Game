import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Substance {
    public static void main(String[] Args) throws IOException {
        //system creates and outputs random
       System.out.println("The High Low Game");
        System.out.println("I will generate a random number for you");
        int theAnswer = giveRandomNumber();
        System.out.println(theAnswer);

        //User inputs their guess
        System.out.println("Give number");
        BufferedReader Reader = new BufferedReader(
                new InputStreamReader(System.in));
        String Input = Reader.readLine();
        int Inputint = Integer.parseInt(Input);

        while (Inputint != theAnswer) {

            System.out.println(Input);

            //Make comparison

            if (theAnswer< Inputint){
                System.out.println("That number is too high");
            }
            if (theAnswer> Inputint){
                System.out.println("That number is too low");
            }
            Input = Reader.readLine();
            Inputint = Integer.parseInt(Input);
        }
        System.out.println("Jeepers! He would have gotten away with it too... if it werent for your correct number");
    }
    private static int giveRandomNumber(){
        Random theAnswer = new Random();
        int storage = theAnswer.nextInt(100);
        storage = storage+1;
        return storage;
    }
}
