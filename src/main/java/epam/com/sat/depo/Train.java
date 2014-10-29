package epam.com.sat.depo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1 on 29.10.2014.
 */
public class Train {
    private String Number="-000";
    public Train(String N){
        if (N.isEmpty()) {throw new IllegalArgumentException("Number of Train is empty!");};
        this.Number=N;

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
