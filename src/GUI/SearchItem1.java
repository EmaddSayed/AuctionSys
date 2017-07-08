package GUI;

import auctionsystem.Bidder;
import auctionsystem.User;
import java.util.HashMap;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author emad
 */
public class SearchItem1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form SearchItem1
     */
    User user;
    private int Flag;

    public SearchItem1(User U, int FlagSeller) {
        this.user = U;
        this.Flag = FlagSeller;
        initComponents();
        if (FlagSeller == 1) {
            this.PutPrice.setVisible(false);
        }
        It.setVisible(false);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.PutPriceView.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ITEMID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        It = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Minia = new javax.swing.JLabel();
        DeptID = new javax.swing.JTextField();
        ItemWieght = new javax.swing.JTextField();
        Date = new javax.swing.JTextField();
        Mini = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        PutPrice = new javax.swing.JButton();
        PutPriceView = new javax.swing.JPanel();
        SubmotPrice = new javax.swing.JTextField();
        PutPrice1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel7.setBackground(new java.awt.Color(51, 255, 51));
        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 255, 0));
        jLabel7.setText("Search Item");

        ITEMID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(51, 255, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Item ID       :");

        It.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setBackground(new java.awt.Color(51, 255, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Dept ID                :");

        jLabel3.setBackground(new java.awt.Color(51, 255, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Item Wieght         :");

        jLabel4.setBackground(new java.awt.Color(51, 255, 51));
        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("Date Of Usage      :");

        Minia.setBackground(new java.awt.Color(51, 255, 51));
        Minia.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        Minia.setForeground(new java.awt.Color(0, 204, 204));
        Minia.setText("Minimum Price      :");

        DeptID.setEditable(false);
        DeptID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        ItemWieght.setEditable(false);
        ItemWieght.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Date.setEditable(false);
        Date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Mini.setEditable(false);
        Mini.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Price.setEditable(false);
        Price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel8.setBackground(new java.awt.Color(51, 255, 51));
        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText("Highest Price       :");

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("More");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(255, 0, 0));
        Delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        PutPrice.setBackground(new java.awt.Color(51, 255, 51));
        PutPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PutPrice.setText("Put Price");
        PutPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PutPriceActionPerformed(evt);
            }
        });

        PutPriceView.setBackground(new java.awt.Color(153, 153, 153));

        SubmotPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        PutPrice1.setBackground(new java.awt.Color(51, 255, 51));
        PutPrice1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PutPrice1.setText("Submit Price");
        PutPrice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PutPrice1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PutPriceViewLayout = new javax.swing.GroupLayout(PutPriceView);
        PutPriceView.setLayout(PutPriceViewLayout);
        PutPriceViewLayout.setHorizontalGroup(
            PutPriceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PutPriceViewLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(PutPrice1)
                .addGap(57, 57, 57)
                .addComponent(SubmotPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addContainerGap())
        );
        PutPriceViewLayout.setVerticalGroup(
            PutPriceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PutPriceViewLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(PutPriceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmotPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PutPrice1))
                .addContainerGap())
        );

        javax.swing.GroupLayout ItLayout = new javax.swing.GroupLayout(It);
        It.setLayout(ItLayout);
        ItLayout.setHorizontalGroup(
            ItLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ItLayout.createSequentialGroup()
                .addGroup(ItLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ItLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(ItLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ItLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Minia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ItLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(ItLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ItLayout.createSequentialGroup()
                        .addComponent(PutPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(ItLayout.createSequentialGroup()
                        .addGroup(ItLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Mini, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(Date, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ItemWieght, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DeptID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Price))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(ItLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(PutPriceView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ItLayout.setVerticalGroup(
            ItLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ItLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(ItLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DeptID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addGroup(ItLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ItemWieght, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ItLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ItLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Minia)
                    .addComponent(Mini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ItLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(ItLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PutPrice)
                    .addComponent(Delete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PutPriceView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jButton3.setBackground(new java.awt.Color(51, 255, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(ITEMID, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(It, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ITEMID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(It, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ManagerHome.ManagerView.removeAll();
        ManagerHome.ManagerView.repaint();
        ManagerHome.ManagerView.revalidate();
        int DeptID = Integer.parseInt(this.DeptID.getText());
        SearchDept S = new SearchDept(this.user.departementInfo(DeptID));
        ManagerHome.ManagerView.add(S);
        S.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int ItemID;
        this.PutPriceView.setVisible(false);
        this.Price.setText("");
        try {
            ItemID = Integer.parseInt(this.ITEMID.getText());
            HashMap<String, String> Values = this.user.SearchItem(ItemID);
            if (Values != null) {//2 20 5 30000
                this.It.setVisible(true);
                this.DeptID.setText(Values.get("7omar"));
                this.ItemWieght.setText(Values.get("Weight"));
                this.Date.setText(Values.get("Perioud_Usage"));
                this.Mini.setText(Values.get("Minimum_Price"));
                try{
                this.Price.setText("" + this.user.Get_Max_Price(ItemID));
                }
                catch(Exception E)
                {
                    
                }
            }
        }
        catch(Exception E)
        {
            JOptionPane.showMessageDialog(null, "Invalid ID Or ID Doesn't Exist             ");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        int ItemID = Integer.parseInt(this.ITEMID.getText());
        if (this.user.DeleteItem(ItemID, this.Flag)) {
            JOptionPane.showMessageDialog(null, "Deleted");

        } else {
            JOptionPane.showMessageDialog(null, "Not Yours");

        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void PutPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PutPriceActionPerformed
        // TODO add your handling code here:
        this.PutPriceView.setVisible(true);
    }//GEN-LAST:event_PutPriceActionPerformed

    private void PutPrice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PutPrice1ActionPerformed
        // TODO add your handling code here:
        Bidder B = new Bidder();
        B = (Bidder) this.user;
        int ItemID = Integer.parseInt(this.ITEMID.getText());
        float Price = Float.parseFloat(this.SubmotPrice.getText());
        boolean Flag = B.PutPriceOnItem(ItemID, Price);
        if (Flag) {
            JOptionPane.showMessageDialog(null, "Done");
        } else {
            JOptionPane.showMessageDialog(null, "Item Sold or Your balance not Enough " + System.getProperty("line.separator") + " for Whole Items you Partispated");
        }

    }//GEN-LAST:event_PutPrice1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Date;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField DeptID;
    private javax.swing.JTextField ITEMID;
    private javax.swing.JPanel It;
    private javax.swing.JTextField ItemWieght;
    private javax.swing.JTextField Mini;
    private javax.swing.JLabel Minia;
    private javax.swing.JTextField Price;
    private javax.swing.JButton PutPrice;
    private javax.swing.JButton PutPrice1;
    private javax.swing.JPanel PutPriceView;
    private javax.swing.JTextField SubmotPrice;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
