package epam.com.sat.depo;

/**
 * Created by 1 on 28.10.2014.
 */
public class PassengerVagon extends Vagon{
    int countPassenger=0;
    int levelComfort=100;
    public PassengerVagon(int cargo,int idVagon,int countPassenger,int levelComfort){
        super(cargo,idVagon);
        this.countPassenger=countPassenger;
        if (levelComfort>100) {throw new IllegalArgumentException("Level of Comfort is > 100% !");};
        this.levelComfort=levelComfort;
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    public int getLevelComfort() {
        return levelComfort;
    }
}

