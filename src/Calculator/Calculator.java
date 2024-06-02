/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Calculator;


public class Calculator extends javax.swing.JFrame {

    
    double NumEnter1;
    double NumEnter2;
    double Result;
    String Op;
    
    public Calculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtResult = new javax.swing.JTextField();
        jbtnPM = new javax.swing.JButton();
        jbtnBKS = new javax.swing.JButton();
        jbtnCE = new javax.swing.JButton();
        jbtnC = new javax.swing.JButton();
        jbtnPlus = new javax.swing.JButton();
        jbtnDigit7 = new javax.swing.JButton();
        jbtnDigit8 = new javax.swing.JButton();
        jbtnDigit9 = new javax.swing.JButton();
        jbtnMinus = new javax.swing.JButton();
        jbtnDigit4 = new javax.swing.JButton();
        jbtnDigit5 = new javax.swing.JButton();
        jbtnDigit6 = new javax.swing.JButton();
        jbtnMulti = new javax.swing.JButton();
        jbtnDigit1 = new javax.swing.JButton();
        jbtnDigit2 = new javax.swing.JButton();
        jbtnDigit3 = new javax.swing.JButton();
        jbtnSlash = new javax.swing.JButton();
        jbtnDigit0 = new javax.swing.JButton();
        jbtnDot = new javax.swing.JButton();
        jbtnEqual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 51));
        setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtResult.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jtxtResult.setForeground(new java.awt.Color(51, 0, 102));
        jtxtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtResultActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 350, 80));

        jbtnPM.setBackground(new java.awt.Color(255, 0, 153));
        jbtnPM.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jbtnPM.setText("+-");
        jbtnPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPMActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 70, 50));

        jbtnBKS.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jbtnBKS.setText("<");
        jbtnBKS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBKSActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBKS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 70, 40));

        jbtnCE.setBackground(new java.awt.Color(255, 51, 51));
        jbtnCE.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jbtnCE.setText("CE");
        jbtnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCEActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 70, 40));

        jbtnC.setBackground(new java.awt.Color(255, 51, 51));
        jbtnC.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jbtnC.setText("C");
        jbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 70, 40));

        jbtnPlus.setBackground(new java.awt.Color(255, 0, 153));
        jbtnPlus.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jbtnPlus.setText("+");
        jbtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 70, 50));

        jbtnDigit7.setBackground(new java.awt.Color(51, 0, 204));
        jbtnDigit7.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jbtnDigit7.setText("7");
        jbtnDigit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit7ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 70, 40));

        jbtnDigit8.setBackground(new java.awt.Color(51, 0, 204));
        jbtnDigit8.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jbtnDigit8.setText("8");
        jbtnDigit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit8ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 70, 40));

        jbtnDigit9.setBackground(new java.awt.Color(51, 0, 204));
        jbtnDigit9.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jbtnDigit9.setText("9");
        jbtnDigit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit9ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 70, 40));

        jbtnMinus.setBackground(new java.awt.Color(255, 0, 153));
        jbtnMinus.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jbtnMinus.setText("-");
        jbtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMinusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 70, 50));

        jbtnDigit4.setBackground(new java.awt.Color(51, 0, 204));
        jbtnDigit4.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jbtnDigit4.setText("4");
        jbtnDigit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 70, 40));

        jbtnDigit5.setBackground(new java.awt.Color(51, 0, 204));
        jbtnDigit5.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jbtnDigit5.setText("5");
        jbtnDigit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit5ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 70, 40));

        jbtnDigit6.setBackground(new java.awt.Color(51, 0, 204));
        jbtnDigit6.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jbtnDigit6.setText("6");
        jbtnDigit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit6ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 70, 40));

        jbtnMulti.setBackground(new java.awt.Color(255, 0, 153));
        jbtnMulti.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jbtnMulti.setText("*");
        jbtnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMultiActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 70, 50));

        jbtnDigit1.setBackground(new java.awt.Color(51, 0, 204));
        jbtnDigit1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jbtnDigit1.setText("1");
        jbtnDigit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 70, 40));

        jbtnDigit2.setBackground(new java.awt.Color(51, 0, 204));
        jbtnDigit2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jbtnDigit2.setText("2");
        jbtnDigit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 70, 40));

        jbtnDigit3.setBackground(new java.awt.Color(51, 0, 204));
        jbtnDigit3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jbtnDigit3.setText("3");
        jbtnDigit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 70, 40));

        jbtnSlash.setBackground(new java.awt.Color(255, 0, 153));
        jbtnSlash.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jbtnSlash.setText("/");
        jbtnSlash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSlashActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSlash, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 70, 50));

        jbtnDigit0.setBackground(new java.awt.Color(51, 0, 204));
        jbtnDigit0.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jbtnDigit0.setText("0");
        jbtnDigit0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit0ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 70, 40));

        jbtnDot.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jbtnDot.setText(".");
        jbtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDotActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDot, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 70, 50));

        jbtnEqual.setBackground(new java.awt.Color(102, 102, 102));
        jbtnEqual.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jbtnEqual.setText("=");
        jbtnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEqualActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnEqual, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 70, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void EnterNumbers(String q){
     String Nums = jtxtResult.getText() + q;
     jtxtResult.setText(Nums);
 }
    private void jbtnDigit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit7ActionPerformed
EnterNumbers("7");
    }//GEN-LAST:event_jbtnDigit7ActionPerformed

    private void jtxtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtResultActionPerformed

    private void jbtnDigit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit8ActionPerformed
