
package view;

public class TelaInicial extends javax.swing.JFrame {
 
    public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        buttonPessoa = new javax.swing.JButton();
        buttonAmizade = new javax.swing.JButton();
        buttonPost = new javax.swing.JButton();
        buttonFoto = new javax.swing.JButton();
        buttonCurteP = new javax.swing.JButton();
        buttonComentario = new javax.swing.JButton();
        buttonCurteC = new javax.swing.JButton();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Selecione a tabela que deseja acessar");

        buttonPessoa.setText("Pessoa");
        buttonPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPessoaActionPerformed(evt);
            }
        });

        buttonAmizade.setText("Amizade");
        buttonAmizade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAmizadeActionPerformed(evt);
            }
        });

        buttonPost.setText("Post");
        buttonPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPostActionPerformed(evt);
            }
        });

        buttonFoto.setText("Foto");
        buttonFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFotoActionPerformed(evt);
            }
        });

        buttonCurteP.setText("CurtePost");
        buttonCurteP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCurtePActionPerformed(evt);
            }
        });

        buttonComentario.setText("Comentario");
        buttonComentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonComentarioActionPerformed(evt);
            }
        });

        buttonCurteC.setText("CurteComentario");
        buttonCurteC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCurteCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonPessoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonAmizade)
                    .addComponent(buttonComentario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonPost)
                        .addGap(18, 18, 18)
                        .addComponent(buttonFoto)
                        .addGap(18, 18, 18)
                        .addComponent(buttonCurteP))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(buttonCurteC)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPessoa)
                    .addComponent(buttonAmizade)
                    .addComponent(buttonPost)
                    .addComponent(buttonFoto)
                    .addComponent(buttonCurteP))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonComentario)
                    .addComponent(buttonCurteC))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCurteCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCurteCActionPerformed
        TabelaCurteComentario tabelaCurteC = new TabelaCurteComentario();
        tabelaCurteC.show();
    }//GEN-LAST:event_buttonCurteCActionPerformed

    private void buttonComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonComentarioActionPerformed
        TabelaComentario tabelaComentario = new TabelaComentario();
        tabelaComentario.show();
    }//GEN-LAST:event_buttonComentarioActionPerformed

    private void buttonCurtePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCurtePActionPerformed
        TabelaCurtePost tabelaCurteP = new TabelaCurtePost();
        tabelaCurteP.show();
    }//GEN-LAST:event_buttonCurtePActionPerformed

    private void buttonFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFotoActionPerformed
        TabelaFoto tabelaFoto = new TabelaFoto();
        tabelaFoto.show();
    }//GEN-LAST:event_buttonFotoActionPerformed

    private void buttonPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPostActionPerformed
        TabelaPost tabelaPost = new TabelaPost();
        tabelaPost.show();
    }//GEN-LAST:event_buttonPostActionPerformed

    private void buttonAmizadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAmizadeActionPerformed
        TabelaAmizade tabelaAmizade = new TabelaAmizade();
        tabelaAmizade.show();
    }//GEN-LAST:event_buttonAmizadeActionPerformed

    private void buttonPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPessoaActionPerformed
        TabelaPessoa tabelaPessoa = new TabelaPessoa();
        tabelaPessoa.show();

    }//GEN-LAST:event_buttonPessoaActionPerformed
    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAmizade;
    private javax.swing.JButton buttonComentario;
    private javax.swing.JButton buttonCurteC;
    private javax.swing.JButton buttonCurteP;
    private javax.swing.JButton buttonFoto;
    private javax.swing.JButton buttonPessoa;
    private javax.swing.JButton buttonPost;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
