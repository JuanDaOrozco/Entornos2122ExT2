public class Problema3 {
    public String iniciar(int in, int fi) {
        int number = in;
        String text = "";
        for (int i = in; i <= fi; i++) {
            if (number % 3 == 0) {
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
            }
            else if (number % 5 == 0) {
                text = text + "Buzz";
                if (number % 7 == 0) {
                    text = text + "Foo";
                }
                else if (number % 11 == 0) {
                    text = text + "Boo";
                }
            }
            else if (number % 7 == 0) {
                text = text + "Foo";
                if (number % 11 == 0) {
                    text = text + "Boo";
                }
            }
            else if (number % 11 == 0) {
                text = text + "Boo";
            }
            else {
                text = text + number;
            }
            number++;
        }
        return text;
    }
}
