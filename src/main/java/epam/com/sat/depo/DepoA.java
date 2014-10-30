package epam.com.sat.depo;

/**
 * @author sat
 */
public class DepoA {
    public enum Name{
        ASTANA, KARAGANDA, ALMATY, YRALSK;
    }
    public Train createTrain(String Nm){
        return new Train(Nm);
    }
}

