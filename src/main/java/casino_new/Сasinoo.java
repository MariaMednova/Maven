package casino_new;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Сasinoo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите название игры");
for ( KindGames s: KindGames.values())
        System.out.println(s);
        Games games = new Games();
        int finish = 0;
        while (true) {
            String userInput = sc.nextLine();
            Method[] methods = games.getClass().getDeclaredMethods();

            for (Method method : methods) {
                Annotation[] methodAnnotations = method.getDeclaredAnnotations();
                for (Annotation annotation : methodAnnotations) {
                    if (annotation.annotationType() == ChooseGame.class) {
                        String command = ((ChooseGame) annotation).mainCommand();
                        String commandAlias = ((ChooseGame) annotation).russianAlias();

                        if (userInput.toLowerCase().equals(command) || userInput.toLowerCase().equals(commandAlias)) {
                            try {
                               finish= finish+(int) method.invoke(games);
                               if (finish<0){
                                System.out.println("Общая сумма проигрыша="+finish+"$");}
                               else if (finish>=0){
                                   System.out.println("Общая сумма выигрыша="+finish+"$");}
                            } catch (IllegalAccessException | InvocationTargetException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }

        }

    }
}



