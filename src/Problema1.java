public class Problema1 {
    public String iniciar() {
        int number = 1;
        String text = "";
        for (int i = 0; i < 20; i++) {
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
