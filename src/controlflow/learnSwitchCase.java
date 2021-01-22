package controlflow;

public class learnSwitchCase {
    public static void main(String[] args) {
        int foodSerial= 10 ;
        String foodName;
        switch (foodSerial){
            case 1:
                foodName= "pizza";
                break;
            case 2 :
                foodName= "tomato";

            case 3:
                foodName ="selecto";
                break;
            case 4:
                foodName= "batata";
                break;
            case 5:
                foodName= "baklawa";
                break;
            case 6:
            foodName = "salade";
                break;
            case 7:
                foodName= "couscous";

                break;

            case 8: foodName= "pasta";
                break;
            default:
                foodName= "no food";
                break;

        }
        System.out.println("i need "+ foodName);

        String bestStudent= "marck";
        String level= "b1";

        switch (bestStudent) {
            case "level":
                bestStudent = "sarah";
                break;

            case "level2":
                bestStudent = "marck";
                break;
            case "level3":
                bestStudent = "alin";
                break;
            case "level4":
                bestStudent = "maya";
                break;
            default:
                bestStudent="no one";
        }
               // System.out.println("the best one is " +bestStudent);


    }
}
