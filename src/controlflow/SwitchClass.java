package controlflow;

public class SwitchClass {
    public static void main(String[] args) {
        order();
    }

    public static void order() {
        int drink = 4;
        String drinkmenu;
        switch (drink) {
            case 1:
                drinkmenu = "pepsi";
                break;
            case 2:
                drinkmenu = "coca";
                break;
            case 3:
                drinkmenu = "tea";
                break;
            case 4:
                drinkmenu = "coffe";
                break;
            case 5:
                drinkmenu = "beer";
                break;
            case 6:
                drinkmenu = "water";
                break;
            default:
                drinkmenu = "no drink sorry!";

        }
        System.out.println("i want to drink " + drinkmenu + " please");

    }
}
