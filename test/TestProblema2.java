import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestProblema2 {
    Problema2 fizz = new Problema2();
    @BeforeEach
    private void setUp() {
        fizz = new Problema2();
    }
    @Test
    public void testProblema1() {
        Assertions.assertEquals(  "BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19Buzz", fizz.iniciar(5, 20));
    }
}
