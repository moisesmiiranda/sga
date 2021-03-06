/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import DAO_Generico.Dao;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Paciente;
import org.hibernate.Session;
import util.Utilitaria;

public class JDCadastroPaciente extends javax.swing.JDialog {

    /**
     * Creates new form JDCadastroPaciente
     */
    public JDCadastroPaciente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();
        mostrarDoBancoNaTabela();

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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePacientes = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jRadioButtonM = new javax.swing.JRadioButton();
        jRadioButtonF = new javax.swing.JRadioButton();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldDataDeNascimento = new javax.swing.JFormattedTextField();
        jTextFieldCPF = new javax.swing.JFormattedTextField();
        jTextFieldTelefone = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Paciente");
        setModal(true);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTablePacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Data de Nascimento", "Sexo", "CPF", "Endereço", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePacientes);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Data de Nascimento:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Sexo:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("CPF:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Endereço:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Telefone:");

        jTextFieldNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldNome.setEnabled(false);

        jRadioButtonM.setText("M");
        jRadioButtonM.setEnabled(false);
        jRadioButtonM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonMMouseClicked(evt);
            }
        });
        jRadioButtonM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMActionPerformed(evt);
            }
        });

        jRadioButtonF.setText("F");
        jRadioButtonF.setEnabled(false);
        jRadioButtonF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonFMouseClicked(evt);
            }
        });

        jTextFieldEndereco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldEndereco.setEnabled(false);

        try {
            jTextFieldDataDeNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldDataDeNascimento.setEnabled(false);
        jTextFieldDataDeNascimento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        try {
            jTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldCPF.setEnabled(false);
        jTextFieldCPF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        try {
            jTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldTelefone.setEnabled(false);
        jTextFieldTelefone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNome)
                            .addComponent(jTextFieldEndereco)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldDataDeNascimento, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(jRadioButtonM)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioButtonF)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(392, 392, 392)))
                        .addGap(14, 14, 14))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDataDeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonM)
                    .addComponent(jRadioButtonF))
                .addGap(7, 7, 7)
                .addComponent(jLabel5)
                .addGap(1, 1, 1)
                .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/addNew.png"))); // NOI18N
        jButtonNovo.setMnemonic('n');
        jButtonNovo.setText("Novo");
        jButtonNovo.setToolTipText("Inicia um novo cadastro");
        jButtonNovo.setPreferredSize(new java.awt.Dimension(110, 40));
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonNovo);

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/excluir.png"))); // NOI18N
        jButtonExcluir.setMnemonic('e');
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setToolTipText("Exclui o cadastro selecionado");
        jButtonExcluir.setPreferredSize(new java.awt.Dimension(110, 40));
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonExcluir);

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/editar.png"))); // NOI18N
        jButtonAlterar.setMnemonic('a');
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setToolTipText("Permite modificar o cadastro selecionado");
        jButtonAlterar.setPreferredSize(new java.awt.Dimension(110, 40));
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonAlterar);

        jButtonAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/atualizar.png"))); // NOI18N
        jButtonAtualizar.setMnemonic('r');
        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.setToolTipText("Salva as alterações feitas neste cadastro");
        jButtonAtualizar.setEnabled(false);
        jButtonAtualizar.setPreferredSize(new java.awt.Dimension(110, 40));
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonAtualizar);

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/salvar.png"))); // NOI18N
        jButtonSalvar.setMnemonic('s');
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setToolTipText("Salva o cadastro");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.setPreferredSize(new java.awt.Dimension(110, 40));
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonSalvar);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTablePacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePacientesMouseClicked
        selecionarPaciente();
    }//GEN-LAST:event_jTablePacientesMouseClicked

    private void jRadioButtonMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonMMouseClicked
        //Essa ação deve desabilitar o jRadioButton do sexo feminino
        jRadioButtonF.getModel().setSelected(false);
    }//GEN-LAST:event_jRadioButtonMMouseClicked

    private void jRadioButtonMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMActionPerformed

    }//GEN-LAST:event_jRadioButtonMActionPerformed

    private void jRadioButtonFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonFMouseClicked
        //Essa ação deve desabilitar o jRadioButton do sexo masculino
        jRadioButtonM.getModel().setSelected(false);
    }//GEN-LAST:event_jRadioButtonFMouseClicked

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        HabilitarCampos();
        limparCampos();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        HabilitarCampos();

    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        atualizarCadPacientes();
        mostrarDoBancoNaTabela();
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        salvarPaciente();
        mostrarDoBancoNaTabela();
        limparCampos();
        controleCamposEBotoes();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        //NÃO = 1 SIM = 0
        int resp = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja exluir o paciente "
                + jTextFieldNome.getText() + "?", "Atenção!", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            try {
                excluirPaciente();
                limparCampos();
                mostrarDoBancoNaTabela();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, jTextFieldNome.getText() + " não pode ser excluído,"
                        + " verifique se não há um atendimento associado a este cadastro.", "ATENÇÃO", JOptionPane.OK_OPTION);
            }

        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(JDCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDCadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDCadastroPaciente dialog = new JDCadastroPaciente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButtonF;
    private javax.swing.JRadioButton jRadioButtonM;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePacientes;
    private javax.swing.JFormattedTextField jTextFieldCPF;
    private javax.swing.JFormattedTextField jTextFieldDataDeNascimento;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JFormattedTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables

    private void salvarPaciente() {
        Paciente p = new Paciente();
        p.setNome(jTextFieldNome.getText().trim());
        p.setCpf(jTextFieldCPF.getText().trim());
        p.setEndereco(jTextFieldEndereco.getText().trim());
        p.setTelefone(jTextFieldTelefone.getText());

        //Deve gravar assim: dd/MM/yyyy
        // está salvando assim: 1960-09-22/ 22-09-1960
        String dia = jTextFieldDataDeNascimento.getText().substring(0, 2);
        String mes = jTextFieldDataDeNascimento.getText().substring(3, 5);
        String ano = jTextFieldDataDeNascimento.getText().substring(6);
        String dataASerGravada = ano + "-" + mes + "-" + dia;

        LocalDate DN = LocalDate.parse(dataASerGravada);
        p.setDataDeNascimento(java.sql.Date.valueOf(DN));
        //Salvar Sexo
        if (jRadioButtonM.getModel().isSelected() == true) {
            p.setSexo("Masculino");
        } else if (jRadioButtonF.getModel().isSelected() == true) {
            p.setSexo("Feminino");
        }

        Dao<Paciente> dao = new Dao<>();
        dao.gravar(p);
        
        //CONTROLE BOTÕES
        
        jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonAlterar.setEnabled(true);

        // Desabilitando campos
        jTextFieldCPF.setEnabled(false);
        jTextFieldDataDeNascimento.setEnabled(false);
        jTextFieldEndereco.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldTelefone.setEnabled(false);
        jRadioButtonM.setEnabled(false);
        jRadioButtonF.setEnabled(false);
    }

    private void HabilitarCampos() {
        //Habilitanto campos de texto
        jTextFieldCPF.setEnabled(true);
        jTextFieldDataDeNascimento.setEnabled(true);
        jTextFieldEndereco.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldTelefone.setEnabled(true);
        jRadioButtonM.setEnabled(true);
        jRadioButtonF.setEnabled(true);
        //desabilitando botões novo e alterar, excluir
        jButtonExcluir.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        //Habilitar o botão Salvar
        jButtonSalvar.setEnabled(true);
    }

    private void limparCampos() {
        jTextFieldNome.setText(null);
        jTextFieldDataDeNascimento.setText(null);
        jRadioButtonF.getModel().setSelected(false);
        jRadioButtonM.getModel().setSelected(false);
        jTextFieldCPF.setText(null);
        jTextFieldEndereco.setText(null);
        jTextFieldTelefone.setText(null);

    }

    private void mostrarDoBancoNaTabela() {
        Session sessao = Utilitaria.getSession();//Peguei a sessao
        List<Paciente> Lpacientes = sessao.createQuery("from Paciente").list();//selecionei a tabela pacientes
        int i = 0;

        //Teste pra adicionar uma linha a tabela vazia
        if (jTablePacientes.getRowCount() == 0) {
            DefaultTableModel table = (DefaultTableModel) jTablePacientes.getModel();
            table.addRow(new Object[jTablePacientes.getRowCount() + 1]);

        }

        for (Paciente p : Lpacientes) {
            Lpacientes.lastIndexOf(p);
            //Conversão necessária para salvar a data no formato correto
            //Data está aparecendo assim 1982-04-22
            //Deve aparecer assim: 22/04/1982
            String dataN_do_paciente = String.valueOf(p.getDataDeNascimento());
            String ano = dataN_do_paciente.substring(0, 4);
            String mes = dataN_do_paciente.substring(5, 7);
            String dia = dataN_do_paciente.substring(8);
            String DataParaTabela = dia + "/" + mes + "/" + ano;

            jTablePacientes.getModel().setValueAt(p.getId(), i, 0);
            jTablePacientes.getModel().setValueAt(p.getNome(), i, 1);
            jTablePacientes.getModel().setValueAt(DataParaTabela, i, 2);
            jTablePacientes.getModel().setValueAt(p.getSexo(), i, 3);
            jTablePacientes.getModel().setValueAt(p.getCpf(), i, 4);
            jTablePacientes.getModel().setValueAt(p.getEndereco(), i, 5);
            jTablePacientes.getModel().setValueAt(p.getTelefone(), i, 6);
            i++;

            DefaultTableModel tabelaPaciente = (DefaultTableModel) jTablePacientes.getModel(); // pegando o modelo padrão da tabela
            int nLinhas = jTablePacientes.getRowCount() - 1;
            tabelaPaciente.addRow(new Object[jTablePacientes.getRowCount() - nLinhas]);

        }

    }

    private void controleCamposEBotoes() {

    }

    private void selecionarPaciente() {
        int linhaSelecionada = jTablePacientes.getSelectedRow();
        jTextFieldNome.setText(jTablePacientes.getValueAt(linhaSelecionada, 1).toString());
        jTextFieldDataDeNascimento.setText(jTablePacientes.getValueAt(linhaSelecionada, 2).toString());
        //pegando o sexo
        String sexo = jTablePacientes.getValueAt(linhaSelecionada, 3).toString();
        String sexoM = "masculino";
        String sexoF = "feminino";

        if (sexo.equalsIgnoreCase(sexoM)) {
            jRadioButtonM.getModel().setSelected(true);
            jRadioButtonF.getModel().setSelected(false);
        } else if (sexo.equalsIgnoreCase(sexoF)) {
            jRadioButtonF.getModel().setSelected(true);
            jRadioButtonM.getModel().setSelected(false);
        }

        jTextFieldCPF.setText(jTablePacientes.getValueAt(linhaSelecionada, 4).toString());
        jTextFieldEndereco.setText(jTablePacientes.getValueAt(linhaSelecionada, 5).toString());
        jTextFieldTelefone.setText(jTablePacientes.getValueAt(linhaSelecionada, 6).toString());

    }

    private void atualizarCadPacientes() {
        Paciente p = new Paciente();
        p.setNome(jTextFieldNome.getText().trim());
        p.setCpf(jTextFieldCPF.getText().trim());
        p.setEndereco(jTextFieldEndereco.getText().trim());
        p.setTelefone(jTextFieldTelefone.getText());
        p.setId(Integer.parseInt(jTablePacientes.getModel().getValueAt(jTablePacientes.getSelectedRow(), 0).toString()));

        //Deve gravar assim: dd/MM/yyyy
        // está salvando assim: 1960-09-22/ 22-09-1960
        String dia = jTextFieldDataDeNascimento.getText().substring(0, 2);
        String mes = jTextFieldDataDeNascimento.getText().substring(3, 5);
        String ano = jTextFieldDataDeNascimento.getText().substring(6);
        String dataASerGravada = ano + "-" + mes + "-" + dia;

        LocalDate DN = LocalDate.parse(dataASerGravada);
        //Setando a dataNascimento
        p.setDataDeNascimento(java.sql.Date.valueOf(DN));
        //Salvar Sexo
        if (jRadioButtonM.getModel().isSelected() == true) {
            //Setando o Sexo
            p.setSexo("Masculino");
        } else if (jRadioButtonF.getModel().isSelected() == true) {
            //Setando o Sexo
            p.setSexo("Feminino");
        }

        Dao<Paciente> dao = new Dao<>();
        dao.atualizar(p);
        JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso!");

        jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonAlterar.setEnabled(true);

        // Desabilitando campos
        jTextFieldCPF.setEnabled(false);
        jTextFieldDataDeNascimento.setEnabled(false);
        jTextFieldEndereco.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldTelefone.setEnabled(false);
        jRadioButtonM.setEnabled(false);
        jRadioButtonF.setEnabled(false);
    }

    private void excluirPaciente() {
        Paciente p = new Paciente();
        p.setId((int) jTablePacientes.getModel().getValueAt(jTablePacientes.getSelectedRow(), 0));
        p.setNome(jTextFieldNome.getText());

        Dao<Paciente> dao = new Dao<>();
        dao.excluir(p);
        JOptionPane.showMessageDialog(null, "Paciente " + p.getNome() + " foi excluido com sucesso.");

    }
}
