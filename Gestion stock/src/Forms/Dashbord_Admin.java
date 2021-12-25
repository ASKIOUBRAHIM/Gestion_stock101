
package Forms;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.*;

public class Dashbord_Admin extends javax.swing.JFrame {

 
    public Dashbord_Admin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Global_container = new javax.swing.JPanel();
        nav_bar = new javax.swing.JPanel();
        sedeconnecter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        section_bar = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        ACC = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        FOUR = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        Prod = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        Clien = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        accueil1 = new Forms.Accueil();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(384, 455));
        setUndecorated(true);

        Global_container.setBackground(new java.awt.Color(0, 0, 0));

        nav_bar.setBackground(new java.awt.Color(255, 255, 0));

        sedeconnecter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/se-deconnecter.png"))); // NOI18N
        sedeconnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sedeconnecterActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 36)); // NOI18N
        jLabel1.setText("Espace Administrateur ");

        javax.swing.GroupLayout nav_barLayout = new javax.swing.GroupLayout(nav_bar);
        nav_bar.setLayout(nav_barLayout);
        nav_barLayout.setHorizontalGroup(
            nav_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nav_barLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sedeconnecter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        nav_barLayout.setVerticalGroup(
            nav_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nav_barLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sedeconnecter, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nav_barLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        section_bar.setBackground(new java.awt.Color(0, 0, 0));
        section_bar.setForeground(new java.awt.Color(255, 255, 0));

        jPanel5.setBackground(new java.awt.Color(255, 255, 0));

        ACC.setBackground(new java.awt.Color(255, 255, 0));
        ACC.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        ACC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ACC.setText("Accueil");
        ACC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ACC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ACCMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(ACC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ACC)
                .addGap(8, 8, 8))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 0));
        jPanel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        FOUR.setBackground(new java.awt.Color(0, 0, 0));
        FOUR.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        FOUR.setText("Entreprise");
        FOUR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FOURMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FOUR, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FOUR)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 0));

        Prod.setBackground(Color.decode("#FEFFDB"));
        Prod.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        Prod.setText("Produit");
        Prod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ProdMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Prod)
                .addGap(30, 30, 30))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Prod)
                .addGap(19, 19, 19))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 0));

        Clien.setBackground(new java.awt.Color(0, 0, 0));
        Clien.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        Clien.setText("Employes");
        Clien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ClienMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(Clien)
                .addGap(23, 23, 23))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Clien)
                .addContainerGap())
        );

        javax.swing.GroupLayout section_barLayout = new javax.swing.GroupLayout(section_bar);
        section_bar.setLayout(section_barLayout);
        section_barLayout.setHorizontalGroup(
            section_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(section_barLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(section_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        section_barLayout.setVerticalGroup(
            section_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(section_barLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        container.setBackground(Color.decode("#444444"));
        container.setName("background two"); // NOI18N
        container.setPreferredSize(new java.awt.Dimension(950, 300));
        container.setLayout(new javax.swing.OverlayLayout(container));

        accueil1.setBackground(Color.decode("#110133")
        );
        accueil1.setBorder(null);
        accueil1.setVisible(true);
        container.add(accueil1);

        javax.swing.GroupLayout Global_containerLayout = new javax.swing.GroupLayout(Global_container);
        Global_container.setLayout(Global_containerLayout);
        Global_containerLayout.setHorizontalGroup(
            Global_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nav_bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Global_containerLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(section_bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        Global_containerLayout.setVerticalGroup(
            Global_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Global_containerLayout.createSequentialGroup()
                .addComponent(nav_bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Global_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(section_bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Global_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Global_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void ACCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ACCMousePressed
        container.removeAll();
        
        Accueil accueil = new Accueil();
        container.add(accueil);
        accueil.setVisible(true);
        
        
    }//GEN-LAST:event_ACCMousePressed

    private void FOURMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FOURMousePressed
       container.removeAll();
       
        Fournisseur fournisseur = new Fournisseur();
        container.add(fournisseur);
        fournisseur.setVisible(true);
    }//GEN-LAST:event_FOURMousePressed

    private void ProdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProdMousePressed
        container.removeAll();
        Produit produit = new Produit();
        container.add(produit);
        produit.setVisible(true);
    }//GEN-LAST:event_ProdMousePressed

    private void ClienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClienMousePressed
        container.removeAll();
        employes emp= new employes();
        container.add(emp);
        emp.setVisible(true);
        
    }//GEN-LAST:event_ClienMousePressed

    private void sedeconnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sedeconnecterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sedeconnecterActionPerformed
    
    
    // function katrd interface f lwest hhhhhhhhhh 
     public static void centreWindow(Window frame) {
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
    int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
    frame.setLocation(x, y);
}
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Dashbord_Admin mywindow = new Dashbord_Admin();
                
                mywindow.setVisible(true);
                mywindow.setResizable(false);
                mywindow.setTitle("Gestion de Stock ");
                
                centreWindow(mywindow) ;
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ACC;
    private javax.swing.JLabel Clien;
    private javax.swing.JLabel FOUR;
    private javax.swing.JPanel Global_container;
    public javax.swing.JLabel Prod;
    private Forms.Accueil accueil1;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel nav_bar;
    private javax.swing.JPanel section_bar;
    private javax.swing.JButton sedeconnecter;
    // End of variables declaration//GEN-END:variables
}
