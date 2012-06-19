

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * updatevehicle.java
 *
 * Created on Sep 2, 2010, 9:40:08 AM
 */

package vehiclerentalsystem;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author chana911
 */
public class updatevehicle extends javax.swing.JFrame {

    /** Creates new form updatevehicle */
    public updatevehicle() {
        initComponents();
        loadvhno();
    }



    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

     public void loadvhno() {
        try {
            Connection conn = myconn1.getConnection();
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("select vhno from vehicle");

            while (rs.next()) {
                vhno.addItem(rs.getString("vhno"));
            }
            rs = s.executeQuery("select vhtype,vhmodel,hirerate,dateofrenewlicence,date_of_insurance,servicedetail,maintainance_cost from vehicle where vhno = '" + vhno.getSelectedItem().toString()+"'");

            while (rs.next()) {
                vhtype.setText(rs.getString("vhtype"));
                vhmodel.setText(rs.getString("vhmodel"));
                Hirerate.setText(rs.getString("hirerate"));
               // r_date.setText("dateofrenewlicence");
               // ins_date.setText("date_of_insurance");
               // service_detail.setText("servicedetail");
               // m_cost.setText("maintainance_cost");
            }

        }
        catch (Exception ex) {
           // Logger.getLogger(updatecus.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }


    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ins_date = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        main = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        vhtype = new javax.swing.JTextField();
        vhmodel = new javax.swing.JTextField();
        r_date = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        vhno = new javax.swing.JComboBox();
        delete = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Hirerate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        service_detail = new javax.swing.JTextField();
        service = new javax.swing.JLabel();
        m_cost = new javax.swing.JTextField();
        jCalendarButton1 = new net.sourceforge.jcalendarbutton.JCalendarButton();
        jCalendarButton2 = new net.sourceforge.jcalendarbutton.JCalendarButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        update.setFont(new java.awt.Font("Forte", 0, 18));
        update.setForeground(new java.awt.Color(0, 0, 102));
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jLabel2.setText("Vehicle No");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jLabel6.setText("Revenew Date");

        main.setFont(new java.awt.Font("Forte", 0, 18));
        main.setForeground(new java.awt.Color(0, 0, 102));
        main.setText("Main");
        main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jLabel3.setText("Vehicle Type");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jLabel4.setText("Vehicle Model");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jLabel7.setText("Insurance Date");

        jLabel1.setFont(new java.awt.Font("Forte", 1, 24));
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Update vehicle");

        vhno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vhnoActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Forte", 0, 18));
        delete.setForeground(new java.awt.Color(0, 0, 102));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jLabel8.setText("Hire rate");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jLabel9.setText("Maintainance Cost");

        service.setFont(new java.awt.Font("Times New Roman", 0, 24));
        service.setText("Service Detail");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(320, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(355, Short.MAX_VALUE)
                .addComponent(update)
                .addGap(18, 18, 18)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(main)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(service)
                    .addComponent(jLabel9))
                .addGap(169, 169, 169)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(m_cost)
                    .addComponent(service_detail)
                    .addComponent(ins_date)
                    .addComponent(r_date)
                    .addComponent(Hirerate)
                    .addComponent(vhmodel)
                    .addComponent(vhtype)
                    .addComponent(vhno, 0, 176, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCalendarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCalendarButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vhno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vhtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(vhmodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Hirerate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(r_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jCalendarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ins_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(jCalendarButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(service)
                    .addComponent(service_detail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update)
                    .addComponent(delete)
                    .addComponent(main))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainActionPerformed
        // TODO add your handling code here:
        new main1().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mainActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            // TODO add your handling code here:
            Connection conn = myconn1.getConnection();
            Statement s = conn.createStatement();
            s.executeUpdate("update vehicle set vhtype = '" + vhtype.getText() + "'" + ",vhmodel = '" + vhmodel.getText() + "'" + ",hirerate = '" + Hirerate.getText() + "'" + ",dateofrenewlicence = '" + r_date.getText() + "'" + ",date_Of_insurance = '" + ins_date.getText() + "'" +",servicedetail = '" + service_detail.getText() + "'" + ",maintainance_cost = '" + m_cost.getText() + "'where vhno = '" + vhno.getSelectedItem().toString() + "'");
            JOptionPane.showMessageDialog(null, "Record updated");
        } catch (Exception ex) {
            //Logger.getLogger(updatevehicle.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Record update failed");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try {
            // TODO add your handling code here:
            Connection conn = myconn1.getConnection();
            Statement s = conn.createStatement();
            s.executeUpdate("delete from vehicle where vhno ='" + vhno.getSelectedItem().toString() + "'");
            vhno.removeAllItems();
            loadvhno();
        } catch (Exception ex) {
            //Logger.getLogger(updatevehicle.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void vhnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vhnoActionPerformed
        try {
            // TODO add your handling code here:
            Connection conn = myconn1.getConnection();
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("select  vhtype,vhmodel ,hirerate,dateofrenewlicence,date_Of_insurance,servicedetail,maintainance_cost from vehicle where vhno = '" + vhno.getSelectedItem().toString() + "'");
            while (rs.next()) {
                vhtype.setText(rs.getString("vhtype"));
                vhmodel.setText(rs.getString("vhmodel"));
                Hirerate.setText(rs.getString("hirerate"));
                r_date.setText(rs.getString("dateofrenewlicence"));
                ins_date.setText(rs.getString("date_Of_insurance"));
                service_detail.setText(rs.getString("servicedetail"));
                m_cost.setText(rs.getString("maintainance_cost"));
    }//GEN-LAST:event_vhnoActionPerformed
        }
        catch(Exception ex){
            ex.printStackTrace();

        }
    }

     private void dateOnlyPopupChanged(java.beans.PropertyChangeEvent evt) {
        if (evt.getNewValue() instanceof Date)
            setDate((Date)evt.getNewValue());
    }

      private void datePopupChanged(java.beans.PropertyChangeEvent evt) {
        if (evt.getNewValue() instanceof Date)
            setDate1((Date)evt.getNewValue());
    }

          public void setDate(Date date)
    {
        String dateString = "";
        if (date != null)
    		dateString = dateFormat.format(date);
        r_date.setText(dateString);
        jCalendarButton1.setTargetDate(date);
    }

      public void setDate1(Date date)
    {
        String dateString = "";
        if (date != null)
    		dateString = dateFormat.format(date);
        ins_date.setText(dateString);
        jCalendarButton1.setTargetDate(date);
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatevehicle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Hirerate;
    private javax.swing.JButton delete;
    private javax.swing.JTextField ins_date;
    private net.sourceforge.jcalendarbutton.JCalendarButton jCalendarButton1;
    private net.sourceforge.jcalendarbutton.JCalendarButton jCalendarButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField m_cost;
    private javax.swing.JButton main;
    private javax.swing.JTextField r_date;
    private javax.swing.JLabel service;
    private javax.swing.JTextField service_detail;
    private javax.swing.JButton update;
    private javax.swing.JTextField vhmodel;
    private javax.swing.JComboBox vhno;
    private javax.swing.JTextField vhtype;
    // End of variables declaration//GEN-END:variables
public static DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
}