public class Aeroport {
    private String iata;
    private String name;
    private String country;
    private Double latitude;
    private Double longitude;

    public Aeroport (String iata, String name, String country, Double latitude, Double longitude){
        this.iata = iata;
        this.name = name;
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getIata() {
        return iata;
    }
    public Double getLatitude() {
        return latitude;
    }
    public Double getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return ("L'aéroport " + name + " \n = " + "Le IATA est " + iata + " \n = " + "Le nom est " + name + " \n = " +"Le pays est "+ country + " \n = "
        + "La latitude est " + latitude + " \n = " + "La longitude est " + longitude);
    }
}
