/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locafilm;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PLK
 */
public class Controleur {
    private FramePerson fp;
    private FrameRecherche fr;
    private LoginWindow lw;
    private FrameFilm ff;

    public void setFp(FramePerson fp) {
        this.fp = fp;
    }

    public void setFr(FrameRecherche fr) {
        this.fr = fr;
    }

    public void setLw(LoginWindow lw) {
        this.lw = lw;
    }

    void start() {
        lw.setVisible(true);
       // ff.setVisible(true);
        //afficherFilm(10);
    }

    public void setFf(FrameFilm ff) {
        this.ff = ff;
    }
    
    void connexion(){
        String courriel = lw.getTf_identifiant().getText();
        String mdp = lw.getTf_password().getText();
        
        boolean check = FacadeConnexion.checkPassword(courriel, mdp);
        
        if(check){
            lw.setVisible(false);
            fr.setVisible(true);
            fr.getLabel_nom_utilisateur().setText(courriel);
            int nbcopiemax = Facade.getNbCopieMax(courriel);
            fr.getTf_nbLoc().setText(Integer.toString(nbcopiemax));
        }
        else{
            JOptionPane.showMessageDialog(lw,"Identifiant ou mot de passe incorrect","Login Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    void afficherFilm(BigDecimal idFilm) {
        Film f = DAOFilm.getFilmInfos(idFilm);
        ff.setF(f);
        try {
            ff.updateInfos();
        } catch (SQLException ex) {
            Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
        }
        ff.setVisible(true); 
    }
    
    void louerFilm(BigDecimal idFilm){
        String courriel = fr.getLabel_nom_utilisateur().getText();
        int nbcopiemax = Facade.getNbCopieMax(courriel);
        if (nbcopiemax > 0){
            boolean loc_ok = Facade.louerFilm(courriel, idFilm);
            if(loc_ok){
                JOptionPane.showMessageDialog(fr,"Location OK","Location",JOptionPane.INFORMATION_MESSAGE);
                nbcopiemax = Facade.getNbCopieMax(courriel);
                fr.getTf_nbLoc().setText(Integer.toString(nbcopiemax));
            }
            else{
                JOptionPane.showMessageDialog(fr,"Plus de copies disponibles","Location",JOptionPane.ERROR_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(fr,"Vous avez atteint le nombre de location maximal","Location",JOptionPane.ERROR_MESSAGE);   
        }
    }
}
