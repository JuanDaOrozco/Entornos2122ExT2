import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestProblema3 {
    Problema3 fizz = new Problema3();
    @BeforeEach
    private void setUp() {
        fizz = new Problema3();
    }
    @Test
    public void testProblema1() {
        Assertions.assertEquals(  "BuzzBooFizz13FooFizzBuzz1617Fizz19BuzzFizzFoo", fizz.iniciar(10, 21));
    }
}
