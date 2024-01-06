import java.util.Random;
import java.util.Scanner;
class Game{
    Scanner sc=new Scanner(System.in);
    int n;
    int g;
    int p;
    public Game(int q){
       n=q;
       g=0;
    }
    void getter(){
        System.out.println("Enter a number:34");
        p=sc.nextInt();
        g++;
        process(p);
    }
    void process(int s){
        if(s==n)
        {
            System.out.println("You won");
            System.out.println("No. of attempts: "+g);
        }
       else if(s>n)
        {
            System.out.println("Entered number is greater");
            getter();
        }
        else
        {
            System.out.println("Entered number is smaller");
            getter();
        }
    }
}
public class GuessTheNo {
    //Scaneer class object must be declared inside the main function
    public static void main(String[] args) {
       //Scanner sc=new Scanner(System.in);
       Random r=new Random();
       int a=r.nextInt(11);
       Game g=new Game(a);
       g.getter();
        
       
    }
    
}