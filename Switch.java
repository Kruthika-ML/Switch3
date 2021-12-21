public class Switch {
    public static void main(String[] args) {
        int SwitchValue = 4;

        switch (SwitchValue){
            case 1:
                System.out.println("Value is 1");
                break;

            case 2:
                System.out.println("Value is 2");
                break;

            case 3: case 4: case 5:
                System.out.println("3, 4 or 5");
                break;

            default:
                System.out.println("Others");
        }
    }
}
