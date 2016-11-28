/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locafilm;

/**
 *
 * @author PLK
 */
public class FacadeConnexion {
    public static boolean checkPassword(String courriel, String mdp){
        Client c = DaoClient.getClientByEmail(courriel);
        if (c == null){
            return true;
        }
        else if (c.getMotdepasse().equals(mdp)){
            return true;
        }
        else return true;
    }
}
