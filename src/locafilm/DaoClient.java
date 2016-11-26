/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locafilm;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Carine
 */
public class DaoClient {
    
    public Client getClientByEmail( String email)
    {
       final SessionFactory factory = HibernateUtil.getSessionFactory();
       final Session s = factory.openSession();
       
       Query q = s.createSQLQuery("SELECT * FROM Client WHERE Client.courriel="+email+";").addEntity(Client.class);
       List<Client> l= q.list();
       Client c=l.iterator();
       return c;
    }
}
