public class SimpleTrafficLight {
    public static void delay(){
        try {
            // Sleep for 1 seconds (1000 milliseconds)
            Thread.sleep(995);
        } catch (InterruptedException e) {
            // Handle the interruption if needed
            e.printStackTrace();
        }
    }
    public static void displaySecWithStr(String str){
        int s=0;
        while(true){
            // to clear screen
            System.out.print("\033[H\033[2J"); 
            System.out.flush();

            System.out.println("\tSimple Traffic Light\n");
            // to print signal 
            System.out.print(str);
            if(s>5){
                return;
            }
            System.out.println(s);
            delay(); // 1 sec sleep
            s++;
        }
    }
    public static void main(String[] args) {
 // Simple Traffic Light: Implement a program that simulates a simple traffic light with states like "Red," "Yellow," and "Green." Use a switch statement to handle the transitions between states.
        
        int c=1;
        String str;
        while(true){
             switch(c){
            case 1:
                str="\tGreen Light\n\tGo : ";
                displaySecWithStr(str); // delay code 60 sec
                break;
            case 2:
                str="\tYellow Light\n\tSlow down : ";
                displaySecWithStr(str); // delay code 60 sec
                break;
            case 3:
                str="\tRed Light\n\tStop : ";
                displaySecWithStr(str); // delay code 60 sec
                break;
            }   c++;
            if(c>3){
                c=1;
            }
        }      
    
    }
}
