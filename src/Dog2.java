public class Dog2 {

    private String name;
    private int identity;
    private String ownerName;
    private String rasa;
    private String haveFlees;

    public Dog2(String name, int identity, String ownerName, String rasa, String haveFlees) {
        this.name = name;
        this.identity = identity;
        this.ownerName = ownerName;
        this.rasa = rasa;
        this.haveFlees = haveFlees;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }
    // -----------------------------------------------
    public void setIdentity(int identity) {
        this.identity = identity;
    }

    //public double getIdentity(); {
        // return identity;




    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }
    // public void setRasa(String rasa); {
       // this.rasa = rasa;


    //public void sethaveFlees(String haveFlees);{
       // this.haveFlees = haveFlees;

    public void feed() {
        System.out.println("Karmimy psa: " + name);
    }

    public void scratch() {
        System.out.println("how how " + name);
    }

    @Override                   // zamiana dzialania metody ktora istnieje
    public String toString() {
        return name + " numer obrozy " + identity + " - wlasciciel " + ownerName + " rasa: " +rasa +" siersc: "+ haveFlees;
    }
}
