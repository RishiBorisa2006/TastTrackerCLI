public class Main {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Please provide a valid argument.");
            return;
        }
        String input = args[0];
        switch (input) {
            case "add":
                System.out.println("You chose add!");
                break;
            case "list":
                System.out.println("You chose list!");
                break;
            case "delete":
                System.out.println("You chose delete!");
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
    }
}