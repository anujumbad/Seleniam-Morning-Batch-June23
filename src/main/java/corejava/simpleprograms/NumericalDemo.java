package corejava.simpleprograms;

import org.example.Main;

public class NumericalDemo {
    public void substraction() {
        int a = 4;
        int b = 3;
        int c = a - b;
        System.out.println("Substraction is" + c);
    }

    public static void main(String[] args) {

            NumericalDemo numericalDemo = new NumericalDemo();
            numericalDemo.substraction();
        }
    }