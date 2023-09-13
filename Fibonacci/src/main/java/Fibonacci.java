package exercicio1;
import java.util.Scanner;
// sequencia fibonacci

public class Fibonacci {
        public static int fibRecursivo(int num, int a, int b){
            return (num == 0)? (a):(fibRecursivo(num-1,b,a+b));
        }
        public static String fibFor (int num){
            String mensagem = ("0");
            int num1 = 0;
            int num2 = 1;

            for (int i = 1; i < num; i++){
                int soma = num1 + num2;
                num1 = num2;
                num2 = soma;
                mensagem = (mensagem + "," + soma);
            }

            return mensagem;

        }
        public static String fibWhile (int num) {
            String mensagem = ("0");
            int num1 = 0;
            int num2 = 1;

            while (num > 1) {
                int soma = num1 + num2;
                num1 = num2;
                num2 = soma;
                mensagem = (mensagem + "," + soma);
                num --;
            }

            return mensagem;
        }


        public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);

            int fib = Integer.parseInt(entrada.nextLine());
            System.out.println(fibRecursivo(fib,0,1));
            System.out.println(fibFor(fib));
            System.out.println(fibWhile(fib));


        }
    }
//oi






