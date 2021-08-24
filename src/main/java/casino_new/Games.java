package casino_new;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Games {
int bigResult;
    public int randomResult(String s) {
        Random random = new Random();
        String[] result = {"выигрыш", "проигрыш"};
        int pos = random.nextInt((result.length));
        // Map<Integer,String> input = new HashMap();
        //input.put(pos,result[pos]);
        String gameResult = result[pos];
        Random numberRandom = new Random();
        int sum = numberRandom.nextInt(1000000);
        if (gameResult.equals(result[0])) {
            sum = sum + 0;
        } else if (gameResult.equals(result[1])) {
            sum = sum *(- 1);
        }
        bigResult=sum;
        System.out.printf("Результат игры в %s - %s \n cумма %sа = %d $ \n", s, gameResult, gameResult, sum);
        return bigResult;
            }
    @ChooseGame( mainCommand = "poker", russianAlias = "покер")
    public  int poker(){
    String game = String.valueOf(KindGames.Покер);
    randomResult(game);
    int gamer=this.bigResult;
    return gamer;
    }
    @ChooseGame( mainCommand = "roulette", russianAlias = "рулетка")
    public  int ruletka() {
        String game = String.valueOf(KindGames.Рулетка);
        randomResult(game);
        int gamer=this.bigResult;
        return gamer;
                }
    @ChooseGame( mainCommand = "slot machine", russianAlias = "однорукийбандит")
    public int  automat() {
        String game = String.valueOf(KindGames.ОднорукийБандит);
        randomResult(game);
        int gamer=this.bigResult;
        return gamer;
    }
    @ChooseGame( mainCommand = "blackjack", russianAlias = "блекджек")
    public  int blackjack(){
        String game = String.valueOf(KindGames.Блекджек);
        randomResult(game);
        int gamer=this.bigResult;
        return gamer;}
    @ChooseGame( mainCommand = "fortunewheel", russianAlias = "колесофортуны")
    public  int fortune(){
        String game = String.valueOf(KindGames.КолесоФортуны);
        randomResult(game);
        int gamer=this.bigResult;
        return gamer;}
    @ChooseGame( mainCommand = "baccarat", russianAlias = "баккара")
    public  int baccarat(){
        String game = String.valueOf(KindGames.Баккара);
        randomResult(game);
        int gamer=this.bigResult;
        return gamer;}
    @ChooseGame( mainCommand = "exit", russianAlias = "выход")
    public void   exit() {
        System.exit(0);
    }

}

