/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * updatecus.java
 *
 * Created on Sep 2, 2010, 9:39:51 AM
 */

package vehiclerentalsystem;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author chana911
 */
public class updatecus extends javax.swing.JFrame {

    /** Creates new form updatecus */
    public updatecus() throws Exception{
        initComponents();
        loadcusno();
    }

    public void loadcusno() {
        try {
            Connection conn = myconn1.getConnection();
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("select cusno from customer");
            
            while (rs.next()) {
                cusno.addItem(rs.getString("cusno"));
            }
            rs = s.executeQuery("select cusname,cusNic_pass,address,phone from customer where cusno = '" + cusno.getSelectedItem().toString() + "'");

            while (rs.next()) {
                 cusname.setText(rs.getString("cusname"));
                cusnic.setText(rs.getString("cusNic_pass"));
                addre.setText(rs.getString("address"));
                phon.setText(rs.getString("phone"));
            }

        }
        catch (Exception ex) {
           // Logger.getLogger(updatecus.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
      
        
    }



    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        phon = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        addre = new javax.swing.JTextField();
        cusnic = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cusno = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        cusname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        back.setFont(new java.awt.Font("Forte", 0, 18));
        back.setForeground(new java.awt.Color(0, 0, 102));
        back.setText("Main");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Forte", 0, 18));
        update.setForeground(new java.awt.Color(0, 0, 102));
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Customer NIC/PassportNo");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Customer name");

        jLabel4.setFont(new java.awt.Font("Forte", 1, 24));
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Update Customer ");

        phone.setFont(new java.awt.Font("Times New Roman", 0, 24));
        phone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        phone.setText("Phone");

        address.setFont(new java.awt.Font("Times New Roman", 0, 24));
        address.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        address.setText("Address");

        delete.setFont(new java.awt.Font("Forte", 0, 18));
        delete.setForeground(new java.awt.Color(0, 0, 102));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        cusno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusnoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jLabel7.setText("Cusno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel4)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(413, Short.MAX_VALUE)
                .addComponent(update)
                .addGap(26, 26, 26)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(289, 289, 289)
                        .addComponent(cusno, 0, 185, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 535, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(address)
                            .addComponent(phone)
                            .addComponent(jLabel1))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cusname, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(addre, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(cusnic, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(phon, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))))
                .addGap(276, 276, 276))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cusno, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cusname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cusnic, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address)
                    .addComponent(addre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone)
                    .addComponent(phon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(update)
                    .addComponent(delete))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            // TODO add your handling code here:
            Connection conn = myconn1.getConnection();
            Statement s = conn.createStatement();
            s.executeUpdate("update customer set cusname = '" + cusname.getText() + "'" + ",cusNic_pass = '" + cusnic.getText() + "'" + ",address = '" + addre.getText() + "'" + ",phone = '" + phon.getText() + "' where cusno = '" + cusno.getSelectedItem().toString() + "'");
                 JOptionPane.showMessageDialog(null, "Record updated");
        } catch (Exception ex) {
           // Logger.getLogger(updatecus.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_updateActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new main1().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void cusnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusnoActionPerformed

        try {
            // TODO add your handling code here:
            Connection conn = myconn1.getConnection();
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("select cusname, cusNic_pass ,address ,phone from customer where cusno = '" + cusno.getSelectedItem().toString()+"'");

            while (rs.next()) {
                cusname.setText(rs.getString("cusname"));
                cusnic.setText(rs.getString("cusNic_pass"));
                addre.setText(rs.getString("address"));
                phon.setText(rs.getString("phone"));
            }
        }
        catch (Exception ex) {
            //Logger.getLogger(updatecus.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }

    }//GEN-LAST:event_cusnoActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        
        try{
        Connection conn = myconn1.getConnection();
        Statement s = conn.createStatement();
        s.executeUpdate("delete from customer where cusno ='"+ cusno.getSelectedItem().toString()+"'");
        
                cusno.removeAllItems();

        loadcusno();
             JOptionPane.showMessageDialog(null, "Record deleted");
    }//GEN-LAST:event_deleteActionPerformed
    catch(Exception e) {
        e.printStackTrace();
        
        }
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new updatecus().setVisible(true);
                } catch (Exception ex) {
                   // Logger.getLogger(updatecus.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addre;
    private javax.swing.JLabel address;
    private javax.swing.JButton back;
    private javax.swing.JTextField cusname;
    private javax.swing.JTextField cusnic;
    private javax.swing.JComboBox cusno;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField phon;
    private javax.swing.JLabel phone;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

}