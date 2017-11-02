/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telaCadastros;

import conexoes.ConexaoMySQL;
import ferramentas.ColorRender;
import ferramentas.RpaIntegrador;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luiz.barcellos
 */
public class IntegracaoRPA_Folha extends javax.swing.JInternalFrame {

    private final ConexaoMySQL cn;
    private RpaIntegrador rpaInteg;
    private javax.swing.text.MaskFormatter data, numero;
    private final DateFormat dateIn = new SimpleDateFormat("dd/MM/yyyy");
    private final DecimalFormat df = new DecimalFormat("#,##0.00");

    /**
     * Creates new form IntegracaoRPA_Folha
     *
     * @param conn
     */
    public IntegracaoRPA_Folha(ConexaoMySQL conn) {
        try {
            data = new javax.swing.text.MaskFormatter("##/####");
            numero = new javax.swing.text.MaskFormatter("######");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        initComponents();
        this.cn = conn;
        this.rpaInteg = new RpaIntegrador(conn);

        montaTabela();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTxtCompetencia = new javax.swing.JFormattedTextField(data);
        jTxtNumero = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTxtQtdInteg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtVlrTotal = new javax.swing.JTextField();
        jTxtQtd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTxtQtdPend = new javax.swing.JTextField();
        jTxtVlrInteg = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTxtVlrPend = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Integração RPA Folha");

        jLabel1.setText("Competência");

        jLabel2.setText("Número");

        jButton1.setText("Integrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Estornar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Pesquisar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTxtCompetencia.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTxtCompetencia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtCompetenciaFocusLost(evt);
            }
        });

        jTxtNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        jTxtNumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtNumeroFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtCompetencia, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(jLabel2)
                .addComponent(jButton3)
                .addComponent(jTxtCompetencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jButton1)
            .addComponent(jButton2)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumo"));

        jLabel3.setText("Integrados");

        jTxtQtdInteg.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtQtdInteg.setEnabled(false);

        jLabel4.setText("Valor Total");

        jTxtVlrTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtVlrTotal.setEnabled(false);

        jTxtQtd.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtQtd.setEnabled(false);

        jLabel5.setText("Quantidade");

        jLabel6.setText("Pendentes");

        jTxtQtdPend.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtQtdPend.setEnabled(false);

        jTxtVlrInteg.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtVlrInteg.setEnabled(false);

        jLabel7.setText("Valor Integrado");

        jLabel8.setText("Valor Pendente");

