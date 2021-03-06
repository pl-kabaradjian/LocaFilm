/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locafilm;

import java.sql.Blob;
import java.sql.SQLException;

/**
 *
 * @author PLK
 */
public class FrameFilm extends javax.swing.JFrame {
    private Controleur c;
    private Film f;
    /**
     * Creates new form FrameFilm
     */
    public FrameFilm() {
        initComponents();
    }
    
    public FrameFilm(Controleur c) {
        initComponents();
        this.c = c;
    }

    public void setF(Film f) {
        this.f = f;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        panel_infos = new javax.swing.JPanel();
        panel_annee = new javax.swing.JPanel();
        tf_annee = new javax.swing.JTextField();
        l_annee = new javax.swing.JLabel();
        panel_langue = new javax.swing.JPanel();
        tf_langue = new javax.swing.JTextField();
        l_langue = new javax.swing.JLabel();
        panel_duree = new javax.swing.JPanel();
        tf_duree = new javax.swing.JTextField();
        l_duree = new javax.swing.JLabel();
        panel_pays = new javax.swing.JPanel();
        tf_pays = new javax.swing.JTextField();
        l_pays = new javax.swing.JLabel();
        panel_genre = new javax.swing.JPanel();
        tf_genre = new javax.swing.JTextField();
        l_genre = new javax.swing.JLabel();
        panel_real = new javax.swing.JPanel();
        tf_real = new javax.swing.JTextField();
        l_real = new javax.swing.JLabel();
        panel_titre = new javax.swing.JPanel();
        tf_titre = new javax.swing.JTextField();
        l_titre = new javax.swing.JLabel();
        panel_resume = new javax.swing.JPanel();
        sp_resume = new javax.swing.JScrollPane();
        ta_resume = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Details du film");
        setResizable(false);

        panel_infos.setBorder(javax.swing.BorderFactory.createTitledBorder("Infos"));
        panel_infos.setToolTipText("");

        tf_annee.setEditable(false);

        l_annee.setText("Année");

        javax.swing.GroupLayout panel_anneeLayout = new javax.swing.GroupLayout(panel_annee);
        panel_annee.setLayout(panel_anneeLayout);
        panel_anneeLayout.setHorizontalGroup(
            panel_anneeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_anneeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_annee)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_annee)
                .addContainerGap())
        );
        panel_anneeLayout.setVerticalGroup(
            panel_anneeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_anneeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_anneeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_annee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_annee))
                .addContainerGap())
        );

        tf_langue.setEditable(false);
        tf_langue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_langueActionPerformed(evt);
            }
        });

        l_langue.setText("Langue");

        javax.swing.GroupLayout panel_langueLayout = new javax.swing.GroupLayout(panel_langue);
        panel_langue.setLayout(panel_langueLayout);
        panel_langueLayout.setHorizontalGroup(
            panel_langueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_langueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_langue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_langue, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_langueLayout.setVerticalGroup(
            panel_langueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_langueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_langueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_langue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_langue))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tf_duree.setEditable(false);

        l_duree.setText("Durée");

        javax.swing.GroupLayout panel_dureeLayout = new javax.swing.GroupLayout(panel_duree);
        panel_duree.setLayout(panel_dureeLayout);
        panel_dureeLayout.setHorizontalGroup(
            panel_dureeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_dureeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_duree)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_duree)
                .addContainerGap())
        );
        panel_dureeLayout.setVerticalGroup(
            panel_dureeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dureeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_dureeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_duree)
                    .addComponent(tf_duree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tf_pays.setEditable(false);

        l_pays.setText("Pays");

        javax.swing.GroupLayout panel_paysLayout = new javax.swing.GroupLayout(panel_pays);
        panel_pays.setLayout(panel_paysLayout);
        panel_paysLayout.setHorizontalGroup(
            panel_paysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_paysLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_pays)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_pays)
                .addContainerGap())
        );
        panel_paysLayout.setVerticalGroup(
            panel_paysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_paysLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_paysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_pays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_pays))
                .addContainerGap())
        );

        tf_genre.setEditable(false);

        l_genre.setText("Genre(s)");

        javax.swing.GroupLayout panel_genreLayout = new javax.swing.GroupLayout(panel_genre);
        panel_genre.setLayout(panel_genreLayout);
        panel_genreLayout.setHorizontalGroup(
            panel_genreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_genreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_genre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_genre, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_genreLayout.setVerticalGroup(
            panel_genreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_genreLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_genreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_genre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_genre))
                .addContainerGap())
        );

        tf_real.setEditable(false);

        l_real.setText("Realisateur");

        javax.swing.GroupLayout panel_realLayout = new javax.swing.GroupLayout(panel_real);
        panel_real.setLayout(panel_realLayout);
        panel_realLayout.setHorizontalGroup(
            panel_realLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_realLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_real)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_real, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_realLayout.setVerticalGroup(
            panel_realLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_realLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_realLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_real, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_real))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tf_titre.setEditable(false);
        tf_titre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_titreActionPerformed(evt);
            }
        });

        l_titre.setText("Titre");

        javax.swing.GroupLayout panel_titreLayout = new javax.swing.GroupLayout(panel_titre);
        panel_titre.setLayout(panel_titreLayout);
        panel_titreLayout.setHorizontalGroup(
            panel_titreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_titreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_titre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_titre)
                .addContainerGap())
        );
        panel_titreLayout.setVerticalGroup(
            panel_titreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_titreLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_titreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_titre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_titre))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_infosLayout = new javax.swing.GroupLayout(panel_infos);
        panel_infos.setLayout(panel_infosLayout);
        panel_infosLayout.setHorizontalGroup(
            panel_infosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_infosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_infosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panel_langue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_pays, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_titre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_infosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panel_annee, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_duree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_genre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panel_infosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_real, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        panel_infosLayout.setVerticalGroup(
            panel_infosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_infosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_infosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_annee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_titre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_infosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_langue, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_duree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_infosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_pays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_genre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_real, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        panel_resume.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumé"));

        ta_resume.setEditable(false);
        ta_resume.setColumns(20);
        ta_resume.setRows(5);
        sp_resume.setViewportView(ta_resume);

        javax.swing.GroupLayout panel_resumeLayout = new javax.swing.GroupLayout(panel_resume);
        panel_resume.setLayout(panel_resumeLayout);
        panel_resumeLayout.setHorizontalGroup(
            panel_resumeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_resumeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sp_resume)
                .addContainerGap())
        );
        panel_resumeLayout.setVerticalGroup(
            panel_resumeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_resumeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sp_resume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_infos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_resume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_infos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_resume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_titreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_titreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_titreActionPerformed

    private void tf_langueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_langueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_langueActionPerformed

    public void updateInfos() throws SQLException{
        this.tf_titre.setText(f.getTitre());
        this.tf_annee.setText(f.getAnnee().toString());
        this.tf_langue.setText(f.getLangue());
        this.tf_duree.setText(f.getDuree().toString());
        this.tf_real.setText(((Equipetournage)f.getRealisateur().toArray()[0]).getNom());
        this.tf_genre.setText(((Genre)f.getGenres().toArray()[0]).getGenre());
        this.tf_pays.setText(((Pays)f.getPayses().toArray()[0]).getPays());
        
        Blob blob = f.getResume();
        byte[] bdata = blob.getBytes(1, (int)blob.length()); 
        String dataStr = new String(bdata);
        this.ta_resume.setText(dataStr);
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
            java.util.logging.Logger.getLogger(FrameFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameFilm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel l_annee;
    private javax.swing.JLabel l_duree;
    private javax.swing.JLabel l_genre;
    private javax.swing.JLabel l_langue;
    private javax.swing.JLabel l_pays;
    private javax.swing.JLabel l_real;
    private javax.swing.JLabel l_titre;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panel_annee;
    private javax.swing.JPanel panel_duree;
    private javax.swing.JPanel panel_genre;
    private javax.swing.JPanel panel_infos;
    private javax.swing.JPanel panel_langue;
    private javax.swing.JPanel panel_pays;
    private javax.swing.JPanel panel_real;
    private javax.swing.JPanel panel_resume;
    private javax.swing.JPanel panel_titre;
    private javax.swing.JScrollPane sp_resume;
    private javax.swing.JTextArea ta_resume;
    private javax.swing.JTextField tf_annee;
    private javax.swing.JTextField tf_duree;
    private javax.swing.JTextField tf_genre;
    private javax.swing.JTextField tf_langue;
    private javax.swing.JTextField tf_pays;
    private javax.swing.JTextField tf_real;
    private javax.swing.JTextField tf_titre;
    // End of variables declaration//GEN-END:variables
}
