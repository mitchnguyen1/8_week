public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "sunny";
        // Determine what to wear based on the weather (e.g., sunny, cloudy, rainy, snowy)
        // Decide whether to use if-else or switch
        switch (weather) {
            case "sunny":
                System.out.println("Shirt");
                break;
            case "cloudy":
                System.out.println("Tank Top");
                break;
            case "rainy":
                System.out.println("Raincoat");
                break;
            case "snowy":
                System.out.println("Thick coat");
                break;
        }
        // Section 2: User role
        int role = 2;
        // Determine user access level based on the role (e.g., 1: admin, 2: editor, 3: user)
        // Decide whether to use if-else or switch
        switch (role) {
            case 1:
                System.out.println("Admin");
                break;
            case 2:
                System.out.println("Editor");
                break;
            case 3:
                System.out.println("User");
                break;
            default:
                System.out.println("Contact HR");
        }

        // Section 3: Temperature and humidity
        int temperature = 75;
        int humidity = 65;
        // Determine the comfort level based on both temperature and humidity (e.g., too hot, too cold, comfortable)
        // Decide whether to use if-else or switch
        if(temperature >= 80 && humidity >= 60){
            System.out.println("It's too hot and humid");
        }else if (temperature >= 80){
            System.out.println("It's too hot");
        }else if (temperature <= 60 && humidity >= 60){
            System.out.println("it's too cold and humid");
        }else{
            System.out.println("Stay inside");
        }

        // Section 5: Age and income
        int age = 25;
        int income = 50000;
        // Determine eligibility for a specific credit card based on age and income
        // Decide whether to use if-else or switch
        if(age >= 18 && age <= 60 && income >= 30000){
            System.out.println("Eligible for credit card");
        }else{
            System.out.println("Sorry you are not eligible");
        }

        // Section 1: Traffic light colors
        String lightColor = "green";
        // Determine what action to take based on the traffic light color (e.g., green, yellow, red)
        // Decide whether to use if-else or switch
        switch(lightColor){
            case "green":
                System.out.println("Go");
                break;
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Slow Down");
                break;
            default:
                System.out.println("Power Outage");
        }

        // Section 2: Exam grade
        int grade = 85;
        // Determine the letter grade based on the numeric grade (e.g., A, B, C, D, F)
        // Decide whether to use if-else or switch

        // Section 3: Browser type
        String browser = "Chrome";
        // Check if the browser is one of the following: Chrome, Firefox, Safari, Edge, or Opera
        // Decide whether to use if-else or switch
        switch(browser){
            case "Chrome":
                System.out.println("Enjoy Chrome");
                break;
            case "Firefox":
                System.out.println("Best non profit browser");
                break;
            case "Safari":
                System.out.println("I see ur an apple head");
                break;
            case "Edge":
                System.out.println("This is old");
                break;
            case "Opera":
                System.out.println("Like this browser?");
                break;
            default:
                System.out.println("What browser are you on?");
        }

    }
}
