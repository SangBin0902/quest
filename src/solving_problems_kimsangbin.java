import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class solving_problems_kimsangbin {

    public static void main(String[] args) {
        QuizService quizService = new QuizService();

        quizService.addQuiz(new Quiz(
                "1. Python에서 변수를 선언하는 방법은? (점수: 10점)",
                Arrays.asList("1) var name ", "2) name = value ", "3) set name ", "4) name == value "),
                2,
                10
        ));

        quizService.addQuiz(new Quiz(
                "2. Python에서 리스트(List)의 특징은 무엇인가요? (점수: 15점)",
                Arrays.asList("1) 순서가 있고 변경 가능하다, ", "2) 중복된 값을 가질 수 없다, ", "3) 원소를 추가하거나 삭제할 수 없다, ", "4) 정렬된 상태로 유지된다"),
                4,
                15
        ));

        quizService.addQuiz(new Quiz(
                "3. Python에서 조건문을 작성하는 방법은? (점수: 10점)",
                Arrays.asList("1) if-else, ", "2) for-in, ", "3) while, ", "4) def"),
                1,
                10
        ));

        quizService.addQuiz(new Quiz(
                "4. Python에서 함수를 정의하는 방법은? (점수: 5점)",
                Arrays.asList("1) class, ", "2) def, ", "3) import, ", "4) return"),
                2,
                5
        ));

        quizService.startQuiz();
    }
}