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

    public static void main(String[] args) {
        Controleur control = new Controleur();

        LoginWindow window_login = new LoginWindow(control);
        FrameRecherche recherche_frame = new FrameRecherche(control);
        //FramePerson person_frame = new FramePerson(control);
        //control.setFp(person_frame);
        control.setLw(window_login);
        control.setFr(recherche_frame);
        //window_login.show();
        //f2.show();
        control.start();
    }
}
