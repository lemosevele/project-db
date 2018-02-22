package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import dominio.Amizade;
import dao.AmizadeDAO;

public class TabelaAmizade extends javax.swing.JFrame {

    public TabelaAmizade() {
        initComponents();
        readTabelaAmizade();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textRotulo = new javax.swing.JTextField();
        buttonInserirP = new javax.swing.JButton();
        buttonExcluirP = new javax.swing.JButton();
        buttonAtualizarP = new javax.swing.JButton();
        textIdPessoa2 = new javax.swing.JTextField();
        textIdPessoa1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAmizade = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Rótulo");

        textRotulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRotuloActionPerformed(evt);
            }
        });

        buttonInserirP.setText("Inserir");
        buttonInserirP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInserirPActionPerformed(evt);
            }
        });

        buttonExcluirP.setText("Excluir");
        buttonExcluirP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirPActionPerformed(evt);
            }
        });

        buttonAtualizarP.setText("Atualizar");
        buttonAtualizarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtualizarPActionPerformed(evt);
            }
        });

        jLabel2.setText("idPessoa1");

        jLabel3.setText("idPessoa2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonInserirP)
                        .addGap(50, 50, 50)
                        .addComponent(buttonExcluirP)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textIdPessoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textIdPessoa2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonAtualizarP)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(textRotulo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(93, 93, 93)
                .addComponent(jLabel1)
                .addGap(102, 102, 102))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textRotulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textIdPessoa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textIdPessoa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonInserirP)
                    .addComponent(buttonExcluirP)
                    .addComponent(buttonAtualizarP))
                .addGap(19, 19, 19))
        );

        tabelaAmizade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idPessoa1", "idPessoa2", "rotulo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaAmizade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAmizadeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaAmizade);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textRotuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRotuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textRotuloActionPerformed

    public void readTabelaAmizade(){
        DefaultTableModel modelo = (DefaultTableModel) tabelaAmizade.getModel();
        modelo.setNumRows(0);
        
        AmizadeDAO amizadeDAO = new AmizadeDAO();
        for(Amizade amizade : amizadeDAO.read()){
            modelo.addRow(new Object[] {
                amizade.getIdPessoa1(),
                amizade.getIdPessoa2(),
                amizade.getRotulo()
            });
        }
    }
    
    private void buttonInserirPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInserirPActionPerformed
        Amizade amizade = new Amizade();
        AmizadeDAO amizadeDAO = new AmizadeDAO();
                
        amizade.setRotulo(textRotulo.getText());
        amizade.setIdPessoa1(Integer.parseInt(textIdPessoa1.getText()));
        amizade.setIdPessoa2(Integer.parseInt(textIdPessoa2.getText()));
     
        amizadeDAO.create(amizade);
        
        readTabelaAmizade();
    }//GEN-LAST:event_buttonInserirPActionPerformed

    private void buttonExcluirPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirPActionPerformed
        Amizade amizade = new Amizade();
        amizade.setIdPessoa1(Integer.parseInt(textIdPessoa1.getText()));
        amizade.setIdPessoa2(Integer.parseInt(textIdPessoa2.getText()));
        
        AmizadeDAO amizadedao = new AmizadeDAO();
        amizadedao.delete(amizade);
        
        readTabelaAmizade();
        
    }//GEN-LAST:event_buttonExcluirPActionPerformed

    private void tabelaAmizadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAmizadeMouseClicked
        if(tabelaAmizade.getSelectedRow() != -1){
            
            textIdPessoa1.setText(tabelaAmizade.getValueAt(tabelaAmizade.getSelectedRow(), 0).toString());
            textIdPessoa2.setText(tabelaAmizade.getValueAt(tabelaAmizade.getSelectedRow(), 1).toString());
            textRotulo.setText(tabelaAmizade.getValueAt(tabelaAmizade.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_tabelaAmizadeMouseClicked

    private void buttonAtualizarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarPActionPerformed
        if(tabelaAmizade.getSelectedRow() != -1){
            Amizade amizade = new Amizade();
            AmizadeDAO amizadeDAO = new AmizadeDAO();
                
            amizade.setRotulo(textRotulo.getText());
            amizade.setIdPessoa1(Integer.parseInt(textIdPessoa1.getText()));
            amizade.setIdPessoa2(Integer.parseInt(textIdPessoa2.getText()));
            
            String oldPessoa1 = tabelaAmizade.getValueAt(tabelaAmizade.getSelectedRow(), 0).toString();
            String oldPessoa2 = tabelaAmizade.getValueAt(tabelaAmizade.getSelectedRow(), 1).toString();
     
            amizadeDAO.update(amizade, oldPessoa1, oldPessoa2);
        
            readTabelaAmizade();
            
        }
    }//GEN-LAST:event_buttonAtualizarPActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaAmizade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAtualizarP;
    private javax.swing.JButton buttonExcluirP;
    private javax.swing.JButton buttonInserirP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaAmizade;
    private javax.swing.JTextField textIdPessoa1;
    private javax.swing.JTextField textIdPessoa2;
    private javax.swing.JTextField textRotulo;
    // End of variables declaration//GEN-END:variables
}
