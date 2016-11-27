/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locafilm;

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;

/**
 *
 * @author Carine
 */
public class FrameRecherche extends javax.swing.JFrame {
    private Controleur c;
    /**
     * Creates new form FrameRecherche
     */
    public FrameRecherche() {
        initComponents();
    }

    public void setC(Controleur c) {
        this.c = c;
    }
    
    public FrameRecherche(Controleur c) {
        initComponents();
        this.c = c;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_recherche = new javax.swing.JPanel();
        panel_chercher = new javax.swing.JPanel();
        comboBox_critere = new javax.swing.JComboBox<>();
        bouton_chercher = new javax.swing.JButton();
        textField_critere = new javax.swing.JTextField();
        panel_resultat = new javax.swing.JPanel();
        list_resultat = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        bouton_voir_fiche = new javax.swing.JButton();
        bouton_louer = new javax.swing.JButton();
        label_utilisateur = new javax.swing.JLabel();
        label_nom_utilisateur = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        comboBox_critere.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "titre", "annee", "pays", "langue", "duree", "realisateur", "genre" }));

        bouton_chercher.setText("Chercher");
        bouton_chercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_chercherActionPerformed(evt);
            }
        });

        textField_critere.setText("critere");

        javax.swing.GroupLayout panel_chercherLayout = new javax.swing.GroupLayout(panel_chercher);
        panel_chercher.setLayout(panel_chercherLayout);
        panel_chercherLayout.setHorizontalGroup(
            panel_chercherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_chercherLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(textField_critere, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(comboBox_critere, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bouton_chercher, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        panel_chercherLayout.setVerticalGroup(
            panel_chercherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_chercherLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_chercherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox_critere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bouton_chercher)
                    .addComponent(textField_critere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(291, 291, 291))
        );

        list_resultat.setViewportView(jList1);

        bouton_voir_fiche.setText("voir la fiche");

        bouton_louer.setLabel("louer");
        bouton_louer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_louerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_resultatLayout = new javax.swing.GroupLayout(panel_resultat);
        panel_resultat.setLayout(panel_resultatLayout);
        panel_resultatLayout.setHorizontalGroup(
            panel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_resultatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(list_resultat, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(panel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bouton_voir_fiche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bouton_louer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        panel_resultatLayout.setVerticalGroup(
            panel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_resultatLayout.createSequentialGroup()
                .addComponent(list_resultat)
                .addContainerGap())
            .addGroup(panel_resultatLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(bouton_voir_fiche)
                .addGap(63, 63, 63)
                .addComponent(bouton_louer)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        label_utilisateur.setText("utilisateur :");

        javax.swing.GroupLayout panel_rechercheLayout = new javax.swing.GroupLayout(panel_recherche);
        panel_recherche.setLayout(panel_rechercheLayout);
        panel_rechercheLayout.setHorizontalGroup(
            panel_rechercheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_rechercheLayout.createSequentialGroup()
                .addGroup(panel_rechercheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_rechercheLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_rechercheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_rechercheLayout.createSequentialGroup()
                                .addComponent(panel_resultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(panel_chercher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panel_rechercheLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(label_utilisateur)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_nom_utilisateur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_rechercheLayout.setVerticalGroup(
            panel_rechercheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_rechercheLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panel_rechercheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_utilisateur)
                    .addComponent(label_nom_utilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_chercher, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_resultat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_recherche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_recherche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bouton_louerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_louerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bouton_louerActionPerformed

    private void bouton_chercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_chercherActionPerformed
        System.out.println("Appui");
        String recherche = textField_critere.getText();
        String critere = comboBox_critere.getSelectedItem().toString();
        List<Film> listFilm = Facade.getListeFilm();
        
        DefaultListModel listModel = new DefaultListModel();
        jList1.setModel(listModel);
        
        boolean find = false;


        for (Film f : listFilm) {
            if (critere == "titre") 
            {
                if (f.getTitre().lastIndexOf(recherche) != -1) {find = true;}
                if (find) {
                    listModel.addElement(f.getTitre());
                }
            }
            if (critere == "annee") 
            {
                if (f.getAnnee().toString().lastIndexOf(recherche) != -1) {find = true;}
                if (find) {
                    listModel.addElement(f.getTitre());
                }
            }
            
            find=false;
        }
    }//GEN-LAST:event_bouton_chercherActionPerformed

    public JLabel getLabel_nom_utilisateur() {
        return label_nom_utilisateur;
    }

    public JLabel getLabel_utilisateur() {
        return label_utilisateur;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameRecherche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameRecherche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameRecherche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameRecherche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameRecherche().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bouton_chercher;
    private javax.swing.JButton bouton_louer;
    private javax.swing.JButton bouton_voir_fiche;
    private javax.swing.JComboBox<String> comboBox_critere;
    private javax.swing.JList<String> jList1;
    private javax.swing.JLabel label_nom_utilisateur;
    private javax.swing.JLabel label_utilisateur;
    private javax.swing.JScrollPane list_resultat;
    private javax.swing.JPanel panel_chercher;
    private javax.swing.JPanel panel_recherche;
    private javax.swing.JPanel panel_resultat;
    private javax.swing.JTextField textField_critere;
    // End of variables declaration//GEN-END:variables
}
