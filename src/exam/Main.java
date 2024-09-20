package exam;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {-3, 41, 5, -3, 2, 49, 5, 5};
        //oppgave 1


       /* numbersOverTen(numbers); //a
        everyOther(numbers); //b
        averagePositiveNumber(numbers); //c
*/

        //oppgave 2
     /*   exam.ArrayManager newManager = new exam.ArrayManager();
        newManager.elementsOverZero(numbers);
        newManager.printBiggestNumber(numbers);
        newManager.printSpecificNumber(numbers, 5);*/

        //oppgave 3
      /*  String weight = showInputDialog("What is your weight");
        String height = showInputDialog("What is your height");

        bmiCalculator(weight, height);*/


        //oppgave 4
        /*int c = 32;
        int f = 110;
        KonverterTemperatur.tilCelsius(f);
        KonverterTemperatur.tilFahrenheit(c);*/


        //oppgave 5
        ArrayList<Bok> bokListe = new ArrayList<>();
        Papirbok lotr = new Papirbok("Lord Of The rings", "Tolkien", 5.1, 1231252);
        Lydbok potter = new Lydbok("Harry Potter", "jk, rowling", 50.0, 130);
        bokListe.add(lotr);
        bokListe.add(potter);
        for (Bok enbok : bokListe) {
            System.out.println(enbok);
        }
    }


    public static void bmiCalculator(String sWeight, String sHeight) {
        int weight = 0;
        double height = 0;
        try {
            weight = Integer.parseInt(sWeight);
            height = Double.parseDouble(sHeight);
        } catch (NumberFormatException e) {
            System.out.println("invalid, not a number");
            return;
        }
        double bmi = (1.3 * weight) / Math.pow((height / 100), 2.5);

        System.out.println(bmi);
        int bmiInt = (int) bmi;
        long bmiRounded = Math.round(bmi);
        JOptionPane.showMessageDialog(null, "BMI is " + bmiRounded);
    }


    public static void numbersOverTen(int[] array) {
        int overTen = 0;

        for (int element : array) {
            if (element >= 10) {
                overTen++;
            }
        }
        System.out.println("Ther are " + overTen + " numbers, that are over ten");
    }

    public static void everyOther(int[] array) {
        int x = 0;

        for (int element : array) {
            if (x % 2 == 0) {
                System.out.println(element);
            }
            x++;
        }
    }

    public static void averagePositiveNumber(int[] array) {
        int sum = 0;
        int positiveNumbers = 0;
        for (int element : array) {
            if (element > 0) {
                sum += element;
                positiveNumbers++;
            }


        }
        int average = sum / positiveNumbers;
        System.out.println("The average number is " + average);
    }

}
