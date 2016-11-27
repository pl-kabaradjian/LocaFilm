/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locafilm;

import javax.swing.JOptionPane;

/**
 *
 * @author PLK
 */
public class Controleur {
    private FramePerson fp;
    private FrameRecherche fr;
    private LoginWindow lw;

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
    }
    
    void connexion(){
        String courriel = lw.getTf_identifiant().getText();
        String mdp = lw.getTf_password().getText();
        
        boolean check = FacadeConnexion.checkPassword(courriel, mdp);
        if(check){
            lw.setVisible(false);
            fr.setVisible(true);
            fr.getLabel_nom_utilisateur().setText(courriel);
        }
        else{
            JOptionPane.showMessageDialog(lw,"Identifiant ou mot de passe incorrect","Login Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
