package epam.com.sat.depo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by 1 on 29.10.2014.
 */
public class Train {
    private String number="-000";
    public Train(String N){
        if (N.isEmpty()) {throw new IllegalArgumentException("Number of Train is empty!");};
        this.number=N;

    }
    private List<Vagon> vagonsList = new ArrayList<Vagon>();
    public Train addVagon(Vagon vagon){
        vagonsList.add(vagon);
        return this;
    }
    public int countVagon(){

        int c=this.vagonsList.size();
        System.out.println("listTemp.size()=" + c);
        return c;
    }
    public ArrayList<Vagon> getList(){
        int size=this.vagonsList.size();
        ArrayList<Vagon> listVagonListNew=new ArrayList<Vagon>(size);

        System.arraycopy(this.vagonsList,0,listVagonListNew,0,size);
        return listVagonListNew;
    }

    public int calcTotalPassenger(){
        int TotalPassenger=0;
        List<Vagon> listTemp;//=new ArrayList<Vagon>();
        listTemp=this.getList();

        for (int i = 0; i < this.countVagon(); i++) {
            Vagon Vg;
            Vg=listTemp.get(i);
            if (Vg instanceof PassengerVagon) {
                PassengerVagon VgP;
                VgP=(PassengerVagon)Vg;
                TotalPassenger+=VgP.getCountPassenger();
            };
        }

        Date sysDate = new Date();
        String sysDTString = sysDate.toString();

        {System.out.println("TotalPassenger on="+sysDTString+" = "+TotalPassenger);}
        return TotalPassenger;
    }

    public int calcTotalPassengerCargo(){
        int TotalPassengerCargo=0;
        List<Vagon> listTemp;//=new ArrayList<Vagon>();
        listTemp=this.getList();

        for (int i = 0; i < this.countVagon(); i++) {
            Vagon Vg;
            Vg=listTemp.get(i);
            if (Vg instanceof PassengerVagon) {
                TotalPassengerCargo+=Vg.getCountCargo();
            };
        }

        Date sysDate = new Date();
        String sysDTString = sysDate.toString();

        {System.out.println("TotalPassengerCargo on="+sysDTString+" = "+TotalPassengerCargo);}
        return TotalPassengerCargo;
    }

    public int calcTotalCargo(){
        int TotalCargo=0;
        List<Vagon> listTemp;//=new ArrayList<Vagon>();
        listTemp=this.getList();

        for (int i = 0; i < this.countVagon(); i++) {
            Vagon Vg;
            Vg=listTemp.get(i);
            TotalCargo+=Vg.getCountCargo();

        }

        Date sysDate = new Date();
        String sysDTString = sysDate.toString();

        {System.out.println("TotalCargo on="+sysDTString+" = "+TotalCargo);}
        return TotalCargo;
    }

    @Override
    public String toString(){
        String rez= "Train isn't exist ";
        List<Vagon> listTemp;
        listTemp=this.getList();
        if (0 == listTemp.size()) {return rez;};
        rez="Train N="+this.number+" have " +listTemp.size()+" vagons";
        return rez;
    }

    public class Lokomotiv{
       public String Mark;
       public String Driver;
   }
    public void addLokomotiv(String M,String D){
        Lokomotiv L=new Lokomotiv();
        L.Mark=M;
        L.Driver=D;
        System.out.println("Lokomotiv add ");
    }
}
