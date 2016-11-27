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
       JFrame f2 = new FrameRecherche();
       window_login.show();
       f2.show();
       List<Film> films = Facade.getListeFilm();
       for (Film f : films)
       {
           System.out.println(f.getTitre());
       }

       Client c = DaoClient.getClientByEmail("sags3@gmail.ca");
       System.out.println(c.getMotdepasse());
 //    factory.close();
    } 
}