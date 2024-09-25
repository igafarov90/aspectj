import com.jcabi.aspects.RetryOnFailure;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class TestIt {

    @RetryOnFailure(attempts = 3, delay = 5, unit = TimeUnit.SECONDS,
            types = {java.lang.ArithmeticException.class})
public int divideByZero () {
            int x = 1 ;
            int y = 1 ;
            int sum = x+y;
            return sum;

        }



    @Test
     void tt(){
       int sum = divideByZero();
       Assertions.assertEquals(sum, 4);
}

    }

