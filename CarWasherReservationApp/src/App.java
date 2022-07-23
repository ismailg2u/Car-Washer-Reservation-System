


public class App
{
    public static void main( String[] args )
    {
        System.out.println("------------------------");
        System.out.println("Welcome to Car Washer Reservation System");
        System.out.println("Chose your cleaning type:interior:30 dollar ,exterior:20 dollar or both of them:45 dollar");
        String cleaningType = "interior";
        CleaningType cleaningType1 = new CleaningType(cleaningType);
        System.out.println("Enter your car model");
        String carType = "SUV";
        System.out.println(carType);
        System.out.println("Enter your car plaque");
        String carPlaque = "26/ES/26";
        System.out.println(carPlaque);
        CarType carType1 = new CarType(carType,carPlaque);
        System.out.println("Enter date");
        Date date = new Date("10/01/2022");
        System.out.println(date.getDate());
        System.out.println("Enter your payment type cash or credit card");
        Payment payment = new Payment("cash");
        System.out.println("cash");
        Reservation makeReservation = new Reservation(cleaningType1,carType1,date,payment);
        System.out.println(makeReservation.getReservation());
        System.out.println("yor reservation is done");
        System.out.println("------------------------");
        System.out.println("User enters own plaque");
        System.out.println(carPlaque);
        System.out.println("Your car has been washed just 1 time on 10/01/2022 ");


    }
}
