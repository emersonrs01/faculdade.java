 import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;
public class IG_cpf_banco extends javax.swing.JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public IG_cpf_banco() {
        initComponents();
        setTitle("ADS BANK OF AMERICA");
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numcpf = new java.awt.TextField();
        validacpf = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rescpf = new javax.swing.JLabel();
        resultfinal = new javax.swing.JLabel();
        textvalorsaque = new javax.swing.JTextField();
        textnt200 = new javax.swing.JLabel();
        btSacar = new javax.swing.JButton();
        textnt100 = new javax.swing.JLabel();
        textnt50 = new javax.swing.JLabel();
        textnt20 = new javax.swing.JLabel();
        textnt10 = new javax.swing.JLabel();
        textnt5 = new javax.swing.JLabel();
        textnt2 = new javax.swing.JLabel();
        textntnor = new javax.swing.JLabel();
        btpequenas = new javax.swing.JButton();
        btmedias = new javax.swing.JButton();
        lbbemvindo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("ADS BANK OF AMERICA");

        jLabel2.setText("Valide Seu CPF para Proceder ao Saque.");

        numcpf.setName("numcpf"); // NOI18N
        numcpf.setText("Insira e Valide Seu CPF!");
        numcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numcpfActionPerformed(evt);
            }
        });

        validacpf.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        validacpf.setText("Validar CPF");
        validacpf.setActionCommand("validaCPF");
        validacpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validacpfActionPerformed(evt);
            }
        });

        jLabel4.setText("OBS: Apenas Números");

        jLabel5.setText("Resultado da Validação: ");

        textvalorsaque.setText("Valide seu CPF");
        textvalorsaque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textvalorsaqueMouseClicked(evt);
            }
        });
        textvalorsaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textvalorsaqueActionPerformed(evt);
            }
        });

        textnt200.setText("Notas de 200 Reais");

        btSacar.setText("Notas Grandes!");
        btSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSacarActionPerformed(evt);
            }
        });

        textnt100.setText("Notas de 100 Reais");

        textnt50.setText("Notas de  50 Reais ");

        textnt20.setText("Notas de  20 Reais");

        textnt10.setText("Notas de  10 Reais");

        textnt5.setText("Notas de    5 Reais");

        textnt2.setText("Notas de    2 Reais");

        textntnor.setText("Normação");

        btpequenas.setText("Notas Pequenas");
        btpequenas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpequenasActionPerformed(evt);
            }
        });

        btmedias.setText("Notas Médias");
        btmedias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmediasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(resultfinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rescpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(54, 54, 54))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textvalorsaque, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btSacar)
                                .addGap(163, 163, 163)))
                        .addGap(67, 221, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textntnor, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btmedias)
                                        .addGap(28, 28, 28)
                                        .addComponent(btpequenas))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textnt200, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textnt100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textnt50, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                        .addComponent(textnt20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textnt10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textnt5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textnt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(lbbemvindo, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(234, 234, 234))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(validacpf, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(validacpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rescpf)
                    .addComponent(jLabel5))
                .addGap(36, 36, 36)
                .addComponent(resultfinal)
                .addGap(31, 31, 31)
                .addComponent(lbbemvindo)
                .addGap(46, 46, 46)
                .addComponent(textvalorsaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSacar)
                    .addComponent(btpequenas)
                    .addComponent(btmedias))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textnt200)
                    .addComponent(textntnor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textnt100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textnt50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textnt20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textnt10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textnt5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textnt2)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numcpfActionPerformed
    }//GEN-LAST:event_numcpfActionPerformed

    private void validacpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validacpfActionPerformed
        String ncpf = numcpf.getText();
        CPF a1 = new CPF();
        a1.cpf(ncpf);
        Boolean valcpf = a1.valido();
        if("00757613004".equals(ncpf))
                lbbemvindo.setText("Welcome Mr. Edgar.");
        if("01561526061".equals(ncpf))
                lbbemvindo.setText("Welcome Ms. Luana.");
        if(valcpf == true){
            rescpf.setText("VALIDO");
            resultfinal.setText("Validado com Sucesso!! CPF Nº "+ncpf);
            numcpf.setText("");
        }
        else{
            rescpf.setText("INVALIDO");
            JOptionPane.showMessageDialog(null,"CPF INVÁLIDO","Insira Novamente Seus Dados!",2);
            resultfinal.setText("");
            numcpf.setText("");
        }
    }//GEN-LAST:event_validacpfActionPerformed

    private void textvalorsaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textvalorsaqueActionPerformed

    }//GEN-LAST:event_textvalorsaqueActionPerformed

    private void btSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSacarActionPerformed
        textntnor.setText("");
        textnt200.setText("");
        textnt100.setText("");
        textnt50.setText("");
        textnt20.setText("");
        textnt10.setText("");
        textnt5.setText("");
        textnt2.setText("");
        int saque = Integer.parseInt(textvalorsaque.getText());
        if(saque<2 || saque==3){
            textntnor.setText("SAQUE INVALIDO - TENTE NOVAMENTE");
            }
        Dinheiro s1 = new Dinheiro(saque);
        textntnor.setText("Notas Normatizadas... "+s1.normacao());
        textnt200.setText("Notas de R$ 200,00 -> "+s1.getNotas200());
        textnt100.setText("Notas de R$ 100,00 -> "+s1.getNotas100());
        textnt50.setText("Notas de R$   50,00 -> "+s1.getNotas50());
        textnt20.setText("Notas de R$   20,00 -> "+s1.getNotas20());
        textnt10.setText("Notas de R$   10,00 -> "+s1.getNotas10());
        textnt5.setText("Notas de R$     5,00 -> "+s1.getNotas5());
        textnt2.setText("Notas de R$     2,00 -> "+s1.getNotas2());
 
    }//GEN-LAST:event_btSacarActionPerformed

    private void btpequenasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpequenasActionPerformed
        textntnor.setText("");
        textnt200.setText("");
        textnt100.setText("");
        textnt50.setText("");
        textnt20.setText("");
        textnt10.setText("");
        textnt5.setText("");
        textnt2.setText("");
        int saque = Integer.parseInt(textvalorsaque.getText());
        Dinheiro s1 = new Dinheiro(saque);
        textntnor.setText("Notas Normatizadas... "+s1.normacao());
        textnt50.setText("Notas de R$   50,00 -> "+s1.getNotas50());
        textnt20.setText("Notas de R$   20,00 -> "+s1.getNotas20());
        textnt10.setText("Notas de R$   10,00 -> "+s1.getNotas10());
        textnt5.setText("Notas de R$     5,00 -> "+s1.getNotas5());
        textnt2.setText("Notas de R$     2,00 -> "+s1.getNotas2());
 
    }//GEN-LAST:event_btpequenasActionPerformed

    private void btmediasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmediasActionPerformed
        textntnor.setText("");
        textnt200.setText("");
        textnt100.setText("");
        textnt50.setText("");
        textnt20.setText("");
        textnt10.setText("");
        textnt5.setText("");
        textnt2.setText("");
        int saque = Integer.parseInt(textvalorsaque.getText());
        Dinheiro s1 = new Dinheiro(saque);
        textntnor.setText("Notas Normatizadas... "+s1.normacao());
        textnt100.setText("Notas de R$ 100,00 -> "+s1.getNotas100());
        textnt50.setText("Notas de R$   50,00 -> "+s1.getNotas50());
        textnt20.setText("Notas de R$   20,00 -> "+s1.getNotas20());
        textnt10.setText("Notas de R$   10,00 -> "+s1.getNotas10());
        textnt5.setText("Notas de R$     5,00 -> "+s1.getNotas5());
        textnt2.setText("Notas de R$     2,00 -> "+s1.getNotas2());
 
    }//GEN-LAST:event_btmediasActionPerformed

    private void textvalorsaqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textvalorsaqueMouseClicked
        String rescpf1 = rescpf.getText();
        if(rescpf1.equals("VALIDO")){
            textvalorsaque.setText("CPF VALIDADO");
        }else{
            boolean valcpf = false;
            while(valcpf==false){
            JOptionPane.showMessageDialog(null,"CPF NAO VERIFICADO","Insira o CPF para continuar!",2);
            valcpf=true;
        }}
    }//GEN-LAST:event_textvalorsaqueMouseClicked

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
            java.util.logging.Logger.getLogger(IG_cpf_banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IG_cpf_banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IG_cpf_banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IG_cpf_banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new IG_cpf_banco().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSacar;
    private javax.swing.JButton btmedias;
    private javax.swing.JButton btpequenas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbbemvindo;
    private java.awt.TextField numcpf;
    private javax.swing.JLabel rescpf;
    private javax.swing.JLabel resultfinal;
    private javax.swing.JLabel textnt10;
    private javax.swing.JLabel textnt100;
    private javax.swing.JLabel textnt2;
    private javax.swing.JLabel textnt20;
    private javax.swing.JLabel textnt200;
    private javax.swing.JLabel textnt5;
    private javax.swing.JLabel textnt50;
    private javax.swing.JLabel textntnor;
    private javax.swing.JTextField textvalorsaque;
    private javax.swing.JButton validacpf;
    // End of variables declaration//GEN-END:variables
}
