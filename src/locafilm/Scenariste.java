package locafilm;
// Generated 18 nov. 2016 16:55:43 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Scenariste generated by hbm2java
 */
public class Scenariste  implements java.io.Serializable {


     private BigDecimal idscenariste;
     private Film film;
     private String nom;

    public Scenariste() {
    }

	
    public Scenariste(BigDecimal idscenariste, Film film) {
        this.idscenariste = idscenariste;
        this.film = film;
    }
    public Scenariste(BigDecimal idscenariste, Film film, String nom) {
       this.idscenariste = idscenariste;
       this.film = film;
       this.nom = nom;
    }
   
    public BigDecimal getIdscenariste() {
        return this.idscenariste;
    }
    
    public void setIdscenariste(BigDecimal idscenariste) {
        this.idscenariste = idscenariste;
    }
    public Film getFilm() {
        return this.film;
    }
    
    public void setFilm(Film film) {
        this.film = film;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }




}


