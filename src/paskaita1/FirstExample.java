package paskaita1;

import java.util.Scanner;

/**
 * Created by Vartotojas on 2017-04-04.
 */
public class FirstExample {

    public static void main(String[] args) {

        System.out.println("Hi Augustinas ");
        FirstExampleSupportClass example = new FirstExampleSupportClass();
        example.sayHi();
        int sum = example.sum(10, 20);
        //System.out.println(example.sum(10, 20));
        System.out.println(sum);

        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Write your name");
        int insertedNumb = scanner.nextInt();
        System.out.println("inserted number >> " + insertedNumb);*/

        // example.userName(scanner);
        //example.userWord(scanner);
        example.veiksmai(scanner);

    }


}

class FirstExampleSupportClass {

    public void veiksmai(Scanner asd) {
        System.out.println("Insert the first number");
        int firstNumber = asd.nextInt();
        System.out.println("Insert the second number");
        int secondNumber = asd.nextInt();
        System.out.println("Suma yra " + suma(firstNumber, secondNumber));
        System.out.println("Skirtumas yra " + atimtis(firstNumber, secondNumber));

    }

    public int suma(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public float suma(float firstNumber, float secondNumber) {
        return firstNumber + secondNumber;
    }

    public int atimtis(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;

    }

    public void userWord(Scanner sca) {
        System.out.println("Please insert a word :)");
        String userWord = sca.nextLine();
        System.out.println(userWord.length());

    }

    public void userName(Scanner sc) {
        System.out.println("Please insert your name :)");
        String name = sc.nextLine();
        System.out.println("Hi " + name);

    }

    public void sayHi() {
        System.out.println("Labas");
    }

    public int sum(int firstNumb, int secondNumb) {
        return firstNumb + secondNumb;

    }
}
