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
       final SessionFactory factory = HibernateUtil.getSessionFactory();
       final Session s = factory.openSession();
       
       Query q = s.createSQLQuery("SELECT * FROM Film");
       List films = q.list();
       
       System.out.println( films.size() + " films trouvés:" );

        for ( Iterator iter = films.iterator(); iter.hasNext(); ) {
            Film f = (Film) iter.next();
            System.out.println("Film :"+ f.getTitre() );
        }
       
       System.out.println("\n----\n");
       s.close();
       factory.close();
    }
    
}
