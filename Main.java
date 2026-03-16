
class SeniorCitizenException extends Exception {}
public class Main {
    public static void main(String[] args) {
        int age = 65;
        try {
            if (age >= 60) {
                throw new SeniorCitizenException();
            }
            System.out.println("Not a senior citizen");
        } catch (SeniorCitizenException e) {
            System.out.println("Senior citizen';");
        }
    }
}
