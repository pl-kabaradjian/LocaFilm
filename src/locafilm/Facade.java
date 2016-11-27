/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locafilm;

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
    
}
