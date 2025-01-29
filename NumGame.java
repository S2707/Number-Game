import java.util.Scanner;
public class NumGame{
    
    public static void guessingNumGame(){
        // Scanner Class
        Scanner sc = new Scanner(System.in);

       // Number generating formula
        int NUM = 1 +(int)(100*Math.random());

        //Setting variable trials for guessing
        var K =10 ;

        int i, guess;

        System.out.println(
            "A number is choosen "
            +"between 1 to 100"
            +" Guess The Number"
           +" Within 10 Trials"
        );

        //Counting the trials upto K
        for(i=0; i<K; i++){
            System.out.println("Guess The Number:");

            //Take input for guessing
            guess = sc.nextInt();

            //If the Number is Guesssed
            if(NUM==guess){
                System.out.println("COngratulations!!"+"You Guessed The Number. ");

            }
            else if(NUM>guess && i!=K-1){
                System.out.println("The Number Is Greater Than "+guess);

            }
            else if(NUM<guess && i!=K-1){
                System.out.println("The Number Is Less Than "+guess);
            
            }
        }
        if(i == K){
            System.out.println("You Have exhausted "+K+" trials.");
            System.out.println("The Number Was"+NUM);
        }
     
    }
    
    //Main Driver code
    // execution begin
    public static void main(String arg[]){
        guessingNumGame();
    }
}