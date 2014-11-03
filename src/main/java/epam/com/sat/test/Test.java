package epam.com.sat.test;

import epam.com.sat.depo.Depo;
//import epam.com.sat.depo.DepoA;
import epam.com.sat.depo.Dispatcher;
import epam.com.sat.depo.Train;
import org.slf4j.*;
//import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by 1 on 28.10.2014.
 */
public class Test {

    public static void main(String[] args) {

        Logger log = LoggerFactory.getLogger(Test.class);


        log.info("Begin");
        log.debug("Begin");
        int totalPassengerCargo;int totalPassenger;
        Depo depo=new Depo("KARAGANDA");
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setName("Sat");
        Train train= dispatcher.launchTrain("015-Astana",21,2);
        //System.out.println(Train1.toString());
        log.info(train.toString());
        if ((train != null)) {
            totalPassengerCargo=dispatcher.calcTotalPassengerCargo(train);
            totalPassenger=dispatcher.calcTotalPassenger(train);
            dispatcher.sortByComfortLevel(train);
            List<Integer> arrFindVagons;
            arrFindVagons=dispatcher.searchVagons(2,8,train);
            //System.out.println
            // ("Find vagons in range between 2 and 8:");
            log.info("Find vagons in range between 2 and 8:");
            for (Integer Id : arrFindVagons) {
                //System.out.println("Vagon id=" + Id);
                log.info("Vagon id=" + Id);
                }

            }

        System.gc();

        }



    }

