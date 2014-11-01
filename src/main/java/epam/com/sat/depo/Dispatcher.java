package epam.com.sat.depo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.processing.SupportedOptions;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class Dispatcher {
    private String Name;
    private static Logger log = LoggerFactory.getLogger(Dispatcher.class);
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Train launchTrain(String nameDepo,String numberTrain, int countPassengerVagon,int countCargoVagon){
        Depo Depo=new Depo(nameDepo);
        Train T=new Train(numberTrain);

        T.addLokomotiv("TOYOTA","Sat");
        for (int i = 0; i <countPassengerVagon ; i++) {
            PassengerVagon P=new PassengerVagon(i);
            T.addVagon(P);
            //System.out.println
            log.debug(
             ("PassengerVagon add id="+P.getIdVagon()+" count of passengers="+P.getCountPassenger()
                    +" count of cargo="+P.getCountCargo()
                    +" comfort="+P.getLevelComfort())
            );
        }

        for (int k = countPassengerVagon; k <countPassengerVagon+countCargoVagon ; k++) {
            TransportVagon Tv=new TransportVagon(k,"GAZ");
            T.addVagon(Tv);

            log.debug
            //System.out.println
                    ("TransportVagon add id="+Tv.getIdVagon()
                    );
        }

        /*
        //for (int i = 0; i < totalVagons; i++) {
        PassengerVagon P1=new PassengerVagon(12,1,2,55);
        PassengerVagon P2=new PassengerVagon(5,2,1,65);
        PassengerVagon P3=new PassengerVagon(2,3,11,5);
        PassengerVagon P4=new PassengerVagon(50,4,5,95);
        PassengerVagon P5=new PassengerVagon(120,5,0,100);
        PassengerVagon P6=new PassengerVagon(0,6,0,15);
        PassengerVagon P7=new PassengerVagon(10,7,5,5);

        OilVagon O1=new OilVagon(80,9,80,"AI96");

        //}

        T.addVagon(P1).addVagon(P2).addVagon(P3).addVagon(P5).addVagon(P8).addVagon(P7).addVagon(O1);
        */

        Date sysDate = new Date();
        String sysDTString = sysDate.toString();

        //System.out.println
        log.info ("Train create on="+sysDTString);
        //log.error("TTTTTTTTTTTTT");
        return T;
    }
    public int calcTotalPassenger(Train T){
        int TotalPassenger=0;
        List<Vagon> listTemp;//=new ArrayList<Vagon>();
        listTemp=T.getList();
        for (int i = 0; i < T.countVagon(); i++) {
            Vagon Vg;
            Vg=listTemp.get(i);
            if (Vg instanceof PassengerVagon) {
                PassengerVagon VgP;
                VgP=(PassengerVagon)Vg;
                TotalPassenger+=VgP.getCountPassenger();
            };
        }
        //System.out.println
        log.info("TotalPassenger ="+TotalPassenger);
        return TotalPassenger;
    }
    public int calcTotalPassengerCargo(Train T){
        int TotalPassengerCargo=0;
        List<Vagon> listTemp;//=new ArrayList<Vagon>();
        listTemp=T.getList();
        for (int i = 0; i < T.countVagon(); i++) {
            Vagon Vg;
            Vg=listTemp.get(i);
            if (Vg instanceof PassengerVagon) {
                TotalPassengerCargo+=Vg.getCountCargo();
            };
        }
        //System.out.println
         log.info("TotalPassengerCargo ="+TotalPassengerCargo);
        return TotalPassengerCargo;
    }
    public int calcTotalCargo(Train T){
        int TotalCargo=0;
        List<Vagon> listTemp;//=new ArrayList<Vagon>();
        listTemp=T.getList();
        for (int i = 0; i < T.countVagon(); i++) {
            Vagon Vg;
            Vg=listTemp.get(i);
            TotalCargo+=Vg.getCountCargo();
        }
        //System.out.println
         log.info("TotalCargo ="+TotalCargo);
        return TotalCargo;
    }

    public void sortByComfortLevel(Train T){

        //----
        ArrayList<Vagon> listVagonSort=T.getList();
        Collections.sort(listVagonSort, new Comparator<Vagon>() {
            @Override
            public int compare(Vagon o1, Vagon o2) {
                if ((o1 instanceof TransportVagon)) {
                    return -1;
                }
                ;
                if ((o2 instanceof TransportVagon)) {
                    return -1;
                }
                ;
                String a = ((PassengerVagon) o1).getLevelComfort();
                String b = ((PassengerVagon) o2).getLevelComfort();
                //System.out.println
                log.debug ("a="+a+" "+PassengerVagon.getIdComfort(a));
                //System.out.println
                log.debug ("b="+b+" "+PassengerVagon.getIdComfort(b));

                //PassengerVagon.getIdComfort(a);
                //PassengerVagon.getIdComfort(b);

                return PassengerVagon.getIdComfort(a) > PassengerVagon.getIdComfort(b) ? 1 : a == b ? 0 : -1;
            }
        });

        //---
        //System.out.println
                log.info(" Sort by comfort level is:");
        for (Vagon V :listVagonSort) {
            if ((V instanceof PassengerVagon)) {
                //System.out.println
                        log.info("PassengerVagon id=" + V.getIdVagon() + " comfort level= "
                        + ((PassengerVagon) V).getLevelComfort());
            }

        }
        T.setList(listVagonSort);

    }

    static public List<Integer> searchVagons(int fromA, int toB, Train T)
    {
        List<Integer> arrVagons=new ArrayList<Integer>();
        List<Vagon> listTemp;
        listTemp=T.getList();
        int cntP;

        for (Vagon V : listTemp) {
            if ((V instanceof PassengerVagon)) {
                cntP=((PassengerVagon) V).getCountPassenger();
                if (cntP>=fromA&&cntP<=toB) {arrVagons.add(V.getIdVagon());};

                //System.out.println("PassengerVagon id=" + V.getIdVagon() + " comfort level= "
                //      + ((PassengerVagon) V).getLevelComfort());
            }


        }
        if (arrVagons.size()==0) {log.info("Find 0 vagons ");};
        return arrVagons;
    }

}
