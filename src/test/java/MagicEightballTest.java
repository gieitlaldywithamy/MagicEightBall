import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MagicEightballTest {
    MagicEightBall ball;

    @Before
    public void before(){
        ArrayList<String> answers = new ArrayList<String>();
        answers.add("Absolutely 100% yes!");
        answers.add("Naw");
        answers.add("Get some perspective");
        ball = new MagicEightBall(answers);
    }

    @Test
    public void ballHasThreeAnswers(){
        assertEquals(3, ball.numberOfAnswers());
    }

}
