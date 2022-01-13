import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import static java.lang.Math.cos;

public class World {

    ArrayList<Aeroport> aeroportArrayList;

    public World (String fileName){

        aeroportArrayList = new ArrayList<Aeroport>();

        try {
            BufferedReader buf = new BufferedReader(new FileReader(fileName));
            String s = buf.readLine();
            while(s!=null) {
                s = s.replaceAll("\"", "");

                String fields[] = s.split(",");

                if (fields[1].equals("large_airport")) {
                    Aeroport aeroport;
                    aeroportArrayList.add( aeroport = new Aeroport(fields[9], fields[2], fields[5],
                            Double.parseDouble(fields[10]), Double.parseDouble(fields[11])));

                }

                s = buf.readLine();
            }
        }
        catch (Exception e){
            System.out.println("Maybe the file isn't there ?");
            System.out.println(aeroportArrayList.get(aeroportArrayList.size()-1));
            e.printStackTrace();
        }

    }

    public Double Distance (Double latitude1, Double latitude2, Double longitude1, Double longitude2) {

       Double norme = Math.pow((latitude2 - latitude1),2) + Math.pow((longitude2 - longitude1)*cos((latitude2+latitude1)/2), 2);
       return norme;
    }

   // public Aeroport aeroport FindNearestAirport (Double latitude, Double longitude){
     //   Double distance = Distance(latitude, aeroportArrayList.get(0).getLatitude(), longitude, aeroportArrayList.get(0).getLongitude());
       // return
    //}

    //public Double findByCode () {

    //}


}
