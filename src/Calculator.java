
public class Calculator {
    public static void main(String[] args) {
        calc(75, 8, '+');
        calc(84, 37, '-');
        calc(9, 14, '*');
        calc(1000, 8, '/');
        calc(19, 46, '#');
    }

    static void calc(double a, double b, char operation){
        double result;
        switch (operation){
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Sorry, it's incorrect operation type");
                return;
        }
        System.out.println(result);
    }
}

/**
 *
 * This is my first mini-program written in Java, so I'm glad it works :)
 *
 * */