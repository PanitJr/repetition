import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        oddNumbers();
//        average();
//        multiplicationTable();
//        board(7,7);
//        lessLine();
//        LightSaber lightSaber = new LightSaber();
//        // Lightsaber is now turn on
//        lightSaber.turn();
//        // Lightsaber is now turn off
//        lightSaber.turn();
//        // Lightsaber is now turn on
//        lightSaber.turn();
        Integer.parseInt("a");
    }

    public static void oddNumbers(){
        int i=0;
        while (i<=50){
            //if i is odd number
            if(i%2 == 1){
                System.out.println(i);
            }
            i++;
        }
    }

    public static void average(){
        int i=1;
        int sum=0;

        do{
            System.out.print("enter number "+i+":");
            sum+=scanner.nextInt();
            i++;
        }while(i<=5);

        System.out.println("average is :"+sum/5);
    }

    public static void multiplicationTable(){
        for(int i=2;i<=5;i++){
            for(int j=1;j<=12;j++){
                System.out.println(i+"x"+j+"="+i*j);
            }
            System.out.println("---------------");
        }
    }

    public static void board(int a,int b){
        for(int i=1;i<=a;i++){
            if((i%2)==0){
                System.out.print(" ");
            }
            for(int j=1;j<b*2;j++){
                if((j%2)==0){
                    System.out.print(" ");
                }else{
                    System.out.print("#");
                }
            }
            System.out.println("");
        }
    }

    public static void lessLine(){
        for(int i = 0; i<10; i++){
            for(int j = 10-i;j>0;j--){
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static boolean isNumber(String s){
        try {
            Integer.parseInt(s);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
