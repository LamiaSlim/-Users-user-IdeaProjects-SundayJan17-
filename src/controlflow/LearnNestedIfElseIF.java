package controlflow;

public class LearnNestedIfElseIF {
    //if block inside if block
    public static void main(String[] args) {
        int score = 59;
        int score1 = 30;
        if (score < 76) {
            System.out.println("lets see first result");
            if (score == score1 + 39) {
                System.out.println("lets see second result");
            } else if (score + score1 == score1 + score) {
                System.out.println("you are crazy");
            }
            if (score1 <= score) {
                System.out.println("lets see third result");
            }
        }
            if (score > 39) {
                System.out.println("lets see the final result");
            } else {
                System.out.println("we are not able to see the previous results");
            }

        }

    }
