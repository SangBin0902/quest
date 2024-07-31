import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizService {

    private List<Quiz> quizzes;
    private List<Integer> userAnswers;
    private Scanner scanner;

    public QuizService() {
        this.quizzes = new ArrayList<>();
        this.userAnswers = new ArrayList<>();
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
                System.out.print(bogi.get(i));
            }

            int userAnswerIndex = -1;

            while(true) {
                System.out.println();
                System.out.println("-정답: ");

                try {
                    userAnswerIndex = scanner.nextInt() -1;

                    if(userAnswerIndex < 0 || userAnswerIndex >= bogi.size()) {
                        System.out.println("Invalid Choice.");
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid Input.");
                    scanner.next();
                }
            }

            userAnswers.add(userAnswerIndex);

            if (quiz.checkAnswer(userAnswerIndex)) {
                totalScore += quiz.getScore();
            } else {
                System.out.println("틀렸습니다.");
            }
            System.out.println();
        }
        printUserAnswers();
        System.out.println();
        System.out.println("당신 응답 합계 : " + totalScore + "점");
        System.out.println("학점은 F 입니다.");
    }

    public void printUserAnswers() {
        for (int i = 0; i < quizzes.size(); i++) {
            Quiz quiz = quizzes.get(i);
            int userAnswerIndex = userAnswers.get(i);
            // String userAnswer = quiz.getBogi().get(userAnswerIndex);
            System.out.print((i + 1) + "번: " + userAnswerIndex + " ");
        }
    }
}
