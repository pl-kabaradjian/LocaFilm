package locafilm;
// Generated 18 nov. 2016 16:55:43 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.sql.Blob;
import java.util.HashSet;
import java.util.Set;

/**
 * Film generated by hbm2java
 */
public class Film  implements java.io.Serializable {


     private BigDecimal idfilm;
     private Equipetournage equipetournage;
     private String titre;
     private BigDecimal annee;
     private String langue;
     private BigDecimal duree;
     private Blob resume;
     private String poster;
     private Set copies = new HashSet(0);
     private Set annonces = new HashSet(0);
     private Set roles = new HashSet(0);
     private Set genres = new HashSet(0);
     private Set payses = new HashSet(0);
     private Set scenaristes = new HashSet(0);
     private Set realisateur = new HashSet(0);

    public Film() {
    }

	
    public Film(BigDecimal idfilm) {
        this.idfilm = idfilm;
    }
    public Film(BigDecimal idfilm, Equipetournage equipetournage, String titre, BigDecimal annee, String langue, BigDecimal duree, Blob resume, String poster, Set copies, Set annonces, Set roles, Set genres, Set payses, Set scenaristes, Set realisateur) {
       this.idfilm = idfilm;
       this.equipetournage = equipetournage;
       this.titre = titre;
       this.annee = annee;
       this.langue = langue;
       this.duree = duree;
       this.resume = resume;
       this.poster = poster;
       this.copies = copies;
       this.annonces = annonces;
       this.roles = roles;
       this.genres = genres;
       this.payses = payses;
       this.scenaristes = scenaristes;
       this.realisateur = realisateur;
    }
   
    public BigDecimal getIdfilm() {
        return this.idfilm;
    }
    
    public void setIdfilm(BigDecimal idfilm) {
        this.idfilm = idfilm;
    }
    public Equipetournage getEquipetournage() {
        return this.equipetournage;
    }
    
    public void setEquipetournage(Equipetournage equipetournage) {
        this.equipetournage = equipetournage;
    }
    public String getTitre() {
        return this.titre;
    }
    
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public BigDecimal getAnnee() {
        return this.annee;
    }
    
    public void setAnnee(BigDecimal annee) {
        this.annee = annee;
    }
    public String getLangue() {
        return this.langue;
    }
    
    public void setLangue(String langue) {
        this.langue = langue;
    }
    public BigDecimal getDuree() {
        return this.duree;
    }
    
    public void setDuree(BigDecimal duree) {
        this.duree = duree;
    }
    public Blob getResume() {
        return this.resume;
    }
    
    public void setResume(Blob resume) {
        this.resume = resume;
    }
    public String getPoster() {
        return this.poster;
    }
    
    public void setPoster(String poster) {
        this.poster = poster;
    }
    public Set getCopies() {
        return this.copies;
    }
    
    public void setCopies(Set copies) {
        this.copies = copies;
    }
    public Set getAnnonces() {
        return this.annonces;
    }
    
    public void setAnnonces(Set annonces) {
        this.annonces = annonces;
    }
    public Set getRoles() {
        return this.roles;
    }
    
    public void setRoles(Set roles) {
        this.roles = roles;
    }
    public Set getGenres() {
        return this.genres;
    }
    
    public void setGenres(Set genres) {
        this.genres = genres;
    }
    public Set getPayses() {
        return this.payses;
    }
    
    public void setPayses(Set payses) {
        this.payses = payses;
    }
    public Set getScenaristes() {
        return this.scenaristes;
    }
    
    public void setScenaristes(Set scenaristes) {
        this.scenaristes = scenaristes;
    }
    
    public Set getRealisateur()
    {
        return this.realisateur;
    }
    public void setRealisateur(Set realisateur){
        this.realisateur = realisateur;
    }




}


