import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestProblema2 {
    Problema1 fizz = new Problema1();
    @BeforeEach
    private void setUp() {
        fizz = new Problema1();
    }
    @Test
    public void testProblema1() {
        Assertions.assertEquals(  "12Fizz4BuzzFizz78FizzBuzz11Fizz1314Fizz1617Fizz19Buzz", fizz.iniciar());
    }
}
