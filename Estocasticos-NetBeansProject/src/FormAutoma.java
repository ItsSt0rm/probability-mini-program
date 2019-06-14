
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class FormAutoma extends javax.swing.JFrame {

    /**
     * Creates new form FormAutoma
     */
    public FormAutoma() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnapuestas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rbganarconserv = new javax.swing.JRadioButton();
        rbganararries = new javax.swing.JRadioButton();
        rbecon = new javax.swing.JRadioButton();
        rbderro = new javax.swing.JRadioButton();
        btnApostar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        buttonGroup1.add(rbganarconserv);
        buttonGroup1.add(rbganararries);

        buttonGroup2.add(rbecon);
        buttonGroup2.add(rbderro);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Apuestas en modo automático");

        jLabel2.setText("Número de apuestas:");

        jLabel3.setText("Probabilidad de ganar");

        jLabel4.setText("Valor apostado");

        rbganarconserv.setText("Estrategia conservadora");

        rbganararries.setText("Estrategia arriesgada");

        rbecon.setText("Estrategia economizadora");

        rbderro.setText("Estrategia derrochadora");

        btnApostar.setText("Apostar");
        btnApostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApostarActionPerformed(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnApostar)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnapuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVolver))))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(181, 181, 181))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbganarconserv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbecon)
                        .addGap(93, 93, 93))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbganararries)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbderro)
                        .addGap(103, 103, 103))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnapuestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbganarconserv)
                    .addComponent(rbecon))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbganararries)
                    .addComponent(rbderro))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApostar)
                    .addComponent(btnVolver))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnApostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApostarActionPerformed
        //Gráfica
        XYSeries series = new XYSeries("Gráfica de saldo");
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        JFreeChart chart = ChartFactory.createXYLineChart("Gráfica saldo", "N. Apuesta", "Saldo", dataset);
        ChartFrame frame;
        frame = new ChartFrame("Gráfica de saldo", chart);
        frame.pack();

        int nApuestas = 0;
        double cuotaApuesta = 0;
        double valorApostado = 0;
        double valorGanado = 0;
        double saldoActual = 50000;
        double probGanar = 0;

        boolean selectGanar = false;
        boolean selectValor = false;

        if (txtnapuestas.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "No puede dejar el número de apuestas vacío");
            return;
        } else {
            nApuestas = Integer.parseInt(txtnapuestas.getText());
        }

        if (rbganararries.isSelected() == false && rbganarconserv.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una probabilidad de ganar");
            return;
        } else {
            selectGanar = true;
        }
        if (rbderro.isSelected() == false && rbecon.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un valor incial");
            return;
        } else {
            selectValor = true;
        }

        if (selectGanar == true && selectValor == true) {
            series.add(0, saldoActual);
            for (int i = 1; i <= nApuestas; i++) {

                if (saldoActual < 0) {
                    frame.setVisible(true);
                    JOptionPane.showMessageDialog(null, "El saldo final es de: " + saldoActual);
                    return;
                }
                // Probabilidad de ganar
                if (rbganarconserv.getSelectedObjects() != null) {

                    probGanar = Math.random();
                    if (probGanar <= 0.5) {
                        probGanar += 0.35;
                    }
                    if (probGanar > 0.5 && probGanar < 1) {
                        probGanar += 0.2;
                    }

                    cuotaApuesta = (double) Math.round((1 / probGanar) * 100d) / 100d;
                } else if (rbganararries.getSelectedObjects() != null) {

                    probGanar = Math.random();
                    if (probGanar <= 0.5 && probGanar > 0.2) {
                        probGanar -= 0.2;
                    }
                    if (probGanar > 0.5 && probGanar < 1) {
                        probGanar -= 0.35;
                    }

                    cuotaApuesta = (double) Math.round((1 / probGanar) * 100d) / 100d;
                }

                // Valor apostado
                if (rbderro.getSelectedObjects() != null) {

                    valorApostado = (int) (Math.random() * 25000);

                } else if (rbecon.getSelectedObjects() != null) {

                    valorApostado = (int) (Math.random() * 5000);

                }
                if (valorApostado > saldoActual) {
                    frame.setVisible(true);
                    JOptionPane.showMessageDialog(null, "El saldo final es de: " + saldoActual);
                    return;
                }
                double r = Math.random();
                if (r < probGanar) {
                    valorGanado = valorApostado * cuotaApuesta;
                    saldoActual = saldoActual - valorApostado + valorGanado;
                    if (saldoActual < 0) {
                        frame.setVisible(true);
                        JOptionPane.showMessageDialog(null, "El saldo final es de: " + saldoActual);
                        return;
                    }
                } else {
                    saldoActual = saldoActual - valorApostado;

                    if (saldoActual < 0) {
                        frame.setVisible(true);
                        JOptionPane.showMessageDialog(null, "El saldo final es de: " + saldoActual);
                        return;
                    }
                }

                series.add(i, saldoActual);

            }
            frame.setVisible(true);
            JOptionPane.showMessageDialog(null, "El saldo final es de: " + saldoActual);
        }

    }//GEN-LAST:event_btnApostarActionPerformed

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
            java.util.logging.Logger.getLogger(FormAutoma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAutoma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAutoma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAutoma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAutoma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApostar;
    private javax.swing.JButton btnVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton rbderro;
    private javax.swing.JRadioButton rbecon;
    private javax.swing.JRadioButton rbganararries;
    private javax.swing.JRadioButton rbganarconserv;
    private javax.swing.JTextField txtnapuestas;
    // End of variables declaration//GEN-END:variables
}