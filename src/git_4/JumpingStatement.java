package git_4;

public class JumpingStatement {

        public static void main(String[] args) {


            System.out.println("Break Example:");

            for (int i = 1; i <= 5; i++) {

                if (i == 3) {
                    break;
                }

                System.out.println(i);
            }


            System.out.println("\nContinue Example:");

            for (int i = 1; i <= 5; i++) {

                if (i == 3) {
                    continue;
                }

                System.out.println(i);
            }
        }
}
