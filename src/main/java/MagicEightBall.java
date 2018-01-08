import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MagicEightBall {

    private ArrayList<String> answers;

    public MagicEightBall() {
        this.answers = new ArrayList<>();

    }

    public int numberOfAnswers() {
        return this.answers.size();
    }

    public void addAnswer(String answer){
        this.answers.add(answer);
    }

    public String randomAnswer() {
        Collections.shuffle(answers);
        return answers.get(0);
    }

    public ArrayList<String> getAnswers() {
        return this.answers;
    }
}
