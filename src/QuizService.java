import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizService {

    private List<Quiz> quizzes;
    private Scanner scanner;

    public QuizService() {
        this.quizzes = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void addQuiz(Quiz quiz) {
        quizzes.add(quiz);
    }

    public void startQuiz() {
        int totalScore = 0;

        for (Quiz quiz : quizzes) {
            System.out.println(quiz.getQuestion());
            List<String> bogi = quiz.getBogi();
            for (int i = 0; i < bogi.size(); i++) {
                System.out.println(bogi.get(i));
            }

            System.out.println("-정답: ");
            int userAnswerIndex = scanner.nextInt();

            if (quiz.checkAnswer(userAnswerIndex)) {
                totalScore += quiz.getScore();
            }
            System.out.println();
        }
        System.out.println("당신 응답 합계 : " + totalScore + "점");
        System.out.println("학점은 F 입니다.");
    }
}
