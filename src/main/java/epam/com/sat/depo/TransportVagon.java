package epam.com.sat.depo;

/**
 * Created by 1 on 28.10.2014.
 */
public class TransportVagon extends Vagon{
    //int tonnOil=0;
    String typeCargo;
    public enum TypeCargo{
        LIQYID,SOLID,GAZ;
    }
    public TransportVagon(int idVagon,String typeCargo){
        super(idVagon);
        //this.typeCargo=typeCargo;
        if ((TypeCargo.valueOf(typeCargo).ordinal() >=0 )) {};
        this.typeCargo=typeCargo;
    }
}
