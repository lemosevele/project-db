package view;

import dao.CurteComentarioDAO;
import dao.FotoDAO;
import dao.PessoaDAO;
import dominio.CurteComentario;
import dominio.Foto;
import dominio.Pessoa;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


public class TabelaFoto extends javax.swing.JFrame {

    
    private Foto foto = new Foto();
    public TabelaFoto() {
        initComponents();
        readTabelaFoto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonInserirP1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaFoto = new javax.swing.JTable();
        lbImagem = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        buttonInserirP = new javax.swing.JButton();
        buttonExcluirP = new javax.swing.JButton();
        buttonAtualizarP = new javax.swing.JButton();
        txtIdPost = new javax.swing.JTextField();
        txtFile = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonInserirP2 = new javax.swing.JButton();

        buttonInserirP1.setText("Inserir");
        buttonInserirP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInserirP1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TabelaFoto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "idPost", "imagem"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaFotoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaFoto);

        lbImagem.setText("lbImagem");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(lbImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addContainerGap())
        );

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

        txtIdPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPostActionPerformed(evt);
            }
        });

        jLabel2.setText("arquivo");

        jLabel3.setText("idPost");

        buttonInserirP2.setText("selecionar");
        buttonInserirP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInserirP2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(buttonInserirP)
                                .addGap(61, 61, 61)
                                .addComponent(buttonExcluirP))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonInserirP2)))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonAtualizarP)
                            .addComponent(txtIdPost, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(206, 206, 206)
                        .addComponent(jLabel3)
                        .addGap(97, 97, 97))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdPost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonInserirP2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonInserirP)
                    .addComponent(buttonExcluirP)
                    .addComponent(buttonAtualizarP))
                .addGap(19, 19, 19))
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

    private void TabelaFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaFotoMouseClicked
        if (TabelaFoto.getSelectedRow() != -1){
            txtIdPost.setText(TabelaFoto.getValueAt(TabelaFoto.getSelectedRow(), 1).toString());
            txtFile.setText(TabelaFoto.getValueAt(TabelaFoto.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_TabelaFotoMouseClicked

    private void readTabelaFoto(){
        DefaultTableModel modelo = (DefaultTableModel) TabelaFoto.getModel();
        modelo.setNumRows(0);
        
        FotoDAO fotodao = new FotoDAO();
        for(Foto foto: fotodao.read()){
            modelo.addRow(new Object[] {
                foto.getId(),
		foto.getIdPost(),
                foto.getImagem()
            });
        }
    }
            
    private void buttonInserirPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInserirPActionPerformed
        FotoDAO fotodao = new FotoDAO();
        foto.setIdPost(Integer.parseInt(txtIdPost.getText()));
        fotodao.create(foto);
        
    }//GEN-LAST:event_buttonInserirPActionPerformed

    private void buttonExcluirPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirPActionPerformed
        Foto foto = new Foto();
        FotoDAO fotodao = new FotoDAO();
        
        foto.setId(Integer.parseInt(TabelaFoto.getValueAt(TabelaFoto.getSelectedRow(),0).toString()));
        fotodao.delete(foto);
        
        readTabelaFoto();
    }//GEN-LAST:event_buttonExcluirPActionPerformed

    private void txtIdPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPostActionPerformed

    private void buttonInserirP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInserirP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonInserirP1ActionPerformed

    private void buttonInserirP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInserirP2ActionPerformed
                
        
        //foto.setId(Integer.parseInt(TabelaFoto.getValueAt(TabelaFoto.getSelectedRow(),0).toString()));
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("imagem", "jpg", "png"); 
        
        fileChooser.setFileFilter(filter);
        int retorno = fileChooser.showOpenDialog(this);
        
        if(retorno == JFileChooser.APPROVE_OPTION){
            
            File file = fileChooser.getSelectedFile();
            txtFile.setText(file.getPath());
            lbImagem.setIcon(new ImageIcon(file.getPath()));
            foto.setImagem(file.getPath());
        }
        
        readTabelaFoto();
    }//GEN-LAST:event_buttonInserirP2ActionPerformed

    private void buttonAtualizarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarPActionPerformed
        if(TabelaFoto.getSelectedRow() != -1){
            Foto foto = new Foto();
            FotoDAO fotodao = new FotoDAO();

            foto.setId((int)TabelaFoto.getValueAt(TabelaFoto.getSelectedRow(), 0));
            foto.setIdPost(Integer.parseInt(txtIdPost.getText()));
            foto.setImagem(txtFile.getText());
            fotodao.update(foto);
            
            readTabelaFoto();  
        
        }      
    }//GEN-LAST:event_buttonAtualizarPActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaFoto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaFoto;
    private javax.swing.JButton buttonAtualizarP;
    private javax.swing.JButton buttonExcluirP;
    private javax.swing.JButton buttonInserirP;
    private javax.swing.JButton buttonInserirP1;
    private javax.swing.JButton buttonInserirP2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbImagem;
    private javax.swing.JTextField txtFile;
    private javax.swing.JTextField txtIdPost;
    // End of variables declaration//GEN-END:variables
}
