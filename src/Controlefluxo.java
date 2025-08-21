public class Controlefluxo {
    public static void main(String[] args){

        // if else
        int number = 7;
        if(number > 10){
            System.out.println("Greater");
        } else if (number == 100){
            System.out.println("Exactly");
        } else{
            System.out.println("Less");
        }

        // switch
        int dayNum = 3;
        switch (dayNum){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            default:
                System.out.println("i don't remember");
        }

        //while loop
        int count = 0;
        while (count < 7){
            System.out.println("i am bonito " + count);
            count++;
        }

        //do while loop
        int x = 0;
        do {
            System.out.println("x is " + x);
            x++;
        } while (x < 3);

        //for loop
        for (int i = 0; i < 3;i++) {
            System.out.println("i is " + i);
        }

        //break e continue
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            if (i == 1){
                continue;
            }
            System.out.println("i = " + i);
        }

    }
}
