package locafilm;
// Generated 18 nov. 2016 16:55:43 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Role generated by hbm2java
 */
public class Role  implements java.io.Serializable {


     private BigDecimal idrole;
     private Equipetournage equipetournage;
     private Film film;
     private String personnage;

    public Role() {
    }

	
    public Role(BigDecimal idrole, Equipetournage equipetournage, Film film) {
        this.idrole = idrole;
        this.equipetournage = equipetournage;
        this.film = film;
    }
    public Role(BigDecimal idrole, Equipetournage equipetournage, Film film, String personnage) {
       this.idrole = idrole;
       this.equipetournage = equipetournage;
       this.film = film;
       this.personnage = personnage;
    }
   
    public BigDecimal getIdrole() {
        return this.idrole;
    }
    
    public void setIdrole(BigDecimal idrole) {
        this.idrole = idrole;
    }
    public Equipetournage getEquipetournage() {
        return this.equipetournage;
    }
    
    public void setEquipetournage(Equipetournage equipetournage) {
        this.equipetournage = equipetournage;
    }
    public Film getFilm() {
        return this.film;
    }
    
    public void setFilm(Film film) {
        this.film = film;
    }
    public String getPersonnage() {
        return this.personnage;
    }
    
    public void setPersonnage(String personnage) {
        this.personnage = personnage;
    }




}


