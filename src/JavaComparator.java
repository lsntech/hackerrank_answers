import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class JavaComparator {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);

        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }




    }



}

class Checker implements Comparator<Player>{

    @Override
    public int compare(Player a, Player b) {

        if(a.score == b.score){
           return a.name.compareTo(b.name);
        }

        return ((Integer) b.score).compareTo(a.score);
    }
}



class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }


}



