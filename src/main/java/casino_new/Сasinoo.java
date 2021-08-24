package casino_new;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Сasinoo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println(userInput);
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
                                method.invoke(games);
                                finish = finish + 1;
                            } catch (IllegalAccessException | InvocationTargetException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
            //System.out.println("сумма: " + finish);
        }

    }
}



