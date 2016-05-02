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
import modelo.Consulta;
import modelo.Paciente;
import modelo.Profissional;
import org.hibernate.Session;
import util.Utilitaria;

/**
 *
 * @author ADMIN
 */
public class JDCadConsulta extends javax.swing.JDialog {

    /**
     * Creates new form JDCadConsultaJDCadConsulta
     */
    private Paciente paciente;

    private Profissional profissional;

    private Consulta consulta;

    public JDCadConsulta(java.awt.Frame parent, boolean modal) {
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
        jTFDataConsulta = new com.toedter.calendar.JDateChooser();
        jTFHora = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldNomePaciente = new javax.swing.JTextField();
        jTextFieldNomeProfissional = new javax.swing.JTextField();
        jButtonPesquisaPaciente = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableConsultasCadastradas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Consulta");
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
        jLabel4.setText("Data da Consulta:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Hora da Consulta:");

        try {
            jTFHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
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
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldNomeProfissional)
                            .addComponent(jTextFieldNomePaciente)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jTFDataConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                                .addGap(94, 94, 94)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jTFHora, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonPesquisaPaciente)
                            .addComponent(jButton2))
                        .addGap(240, 240, 240))))
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
                    .addComponent(jTFDataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addContainerGap(34, Short.MAX_VALUE))
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

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/salvar.png"))); // NOI18N
        jButtonSalvar.setMnemonic('s');
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setToolTipText("Salva o cadastro atual");
        jButtonSalvar.setPreferredSize(new java.awt.Dimension(100, 35));
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonSalvar);

        jTableConsultasCadastradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Data", "Hora", "Nome do Paciente", "Profissional"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableConsultasCadastradas.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableConsultasCadastradas);
        if (jTableConsultasCadastradas.getColumnModel().getColumnCount() > 0) {
            jTableConsultasCadastradas.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consultas Cadastradas");

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
                .addGap(214, 214, 214)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
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

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed

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
                JDCadConsulta dialog = new JDCadConsulta(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisaPaciente;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jTFDataConsulta;
    private javax.swing.JFormattedTextField jTFHora;
    private javax.swing.JTable jTableConsultasCadastradas;
    private javax.swing.JTextField jTextFieldNomePaciente;
    private javax.swing.JTextField jTextFieldNomeProfissional;
    // End of variables declaration//GEN-END:variables

    //Variavel da tela
    private void SalvarConsulta() {
        Consulta c = new Consulta();
        //Salvar a Data
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = sf.format(jTFDataConsulta.getDate());

        String dia = dataFormatada.toString().substring(0, 2);
        String mes = dataFormatada.toString().substring(3, 5);
        String ano = dataFormatada.toString().substring(6);
        String Data_Cons_Banco = ano + "-" + mes + "-" + dia;
        //Variável local date para converter para date a string;
        LocalDate DtCons = LocalDate.parse(Data_Cons_Banco);
        // salvando no objeto
        c.setData(java.sql.Date.valueOf(DtCons));

        //pegar a hora da tela
        int HH = Integer.parseInt(jTFHora.getText().substring(0, 2));
        int mm = Integer.parseInt(jTFHora.getText().substring(3, 5));

        LocalTime hora = LocalTime.of(HH, mm);
        Time horaMinuto = Time.valueOf(hora);
        //salvar hora
        c.setHora(horaMinuto);
        //precisa receber um objeto paciente 
        c.setPaciente(paciente);
        //precisa receber um objeto profissional
        c.setProfissional(profissional);

        Dao<Consulta> dao = new Dao<>();
        dao.gravar(c);
        JOptionPane.showMessageDialog(null, "Dados gravados com sucesso!");

    }

    private void pesquisarOTextFiel() {
        List<Paciente> pacientes = Utilitaria.getSession().
                getNamedQuery("pacientePorNome").setString("nome",
                jTextFieldNomePaciente.getText() + "%").list();

    }

    private void pesquisarNoTextField() {
        List<Profissional> profissionais = Utilitaria.getSession().
                getNamedQuery("profissionalPorNome").setString("nome",
                jTextFieldNomeProfissional.getText() + "%").list();

        StringBuffer armazenarNomes = new StringBuffer();
        for (Profissional p : profissionais) {
            armazenarNomes.append(p.getNome());
        }
        if (armazenarNomes.length() == 0) {
            JOptionPane.showMessageDialog(null, "Profissional não encontrado!");
            profissional = new Profissional();
            ListaProfissional Telalp = new ListaProfissional(profissional);
            Telalp.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            Telalp.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Profissional encontrado: " + armazenarNomes.toString());
            jTextFieldNomeProfissional.setText(armazenarNomes.toString());
        }

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
        List<Consulta> LConsultas = sessao.createQuery("from Consulta").list();
        int i = 0;
        int linha = 1;
        //  "ID", "Data", "Hora", "Nome do Paciente", "Profissional"

        for (Consulta c : LConsultas) {
            //para exibir a data no formato correto
            String dataNobanco = String.valueOf(c.getData());
            //1997
            String ano = dataNobanco.substring(0, 4);
            String mes = dataNobanco.substring(5, 7);
            String dia = dataNobanco.substring(8);
            String dataNatabela = dia + "/" + mes + "/" + ano;
            jTableConsultasCadastradas.getModel().setValueAt(c.getId(), i, 0);
            jTableConsultasCadastradas.getModel().setValueAt(dataNatabela, i, 1);
            jTableConsultasCadastradas.getModel().setValueAt(c.getHora(), i, 2);
            if (c.getPaciente() != null) {
                jTableConsultasCadastradas.getModel().setValueAt(c.getPaciente().getNome(), i, 3);
            }
            if (c.getProfissional() != null) {
                jTableConsultasCadastradas.getModel().setValueAt(c.getProfissional().getNome(), i, 4);
            }
            i++;
            DefaultTableModel tabelaConsulta = (DefaultTableModel) jTableConsultasCadastradas.getModel();
            tabelaConsulta.addRow(new Object[linha]);

        }
    }

    private void buscarPorPacientes() {
        /*Esse método deve Instanciar um Paciente,
        criar uma instância da tela a ser chamada
        e setar na mesma uma lista de Pacientes com o parâmetro "paciente"*/

        paciente = new Paciente();
        ListaPaciente lp;
        lp = new ListaPaciente(paciente);
        lp.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        lp.setVisible(true);

     
    }

    private void buscarPorProfissionais() {
        /*Esse método deve Instanciar um Profissional,
        criar uma instância da tela a ser chamada
        e setar na mesma uma lista de Profissional com o parâmetro "Profissional"*/
        profissional = new Profissional();
        ListaProfissional lp;
        lp = new ListaProfissional(profissional);
        lp.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        lp.setVisible(true);

       
    }

}//chaveFinal