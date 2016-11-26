package locafilm;
// Generated 18 nov. 2016 16:55:43 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Membre generated by hbm2java
 */
public class Membre  implements java.io.Serializable {


     private BigDecimal idmembre;
     private String nomfamille;
     private String prenom;
     private String courriel;
     private String tel;
     private Date datenaissance;
     private String motdepasse;
     private Adresse adresse;

    public Membre() {
    }

    public Membre(BigDecimal idmembre) {
        this.idmembre = idmembre;
    }
    public Membre(BigDecimal idmembre, String nomfamille, String prenom, String courriel, String tel, Date datenaissance, String motdepasse, Adresse adresse) {
       this.idmembre = idmembre;
       this.nomfamille = nomfamille;
       this.prenom = prenom;
       this.courriel = courriel;
       this.tel = tel;
       this.datenaissance = datenaissance;
       this.motdepasse = motdepasse;
       this.adresse = adresse;
    }
   
    public BigDecimal getIdmembre() {
        return this.idmembre;
    }
    
    public void setIdmembre(BigDecimal idmembre) {
        this.idmembre = idmembre;
    }
    public String getNomfamille() {
        return this.nomfamille;
    }
    
    public void setNomfamille(String nomfamille) {
        this.nomfamille = nomfamille;
    }
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getCourriel() {
        return this.courriel;
    }
    
    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }
    public String getTel() {
        return this.tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }
    public Date getDatenaissance() {
        return this.datenaissance;
    }
    
    public void setDatenaissance(Date datenaissance) {
        this.datenaissance = datenaissance;
    }
    public String getMotdepasse() {
        return this.motdepasse;
    }
    
    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }
    public Adresse getAdresse() {
        return this.adresse;
    }
    
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
