import java.util.List;

public class Quiz {

    private String question;
    private List<String> bogi;
    private int correctAnswerIndex;
    private int score;

    public Quiz(String question, List<String> bogi, int correctAnswerIndex, int score) {
        this.question = question;
        this.bogi = bogi;
        this.correctAnswerIndex = correctAnswerIndex;
        this.score = score;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getBogi() {
        return bogi;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    public int getScore() {
        return score;
    }

    public boolean checkAnswer(int userAnswerIndex) {
        return userAnswerIndex == correctAnswerIndex;
    }
}
