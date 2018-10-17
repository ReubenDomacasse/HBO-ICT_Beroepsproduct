import javax.swing.*;

public class Product {

    private int aantal = 0;
    private String naam = null;
    private float prijs = 0.2F;
    private JButton product;

    public Product() {

    }

    public Product(int aantal, String naam, float prijs, JButton product) {
        this.aantal = aantal;
        this.naam = naam;
        this.prijs = prijs;
        this.product = product;
    }

    public Product(int aantal, String naam, float prijs) {
        this.aantal = aantal;
        this.naam = naam;
        this.prijs = prijs;
    }



    public int getAantal() {
        return aantal;
    }

    public void setAantal(int aantal) {
        this.aantal = aantal;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public float getPrijs() {
        return prijs;
    }

    public void setPrijs(float prijs) {
        this.prijs = prijs;
    }

    public void productsubtotaal(float p1,float p2){
        System.out.println("Totaal:\t"+(p1+p2));
    }

    public void productkorting(){

    }

    public void productbtw(){

    }

    public void producttotaal(){

    }

}
