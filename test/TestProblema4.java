import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestProblema4 {
    Problema4 fizz = new Problema4();
    @BeforeEach
    private void setUp() {
        fizz = new Problema4();
    }
    @Test
    public void testProblema1() {
        Assertions.assertEquals(  "BuzzBooFizz13FooFizzBuzz1617Fizz19BuzzFizzFoo", fizz.iniciar(10, 21));
    }
}
