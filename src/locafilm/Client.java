package locafilm;
// Generated 18 nov. 2016 16:55:43 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Client generated by hbm2java
 */
public class Client  implements java.io.Serializable {


     private BigDecimal idmembre;
     private Membre membre;
     private Forfait forfait;
     private Infocredit infocredit;
     private Set locations = new HashSet(0);

    public Client() {
    }

	
    public Client(Membre membre, Forfait forfait) {
        this.membre = membre;
        this.forfait = forfait;
    }
    public Client(Membre membre, Forfait forfait, Infocredit infocredit, Set locations) {
       this.membre = membre;
       this.forfait = forfait;
       this.infocredit = infocredit;
       this.locations = locations;
    }
   
    public BigDecimal getIdmembre() {
        return this.idmembre;
    }
    
    public void setIdmembre(BigDecimal idmembre) {
        this.idmembre = idmembre;
    }
    public Membre getMembre() {
        return this.membre;
    }
    
    public void setMembre(Membre membre) {
        this.membre = membre;
    }
    public Forfait getForfait() {
        return this.forfait;
    }
    
    public void setForfait(Forfait forfait) {
        this.forfait = forfait;
    }
    public Infocredit getInfocredit() {
        return this.infocredit;
    }
    
    public void setInfocredit(Infocredit infocredit) {
        this.infocredit = infocredit;
    }
    public Set getLocations() {
        return this.locations;
    }
    
    public void setLocations(Set locations) {
        this.locations = locations;
    }




}


