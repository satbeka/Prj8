package epam.com.sat.depo;

import epam.com.sat.builder.TrainBuilder;

/**
 * Created by 1 on 28.10.2014.
 */
public class PassengerVagon extends Vagon {
    private int countPassenger;
    private String levelComfort;
    /*
    private enum Comfort{
        COMMON_PLACE,PLATSKARD,
        COMPARTMENT;
    }
    */
    public PassengerVagon(int idVagon){

        super(idVagon);
        TrainBuilder B=new TrainBuilder();
        this.countPassenger= B.randomCountPassenger();//countPassenger;
        String levelComfort=B.randomLevelComfort(idVagon);
        //if (levelComfort>100) {throw new IllegalArgumentException("Level of Comfort is > 100% !");};
        if ((Dictionary.Comfort.valueOf(levelComfort).ordinal() >=0 )) {};
        this.levelComfort=levelComfort;
    }

    @Override
    public String toString(){
        return "Passenger Vagon id="+this.getIdVagon()+" count passengers="+this.getCountPassenger();
    }
    public int getCountPassenger() {
        return this.countPassenger;
    }

    public String getLevelComfort() {
        return this.levelComfort;
    }

    public static  int getIdComfort(String l) {
        if (l == "COMMON_PLACE") {
            return Dictionary.Comfort.COMMON_PLACE.ordinal();
        }
        ;
        if (l == "PLATSKARD") {
            return Dictionary.Comfort.PLATSKARD.ordinal();
        }
        ;
        if (l == "COMPARTMENT") {
            return Dictionary.Comfort.COMPARTMENT.ordinal();
        }
        ;
        return -1;
    }}


