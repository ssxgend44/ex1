public class Main {
    public static void main(String[] args) {

        String cityName = "Galloway";
        int zipCode = 43119;
        double[] temperature = {32, 25, 27, 40, 45};

        double total = (32 + 25 + 27 + 40 + 45);
        double avg = total / 5;

        System.out.println("City: " + cityName);
        System.out.println("Zip Code: " + zipCode);
        System.out.println("Average temperature: " + avg + " degrees.");
    }
}
