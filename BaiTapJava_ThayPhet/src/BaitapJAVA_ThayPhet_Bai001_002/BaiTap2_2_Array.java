/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaitapJAVA_ThayPhet_Bai001_002;

import java.awt.event.KeyEvent;
import static java.lang.Math.sqrt;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author CrisKha
 */
public class BaiTap2_2_Array extends javax.swing.JFrame {

    /**
     * Creates new form BaiTap2
     */
    public BaiTap2_2_Array() {
        initComponents();
    }

    ArrayList<String> ArrayNumber=new ArrayList<>();
    ArrayList<String>ArraysoNguyenTo=new ArrayList<>();
  
    int soNguyenTo(int soA){
        if (soA < 2)    
            return 0;

        for (int i = 2; i <= sqrt((float)soA); i ++)
        {
            if (soA%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    
    private void sinhmang1chieu(){
        
        String so=txtinputnumber.getText();
        int n=Integer.parseInt(so);
        Random rd =new Random();
        int a[]=new int[n];
        for(int i=0; i<n; i++){
            a[i]=rd.nextInt(1000);
            
            String tem=String.valueOf(a[i]);
            ArrayNumber.add("a["+i+"] = "+tem);
            if(soNguyenTo(a[i])==1){
            ArraysoNguyenTo.add("a["+i+"] = "+tem);
            }
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMang = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jbtnTaoMang = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNguyento = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        btnSNT = new javax.swing.JButton();
        txtinputnumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Bài Tập 2");

        txtMang.setColumns(20);
        txtMang.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtMang.setForeground(new java.awt.Color(255, 0, 0));
        txtMang.setRows(5);
        txtMang.setEnabled(false);
        jScrollPane1.setViewportView(txtMang);

        jLabel3.setText("Mảng số nguyên.");

        jbtnTaoMang.setText("Tạo Mảng");
        jbtnTaoMang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTaoMangActionPerformed(evt);
            }
        });

        txtNguyento.setColumns(20);
        txtNguyento.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtNguyento.setForeground(new java.awt.Color(0, 0, 204));
        txtNguyento.setRows(5);
        txtNguyento.setEnabled(false);
        jScrollPane2.setViewportView(txtNguyento);

        jLabel4.setText("Số nguyên tố.");

        btnSNT.setText("Xuất số nguyên tố trong mảng");
        btnSNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSNTActionPerformed(evt);
            }
        });

        txtinputnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtinputnumberKeyTyped(evt);
            }
        });

        jLabel5.setText("Số phần tử:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtinputnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnTaoMang))
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSNT)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jLabel1)
                .addContainerGap(288, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jbtnTaoMang)
                            .addComponent(txtinputnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4))
                    .addComponent(btnSNT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    private void jbtnTaoMangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTaoMangActionPerformed
        // TODO add your handling code here:
        txtMang.setText(null);
        txtNguyento.setText(null);

        if(txtinputnumber.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Vui lòng nhập số phần tử cần sinh ra:");
            txtinputnumber.requestFocus();
            return;
        }
        ArrayNumber.removeAll(ArrayNumber);
        ArraysoNguyenTo.removeAll(ArraysoNguyenTo);
        sinhmang1chieu();
        ArrayNumber.stream().forEach((obj) -> {
            txtMang.append((obj +"\t"));
            if((ArrayNumber.indexOf(obj)+1)%4==0){
            txtMang.append("\n");
            }
           
        });
    }//GEN-LAST:event_jbtnTaoMangActionPerformed

    private void txtinputnumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtinputnumberKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtinputnumberKeyTyped

    private void btnSNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSNTActionPerformed
        // TODO add your handling code here:
        txtNguyento.setText("Danh sách số nguyên tố trong mảng:\n");
        if(ArraysoNguyenTo.isEmpty()){
            txtNguyento.append("\nKhông có số nguyên tố nào trong mảng!");
            return;
        }
        else{
            ArraysoNguyenTo.stream().forEach((obj) -> {
                txtNguyento.append((obj +"\t"));
                if((ArraysoNguyenTo.indexOf(obj)+1)%4==0){
                    txtNguyento.append("\n");
                }
            });
        }
        
        
    }//GEN-LAST:event_btnSNTActionPerformed

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
            java.util.logging.Logger.getLogger(BaiTap2_2_Array.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaiTap2_2_Array.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaiTap2_2_Array.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaiTap2_2_Array.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaiTap2_2_Array().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSNT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnTaoMang;
    private javax.swing.JTextArea txtMang;
    private javax.swing.JTextArea txtNguyento;
    private javax.swing.JTextField txtinputnumber;
    // End of variables declaration//GEN-END:variables
}