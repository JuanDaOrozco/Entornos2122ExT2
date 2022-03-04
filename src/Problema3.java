public class Problema3 {
    public String iniciar(int in, int fi) {
        int number = in;
        String text = "";
        for (int i = in; i <= fi; i++) {
            if (number % 3 == 0 && number % 5 == 0) {
                text = text + "FizzBuzz";
            }
            else if (number % 3 == 0) {
                text = text + "Fizz";
            }
            else if (number % 5 == 0) {
                text = text + "Buzz";
            }
            else {
                text = text + number;
            }
            number++;
        }
        return text;
    }
}
