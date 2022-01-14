public class Main {

    static public void main(String args[]) {

        World w = new World("./data/airport-codes_no_comma.csv");
        System.out.println("Found "+ w.getAeroportArrayList().size()+" airports.");
        Aeroport paris = w.FindNearestAirport(2.316, 48.866);
        //Aeroport cdg = w.findByCode("CDG");
        //double distance = w.Distance(2.316, 48.866, cdg.getLongitude(), cdg.getLatitude());
        System.out.println(paris);
        //System.out.println(distance);
        //double distanceCDG = w.Distance(2.36, 48.866, cdg.getLongitude(), cdg.getLatitude());
        //System.out.println(cdg);
        //System.out.println(distanceCDG);
    }
}
