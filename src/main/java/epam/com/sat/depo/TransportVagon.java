package epam.com.sat.depo;

/**
 * Created by 1 on 28.10.2014.
 */
public class TransportVagon extends Vagon{
    //int tonnOil=0;
    String typeCargo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransportVagon)) return false;

        TransportVagon that = (TransportVagon) o;

        if (!typeCargo.equals(that.typeCargo)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return typeCargo.hashCode();
    }

    @Override
    public String toString() {
        return "TransportVagon{" +
                "typeCargo='" + typeCargo + '\'' +
                '}';
    }

    /*
        public enum TypeCargo{
            LIQYID,SOLID,GAZ;
        }
        */
    public TransportVagon(int idVagon,String typeCargo){
        super(idVagon);
        //this.typeCargo=typeCargo;
        if ((Dictionary.TypeCargo.valueOf(typeCargo).ordinal() >=0 )) {};
        this.typeCargo=typeCargo;
    }
}
