package view;

import dao.ComentarioDAO;
import dominio.Comentario;

public class TabelaComentario extends javax.swing.JFrame {

    public TabelaComentario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textIdPessoa4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        buttonInserirP = new javax.swing.JButton();
        buttonExcluirP = new javax.swing.JButton();
        buttonAtualizarP = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPessoa = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        textIdPessoa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textData = new javax.swing.JTextField();
        textIdPost = new javax.swing.JTextField();
        textTexto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        textIdPessoa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdPessoa4ActionPerformed(evt);
            }
        });

        jLabel5.setText("idPessoa");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        tabelaPessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "idPessoa", "idPost", "data", "texto"
            }
        ));
        tabelaPessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPessoaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaPessoa);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(buttonInserirP)
                .addGap(51, 51, 51)
                .addComponent(buttonExcluirP)
                .addGap(63, 63, 63)
                .addComponent(buttonAtualizarP)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonInserirP)
                    .addComponent(buttonExcluirP)
                    .addComponent(buttonAtualizarP))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setText("idPessoa");

        textIdPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdPessoaActionPerformed(evt);
            }
        });

        jLabel3.setText("idPost");

        jLabel4.setText("data");

        textData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDataActionPerformed(evt);
            }
        });

        textIdPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdPostActionPerformed(evt);
            }
        });

        textTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTextoActionPerformed(evt);
            }
        });

        jLabel6.setText("texto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textIdPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel2)))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textIdPost, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(textData, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 27, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addGap(126, 126, 126)
                                        .addComponent(jLabel4)
                                        .addGap(115, 115, 115))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel6)
                                .addGap(38, 38, 38)
                                .addComponent(textTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textIdPost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textIdPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaPessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPessoaMouseClicked

    }//GEN-LAST:event_tabelaPessoaMouseClicked

    private void buttonInserirPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInserirPActionPerformed
        ComentarioDAO comentarioDAO = new ComentarioDAO();
        Comentario comentario = new Comentario();
        
        comentario.setData(textData.getText());
        comentario.setTexto(textTexto.getText());
        comentario.setIdPessoa(Integer.parseInt(textIdPessoa.getText()));
        comentario.setIdPost(Integer.parseInt(textIdPost.getText()));
        
        comentarioDAO.create(comentario);
        
    }//GEN-LAST:event_buttonInserirPActionPerformed

    private void buttonExcluirPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirPActionPerformed

    }//GEN-LAST:event_buttonExcluirPActionPerformed

    private void textTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTextoActionPerformed

    private void textDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDataActionPerformed

    private void textIdPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIdPessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIdPessoaActionPerformed

    private void textIdPessoa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIdPessoa4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIdPessoa4ActionPerformed

    private void textIdPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIdPostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIdPostActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaComentario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAtualizarP;
    private javax.swing.JButton buttonExcluirP;
    private javax.swing.JButton buttonInserirP;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaPessoa;
    private javax.swing.JTextField textData;
    private javax.swing.JTextField textIdPessoa;
    private javax.swing.JTextField textIdPessoa4;
    private javax.swing.JTextField textIdPost;
    private javax.swing.JTextField textTexto;
    // End of variables declaration//GEN-END:variables
}
