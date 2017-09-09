
public class Lypsyrobotti {
    
    private Maitosailio sailio;
    
    public Lypsyrobotti() {
        this.sailio = null;
    }
    
    public Maitosailio getMaitosailio() {
        if (sailio == null) {
            return null;
        }
        return sailio;
    }
    
    public void setMaitosailio(Maitosailio maitosailio) {
        sailio = maitosailio;
    }
    
    public void lypsa(Lypsava lypsava) {
        if (sailio == null) {
            System.out.println("Maidot menevät hukkaan!");
        } else {
            sailio.lisaaSailioon(lypsava.lypsa());
            lypsava.lypsa();
        }
    }
}
