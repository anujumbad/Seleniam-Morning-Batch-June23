package corejava.simpleprograms;

public class MultiplicationDemo {
    public void multiplay() {


        int a = 5;
        int b = 4;
        int d = 2;
        int c;
        c = a * b * d;
        System.out.println("Multiplication is"+ c);
    }

    public static void main(String[] args) {
        MultiplicationDemo multiplicationDemo=new MultiplicationDemo();
        multiplicationDemo.multiplay();
    }
}