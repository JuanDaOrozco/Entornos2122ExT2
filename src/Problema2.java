public class Problema2 {
    public String iniciar(int in, int fi) {
        int number = 1;
        String text = "";
        for (int i = in; i < fi; i++) {
            if (number % 3 == 0) {
                text = text + "Fizz";
            }
            else if (number % 5 == 0) {
                text = text + "Buzz";
            }
            else if (number % 3 == 0 && number % 5 == 0) {
                text = text + "FizzBuzz";
            }
            else {
                text = text + number;
            }
            number++;
        }
        return text;
    }
}
