/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaitapJAVA_ThayPhet_Bai001_002;

import java.awt.event.KeyEvent;
import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;

/**
 *
 * @author CrisKha
 */
public class BaiTap2_1_Giai_ptr extends javax.swing.JFrame {

    /**
     * Creates new form BaiTap1
     */
    public BaiTap2_1_Giai_ptr() {
        initComponents();
    }
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaBaiGiai = new javax.swing.JTextArea();
        jTFB = new javax.swing.JTextField();
        jTFC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFA = new javax.swing.JTextField();
        jbtnGPtr = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTFptr = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFX1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFX2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jbtnLamlai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Số C:");

        jTextAreaBaiGiai.setColumns(20);
        jTextAreaBaiGiai.setRows(5);
        jTextAreaBaiGiai.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextAreaBaiGiai.setEnabled(false);
        jScrollPane1.setViewportView(jTextAreaBaiGiai);

        jTFB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBKeyTyped(evt);
            }
        });

        jTFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCKeyTyped(evt);
            }
        });

        jLabel8.setText("Bài Giải:");

        jTFA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFAKeyTyped(evt);
            }
        });

        jbtnGPtr.setText("Giải Ptrình");
        jbtnGPtr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGPtrActionPerformed(evt);
            }
        });

        jLabel5.setText("Ptrình:");

        jTFptr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTFptr.setText("ax2 + bx + c=0");
        jTFptr.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTFptr.setEnabled(false);

        jLabel6.setText("Nghiệm Ptrinh:");

        jTFX1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTFX1.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Bài Tập 1: Phương Trình Bậc 2");

        jLabel7.setText("X2 =");

        jLabel2.setText("Số A:");

        jTFX2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTFX2.setEnabled(false);

        jLabel3.setText("Số B:");

        jLabel9.setText("X2 =");

        jbtnLamlai.setText("Làm Lại");
        jbtnLamlai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLamlaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnLamlai)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTFA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTFB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(23, 23, 23)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTFC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addComponent(jTFptr, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53)
                            .addComponent(jbtnGPtr))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(11, 11, 11)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTFX1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel9)
                            .addGap(8, 8, 8)
                            .addComponent(jTFX2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jTFB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFptr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnGPtr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnLamlai, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTFX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTFX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTFBKeyTyped

    private void jTFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTFCKeyTyped

    private void jTFAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFAKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTFAKeyTyped
   private void settext(){
        jTextAreaBaiGiai.setText("");
        jTFX1.setText("");
        jTFX2.setText("");

    }
    
    private void Actionrun(){
        float a,b,c,x1,x2;
        String A=jTFA.getText();
        String B=jTFB.getText();
        String C=jTFC.getText();
        if (A.isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập số A!");
            jTFA.requestFocus();
            return;
        }
        if (B.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập số B!");
            jTFB.requestFocus();
            return;
        }
        if (C.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập số C!");
            jTFC.requestFocus();
            return;
        }
        a=Float.parseFloat(A);
        b=Float.parseFloat(B);
        c=Float.parseFloat(C);
        if (a==0)
	{
		if (b==0)
		{
			if (c==0){
                            settext();
                            String str="Phuong trinh vo so nghiem";
                            jTextAreaBaiGiai.setText(str);
                        }
			else {
                            String str="Phuong trinh vo nghiem";
                            jTextAreaBaiGiai.setText(str);
                        }
		}
		else
		{
			x1=-b/c;
                        settext();
			String str="Phuong trinh co 1 nghiem: x = "+x1;
                        jTFX1.setText(String.valueOf(x1));
                        jTextAreaBaiGiai.setText(str);
		}
	}
	else
	{
		float delta=b*b-4*a*c ;
		if (delta<0){
                            settext();
                            String str="Với delta = "+delta+" < 0."+"\n=> Phuong trinh vo nghiem";
                            jTextAreaBaiGiai.setText(str);
                        }
		if (delta==0)
		{
			x1=-b/(2*a);
                        settext();
			String str="Với delta = "+delta+"."+"\n=> Phuong trinh co nghiem kép: x = "+x1;
                        jTFX1.setText(String.valueOf(x1));
                        jTFX2.setText(String.valueOf(x1));
                        jTextAreaBaiGiai.setText(str);
		}
		if (delta>0)
		{
			x1=(float) ((-b+sqrt(delta))/(2*a));
			x2=(float) ((-b-sqrt(delta))/(2*a));
			String str="Với delta = "+delta+" > 0."+"\n=> Phuong trinh co 2 nghiem phan biet:"+"\n x1 = "+x1+"\n x2 = "+x2;
			jTFX1.setText(String.valueOf(x1));
                        jTFX2.setText(String.valueOf(x2));
                        jTextAreaBaiGiai.setText(str);
		}
	}
    }
    
    private void jbtnGPtrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGPtrActionPerformed
        // TODO add your handling code here:
        String A=jTFA.getText();
        String B=jTFB.getText();
        String C=jTFC.getText();
        if(A.isEmpty() || B.isEmpty() || C.isEmpty()){
            jTFptr.setText("Ax2 + Bx + C = 0");
        }
        else{
            String ptr=A+"x2"+" + "+B+"x"+" + "+C+" = 0";
            jTFptr.setText(ptr);
        }
        Actionrun();
    }//GEN-LAST:event_jbtnGPtrActionPerformed

    private void jbtnLamlaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLamlaiActionPerformed
        // TODO add your handling code here:
        String ptr="Ax2"+" + "+"Bx"+" + "+"C = 0";
        jTFptr.setText(ptr);
        settext();
        jTFA.setText("");
        jTFB.setText("");
        jTFC.setText("");
        jTFA.requestFocus();
    }//GEN-LAST:event_jbtnLamlaiActionPerformed

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
            java.util.logging.Logger.getLogger(BaiTap2_1_Giai_ptr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaiTap2_1_Giai_ptr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaiTap2_1_Giai_ptr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaiTap2_1_Giai_ptr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaiTap2_1_Giai_ptr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFA;
    private javax.swing.JTextField jTFB;
    private javax.swing.JTextField jTFC;
    private javax.swing.JTextField jTFX1;
    private javax.swing.JTextField jTFX2;
    private javax.swing.JTextField jTFptr;
    private javax.swing.JTextArea jTextAreaBaiGiai;
    private javax.swing.JButton jbtnGPtr;
    private javax.swing.JButton jbtnLamlai;
    // End of variables declaration//GEN-END:variables
}