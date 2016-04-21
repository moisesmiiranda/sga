/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Paciente;
import org.hibernate.Session;
import util.Utilitaria;
import visao.JFCadConsulta;

/**
 *
 * @author ADMIN
 */
public class JDListaPacientes extends javax.swing.JDialog {

    /**
     * Creates new form JDListaPacientes
     */
    private Paciente paciente;
    
    public JDListaPacientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
         initComponents();
    } 

    public JDListaPacientes(Paciente p) {
        this.paciente = p;
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaPacientes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Pacientes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jTableListaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Data de nascimento", "Sexo", "CPF", "Endereço", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListaPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListaPacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableListaPacientes);
        if (jTableListaPacientes.getColumnModel().getColumnCount() > 0) {
            jTableListaPacientes.getColumnModel().getColumn(0).setHeaderValue("ID");
            jTableListaPacientes.getColumnModel().getColumn(1).setHeaderValue("Nome");
            jTableListaPacientes.getColumnModel().getColumn(2).setHeaderValue("Data de nascimento");
            jTableListaPacientes.getColumnModel().getColumn(3).setHeaderValue("Sexo");
            jTableListaPacientes.getColumnModel().getColumn(4).setHeaderValue("CPF");
            jTableListaPacientes.getColumnModel().getColumn(5).setHeaderValue("Endereço");
            jTableListaPacientes.getColumnModel().getColumn(6).setHeaderValue("Telefone");
        }

        jButton1.setText("Adicionar Consulta");
        jButton1.setPreferredSize(new java.awt.Dimension(200, 35));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setText("Pesquisar");
        jButton2.setPreferredSize(new java.awt.Dimension(200, 35));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mostrarTelaPesquisaPaciente();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        mostrarPacientes();


    }//GEN-LAST:event_formWindowOpened

    private void jTableListaPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListaPacientesMouseClicked

    }//GEN-LAST:event_jTableListaPacientesMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        adicionarPacienteNaConsulta();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JDListaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDListaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDListaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDListaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDListaPacientes dialog = new JDListaPacientes(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableListaPacientes;
    // End of variables declaration//GEN-END:variables

    //Variável da tela
    JDPesquisarPaciente pesquisaPaciente;

    private void mostrarTelaPesquisaPaciente() {
        mostrarPacientes();
        pesquisaPaciente = new JDPesquisarPaciente(null, true);
        pesquisaPaciente.setVisible(true);

    }

    private void mostrarPacientes() {

        Session sessao = Utilitaria.getSession();//Peguei a sessao
        List<Paciente> Lpacientes = sessao.createQuery("from Paciente").list();//selecionei a tabela pacientes
        int i = 0;
        int linha = 1;
        //Data está aparecendo assim 1982-04-22
        //Deve aparecer assim: 22/04/1982

        for (Paciente p : Lpacientes) {
            //Conversão necessária para salvar a data no formato correto
            String dataN_do_paciente = String.valueOf(p.getDataDeNascimento());
            String ano = dataN_do_paciente.substring(0, 4);
            String mes = dataN_do_paciente.substring(5, 7);
            String dia = dataN_do_paciente.substring(8);
            String DataParaTabela = dia + "/" + mes + "/" + ano;

            jTableListaPacientes.getModel().setValueAt(p.getId(), i, 0);
            jTableListaPacientes.getModel().setValueAt(p.getNome(), i, 1);
            jTableListaPacientes.getModel().setValueAt(DataParaTabela, i, 2);
            jTableListaPacientes.getModel().setValueAt(p.getSexo(), i, 3);
            jTableListaPacientes.getModel().setValueAt(p.getCpf(), i, 4);
            jTableListaPacientes.getModel().setValueAt(p.getEndereco(), i, 5);
            jTableListaPacientes.getModel().setValueAt(p.getTelefone(), i, 6);
            i++;
            DefaultTableModel tabelaListaPaciente = (DefaultTableModel) jTableListaPacientes.getModel(); // pegando o modelo padrão da tabela

            tabelaListaPaciente.addRow(new Object[linha]);
        }

    }

    private void adicionarPacienteNaConsulta() {
        Paciente pac = (Paciente) Utilitaria.getSession().getNamedQuery("pacientePorID")
                .setInteger(0, Integer.parseInt(jTableListaPacientes.getModel()
                                .getValueAt(jTableListaPacientes.getSelectedRow(), 0)
                                .toString())).uniqueResult();
        paciente.setId(pac.getId());
        paciente.setNome(pac.getNome());
        paciente.setCpf(pac.getCpf());
        paciente.setDataDeNascimento(pac.getDataDeNascimento());
        paciente.setSexo(pac.getSexo());
        paciente.setTelefone(pac.getTelefone());
        paciente.setEndereco(pac.getEndereco());

        dispose();

    }

}
