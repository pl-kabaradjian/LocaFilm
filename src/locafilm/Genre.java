package locafilm;
// Generated 18 nov. 2016 16:55:43 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Genre generated by hbm2java
 */
public class Genre  implements java.io.Serializable {


     private BigDecimal idgenre;
     private String genre;
     private Set films = new HashSet(0);

    public Genre() {
    }

	
    public Genre(BigDecimal idgenre) {
        this.idgenre = idgenre;
    }
    public Genre(BigDecimal idgenre, String genre, Set films) {
       this.idgenre = idgenre;
       this.genre = genre;
       this.films = films;
    }
   
    public BigDecimal getIdgenre() {
        return this.idgenre;
    }
    
    public void setIdgenre(BigDecimal idgenre) {
        this.idgenre = idgenre;
    }
    public String getGenre() {
        return this.genre;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public Set getFilms() {
        return this.films;
    }
    
    public void setFilms(Set films) {
        this.films = films;
    }




}


