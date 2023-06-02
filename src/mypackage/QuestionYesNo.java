package mypackage;

import java.util.Scanner;

public class QuestionYesNo{
    public void qst(String k) {
    Scanner qst1 = new Scanner(System.in);
    String no;
        System.out.println("");
        System.out.println("Далее будет показан список результатов выполнения методов с коллекцией " + k + ", хотите продолжить(y/n)?");
    no = qst1.nextLine();
        if(no.equals("n") || no.equals("N")){
        System.out.println("Завершение программы!");
        System.exit(0);
    } else
            System.out.println("Продолжение выполнения программы!");
    }
}
