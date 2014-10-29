package epam.com.sat.depo;

/**
 * @author sat
 */
public class DepoA {
    public enum Name{
        ASTANA, KARAGANDA, ALMATY, YRALSK;
    }
    public Train createTrain(String Nm){
        Train T=new Train(Nm);
        return T;
    }
}

