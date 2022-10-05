import java.util.*;

public class Game {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        boolean flag=false;
        for(int i=0;i<game.length;i++)
        {
            if(i-1>0 && game[i-1]==0)
            {
                i=i-1;
                continue;
            }
            else if(i+leap>=game.length || i==game.length-1)
            {
                flag=true;
                break;
            }
            else if(game[i+leap]==0)
            {
                i=i+leap;
                continue;
            }
            if(game[i+1]==0)
            {
                i=i+1;
                continue;
            }
            
        }
        return flag;
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
