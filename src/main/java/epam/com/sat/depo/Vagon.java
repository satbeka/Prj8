package epam.com.sat.depo;

/**
 * Created by 1 on 28.10.2014.
 */
public class Vagon{
    private int cargo=-1;
    private int idVagon=-1;
    public Vagon(int cargo,int idVagon){
        this.cargo=cargo;
        this.idVagon=idVagon;
    }
    public int getCountCargo() {
        return this.cargo;
    }

}
