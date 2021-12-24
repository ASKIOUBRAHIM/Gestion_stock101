
package Forms;

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
        jPanel8 = new javax.swing.JPanel();
        STO = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        Clien = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        accueil1 = new Forms.Accueil();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Global_container.setBackground(new java.awt.Color(255, 255, 51));

        nav_bar.setBackground(new java.awt.Color(0, 0, 0));

        sedeconnecter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/se-deconnecter.png"))); // NOI18N
        sedeconnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sedeconnecterActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Espace Administrateur ");

        javax.swing.GroupLayout nav_barLayout = new javax.swing.GroupLayout(nav_bar);
        nav_bar.setLayout(nav_barLayout);
        nav_barLayout.setHorizontalGroup(
            nav_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nav_barLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        section_bar.setBackground(new java.awt.Color(255, 255, 0));
        section_bar.setForeground(new java.awt.Color(255, 255, 0));

        jPanel5.setBackground(new java.awt.Color(51, 0, 51));

        ACC.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        ACC.setForeground(new java.awt.Color(255, 255, 255));
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
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(ACC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ACC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(51, 0, 51));
        jPanel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        FOUR.setBackground(new java.awt.Color(255, 102, 255));
        FOUR.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        FOUR.setForeground(new java.awt.Color(255, 255, 255));
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
                .addComponent(FOUR)
                .addGap(22, 22, 22))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FOUR)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(51, 0, 51));

        Prod.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        Prod.setForeground(new java.awt.Color(255, 255, 255));
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
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(Prod)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Prod)
                .addGap(19, 19, 19))
        );

        jPanel8.setBackground(new java.awt.Color(51, 0, 51));
        jPanel8.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N

        STO.setFont(new java.awt.Font("Book Antiqua", 1, 22)); // NOI18N
        STO.setForeground(new java.awt.Color(255, 255, 255));
        STO.setText("Stock");
        STO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                STOMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(STO)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(STO)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(51, 0, 51));

        Clien.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        Clien.setForeground(new java.awt.Color(255, 255, 255));
        Clien.setText("employes");
        Clien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ClienMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Clien)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Clien)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout section_barLayout = new javax.swing.GroupLayout(section_bar);
        section_bar.setLayout(section_barLayout);
        section_barLayout.setHorizontalGroup(
            section_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(section_barLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(section_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        section_barLayout.setVerticalGroup(
            section_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(section_barLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        container.setBackground(new java.awt.Color(204, 255, 204));
        container.setName("background two"); // NOI18N
        container.setPreferredSize(new java.awt.Dimension(950, 300));
        container.setLayout(new javax.swing.OverlayLayout(container));

        accueil1.setVisible(true);
        container.add(accueil1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        container.add(jScrollPane1);

        javax.swing.GroupLayout Global_containerLayout = new javax.swing.GroupLayout(Global_container);
        Global_container.setLayout(Global_containerLayout);
        Global_containerLayout.setHorizontalGroup(
            Global_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nav_bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Global_containerLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(section_bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Global_containerLayout.setVerticalGroup(
            Global_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Global_containerLayout.createSequentialGroup()
                .addComponent(nav_bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
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

    private void STOMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STOMousePressed
        
        container.removeAll();
        Stock stock = new Stock();
        container.add(stock);
        stock.setVisible(true);
    }//GEN-LAST:event_STOMousePressed

    private void ClienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClienMousePressed
        container.removeAll();
        employes emp= new employes();
        container.add(emp);
        emp.setVisible(true);
        
    }//GEN-LAST:event_ClienMousePressed

    private void sedeconnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sedeconnecterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sedeconnecterActionPerformed
       
   
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            
            Dashbord_Admin mywindow = new Dashbord_Admin();
            
            mywindow.setVisible(true);
            mywindow.setResizable(false);
            mywindow.setTitle("Gestion de Stock ");
            
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ACC;
    private javax.swing.JLabel Clien;
    private javax.swing.JLabel FOUR;
    private javax.swing.JPanel Global_container;
    public javax.swing.JLabel Prod;
    private javax.swing.JLabel STO;
    private Forms.Accueil accueil1;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel nav_bar;
    private javax.swing.JPanel section_bar;
    private javax.swing.JButton sedeconnecter;
    // End of variables declaration//GEN-END:variables
}
