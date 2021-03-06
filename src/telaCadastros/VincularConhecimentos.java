/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telaCadastros;

import cadastros.Transportador;
import conexoes.ConexaoMySQL;
import ferramentas.CteVinculacao;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luiz Fernando Dill Barcellos
 */
public class VincularConhecimentos extends javax.swing.JInternalFrame {

    private conexoes.ConexaoMySQL cn;
    private DateFormat dateIn = new SimpleDateFormat("dd/MM/yyyy");
    private DateFormat dateOut = new SimpleDateFormat("yyyy/MM/dd");
    private JFrame framePai;

    //private static VincularConhecimentos instancia;
    private int usu_inc;

    /**
     * Creates new form VincularConhecimentos
     */
    public VincularConhecimentos(int user, ConexaoMySQL conn) {
        initComponents();
        this.cn = conn;
        montaTabela(jTblCancelados);
        montaLista(null, false, false, jTblCancelados, null);
        montaTabela(jTblDisponiveis);
        this.usu_inc = user;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTblCancelados = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTblDisponiveis = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTxtIdTransportador = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTxtNomeTransportador = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Vincular Conhecimentos Cancelados");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Conhecimentos de Frete Cancelados"));

        jTblCancelados.setModel(new javax.swing.table.DefaultTableModel(
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
        jTblCancelados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblCanceladosMouseClicked(evt);
            }
        });
        jTblCancelados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTblCanceladosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTblCancelados);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Conhecimentos de Frete Disponíveis"));

        jTblDisponiveis.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTblDisponiveis);

        jTxtIdTransportador.setEnabled(false);

        jLabel1.setText("Transportador");

        jTxtNomeTransportador.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtIdTransportador, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtNomeTransportador))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtIdTransportador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtNomeTransportador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButton1.setText("Gravar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Desvincular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTblCanceladosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblCanceladosMouseClicked
        atualizaDados();
    }//GEN-LAST:event_jTblCanceladosMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (jTblCancelados.getSelectedRowCount() == 1
                && jTblDisponiveis.getSelectedRowCount() == 1) {

            CteVinculacao vin = new CteVinculacao(cn);
            int linha_ca = jTblCancelados.getSelectedRow();
            int linha_au = jTblDisponiveis.getSelectedRow();

            if ("Desvincular".equals(jButton2.getText())) {
                if (vin.vinculaCTe(jTblCancelados.getValueAt(linha_ca, 3).toString(),
                        jTblDisponiveis.getValueAt(linha_au, 3).toString(), framePai)) {
                    JOptionPane.showMessageDialog(this, "Conhecimentos de Frete vinculados com sucesso!");
                    montaLista(null, false, false, jTblCancelados, null);
                    montaTabela(jTblDisponiveis);

                } else {
                    //JOptionPane.showMessageDialog(this, "Não foi possível processar os \nConhecimentos de Frete selecionados.");
                }
            } else {
                if (vin.desvinculaCTe(jTblCancelados.getValueAt(linha_ca, 3).toString(),
                        jTblDisponiveis.getValueAt(linha_au, 3).toString())) {
                    JOptionPane.showMessageDialog(this, "Conhecimentos de Frete desvinculados com sucesso!");
                    jButton2.setText("Desvincular");
                    montaLista(null, false, false, jTblCancelados, null);
                    montaTabela(jTblDisponiveis);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Você deve selecionar um conhecimento \nem cada tabela para continuar.");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if ("Desvincular".equals(jButton2.getText())) {
            jButton2.setText("Vincular");
            montaTabela(jTblDisponiveis);
            montaLista(null, false, true, jTblCancelados, null);
        } else {
            jButton2.setText("Desvincular");
            montaTabela(jTblDisponiveis);
            montaLista(null, false, false, jTblCancelados, null);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTblCanceladosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTblCanceladosKeyReleased
        atualizaDados();
    }//GEN-LAST:event_jTblCanceladosKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTblCancelados;
    private javax.swing.JTable jTblDisponiveis;
    private javax.swing.JTextField jTxtIdTransportador;
    private javax.swing.JTextField jTxtNomeTransportador;
    // End of variables declaration//GEN-END:variables

    private void montaTabela(JTable x) {
        DefaultTableModel lista = (DefaultTableModel) x.getModel();

        lista.setRowCount(0);
        lista.setColumnCount(0);

        lista.addColumn("Número");
        lista.addColumn("Série");
        lista.addColumn("Emissão");
        lista.addColumn("Chave");
        lista.addColumn("transportador");

        x.getColumnModel().getColumn(0).setMaxWidth(60);
        x.getColumnModel().getColumn(0).setMinWidth(60);
        x.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(60);
        x.getTableHeader().getColumnModel().getColumn(0).setMinWidth(60);
        x.getColumnModel().getColumn(1).setMaxWidth(40);
        x.getColumnModel().getColumn(1).setMinWidth(40);
        x.getTableHeader().getColumnModel().getColumn(1).setMaxWidth(40);
        x.getTableHeader().getColumnModel().getColumn(1).setMinWidth(40);
        x.getColumnModel().getColumn(2).setMaxWidth(80);
        x.getColumnModel().getColumn(2).setMinWidth(80);
        x.getTableHeader().getColumnModel().getColumn(2).setMaxWidth(80);
        x.getTableHeader().getColumnModel().getColumn(2).setMinWidth(80);
        x.getColumnModel().getColumn(4).setMaxWidth(0);
        x.getColumnModel().getColumn(4).setMinWidth(0);
        x.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(0);
        x.getTableHeader().getColumnModel().getColumn(4).setMinWidth(0);
    }

    public void montaLista(String idTransp, boolean autorizado, boolean vinculado, JTable x, String emissao) {
        montaTabela(x);
        DefaultTableModel lista = (DefaultTableModel) x.getModel();

        String condicao;

        if (autorizado) {
            condicao = "WHERE a.status_envio = 'AU' ";
        } else {
            condicao = "WHERE a.status_envio = 'CA' "
                    + "AND a.chave IN (SELECT chave FROM rpa_detalhe) ";
        }

        if (vinculado) {
            condicao += "AND (a.chave IN (SELECT ca_chave FROM rpa_vinculacao) "
                    + "OR a.chave IN (SELECT au_chave FROM rpa_vinculacao)) "
                    + "AND a.chave IN (SELECT chave FROM rpa_detalhe) ";
        } else {
            condicao += "AND a.chave NOT IN (SELECT ca_chave FROM rpa_vinculacao) ";
        }

        if (idTransp != null) {
            condicao += "AND a.cod_transportador = '" + idTransp + "' ";
        }

        if (emissao != null
                && vinculado == false) {
            condicao += "AND a.emissao >= '" + emissao + "' ";
        }

        String sql = "SELECT * FROM conhecimentos a "
                // + "LEFT JOIN rpa_vinculacao b on (b.ca_chave = a.chave) "
                // + "LEFT JOIN rpa_vinculacao c on (c.au_chave = a.chave) "
                + condicao
                + "ORDER BY numero, serie;";

        if (cn.iniciarTransacao()) {
            try {
                cn.executeConsulta(sql);
                while (cn.rs.next()) {
                    lista.addRow(new String[]{
                        cn.rs.getString("numero"),
                        cn.rs.getString("serie"),
                        dateIn.format(cn.rs.getDate("emissao")),
                        cn.rs.getString("chave"),
                        cn.rs.getString("cod_transportador")
                    });
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Não foi possível consultar os conhecimentos.");
            } finally {
                cn.finalizarTransacao();
            }
        }

    }
    
    /*public int getUsu_inc(){
        return usu_inc;
    }

    public static synchronized VincularConhecimentos getInstance() {
        if (instancia == null) {
            instancia = new VincularConhecimentos(this.);
        }
        return instancia;
    }*/

    public JFrame getFramePai() {
        return framePai;
    }

    public void setFramePai(JFrame framePai) {
        this.framePai = framePai;
    }

    private void atualizaDados() {
        int linha = jTblCancelados.getSelectedRow();

        String idTransportador = jTblCancelados.getValueAt(linha, 4).toString();
        String data = null;

        try {
            data = dateOut.format(dateIn.parse(jTblCancelados.getValueAt(linha, 2).toString()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Não foi possível converter a data selecionada.");
        }

        Transportador transp = new Transportador(usu_inc,cn);

        transp.buscaPessoa(Integer.parseInt(idTransportador));

        jTxtIdTransportador.setText(idTransportador);
        jTxtNomeTransportador.setText(transp.getNome());

        if (!"".equals(jTxtNomeTransportador.getText())
                && "Desvincular".equals(jButton2.getText())) {
            montaLista(idTransportador, true, false, jTblDisponiveis, data);
        } else if (!"".equals(jTxtNomeTransportador.getText())
                && "Vincular".equals(jButton2.getText())) {
            montaLista(idTransportador, true, true, jTblDisponiveis, data);
        }
    }

}