EnterNumbers("8");
    }//GEN-LAST:event_jbtnDigit8ActionPerformed

    private void jbtnDigit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit9ActionPerformed
EnterNumbers("9");
    }//GEN-LAST:event_jbtnDigit9ActionPerformed

    private void jbtnDigit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit4ActionPerformed
EnterNumbers("4");
    }//GEN-LAST:event_jbtnDigit4ActionPerformed

    private void jbtnDigit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit5ActionPerformed
EnterNumbers("5");
    }//GEN-LAST:event_jbtnDigit5ActionPerformed

    private void jbtnDigit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit6ActionPerformed
EnterNumbers("6");
    }//GEN-LAST:event_jbtnDigit6ActionPerformed

    private void jbtnDigit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit1ActionPerformed
EnterNumbers("1");
    }//GEN-LAST:event_jbtnDigit1ActionPerformed

    private void jbtnDigit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit2ActionPerformed
EnterNumbers("2");
    }//GEN-LAST:event_jbtnDigit2ActionPerformed

    private void jbtnDigit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit3ActionPerformed
EnterNumbers("3");
    }//GEN-LAST:event_jbtnDigit3ActionPerformed

    private void jbtnDigit0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit0ActionPerformed
EnterNumbers("0");
    }//GEN-LAST:event_jbtnDigit0ActionPerformed

    private void jbtnSlashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSlashActionPerformed
NumEnter1 = Double.parseDouble(jtxtResult.getText());
jtxtResult.setText("");
Op ="/";
    }//GEN-LAST:event_jbtnSlashActionPerformed

    private void jbtnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMultiActionPerformed
NumEnter1 = Double.parseDouble(jtxtResult.getText());
jtxtResult.setText("");
Op ="*";
    }//GEN-LAST:event_jbtnMultiActionPerformed

    private void jbtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinusActionPerformed
NumEnter1 = Double.parseDouble(jtxtResult.getText());
jtxtResult.setText("");
Op ="-";
    }//GEN-LAST:event_jbtnMinusActionPerformed

    private void jbtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlusActionPerformed
NumEnter1 = Double.parseDouble(jtxtResult.getText());
jtxtResult.setText("");
Op ="+";
    }//GEN-LAST:event_jbtnPlusActionPerformed

    private void jbtnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEqualActionPerformed
NumEnter2 = Double.parseDouble(jtxtResult.getText());
if (Op == "+"){
    Result = NumEnter1 + NumEnter2;
    jtxtResult.setText(String.valueOf(Result));
}

else if (Op == "-"){
    Result = NumEnter1 - NumEnter2;
    jtxtResult.setText(String.valueOf(Result));
}

else if (Op == "*"){
    Result = NumEnter1 * NumEnter2;
    jtxtResult.setText(String.valueOf(Result));
}

else if (Op == "/"){
    Result = NumEnter1 / NumEnter2;
    jtxtResult.setText(String.valueOf(Result));
}
    }//GEN-LAST:event_jbtnEqualActionPerformed

    private void jbtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDotActionPerformed
if (! jtxtResult.getText().contains(".")){
    jtxtResult.setText(jtxtResult.getText() + jbtnDot.getText());
}
        
    }//GEN-LAST:event_jbtnDotActionPerformed

    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCActionPerformed

jtxtResult.setText("");
    }//GEN-LAST:event_jbtnCActionPerformed

    private void jbtnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCEActionPerformed

jtxtResult.setText("");
String Fn, Sn;
Fn = String.valueOf(NumEnter1);
Sn = String.valueOf(NumEnter2);

Fn ="";
Sn="";
    }//GEN-LAST:event_jbtnCEActionPerformed

    private void jbtnPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPMActionPerformed
double nums = Double.parseDouble(String.valueOf(jtxtResult.getText()) );
nums = nums * (-1);
jtxtResult.setText(String.valueOf(nums));
    }//GEN-LAST:event_jbtnPMActionPerformed

    private void jbtnBKSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBKSActionPerformed
String backSp = null;

if (jtxtResult.getText().length() > 0){
    StringBuilder sb = new StringBuilder(jtxtResult.getText());
    sb.deleteCharAt(jtxtResult.getText().length() - 1);
    backSp = sb.toString();
    jtxtResult.setText(backSp);
}
    }//GEN-LAST:event_jbtnBKSActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnBKS;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnCE;
    private javax.swing.JButton jbtnDigit0;
    private javax.swing.JButton jbtnDigit1;
    private javax.swing.JButton jbtnDigit2;
    private javax.swing.JButton jbtnDigit3;
    private javax.swing.JButton jbtnDigit4;
    private javax.swing.JButton jbtnDigit5;
    private javax.swing.JButton jbtnDigit6;
    private javax.swing.JButton jbtnDigit7;
    private javax.swing.JButton jbtnDigit8;
    private javax.swing.JButton jbtnDigit9;
    private javax.swing.JButton jbtnDot;
    private javax.swing.JButton jbtnEqual;
    private javax.swing.JButton jbtnMinus;
    private javax.swing.JButton jbtnMulti;
    private javax.swing.JButton jbtnPM;
    private javax.swing.JButton jbtnPlus;
    private javax.swing.JButton jbtnSlash;
    private javax.swing.JTextField jtxtResult;
    // End of variables declaration//GEN-END:variables
}
