
public class CompanyInfo {

    public static void displayCompanyName() {
        System.out.println("Smart Electronics");
    }
    
    public static void displayHours() {
        System.out.println("Monday - Friday  8 am to 6 pm\n" 
                         + "Saturday         8 am to noon\n"
                         + "Sunday           closed");
    }

    public static void main(String[] args) {
        displayCompanyName();
        displayHours();
    }
}
