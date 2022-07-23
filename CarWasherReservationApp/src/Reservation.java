

public class Reservation {
    CleaningType cleaningType;
    CarType carType;
    Date date;
    Payment payment;


    Reservation(CleaningType cleaningType ,CarType carType, Date date,Payment payment){
        this.cleaningType = cleaningType;
        this.carType = carType;
        this.date = date;
        this.payment = payment;
    }

    public String getReservation() {
        return   "-----------------"+
                "\nInvoice\n" +
                "-----------------"+
                "\ncleaningType=" + cleaningType.getCleaningType() +
                "\n-----------------"+
                "\n" + carType.getCar() +
                "\n-----------------"+
                "\ndate=" + date.getDate() +
                "\n-----------------"+
                "\nPayment=" + payment.getPaymentType() +
                "\n-----------------"+
                "\nPrice:"+ cleaningType.getPrice()+ " dollar" +
                "\n-----------------"

                ;
    }
}

