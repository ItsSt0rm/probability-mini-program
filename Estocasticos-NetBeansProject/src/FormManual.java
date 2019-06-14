
import java.awt.Color;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class FormManual extends javax.swing.JFrame {

    /**
     * Creates new form FormManual
     */
    static double CA;
    static double saldoActual;
    static int nApuesta = 0;
    static boolean confirmOk = false;

    XYSeries series = new XYSeries("Gráfica de saldo");
    XYSeriesCollection dataset;
    JFreeChart chart;
    ChartFrame frame;

    public FormManual() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSaldoInicial = new javax.swing.JTextField();
        btnSaldoInicial = new javax.swing.JButton();
        txtCantDinero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtProbGanar = new javax.swing.JTextField();
        btnApostar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblSaldoActual = new javax.swing.JLabel();
        lblCuotaApuesta = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Apuestas en modo manual");

        jLabel2.setText("Ingrese el saldo inicial");

        txtSaldoInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoInicialActionPerformed(evt);
            }
        });
        txtSaldoInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSaldoInicialKeyReleased(evt);
            }
        });

        btnSaldoInicial.setText("Ok");
        btnSaldoInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaldoInicialActionPerformed(evt);
            }
        });

        txtCantDinero.setText("5000");

        jLabel3.setText("¿Cuánto va a apostar?");

        jLabel4.setText("¿Cuál es la probabilidad de ganar?");

        txtProbGanar.setText("1");
        txtProbGanar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProbGanarKeyReleased(evt);
            }
        });

        btnApostar.setText("Apostar");
        btnApostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApostarActionPerformed(evt);
            }
        });

        jLabel5.setText("Cuota de apuesta:");

        jLabel6.setText("Saldo actual:");

        lblSaldoActual.setText("0");

        lblCuotaApuesta.setText("0");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(lblSaldoActual)
                            .addComponent(lblCuotaApuesta))
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(txtCantDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnApostar)
                                .addGap(43, 43, 43)
                                .addComponent(btnVolver))
                            .addComponent(txtProbGanar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSaldoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSaldoInicial))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSaldoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSaldoInicial)
                        .addComponent(lblSaldoActual)))
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantDinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProbGanar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCuotaApuesta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApostar)
                    .addComponent(btnVolver))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaldoInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaldoInicialActionPerformed
        if (!"".equals(txtSaldoInicial.getText())) {
            if (Double.parseDouble(txtSaldoInicial.getText()) >= 0) {
                
                txtSaldoInicial.enable(false);
                txtSaldoInicial.setBackground(Color.red);
                saldoActual = Integer.parseInt(txtSaldoInicial.getText());
                series.add(nApuesta, saldoActual);
                confirmOk = true;
            } else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un valor válido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No puede dejar el saldo inicial vacío");
        }
    }//GEN-LAST:event_btnSaldoInicialActionPerformed

    private void txtProbGanarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProbGanarKeyReleased
        if (!"".equals(txtProbGanar.getText())) {
            CA = (double) Math.round((1 / Double.parseDouble(txtProbGanar.getText())) * 100d) / 100d;
            lblCuotaApuesta.setText("" + CA);
        }
    }//GEN-LAST:event_txtProbGanarKeyReleased

    private void btnApostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApostarActionPerformed
        dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        chart = ChartFactory.createXYLineChart("Gráfica saldo", "N. Apuesta", "Saldo", dataset);
        frame = new ChartFrame("Gráfica de saldo", chart);

        frame.pack();
        frame.setVisible(false);

        double r = Math.random();
        double probGanar = Double.parseDouble(txtProbGanar.getText());
        double valorApostado = Double.parseDouble(txtCantDinero.getText());

        

        if (confirmOk == true) {
            if (saldoActual > 0 && valorApostado <= saldoActual) {
                if (probGanar == 1) {
                    saldoActual = saldoActual + valorApostado;
                    lblSaldoActual.setText("" + saldoActual);
                    JOptionPane.showMessageDialog(null, "¡Ganaste!");
                } else if (r < probGanar) {
                    double valorGanado = valorApostado * CA;
                    

                    saldoActual = saldoActual - valorApostado + valorGanado;
                    lblSaldoActual.setText("" + saldoActual);
                    JOptionPane.showMessageDialog(null, "¡Ganaste!");
                } else {
                    saldoActual = saldoActual - valorApostado;
                    lblSaldoActual.setText("" + saldoActual);
                    JOptionPane.showMessageDialog(null, "¡Perdiste!");
                }

                nApuesta++;
                series.add(nApuesta, saldoActual);
                frame.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(this, "No tiene saldo suficiente");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor presione el botón de confirmar.");
        }


    }//GEN-LAST:event_btnApostarActionPerformed

    private void txtSaldoInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoInicialActionPerformed


    }//GEN-LAST:event_txtSaldoInicialActionPerformed

    private void txtSaldoInicialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaldoInicialKeyReleased
        lblSaldoActual.setText(txtSaldoInicial.getText());
    }//GEN-LAST:event_txtSaldoInicialKeyReleased

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        FormGen verGen = new FormGen();
        
        verGen.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(FormManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormManual().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApostar;
    private javax.swing.JButton btnSaldoInicial;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblCuotaApuesta;
    private javax.swing.JLabel lblSaldoActual;
    private javax.swing.JTextField txtCantDinero;
    private javax.swing.JTextField txtProbGanar;
    private javax.swing.JTextField txtSaldoInicial;
    // End of variables declaration//GEN-END:variables
}