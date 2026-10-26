public class MessagePrinter {
   public static String getWelcomeMessage() {
    return "Welcome to the updated Git and GitHub learning project!";
}

    public static String getDateMessage() {
        return "Today is: " + java.time.LocalDate.now();
    }

    public static String getTimeMessage() {
        return "Current time: " + java.time.LocalTime.now();
    }

    public static String getGoodbyeMessage() {
        return "Thank you for using MessagePrinter! Have a great day!";
    }

    public static String getAuthorMessage() {
        return "Created by: Artem Yatsenko";
    }

    public static void main(String[] args) {
        System.out.println(getWelcomeMessage());
        System.out.println(getAuthorMessage());
        System.out.println(getTimeMessage());
        System.out.println(getDateMessage());        System.out.println("Learning remote repositories!");
        System.out.println(getGoodbyeMessage());
    }
}
