package epam.com.sat.depo;

import epam.com.sat.railway.Builder;

/**
 * Created by 1 on 28.10.2014.
 */
public class Vagon{
    private int cargo;
    private int idVagon;
    public Vagon(int idVagon){
        Builder B=new Builder();
        this.cargo=B.randomCargo();
        this.idVagon=idVagon;
    }
    public int getCountCargo() {
        return this.cargo;
    }
    public int getIdVagon() {
        return this.idVagon;
    }
}
