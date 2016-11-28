/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locafilm;

import java.math.BigDecimal;
import java.util.List;
/**
 *
 * @author Carine
 */
public class Facade {
    
    public static List<Film> getListeFilm()
    {
        return DAOFilm.getAllFilm();
    }

    static int getNbCopieMax(String courriel) {
        Client c = DaoClient.getClientByEmail(courriel);
        int nb = DaoClient.getLocationmax(c);
        int currentNbLoc = DaoClient.getCurrNbLoc(c);
        return nb-currentNbLoc;
    }

    static boolean louerFilm(String courriel, BigDecimal idFilm) {
        Client c = DaoClient.getClientByEmail(courriel);
        Film f = DAOFilm.getFilmInfos(idFilm);
        if (DaoClient.insertLocation(c, f)) {
            return true;
        } else {
            return false;
        }
    }
}
