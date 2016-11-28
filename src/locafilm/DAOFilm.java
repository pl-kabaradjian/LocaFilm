/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locafilm;
import java.math.BigDecimal;
import java.util.*;
import org.hibernate.FetchMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.*;
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

        //s.close();
        //factory.close();

        return films;
    }
    
    public static Film getFilmInfos(BigDecimal id){
        final SessionFactory factory = HibernateUtil.getSessionFactory();
        final Session s = factory.openSession();
        BigDecimal j = id;
        List<Film> result = s.createCriteria(Film.class).add(Restrictions.eq("idfilm",j)).list();
        
        return result.get(0);
    }
    
    public static Copie getCopie(BigDecimal idFilm){
        final SessionFactory factory = HibernateUtil.getSessionFactory();
        final Session s = factory.openSession();
        
        Query q = s.createSQLQuery("SELECT COPIE.IDFILM,COPIE.NUMEROCOPIE FROM LOCATION RIGHT JOIN (COPIE LEFT JOIN FILM ON COPIE.IDFILM = FILM.IDFILM) ON COPIE.NUMEROCOPIE = LOCATION.NUMEROCOPIE WHERE ((LOCATION.DATELOCATION IS NULL) OR (LOCATION.DATERETOUR IS NOT NULL AND LOCATION.DATELOCATION IS NOT NULL)) AND FILM.IDFILM ="
                + idFilm.toString()).addEntity(Copie.class);
        //System.out.println(q);
        List<Copie> res = q.list();
        //System.out.println(res);
        if(res.isEmpty()){
            return null;
        }
        else{
            return res.get(0);
        }
    }
}