        jTxtVlrPend.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtVlrPend.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtQtdInteg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtQtdPend, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtVlrTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtVlrInteg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtVlrPend, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3)
                .addComponent(jTxtQtdInteg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4)
                .addComponent(jTxtVlrTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTxtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel5)
                .addComponent(jLabel6)
                .addComponent(jTxtQtdPend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTxtVlrInteg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel7)
                .addComponent(jLabel8)
                .addComponent(jTxtVlrPend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        incluiPesquisa();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTxtCompetenciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtCompetenciaFocusLost
        if ("  /    ".equals(jTxtCompetencia.getText())) {
            jTxtCompetencia.setValue(null);
        }
    }//GEN-LAST:event_jTxtCompetenciaFocusLost

    private void jTxtNumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtNumeroFocusLost
        if ("".equals(jTxtNumero.getText())) {
            jTxtNumero.setValue(null);
        }
    }//GEN-LAST:event_jTxtNumeroFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (rpaInteg.fechaFolha(true, jTxtCompetencia.getText(), jTxtNumero.getText())) {
            incluiPesquisa();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (rpaInteg.fechaFolha(false, jTxtCompetencia.getText(), jTxtNumero.getText())) {
            incluiPesquisa();
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JFormattedTextField jTxtCompetencia;
    private javax.swing.JFormattedTextField jTxtNumero;
    private javax.swing.JTextField jTxtQtd;
    private javax.swing.JTextField jTxtQtdInteg;
    private javax.swing.JTextField jTxtQtdPend;
    private javax.swing.JTextField jTxtVlrInteg;
    private javax.swing.JTextField jTxtVlrPend;
    private javax.swing.JTextField jTxtVlrTotal;
    // End of variables declaration//GEN-END:variables

    private DefaultTableModel montaTabela() {
        DefaultTableModel lista = (DefaultTableModel) jTable1.getModel();

        lista.setRowCount(0);
        lista.setColumnCount(0);

        lista.addColumn("tipo");
        lista.addColumn("Código");
        lista.addColumn("Filial");
        lista.addColumn("Número");
        lista.addColumn("Seq");
        lista.addColumn("Nome");
        lista.addColumn("Valor");
        lista.addColumn("Competência");

        jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(0).setMinWidth(0);
        jTable1.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        jTable1.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        jTable1.getColumnModel().getColumn(1).setMaxWidth(60);
        jTable1.getColumnModel().getColumn(1).setMinWidth(60);
        jTable1.getTableHeader().getColumnModel().getColumn(1).setMaxWidth(60);
        jTable1.getTableHeader().getColumnModel().getColumn(1).setMinWidth(60);
        jTable1.getColumnModel().getColumn(2).setMaxWidth(60);
        jTable1.getColumnModel().getColumn(2).setMinWidth(60);
        jTable1.getTableHeader().getColumnModel().getColumn(2).setMaxWidth(60);
        jTable1.getTableHeader().getColumnModel().getColumn(2).setMinWidth(60);
        jTable1.getColumnModel().getColumn(3).setMaxWidth(60);
        jTable1.getColumnModel().getColumn(3).setMinWidth(60);
        jTable1.getTableHeader().getColumnModel().getColumn(3).setMaxWidth(60);
        jTable1.getTableHeader().getColumnModel().getColumn(3).setMinWidth(60);
        jTable1.getColumnModel().getColumn(4).setMaxWidth(40);
        jTable1.getColumnModel().getColumn(4).setMinWidth(40);
        jTable1.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(40);
        jTable1.getTableHeader().getColumnModel().getColumn(4).setMinWidth(40);
        jTable1.getColumnModel().getColumn(6).setMaxWidth(80);
        jTable1.getColumnModel().getColumn(6).setMinWidth(80);
        jTable1.getTableHeader().getColumnModel().getColumn(6).setMaxWidth(80);
        jTable1.getTableHeader().getColumnModel().getColumn(6).setMinWidth(80);
        jTable1.getColumnModel().getColumn(7).setMaxWidth(100);
        jTable1.getColumnModel().getColumn(7).setMinWidth(100);
        jTable1.getTableHeader().getColumnModel().getColumn(7).setMaxWidth(100);
        jTable1.getTableHeader().getColumnModel().getColumn(7).setMinWidth(100);

        jTable1.setDefaultRenderer(Object.class, new ColorRender());

        return lista;
    }

    private void incluiPesquisa() {

        DefaultTableModel lista = montaTabela();

        String competencia = jTxtCompetencia.getText();
        String numero = jTxtNumero.getText();

        String sql = " SELECT a.codigo, a.estabelecimento, a.numero, a.sequencia, "
                + "b.nome, a.vlr_bruto as valor, a.competencia, a.integ_folha "
                + "FROM bsctranscooper.rpa a "
                + "LEFT JOIN bsctranscooper.cad_pessoas b on (b.codigo = a.transportador) "
                + "WHERE a.numero > 0 ";

        if (!"  /    ".equals(competencia)) {
            sql += "AND a.competencia = '" + competencia + "' ";
        }

        if (!"".equals(numero)) {
            sql += "AND a.codigo = '" + numero + "' ";
        }

        sql += "ORDER BY a.competencia, b.nome, a.estabelecimento, a.sequencia, a.numero;";
        String tipo = null;

        if (cn.iniciarTransacao()) {
            try {
                cn.executeConsulta(sql);
                while (cn.rs.next()) {
                    if (cn.rs.getString("integ_folha") != null) {
                        tipo = "T";
                    } else {
                        tipo = "A";
                    }
                    lista.addRow(new String[]{
                        tipo,
                        cn.rs.getString("codigo"),
                        cn.rs.getString("estabelecimento"),
                        cn.rs.getString("numero"),
                        cn.rs.getString("sequencia"),
                        cn.rs.getString("nome"),
                        df.format(cn.rs.getDouble("valor")),
                        cn.rs.getString("competencia")
                    });
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                cn.finalizarTransacao();
            }

        }

        somaTabela();

    }

    private void somaTabela() {
        int qtd = 0;
        int qtdInteg = 0;
        int qtdPend = 0;

        Double total = 0.00;
        Double vlrInteg = 0.00;
        Double vlrPend = 0.00;

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            qtd++;
            total += Double.parseDouble(jTable1.getValueAt(i, 6).toString().replace(".", "").replace(",", "."));

            if ("T".equals(jTable1.getValueAt(i, 0).toString())) {
                qtdInteg++;
                vlrInteg += Double.parseDouble(jTable1.getValueAt(i, 6).toString().replace(".", "").replace(",", "."));
            } else {
                qtdPend++;
                vlrPend += Double.parseDouble(jTable1.getValueAt(i, 6).toString().replace(".", "").replace(",", "."));
            }

            jTxtQtd.setText(qtd + "");
            jTxtQtdInteg.setText(qtdInteg + "");
            jTxtQtdPend.setText(qtdPend + "");

            jTxtVlrTotal.setText(df.format(total));
            jTxtVlrInteg.setText(df.format(vlrInteg));
            jTxtVlrPend.setText(df.format(vlrPend));
        }
    }
}
