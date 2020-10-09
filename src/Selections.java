import java.awt.*;

public class Selections {
    public static void main(String[] args) {

        int hour = 0;
        int minute =58;

        if ((hour >=9) && (hour <15)){
            System.out.println("Du er i skole");

        }else {
            System.out.println("DU er ikke i skole");

            if (hour == 0) System.out.println("Det midnat");

            //Switch

            String color = "sort";

            switch (color){
                case "red":
                    System.out.println("En rød sportsvogn");
                    break;
                case "green":
                    System.out.println("En grøn offroader");
                    break;
                default:
                    System.out.println("En eller anden random bil");

            }
        }
    }
}
