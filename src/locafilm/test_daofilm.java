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

public class test_daofilm {
 
    public static void main(String [] args){
       JFrame window_login = new LoginWindow();
       window_login.show();
       
       List<Film> films = DAOFilm.getAllFilm();
       System.out.println(films.size() + " films trouvés:" );
       for ( Film f : films ) {
            //Film f = iter.next();
            System.out.println("Film :"+ f.getTitre() + " " + ((Genre)f.getGenres().toArray()[0]).getGenre() + " " + f.getLangue() );
        }
       System.out.println("\n----\n");
    } 
}