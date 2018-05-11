    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package binary;

    import java.util.Scanner;
    import java.util.Stack;

    /**
     *
     * @author zhuan
     */
    public class Binary {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            // TODO code application logic here
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                Stack stack = getBinaryStack(a);
                printBinaryStack(stack);
                System.out.println();
            }
        }

        private static Stack getBinaryStack(int a) {
            Stack stack = new Stack();
            if (a==0) {
                stack.push(0);
                return stack;
            }
            while (a > 0) {
                stack.push(a % 2);
                a = a / 2;
            }
            return stack;
        }

        private static void printBinaryStack(Stack stack) {

            int i;

            for (i = 0; i < (4 - stack.size() % 4)%4; i++) {
                System.out.print(0);
            }

            while (!stack.empty()) {
                System.out.print(stack.pop());
                i = (i + 1) % 4;
                if (i == 0) {
                    System.out.print(' ');
                }
            }
        }
    }
