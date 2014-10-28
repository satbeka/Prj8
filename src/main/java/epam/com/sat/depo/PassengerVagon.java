package epam.com.sat.depo;

/**
 * Created by 1 on 28.10.2014.
 */
public class PassengerVagon extends Vagon{
    int countPassenger=0;
    int levelComfort=100;
    public PassengerVagon(int c,int id,int cP,int lC){
        super(c,id);
        this.countPassenger=cP;
        this.levelComfort=lC;
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    public int getLevelComfort() {
        return levelComfort;
    }
}

