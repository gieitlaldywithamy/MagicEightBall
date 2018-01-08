import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MagicEightballTest {
    MagicEightBall ball;

    @Before
    public void before(){
        ball = new MagicEightBall();
        ball.addAnswer("Absolutely 100% yes!");
        ball.addAnswer("Naw");
        ball.addAnswer("Get some perspective");
    }

    @Test
    public void ballHasThreeAnswers(){
        assertEquals(3, ball.numberOfAnswers());
    }

    @Test
    public void ballReturnsRandomAnswer(){
        assertTrue(ball.getAnswers().contains(ball.randomAnswer()));
    }

    @Test
    public void removeAnswer(){
        ball.removeAnswer("Naw");
        assertEquals(2, ball.numberOfAnswers());
    }

}
