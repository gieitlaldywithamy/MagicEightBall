import java.util.ArrayList;

public class MagicEightBall {

    ArrayList<String> answers;

    public MagicEightBall(ArrayList<String> answers) {
        this.answers = answers;
    }

    public int numberOfAnswers() {
        return this.answers.size();
    }
}
