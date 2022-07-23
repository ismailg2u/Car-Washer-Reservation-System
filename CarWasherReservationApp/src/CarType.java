
public class CarType {
    String carModel;
    String plaque;

    CarType(String
                    carModel,String plaque){
        this.carModel = carModel;
        this.plaque = plaque;
    }




    public String getCar() {
        return
                "carModel='" + carModel + '\'' +
                        ", plaque='" + plaque + '\''
                ;
    }
}
