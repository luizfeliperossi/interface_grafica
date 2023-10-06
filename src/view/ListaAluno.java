package view;

import javax.swing.table.DefaultTableModel;

public class ListaAluno extends javax.swing.JFrame {

    public ListaAluno() {
        initComponents();
        setarDadosTabela();
        setLocationRelativeTo(null);
    }

    private void setarDadosTabela() {
        String[][] dados = new String[2][4];
        String[] colunas = new String[]{"Nome", "CPF", "E-mail", "Curso"};

        dados[0][0] = "Luiz Felipe";
        dados[0][1] = "78945612355";
        dados[0][2] = "luiz@google.com";
        dados[0][3] = "TADS";

        dados[1][0] = "Joao";
        dados[1][1] = "12345678900";
        dados[1][2] = "joao@google.com";
        dados[1][3] = "TADS";

        DefaultTableModel model = new DefaultTableModel(dados, colunas);
        jT_ListaAluno.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jT_ListaAluno = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("j"); // NOI18N

        jT_ListaAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jT_ListaAluno.setName("jT_ListaAluno"); // NOI18N
        jT_ListaAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_ListaAlunoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jT_ListaAluno);
        jT_ListaAluno.getAccessibleContext().setAccessibleName("");
        jT_ListaAluno.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jT_ListaAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_ListaAlunoMouseClicked
        if (evt.getClickCount() >= 1) {
            int linha = jT_ListaAluno.getSelectedRow();
            String nome = jT_ListaAluno.getValueAt(linha, 0).toString();
            String cpf = jT_ListaAluno.getValueAt(linha, 1).toString();
            String email = jT_ListaAluno.getValueAt(linha, 2).toString();
            String curso = jT_ListaAluno.getValueAt(linha, 3).toString();
            System.out.println("Nome: " + nome);
            System.out.println("CPF: " + cpf);
            System.out.println("E-mail: " + email);
            System.out.println("Curso: " + curso);

        }
    }//GEN-LAST:event_jT_ListaAlunoMouseClicked

    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jT_ListaAluno;
    // End of variables declaration//GEN-END:variables
}