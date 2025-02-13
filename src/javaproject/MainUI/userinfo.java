/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaproject.MainUI;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author L3gend
 */
public class userinfo extends javax.swing.JFrame {

    /**
     * Creates new form userinfo
     */
    public DataHolder dataHolder;
    public userinfo() {
        initComponents();
        Image();
        this.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound2 = new customframework.PanelRound();
        idlabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        profilelabel = new javax.swing.JLabel();
        namelabel = new javax.swing.JLabel();
        typelabel = new javax.swing.JLabel();
        usrnamelabel = new javax.swing.JLabel();
        joindatalabel = new javax.swing.JLabel();
        editbtn = new customframework.Button();
        closebtn = new javax.swing.JLabel();
        backgroundlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idlabel.setForeground(new java.awt.Color(238, 195, 101));
        idlabel.setText("ID - 0001SB");
        panelRound2.add(idlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 130, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 195, 101));
        jLabel4.setText("Joined Date -");
        panelRound2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 100, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 195, 101));
        jLabel5.setText("Username -");
        panelRound2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 100, -1));

        profilelabel.setBackground(new java.awt.Color(255, 255, 255));
        profilelabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        panelRound2.add(profilelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 40, 100, 100));

        namelabel.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        namelabel.setForeground(new java.awt.Color(238, 195, 101));
        namelabel.setText("Kaung Myat Htet");
        panelRound2.add(namelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 170, 40));

        typelabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        typelabel.setForeground(new java.awt.Color(238, 195, 101));
        typelabel.setText("Owner");
        panelRound2.add(typelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        usrnamelabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usrnamelabel.setForeground(new java.awt.Color(238, 195, 101));
        usrnamelabel.setText("kaungmyathtet");
        panelRound2.add(usrnamelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        joindatalabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        joindatalabel.setForeground(new java.awt.Color(238, 195, 101));
        joindatalabel.setText("14/2/2000");
        panelRound2.add(joindatalabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        editbtn.setBackground(new java.awt.Color(0, 0, 102));
        editbtn.setForeground(new java.awt.Color(238, 195, 101));
        editbtn.setText("Edit");
        editbtn.setFocusPainted(false);
        editbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editbtnMouseClicked(evt);
            }
        });
        panelRound2.add(editbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 100, -1));

        closebtn.setBackground(new java.awt.Color(255, 255, 255));
        closebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closebtn.setFocusable(false);
        closebtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        closebtn.setOpaque(true);
        closebtn.setPreferredSize(new java.awt.Dimension(400, 300));
        closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closebtnMouseExited(evt);
            }
        });
        panelRound2.add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 40, 20));

        backgroundlabel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundlabel.setForeground(new java.awt.Color(238, 195, 101));
        panelRound2.add(backgroundlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closebtnMouseClicked

    private void closebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseEntered
        // TODO add your handling code here:
        closebtn.setBackground(new Color(220,0,0,255));

        ImageIcon closeicon = new ImageIcon(this.getClass().getResource("../icon/whiteclose.png"));
        Image logoclose = closeicon.getImage();
        Image scaleclose = logoclose.getScaledInstance(15,15,Image.SCALE_SMOOTH);
        ImageIcon scaledclose = new ImageIcon(scaleclose);
        closebtn.setIcon(scaledclose);

    }//GEN-LAST:event_closebtnMouseEntered

    private void closebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseExited
        // TODO add your handling code here:
        closebtn.setBackground(Color.WHITE);

        ImageIcon closeicon = new ImageIcon(this.getClass().getResource("../icon/close.png"));
        Image logoclose = closeicon.getImage();
        Image scaleclose = logoclose.getScaledInstance(15,15,Image.SCALE_SMOOTH);
        ImageIcon scaledclose = new ImageIcon(scaleclose);
        closebtn.setIcon(scaledclose);
    }//GEN-LAST:event_closebtnMouseExited

    private void editbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbtnMouseClicked
        // TODO add your handling code here:
        System.out.println(ID+name+username+acctype+password+location+joined_date+profileimgdata+phnum);
        DataHolder dataHolder = new DataHolder();
        dataHolder.setuserData(ID, username,name,profileimgdata,acctype,password,joined_date,phnum,location);
        createacc cacc = new createacc();
        cacc.dataload(dataHolder);
        cacc.setVisible(true);
           
    }//GEN-LAST:event_editbtnMouseClicked
  
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
            java.util.logging.Logger.getLogger(userinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userinfo().setVisible(true);
            }
        });                   
    }
    public void Image(){
        ImageIcon closeicon = new ImageIcon(this.getClass().getResource("../icon/close.png"));
        Image logoclose = closeicon.getImage();
        Image scaleclose = logoclose.getScaledInstance(15,15,Image.SCALE_SMOOTH);
        ImageIcon scaledclose = new ImageIcon(scaleclose);
        closebtn.setIcon(scaledclose);
        
        ImageIcon logo = new ImageIcon(this.getClass().getResource("../icon/backgroundidcard1.jpg"));
        Image logoimg = logo.getImage();
        Image scalelogo = logoimg.getScaledInstance(panelRound2.getWidth(),panelRound2.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledlogo = new ImageIcon(scalelogo);
        backgroundlabel.setIcon(scaledlogo); 
                     
    }
    Integer ID;
    String name;
    String username;
    String acctype;
    String password;
    String location;
    String joined_date;
    String profileimgdata;
    String phnum;
    
    public void dataload(DataHolder dataHolder){
        ImageIcon profile = new ImageIcon(this.getClass().getResource("../profileimg/"+dataHolder.getprofileimgdata()));
        Image profileimg = profile.getImage();
        Image scaleprofile = profileimg.getScaledInstance(profilelabel.getWidth(),profilelabel.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledprofile = new ImageIcon(scaleprofile);
        profilelabel.setIcon(scaledprofile); 
        
        idlabel.setText("ID - "+dataHolder.getIDdata()+ "SB");
        namelabel.setText(dataHolder.getnamedata());
        typelabel.setText(dataHolder.getacctypedata());
        usrnamelabel.setText(dataHolder.getusernamedata());
        joindatalabel.setText(dataHolder.getaccdatedata());
        
        ID = dataHolder.getIDdata();
        name = dataHolder.getnamedata();
        username = dataHolder.getusernamedata();
        password = dataHolder.getpassworddata();
        acctype = dataHolder.getacctypedata();
        joined_date = dataHolder.getaccdatedata();
        phnum = dataHolder.getphnumdata();
        location = dataHolder.getlocationdata();
        profileimgdata = dataHolder.getprofileimgdata();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundlabel;
    private javax.swing.JLabel closebtn;
    private customframework.Button editbtn;
    private javax.swing.JLabel idlabel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel joindatalabel;
    private javax.swing.JLabel namelabel;
    private customframework.PanelRound panelRound2;
    private javax.swing.JLabel profilelabel;
    private javax.swing.JLabel typelabel;
    private javax.swing.JLabel usrnamelabel;
    // End of variables declaration//GEN-END:variables
}
