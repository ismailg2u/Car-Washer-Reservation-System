

public class CleaningType {
    String cleaningType;
    int price;
    CleaningType(String cleaningType){
        this.cleaningType = cleaningType;
        if (cleaningType == "interior")
        {
            System.out.println("you chosed interior ");
            price = 30;
        }
        else if (cleaningType == "exterior")
        {
            System.out.println("you chosed exterior ");
            price = 20;
        }
        else
            System.out.println("you chosed both of them");
        price = 45;

    }

    public int getPrice() {
        return price;
    }

    public String getCleaningType() {
        return cleaningType;
    }
}

