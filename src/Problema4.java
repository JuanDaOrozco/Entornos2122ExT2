public class Problema4 {
    public String iniciar(int in, int fi) {
        int number = in;
        String text = imprimir(number, in, fi);
        return text;
    }
    public String imprimir(int number, int in, int fi) {
        String text = "";
        for (int i = in; i <= fi; i++) {
            if (number % 3 == 0) {
                text = divisible3(number, text);
            }
            else if (number % 5 == 0) {
                text = divisible5(number, text);
            }
            else if (number % 7 == 0) {
                text = divisible7(number, text);
            }
            else if (number % 11 == 0) {
                text = divisible11(number, text);
            }
            else {
                text = text + number;
            }
            number++;
        }
        return text;
    }
    public String divisible3(int number, String text) {
        text = text + "Fizz";
        if (number % 5 == 0) {
            text = text + "Buzz";
        }
        else if (number % 7 == 0) {
            text = text + "Foo";
        }
        else if (number % 11 == 0) {
            text = text + "Boo";
        }
        return text;
    }
    public String divisible5(int number, String text) {
        text = text + "Buzz";
        if (number % 7 == 0) {
            text = text + "Foo";
        }
        else if (number % 11 == 0) {
            text = text + "Boo";
        }
        return text;
    }
    public String divisible7(int number, String text) {
        text = text + "Foo";
        if (number % 11 == 0) {
            text = text + "Boo";
        }
        return text;
    }
    public String divisible11(int number, String text) {
        text = text + "Boo";
        return text;
    }
}
