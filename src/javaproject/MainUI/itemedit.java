/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaproject.MainUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author L3gend
 */
public class itemedit extends javax.swing.JFrame {

    /**
     * Creates new form itemedit
     */
    public itemedit() {
        initComponents();
        this.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itemtypegroup = new javax.swing.ButtonGroup();
        panelRound1 = new customframework.PanelRound();
        jPanel1 = new javax.swing.JPanel();
        drinkradiobtn = new javax.swing.JRadioButton();
        foodradiobtn = new javax.swing.JRadioButton();
        drinktypebox = new javax.swing.JComboBox<>();
        foodtypebox = new javax.swing.JComboBox<>();
        namebox = new customframework.MyTextField();
        pricebox = new customframework.MyTextField();
        qtybox = new customframework.MyTextField();
        jPanel2 = new javax.swing.JPanel();
        insertbtn = new customframework.Button();
        updatebtn = new customframework.Button();
        deletebtn = new customframework.Button();
        backbtn = new customframework.Button();
        jPanel3 = new javax.swing.JPanel();
        imagelabel = new javax.swing.JLabel();
        chooseimgbtn = new customframework.ButtonOutLine();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        itemtypegroup.add(drinkradiobtn);
        drinkradiobtn.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        drinkradiobtn.setText("Drink");

        itemtypegroup.add(foodradiobtn);
        foodradiobtn.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        foodradiobtn.setText("Food");

        drinktypebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Drink Type", "Oleato™", "Hot Coffees", "Hot Teas", "Hot Drinks", "Frappuccino® Blended Beverages", "Cold Coffees", "Iced Teas", "Cold Drinks" }));

        foodtypebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Food Type", "Hot Breakfast", "Oatmeal & Yogurt", "Bakery", "Lunch", "Snacks & Sweets" }));

        namebox.setToolTipText("");
        namebox.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        namebox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        namebox.setHint("Item Name");

        pricebox.setForeground(new java.awt.Color(0, 0, 0));
        pricebox.setToolTipText("");
        pricebox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pricebox.setHint("Price");
        pricebox.setSelectionColor(new java.awt.Color(0, 153, 153));

        qtybox.setToolTipText("");
        qtybox.setHint("Quantity");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(drinkradiobtn)
                        .addGap(18, 18, 18)
                        .addComponent(foodradiobtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pricebox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(foodtypebox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(drinktypebox, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtybox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namebox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drinkradiobtn)
                    .addComponent(foodradiobtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(drinktypebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foodtypebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namebox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pricebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(qtybox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        insertbtn.setBackground(new java.awt.Color(0, 0, 255));
        insertbtn.setForeground(new java.awt.Color(255, 255, 255));
        insertbtn.setText("Insert");
        insertbtn.setFocusable(false);
        insertbtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        insertbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertbtnMouseClicked(evt);
            }
        });

        updatebtn.setBackground(new java.awt.Color(0, 0, 255));
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("Update");
        updatebtn.setFocusable(false);
        updatebtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updatebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatebtnMouseClicked(evt);
            }
        });

