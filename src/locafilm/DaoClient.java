/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locafilm;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Carine
 */
public class DaoClient {
    
    public static Client getClientByEmail(String email) {
        final SessionFactory factory = HibernateUtil.getSessionFactory();
        final Session s = factory.openSession();

        Query q = s.createSQLQuery("SELECT * FROM Client JOIN Membre On Client.idmembre=Membre.idmembre WHERE Membre.courriel LIKE \'" + email + "\'").addEntity(Client.class);
        System.out.println(q);
        List<Client> l = q.list();
        Client c;
        if (l.isEmpty()) {
            c = null;
        } else {
            c = l.get(0);
        }
        //s.close();
        //factory.close();
        return c;
    }
    
    public static boolean insertLocation(Client c, Film f){
        final SessionFactory factory = HibernateUtil.getSessionFactory();
        final Session s = factory.openSession();
        
        Copie copie = DAOFilm.getCopie(f.getIdfilm());
        
        if(copie == null){
            s.close();
            return false;
        }
        else{
            Transaction tx=s.beginTransaction();
            Location l = new Location(null, c, copie);
            l.setDatelocation(new Date());
            s.saveOrUpdate(l);
            tx.commit();
            s.close();
            return true;
        }
    }

    static int getLocationmax(Client c) {
        int nb = c.getForfait().getLocationmax().intValueExact();

        return nb;
    }

    static int getCurrNbLoc(Client c) {
        int currentNbLoc = c.getLocations().toArray().length;

        return currentNbLoc;
    }
}
