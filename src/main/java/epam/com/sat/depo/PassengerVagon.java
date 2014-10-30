package epam.com.sat.depo;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.CompareGenerator;
import epam.com.sat.railway.Builder;

import java.util.Comparator;

/**
 * Created by 1 on 28.10.2014.
 */
public class PassengerVagon extends Vagon {
    private int countPassenger;
    private String levelComfort;
    private enum Comfort{
        HARDCARD,PLATCCARD,CUPECARD;
    }
    public PassengerVagon(int idVagon){

        super(idVagon);
        Builder B=new Builder();
        this.countPassenger= B.randomCountPassenger();//countPassenger;
        String levelComfort=B.randomLevelComfort(idVagon);
        //if (levelComfort>100) {throw new IllegalArgumentException("Level of Comfort is > 100% !");};
        if ((Comfort.valueOf(levelComfort).ordinal() >=0 )) {};
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

    public static  int getIdComfort(String l){
        if (l=="HARDCARD") {return Comfort.HARDCARD.ordinal();};
        if (l=="PLATCCARD") {return Comfort.PLATCCARD.ordinal();};
        if (l=="CUPECARD") {return Comfort.CUPECARD.ordinal();};
        return -1;

    }
}