        deletebtn.setBackground(new java.awt.Color(0, 0, 255));
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("Delete");
        deletebtn.setFocusable(false);
        deletebtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebtnMouseClicked(evt);
            }
        });

        backbtn.setBackground(new java.awt.Color(0, 0, 255));
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("Back");
        backbtn.setFocusable(false);
        backbtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(insertbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updatebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(deletebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(insertbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        imagelabel.setToolTipText("");

        chooseimgbtn.setBackground(new java.awt.Color(0, 0, 204));
        chooseimgbtn.setText("Choose Item Image");
        chooseimgbtn.setFocusable(false);
        chooseimgbtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        chooseimgbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chooseimgbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chooseimgbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(imagelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(imagelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(chooseimgbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public Integer ItemID;
    public String ItemName;
    public String itemtype;
    public String foodtype;
    public String drinktype;
    public String itemimg;
    public String price;
    public String itemqty;
    private void insertbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertbtnMouseClicked
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_insertbtnMouseClicked

    private void updatebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatebtnMouseClicked
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_updatebtnMouseClicked

    private void deletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtnMouseClicked
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_deletebtnMouseClicked

    private void backbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_backbtnMouseClicked

    private File selectedFile;
    private void chooseimgbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooseimgbtnMouseClicked
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png", "gif");
        fileChooser.setFileFilter(filter);

        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile(); // Capture the selected file
            displayImage(selectedFile); // Display the selected image
        }
    }//GEN-LAST:event_chooseimgbtnMouseClicked

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
            java.util.logging.Logger.getLogger(itemedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(itemedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(itemedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(itemedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new itemedit().setVisible(true);
            }
        });
    }

    public void insert() {

        String url = "jdbc:mysql://localhost:3306/possystem?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user = "root";
        String password = "root";
        ItemName = namebox.getText();
        if (drinkradiobtn.isSelected()) {
            itemtype = drinkradiobtn.getText();
        } else if (foodradiobtn.isSelected()) {
            itemtype = foodradiobtn.getText();
        }
        if (drinktypebox.getSelectedIndex() == 0) {
            drinktype = null;
        } else {
            drinktype = drinktypebox.getSelectedItem().toString();
        }
        if (foodtypebox.getSelectedIndex() == 0) {
            foodtype = null;
        } else {
            foodtype = foodtypebox.getSelectedItem().toString();
        }

        itemimg = selectedFile.getName();

        String outputDirectory = "C:\\Users\\L3gend\\Desktop\\java apache\\JavaProject\\src\\javaproject\\images";
        try {
            moveImageToFile(selectedFile.toPath(), outputDirectory, itemimg);
        } catch (IOException ex) {
            Logger.getLogger(createacc.class.getName()).log(Level.SEVERE, null, ex);
        }

        price = pricebox.getText();
        itemqty = qtybox.getText();
        System.out.println(ItemName + itemtype + drinktype + foodtype + price + itemqty + itemimg);
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String query = "Insert into items (name,type,drinktype,foodtype,item_img,baseprice,qty) values(?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, ItemName);
            preparedStatement.setString(2, itemtype);
            preparedStatement.setString(3, drinktype);
            preparedStatement.setString(4, foodtype);
            preparedStatement.setString(5, itemimg);
            preparedStatement.setString(6, price);
            preparedStatement.setString(7, itemqty);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(itemedit.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void update() {
        String url = "jdbc:mysql://localhost:3306/possystem?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user = "root";
        String password = "root";
        ItemName = namebox.getText();
        if (drinkradiobtn.isSelected()) {
            itemtype = drinkradiobtn.getText();
        } else if (foodradiobtn.isSelected()) {
            itemtype = foodradiobtn.getText();
        }
        if (drinktypebox.getSelectedIndex() == 0) {
            drinktype = null;
        } else {
            drinktype = drinktypebox.getSelectedItem().toString();
        }
        if (foodtypebox.getSelectedIndex() == 0) {
            foodtype = null;
        } else {
            foodtype = foodtypebox.getSelectedItem().toString();
        }

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String query = "Update items Set name =?,type =?,drinktype =?,foodtype =?,item_img =?,baseprice=?,qty=? where ID = " + ItemID + "";
            PreparedStatement preparestatement = connection.prepareStatement(query);
            preparestatement.setString(1, namebox.getText());
            preparestatement.setString(2, itemtype);
            preparestatement.setString(3, drinktype);
            preparestatement.setString(4, foodtype);
            if(selectedFile == null){
                preparestatement.setString(5, itemimg);
            }
            
            preparestatement.setString(6, pricebox.getText());
            preparestatement.setString(7, qtybox.getText());
            preparestatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println(ItemID + itemtype + drinktype + foodtype + ItemName + pricebox.getText() + qtybox.getText());
    }

    public void delete() {
        String url = "jdbc:mysql://localhost:3306/possystem?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user = "root";
        String password = "root";

            try {
                Connection connection = DriverManager.getConnection(url, user, password);
                String query = "Delete from items where ID ="+ItemID+"";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.executeUpdate();
                
            } catch (SQLException ex) {
                Logger.getLogger(itemedit.class.getName()).log(Level.SEVERE, null, ex);
            }
            
         

    }

    private void displayImage(File file) {
        ImageIcon itemimage = new ImageIcon(file.getPath());
        Image logoitem = itemimage.getImage();
        Image scaleitem = logoitem.getScaledInstance(imagelabel.getWidth(), imagelabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaleditem = new ImageIcon(scaleitem);
        imagelabel.setIcon(scaleditem);
    }

    private static void moveImageToFile(Path sourcePath, String outputDirectory, String imageName) throws IOException {
        Path destinationPath = Paths.get(outputDirectory, imageName);
        Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
    }

    public void dataload(DataHolder dataHolder) {
        ItemID = dataHolder.getItemIDdata();
        System.out.println(ItemID);
        String url = "jdbc:mysql://localhost:3306/possystem?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user = "root";
        String password = "root";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String query = "Select * from items where ID = " + ItemID + "";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query); ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    namebox.setPreferredSize(new Dimension(162, 37));
                    namebox.setText(resultSet.getString("name"));
                    pricebox.setText(resultSet.getString("baseprice"));
                    qtybox.setText(resultSet.getString("qty"));
                    if ("Drink".equals(resultSet.getString("type"))) {
                        drinkradiobtn.setSelected(true);
                    } else {
                        foodradiobtn.setSelected(true);
                    }
                    if (resultSet.getString("drinktype") != null) {
                        drinktypebox.setSelectedItem(resultSet.getString("drinktype"));
                    } else {
                        drinktypebox.setSelectedIndex(0);
                    }
                    if (resultSet.getString("foodtype") != null) {
                        foodtypebox.setSelectedItem(resultSet.getString("foodtype"));
                    } else {
                        foodtypebox.setSelectedIndex(0);
                    }
                    itemimg = resultSet.getString("item_img");
                    ImageIcon itemimage = new ImageIcon(this.getClass().getResource("../images/"+resultSet.getString("item_img")));
                    Image logoitem = itemimage.getImage();
                    Image scaleitem = logoitem.getScaledInstance(imagelabel.getWidth(), imagelabel.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon scaleditem = new ImageIcon(scaleitem);
                    imagelabel.setIcon(scaleditem);
                    System.out.println(itemimage);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(itemedit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private customframework.Button backbtn;
    private customframework.ButtonOutLine chooseimgbtn;
    private customframework.Button deletebtn;
    private javax.swing.JRadioButton drinkradiobtn;
    private javax.swing.JComboBox<String> drinktypebox;
    private javax.swing.JRadioButton foodradiobtn;
    private javax.swing.JComboBox<String> foodtypebox;
    private javax.swing.JLabel imagelabel;
    private customframework.Button insertbtn;
    private javax.swing.ButtonGroup itemtypegroup;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private customframework.MyTextField namebox;
    private customframework.PanelRound panelRound1;
    private customframework.MyTextField pricebox;
    private customframework.MyTextField qtybox;
    private customframework.Button updatebtn;
    // End of variables declaration//GEN-END:variables
}
