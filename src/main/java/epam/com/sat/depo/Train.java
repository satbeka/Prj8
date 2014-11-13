package epam.com.sat.depo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * Created by 1 on 29.10.2014.
 */
public class Train {
    private String number;
    private static Logger trainLog = LoggerFactory.getLogger("trainLog");
    private List<Vagon> vagonsList = new ArrayList<Vagon>();

    public Train(String N){
        if (N.isEmpty()) { trainLog.error("Number of Train is empty!");
            throw new IllegalArgumentException();};
        this.number=N;
    }

    public Train addVagon(Vagon vagon){
        vagonsList.add(vagon);
        return this;
    }

    public Train removeVagon(Vagon vagon){
        vagonsList.remove(vagon);
        return this;
    }
    public int countVagon(){
        int c=this.vagonsList.size();
        //System.out.println("listTemp.size()=" + c);
        return c;
    }

    /*
    Create new ArrayList
    */
    public ArrayList<Vagon> getList(){
        int size=this.vagonsList.size();
        ArrayList<Vagon> listVagonListNew=new ArrayList<Vagon>(size);

        for (Vagon V : this.vagonsList) {
            listVagonListNew.add(V);
        }


        //System.arraycopy(this.vagonsList,0,listVagonListNew,0,size);
        return listVagonListNew;
    }

    public void setList(ArrayList<Vagon> listVagonNew){
        int size=listVagonNew.size();
        this.vagonsList.clear();
        //ArrayList<Vagon> listVagonListNew=new ArrayList<Vagon>(size);

        for (Vagon V : listVagonNew) {
            this.vagonsList.add(V);
        }

    }


    @Override
    public String toString(){
        String rez= "Train isn't exist ";
        List<Vagon> listTemp;
        listTemp=this.getList();
        if (0 == listTemp.size()) {return rez;};
        rez="Train="+this.number+"vagons= " +listTemp.size();
        return rez;
    }

    public String toInfo(){
        String rez= "Train isn't exist ";
        List<Vagon> listTemp;
        listTemp=this.getList();
        if (0 == listTemp.size()) {return rez;};
        rez="Train Number="+this.number+" have " +listTemp.size()+" vagons";
        trainLog.debug(rez);
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
        //System.out.println
        trainLog.debug("Lokomotiv add ");
    }
}
