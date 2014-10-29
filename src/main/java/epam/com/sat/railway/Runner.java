package epam.com.sat.railway;

import epam.com.sat.depo.*;
//import epam.com.sat.depo.Train;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by 1 on 28.10.2014.
 */
public class Runner {

    /*
    {
    Date sysDate = new Date();
    String sysDTString = sysDate.toString();}
    */

    static public void launchTrain(){
        DepoA Depo;
        Train T=Depo.createTrain("01As");

        //T.Lokomotiv.Driver="Sat";
        //T.Lokomotiv.Mark="TOYOTA";
        T.addLokomotiv("TOYOTA","Sat");

        PassengerVagon P1=new PassengerVagon(12,1,2,55);
        PassengerVagon P2=new PassengerVagon(5,2,1,65);
        PassengerVagon P3=new PassengerVagon(2,3,11,5);
        PassengerVagon P4=new PassengerVagon(50,4,5,95);
        PassengerVagon P5=new PassengerVagon(120,5,0,100);
        PassengerVagon P6=new PassengerVagon(0,6,0,15);
        PassengerVagon P7=new PassengerVagon(10,7,5,5);
        PassengerVagon P8=new PassengerVagon(12,8,7,95);
        OilVagon O1=new OilVagon(80,9,80,"AI95");

        T.addVagon(P1).addVagon(P2).addVagon(P3).addVagon(P5).addVagon(P8).addVagon(P7).addVagon(O1);

        Date sysDate = new Date();
        String sysDTString = sysDate.toString();

        {System.out.println("Train create on="+sysDTString);}
        //return 1;
    }

    static public int calcTotalPassenger(Train T){
        int TotalPassenger=0;
        List<Vagon> listTemp;//=new ArrayList<Vagon>();
        listTemp=T.getList();

        for (int i = 0; i < T.countVagon(); i++) {
            List<Vagon> listTemp=new ArrayList<Vagon>();
            listTemp=this.vagonsList;

        }

        Date sysDate = new Date();
        String sysDTString = sysDate.toString();

        {System.out.println("TotalPassenger on="+sysDTString+" = "+TotalPassenger);}
        return TotalPassenger;
    }

    static public int calcTotalCargo(){
        int TotalCargo=0;
        Date sysDate = new Date();
        String sysDTString = sysDate.toString();

        {System.out.println("TotalCargo on="+sysDTString+" = "+TotalCargo);}
        return TotalCargo;
    }



}
