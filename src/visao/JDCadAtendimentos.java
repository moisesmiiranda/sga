/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import DAO_Generico.Dao;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Atendimento;
import modelo.Paciente;
import modelo.Profissional;
import org.hibernate.Session;
import util.Utilitaria;

/**
 *
 * @author ADMIN
 */
public class JDCadAtendimentos extends javax.swing.JDialog {

    /**
     * Creates new form JDCadConsultaJDCadConsulta
     */
    private Paciente paciente;

    private Profissional profissional;

    private Atendimento consulta;

    public JDCadAtendimentos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();
        mostrarNaTabela();

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
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTFDataAtendimento = new com.toedter.calendar.JDateChooser();
        jTFHoraAtendimento = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldNomePaciente = new javax.swing.JTextField();
        jTextFieldNomeProfissional = new javax.swing.JTextField();
        jButtonPesquisaPaciente = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAtendimentos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Atendimentos");
        setType(java.awt.Window.Type.UTILITY);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Profissional Responsável:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Data:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Hora:");

        try {
            jTFHoraAtendimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Paciente:");

        jButtonPesquisaPaciente.setText("Buscar");
        jButtonPesquisaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaPacienteActionPerformed(evt);
            }
        });

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextFieldDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescricaoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Tipo do Antendimento:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(402, 402, 402))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldNomeProfissional)
                            .addComponent(jTextFieldNomePaciente)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jTFDataAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                                .addGap(94, 94, 94)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jTFHoraAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonPesquisaPaciente)
                            .addComponent(jButton2))
                        .addGap(240, 240, 240))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldDescricao))
                        .addGap(306, 306, 306))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFDataAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFHoraAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisaPaciente))
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/addNew.png"))); // NOI18N
        jButtonNovo.setMnemonic('n');
        jButtonNovo.setText("Novo");
        jButtonNovo.setToolTipText("Inicia um novo cadastro");
        jButtonNovo.setPreferredSize(new java.awt.Dimension(100, 35));
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
        jButtonExcluir.setPreferredSize(new java.awt.Dimension(100, 35));
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonExcluir);

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/editar.png"))); // NOI18N
        jButtonAlterar.setMnemonic('r');
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setToolTipText("Salva o cadastro atual");
        jButtonAlterar.setPreferredSize(new java.awt.Dimension(100, 35));
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonAlterar);

        jButtonAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/atualizar.png"))); // NOI18N
        jButtonAtualizar.setMnemonic('a');
        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.setToolTipText("Salva o cadastro atual");
        jButtonAtualizar.setEnabled(false);
        jButtonAtualizar.setPreferredSize(new java.awt.Dimension(100, 35));
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonAtualizar);

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/salvar.png"))); // NOI18N
        jButtonSalvar.setMnemonic('s');
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setToolTipText("Salva o cadastro atual");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.setPreferredSize(new java.awt.Dimension(100, 35));
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonSalvar);

        jTableAtendimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Descrição", "Data", "Hora", "Nome do Paciente", "Profissional"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAtendimentos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableAtendimentos);
        if (jTableAtendimentos.getColumnModel().getColumnCount() > 0) {
            jTableAtendimentos.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Atendimentos Cadastrados");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        SalvarConsulta();
        mostrarNaTabela();
        controleBotoes();


    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        controleCamposEBotões();

    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonPesquisaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaPacienteActionPerformed
        buscarPorPacientes();


    }//GEN-LAST:event_jButtonPesquisaPacienteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        buscarPorProfissionais();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        SetOTextFielDoPaciente();
        SetOTextFieldDoProfissional();
    }//GEN-LAST:event_formWindowGainedFocus

    private void jTextFieldDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescricaoActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(JDCadCampanhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDCadCampanhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDCadCampanhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDCadCampanhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDCadAtendimentos dialog = new JDCadAtendimentos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisaPaciente;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jTFDataAtendimento;
    private javax.swing.JFormattedTextField jTFHoraAtendimento;
    private javax.swing.JTable jTableAtendimentos;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldNomePaciente;
    private javax.swing.JTextField jTextFieldNomeProfissional;
    // End of variables declaration//GEN-END:variables

    //Variavel da tela
    private void SalvarConsulta() {
        Atendimento a = new Atendimento();
        //Salvar a Data
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = sf.format(jTFDataAtendimento.getDate());

        String dia = dataFormatada.toString().substring(0, 2);
        String mes = dataFormatada.toString().substring(3, 5);
        String ano = dataFormatada.toString().substring(6);
        String Data_Cons_Banco = ano + "-" + mes + "-" + dia;
        //Variável local date para converter para date a string;
        LocalDate DtCons = LocalDate.parse(Data_Cons_Banco);
        // salvando no objeto
        a.setData(java.sql.Date.valueOf(DtCons));

        //pegar a hora da tela
        int HH = Integer.parseInt(jTFHoraAtendimento.getText().substring(0, 2));
        int mm = Integer.parseInt(jTFHoraAtendimento.getText().substring(3, 5));

        LocalTime hora = LocalTime.of(HH, mm);
        Time horaMinuto = Time.valueOf(hora);
        //salvar hora
        a.setHora(horaMinuto);
        //precisa receber um objeto paciente 
        a.setPaciente(paciente);
        //precisa receber um objeto profissional
        a.setProfissional(profissional);

        a.setDescricao(jTextFieldDescricao.getText());

        Dao<Atendimento> dao = new Dao<>();
        dao.gravar(a);
        JOptionPane.showMessageDialog(null, "Dados gravados com sucesso!");

    }

    private void pesquisarOTextFiel() {
        List<Paciente> pacientes = Utilitaria.getSession().
                getNamedQuery("pacientePorNome").setString("nome",
                jTextFieldNomePaciente.getText() + "%").list();

    }

    private void SetOTextFielDoPaciente() {
        if (paciente != null) {
            if (paciente.getId() != 0) {
                jTextFieldNomePaciente.setText(paciente.getNome());

            }
        }
    }

    private void SetOTextFieldDoProfissional() {
        if (profissional != null) {
            if (profissional.getId() != 0) {
                jTextFieldNomeProfissional.setText(profissional.getNome());

            }
        }
    }

    private void mostrarNaTabela() {
        Session sessao = Utilitaria.getSession();
        List<Atendimento> LAtendimentos = sessao.createQuery("from Atendimento").list();
        int i = 0;
        int linha = 1;
        //  "ID", "Data", "Hora", "Nome do Paciente", "Profissional"

        for (Atendimento a : LAtendimentos) {
            //para exibir a data no formato correto
            String dataNobanco = String.valueOf(a.getData());
            //1997
            String ano = dataNobanco.substring(0, 4);
            String mes = dataNobanco.substring(5, 7);
            String dia = dataNobanco.substring(8);
            String dataNatabela = dia + "/" + mes + "/" + ano;
            jTableAtendimentos.getModel().setValueAt(a.getId(), i, 0);
            jTableAtendimentos.getModel().setValueAt(a.getDescricao(), i, 1);
            jTableAtendimentos.getModel().setValueAt(dataNatabela, i, 2);
            jTableAtendimentos.getModel().setValueAt(a.getHora(), i, 3);
            if (a.getPaciente() != null) {
                jTableAtendimentos.getModel().setValueAt(a.getPaciente().getNome(), i, 4);
            }
            if (a.getProfissional() != null) {
                jTableAtendimentos.getModel().setValueAt(a.getProfissional().getNome(), i, 5);
            }
            i++;
            DefaultTableModel tabelaConsulta = (DefaultTableModel) jTableAtendimentos.getModel();
            tabelaConsulta.addRow(new Object[linha]);

        }
    }

    private void buscarPorPacientes() {
        /*Esse método deve Instanciar um Paciente,
        criar uma instância da tela a ser chamada
        e setar na mesma uma lista de Pacientes com o parâmetro "paciente"*/

        paciente = new Paciente();
        ListaPaciente lp;
        lp = new ListaPaciente(null, true, paciente);
        lp.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        lp.setVisible(true);

    }

    private void buscarPorProfissionais() {
        /*Esse método deve Instanciar um Profissional,
        criar uma instância da tela a ser chamada
        e setar na mesma uma lista de Profissional com o parâmetro "Profissional"*/
        profissional = new Profissional();
        ListaProfissional lp;
        lp = new ListaProfissional(null, true, profissional);
        lp.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        lp.setVisible(true);

    }

    private void controleCamposEBotões() {
        //Desabilitar botões
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonAtualizar.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        //Habilitar Botões
        jButtonSalvar.setEnabled(true);
        //Habilitar campos
        jTFDataAtendimento.setEnabled(true);
        jTFHoraAtendimento.setEnabled(true);
        jTextFieldDescricao.setEnabled(true);
        jTextFieldNomePaciente.setEnabled(true);
        jTextFieldNomeProfissional.setEnabled(true);

    }

    private void controleBotoes() {
        //habilitar botões
        jButtonNovo.setEnabled(true);
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonAtualizar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        
    }

}//chaveFinal
