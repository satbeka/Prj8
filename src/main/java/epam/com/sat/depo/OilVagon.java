package epam.com.sat.depo;

/**
 * Created by 1 on 28.10.2014.
 */
public class OilVagon extends Vagon{
    int tonnOil=0;
    String typeOil;
    public enum TypeOil{
        GAZOLINE,AI92,AI96,TOSOL;
    }
    public OilVagon(int c,int id,int tonn,String type){
        super(c,id);
        this.tonnOil=tonn;
        this.typeOil=type;
    }
}
