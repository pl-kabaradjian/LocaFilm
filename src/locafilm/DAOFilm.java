/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locafilm;
import java.util.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
/**
 *
 * @author PLK
 */
public class DAOFilm {

    public static List<Film> getAllFilm() {
        final SessionFactory factory = HibernateUtil.getSessionFactory();
        final Session s = factory.openSession();

        Query q = s.createSQLQuery("SELECT * FROM Film").addEntity(Film.class);
        List result = q.list();
        List<Film> films = (List<Film>) result;

        s.close();
        factory.close();

        return films;
    }
}
