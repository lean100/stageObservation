package com.mycompany.linkgest;


import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneLightIJTheme;
import com.mycompany.linkgest.menu;
import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author Amine
 */
public class principale extends javax.swing.JDialog {
    Connection con;
 String sift,khda;
    
    public principale(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
           clientnames();
           usernames();
           ref();
          
           
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        comtab = new javax.swing.JTable();
        tous = new javax.swing.JRadioButton();
        nonlivre = new javax.swing.JRadioButton();
        livre = new javax.swing.JRadioButton();
        ajtcom = new javax.swing.JButton();
        pricefl = new javax.swing.JTextField();
        cityfl = new javax.swing.JComboBox<>();
        userbox = new javax.swing.JComboBox<>();
        clientbox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        localfl = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comtab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Destination", "Prix", "Date", "Etat", "Emetteur", "Recepteur"
            }
        ));
        jScrollPane1.setViewportView(comtab);
        if (comtab.getColumnModel().getColumnCount() > 0) {
            comtab.getColumnModel().getColumn(4).setResizable(false);
            comtab.getColumnModel().getColumn(6).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 488, 392));

        buttonGroup1.add(tous);
        tous.setText("Tous");
        tous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tousActionPerformed(evt);
            }
        });
        getContentPane().add(tous, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, -1, -1));

        buttonGroup1.add(nonlivre);
        nonlivre.setText("Non livré");
        nonlivre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonlivreActionPerformed(evt);
            }
        });
        getContentPane().add(nonlivre, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, -1, -1));

        buttonGroup1.add(livre);
        livre.setText("Livré");
        livre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                livreActionPerformed(evt);
            }
        });
        getContentPane().add(livre, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, -1, -1));

        ajtcom.setText("Ajouter");
        ajtcom.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ajtcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajtcomActionPerformed(evt);
            }
        });
        getContentPane().add(ajtcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 265, -1, -1));

        pricefl.setText("Prix");
        pricefl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceflActionPerformed(evt);
            }
        });
        getContentPane().add(pricefl, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 225, 85, -1));

        cityfl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " AL HAJEB ", "AGADIR ", "AL HOCEIMA", " ASSA ZAG", " AZILAL", " BENI MELLAL ", "BENSLIMANE", " BOUJDOUR", " BOULEMANE ", "BERRECHID", " CASABLANCA ", "CHEFCHAOUEN", " CHTOUKA AIT BAHA", " CHICHAOUA", " EL JADIDA", " EL KELAA DES SRAGHNAS", " ERRACHIDIA", " ESSAOUIRA", " ES SEMARA", " FES", " FIGUIG", " GUELMIM", " IFRANE", " KENITRA ", "KHEMISSET", " KHENIFRA", " KHOURIBGA", " LAAYOUNE", " LARACHE", " MOHAMMEDIA", " MARRAKECH", " MEKNES", " NADOR ", "OUARZAZATE", " OUJDA ", "OUED EDDAHAB", " RABAT", " SALE", " SKHIRAT", " TEMARA", " SEFROU ", "SAFI ", "SETTAT", " SIDI KACEM", " TANGER", " TAN TAN", " TAOUNAT", " TAROUDANNT", " TATA", " TAZA ", "TETOUAN ", "TIZNIT" }));
        cityfl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityflActionPerformed(evt);
            }
        });
        getContentPane().add(cityfl, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 180, 121, -1));

        userbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userboxActionPerformed(evt);
            }
        });
        getContentPane().add(userbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 100, 100, -1));

        clientbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientboxActionPerformed(evt);
            }
        });
        getContentPane().add(clientbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 140, 99, -1));

        jLabel1.setText("de");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 103, -1, -1));

        jLabel2.setText("à");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 143, -1, -1));

        localfl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " AL HAJEB ", "AGADIR ", "AL HOCEIMA", " ASSA ZAG", " AZILAL", " BENI MELLAL ", "BENSLIMANE", " BOUJDOUR", " BOULEMANE ", "BERRECHID", " CASABLANCA ", "CHEFCHAOUEN", " CHTOUKA AIT BAHA", " CHICHAOUA", " EL JADIDA", " EL KELAA DES SRAGHNAS", " ERRACHIDIA", " ESSAOUIRA", " ES SEMARA", " FES", " FIGUIG", " GUELMIM", " IFRANE", " KENITRA ", "KHEMISSET", " KHENIFRA", " KHOURIBGA", " LAAYOUNE", " LARACHE", " MOHAMMEDIA", " MARRAKECH", " MEKNES", " NADOR ", "OUARZAZATE", " OUJDA ", "OUED EDDAHAB", " RABAT", " SALE", " SKHIRAT", " TEMARA", " SEFROU ", "SAFI ", "SETTAT", " SIDI KACEM", " TANGER", " TAN TAN", " TAOUNAT", " TAROUDANNT", " TATA", " TAZA ", "TETOUAN ", "TIZNIT" }));
        localfl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localflActionPerformed(evt);
            }
        });
        getContentPane().add(localfl, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 180, 121, -1));

        jLabel3.setText("à");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 183, -1, -1));

        jLabel4.setText("de");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 183, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Amine\\Music\\digital-ge2ed7fe4f_1280.png")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 0, 1000, 460));

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tousActionPerformed
clientid(); 
        userid();
        String req;
                try {
            Class.forName("com.mysql.jdbc.Driver");    
            try {
                this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/link","root","");
            } catch (SQLException ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        ///////////////////////////////////////////
     
                req="select * from commande ";
      
        

        try {
            PreparedStatement ps= con.prepareStatement(req); 
            ResultSet rs =ps.executeQuery();
DefaultTableModel model=(DefaultTableModel) comtab.getModel();
model.setRowCount(0);
while(rs.next()){
    model.addRow(new String[]{rs.getString(1),rs.getString(3),rs.getString(2),rs.getString(5)});
}
        } catch (SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }





        // TODO add your handling code here:
    }//GEN-LAST:event_tousActionPerformed

    private void livreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_livreActionPerformed
       String req;
                try {
            Class.forName("com.mysql.jdbc.Driver");    
            try {
                this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/link","root","");
            } catch (SQLException ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        ///////////////////////////////////////////
     
                req="select * from commande where etat=true  ";
      
        

        try {
            PreparedStatement ps= con.prepareStatement(req); 
            ResultSet rs =ps.executeQuery();
DefaultTableModel model=(DefaultTableModel) comtab.getModel();
model.setRowCount(0);
while(rs.next()){
    model.addRow(new String[]{rs.getString(1),rs.getString(3),rs.getString(2),rs.getString(7)});
}
        } catch (SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }






// TODO add your handling code here:
    }//GEN-LAST:event_livreActionPerformed

    private void nonlivreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonlivreActionPerformed
String req;
                try {
            Class.forName("com.mysql.jdbc.Driver");    
            try {
                this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/link","root","");
            } catch (SQLException ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        ///////////////////////////////////////////
     
           req="select * from commande where etat =false ";
      
        

        try {
            PreparedStatement ps= con.prepareStatement(req); 
            ResultSet rs =ps.executeQuery();
DefaultTableModel model=(DefaultTableModel) comtab.getModel();
model.setRowCount(0);
while(rs.next()){
    model.addRow(new String[]{rs.getString(1),rs.getString(3),rs.getString(2),rs.getString(7)});
}
        } catch (SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_nonlivreActionPerformed

    private void priceflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceflActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceflActionPerformed

    private void ajtcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajtcomActionPerformed

        String req;
        try {    
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/link","root","");
          
            req="INSERT INTO commande ( prix, destination,userid,clientid,local) VALUES (?,?,?,?,?);" ;      
            PreparedStatement ps= con.prepareStatement(req); 
            
            ps.setString(1,pricefl.getText().toString());
            ps.setString(2,cityfl.getSelectedItem().toString());
            System.out.println(userid());
            ps.setString(3, String.valueOf(userid()));
            ps.setString(4, String.valueOf(clientid()));
            ps.setString(5, localfl.getSelectedItem().toString()) ;


           
            ps.execute();
           JOptionPane jop1 = new JOptionPane();
            jop1.showMessageDialog(null, "la commande est ajouté ", "Ajout", JOptionPane.INFORMATION_MESSAGE);
           
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }


ref();






        // TODO add your handling code here:
    }//GEN-LAST:event_ajtcomActionPerformed

    private void clientboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientboxActionPerformed

    private void userboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userboxActionPerformed

    private void cityflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityflActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityflActionPerformed

    private void localflActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localflActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_localflActionPerformed

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
            java.util.logging.Logger.getLogger(principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        FlatAtomOneDarkIJTheme.setup();

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                principale dialog = new principale(new javax.swing.JFrame(), true);
               
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    
  void  usernames(){
      
          try {
            Class.forName("com.mysql.jdbc.Driver");    
            try {
                this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/link","root","");
            } catch (SQLException ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }

          String  req="select nom from utili" ;      
        try {         
            PreparedStatement ps= con.prepareStatement(req);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                userbox.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(principale.class.getName()).log(Level.SEVERE, null, ex);
        }
           
      
    }
      
  void  clientnames(){
          try {
            Class.forName("com.mysql.jdbc.Driver");    
            try {
                this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/link","root","");
            } catch (SQLException ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }

          String  req="select nom from client" ;      
        try {         
            PreparedStatement ps= con.prepareStatement(req);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                clientbox.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(principale.class.getName()).log(Level.SEVERE, null, ex);
        }
           
       
    }
  
int userid(){
    int id=0;
       try {
            Class.forName("com.mysql.jdbc.Driver");    
            try {
                this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/link","root","");
            } catch (SQLException ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
       
      PreparedStatement ps;
        try {
            ps = con.prepareStatement("select userid from utili where nom=?");
                  ps.setString(1,userbox.getSelectedItem().toString());
System.out.print(userbox.getSelectedItem().toString());

           ResultSet rs =ps.executeQuery();
                   System.out.println(rs.next());

            id=rs.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(principale.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(id);
        return id;
    
    
    
    
}

int clientid(){
    int id=0;
       try {
            Class.forName("com.mysql.jdbc.Driver");    
            try {
                this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/link","root","");
            } catch (SQLException ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
       
      PreparedStatement ps;
        try {
            ps = con.prepareStatement("select clientid from client where nom=?");
                  ps.setString(1,clientbox.getSelectedItem().toString());
System.out.print(clientbox.getSelectedItem().toString());

           ResultSet rs =ps.executeQuery();
                   System.out.println(rs.next());

            id=rs.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(principale.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(id);
        return id;
    
    
    
    
}
  
void emt(){
                String      req="SELECT nom FROM utili WHERE userid IN (SELECT userid FROM commande )";

 try {
            Class.forName("com.mysql.jdbc.Driver");    
            try {
                this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/link","root","");
            } catch (SQLException ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            

        }

        try { 
            PreparedStatement ps= con.prepareStatement(req);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString(1));
            }
            
           DefaultTableModel model=(DefaultTableModel) comtab.getModel();

    while(rs.next()){
    model.addRow(new String[]{rs.getString(1)});
    }
        } catch (SQLException ex) {
            Logger.getLogger(principale.class.getName()).log(Level.SEVERE, null, ex);
        }

    
}       catch (ClassNotFoundException ex) {
            Logger.getLogger(principale.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
}
  
    void ref(){
        emt();
         String req;
                try {
            Class.forName("com.mysql.jdbc.Driver");    
            try {
                this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/link","root","");
            } catch (SQLException ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        ///////////////////////////////////////////
     
                req="select * from commande ";
      
        

        try {
            PreparedStatement ps= con.prepareStatement(req); 
            ResultSet rs =ps.executeQuery();
DefaultTableModel model=(DefaultTableModel) comtab.getModel();
model.setRowCount(0);
while(rs.next()){
    model.addRow(new String[]{rs.getString(1),rs.getString(3),rs.getString(2),rs.getString(7),rs.getString(4)});
}
        } catch (SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajtcom;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<String> cityfl;
    private javax.swing.JComboBox<String> clientbox;
    private javax.swing.JTable comtab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton livre;
    private javax.swing.JComboBox<String> localfl;
    private javax.swing.JRadioButton nonlivre;
    private javax.swing.JTextField pricefl;
    private javax.swing.JRadioButton tous;
    private javax.swing.JComboBox<String> userbox;
    // End of variables declaration//GEN-END:variables


}

