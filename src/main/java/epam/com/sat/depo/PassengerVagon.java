package epam.com.sat.depo;

import epam.com.sat.builder.TrainBuilder;

import java.util.Comparator;

/**
 * Created by 1 on 28.10.2014.
 */
public class PassengerVagon extends Vagon implements Comparable {
    private int countPassenger;
    private String levelComfort;
    /*
    private enum Comfort{
        COMMON_PLACE,PLATSKARD,
        COMPARTMENT;
    }
    */
    public PassengerVagon(int idVagon) {

        super(idVagon);
        TrainBuilder B=new TrainBuilder();
        this.countPassenger= B.randomCountPassenger();//countPassenger;
        String levelComfort=B.randomLevelComfort(idVagon);
        //if (levelComfort>100) {throw new IllegalArgumentException("Level of Comfort is > 100% !");};
        if ((Dictionary.Comfort.valueOf(levelComfort).ordinal() >=0 )) {};
        this.levelComfort=levelComfort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassengerVagon)) return false;

        PassengerVagon that = (PassengerVagon) o;

        if (countPassenger != that.countPassenger) return false;
        if (!levelComfort.equals(that.levelComfort)) return false;

        return true;
    }


    @Override
    public int hashCode() {
        int result = countPassenger;
        result = 31 * result + levelComfort.hashCode();
        return result;
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
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(PassengerVagon.getIdComfort(this.getLevelComfort()),PassengerVagon.getIdComfort(
                ((PassengerVagon) o).getLevelComfort()));
        //return 0;
    }
}


