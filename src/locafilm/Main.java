/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locafilm;
import java.util.*;
import java.sql.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.*;
import org.hibernate.Query;
import javax.swing.*;

public class Main {
 
    public static void main(String [] args){
       JFrame window_login = new LoginWindow();
       window_login.show();
       //final Configuration configuration = new Configuration().configure();
   /*    final SessionFactory factory = HibernateUtil.getSessionFactory();
       final Session s = factory.openSession();
       
       Query q = s.createSQLQuery("SELECT * FROM Film").addEntity(Film.class);
       List result = q.list();
       List<Film> films = (List<Film>)result;
       
       System.out.println(films.size() + " films trouvés:" );
       System.out.println(films);
       System.out.println(result.get(0));
       for ( Film f : films ) {
            //Film f = iter.next();
            System.out.println("Film :"+ f.getTitre() );
        }
       System.out.println("\n----\n");
       s.close();*/
       
       Client c = DaoClient.getClientByEmail("sags3@gmail.ca");
       System.out.println(c.getMotdepasse());
 //      factory.close();
    }
    
}
