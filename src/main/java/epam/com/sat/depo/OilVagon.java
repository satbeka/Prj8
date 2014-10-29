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
    public OilVagon(int cargo,int idVagon,int tonn,String typeOil){
        super(cargo,idVagon);
        this.tonnOil=tonn;
        if (typeOil>TypeOil.valueOf()) {throw new IllegalArgumentException("There isn't such type as="+typeOil);};
        this.typeOil=typeOil;
    }
}
