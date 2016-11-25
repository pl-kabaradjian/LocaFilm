package locafilm;
// Generated 18 nov. 2016 16:55:43 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Annonce generated by hbm2java
 */
public class Annonce  implements java.io.Serializable {


     private BigDecimal idannonce;
     private Film film;
     private String annonce;

    public Annonce() {
    }

	
    public Annonce(BigDecimal idannonce, Film film) {
        this.idannonce = idannonce;
        this.film = film;
    }
    public Annonce(BigDecimal idannonce, Film film, String annonce) {
       this.idannonce = idannonce;
       this.film = film;
       this.annonce = annonce;
    }
   
    public BigDecimal getIdannonce() {
        return this.idannonce;
    }
    
    public void setIdannonce(BigDecimal idannonce) {
        this.idannonce = idannonce;
    }
    public Film getFilm() {
        return this.film;
    }
    
    public void setFilm(Film film) {
        this.film = film;
    }
    public String getAnnonce() {
        return this.annonce;
    }
    
    public void setAnnonce(String annonce) {
        this.annonce = annonce;
    }




}


