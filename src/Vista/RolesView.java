/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

/**
 *
 * @author InaRu
 */
public class RolesView extends javax.swing.JPanel {

    /**
     * Creates new form ProyectosView
     */
    public RolesView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionesProy_jpnl = new javax.swing.JPanel();
        nuevoCLI_btn = new javax.swing.JButton();
        editCLI_btn = new javax.swing.JButton();
        eliminarCLI_btn = new javax.swing.JButton();
        guardarCLI_btn = new javax.swing.JButton();
        salir_btn = new javax.swing.JButton();
        listaCLI_jpnl = new javax.swing.JPanel();
        buscarCLI_txt = new javax.swing.JTextField();
        buscarCLI_btn = new javax.swing.JButton();
        jScrollP_Proy = new javax.swing.JScrollPane();
        roles_jTbl = new javax.swing.JTable();
        datosPR_pnl = new javax.swing.JPanel();
        codPR_lbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        idCLI_txt = new javax.swing.JTextField();
        nomCLI_txt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(java.awt.SystemColor.controlHighlight);
        setMaximumSize(new java.awt.Dimension(750, 550));
        setMinimumSize(new java.awt.Dimension(750, 550));
        setPreferredSize(new java.awt.Dimension(750, 550));

        opcionesProy_jpnl.setBackground(java.awt.SystemColor.controlHighlight);
        opcionesProy_jpnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 102, 204))); // NOI18N

        nuevoCLI_btn.setBackground(new java.awt.Color(0, 153, 204));
        nuevoCLI_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nuevoCLI_btn.setForeground(new java.awt.Color(255, 255, 255));
        nuevoCLI_btn.setText("Nuevo");
        nuevoCLI_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoCLI_btnActionPerformed(evt);
            }
        });

        editCLI_btn.setBackground(new java.awt.Color(0, 153, 204));
        editCLI_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        editCLI_btn.setForeground(new java.awt.Color(255, 255, 255));
        editCLI_btn.setText("Editar");

        eliminarCLI_btn.setBackground(new java.awt.Color(0, 153, 204));
        eliminarCLI_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eliminarCLI_btn.setForeground(new java.awt.Color(255, 255, 255));
        eliminarCLI_btn.setText("Eliminar");

        guardarCLI_btn.setBackground(new java.awt.Color(0, 153, 204));
        guardarCLI_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        guardarCLI_btn.setForeground(new java.awt.Color(255, 255, 255));
        guardarCLI_btn.setText("Guardar");
        guardarCLI_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCLI_btnActionPerformed(evt);
            }
        });

        salir_btn.setBackground(new java.awt.Color(0, 153, 204));
        salir_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        salir_btn.setForeground(new java.awt.Color(255, 255, 255));
        salir_btn.setText("Salir");
        salir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout opcionesProy_jpnlLayout = new javax.swing.GroupLayout(opcionesProy_jpnl);
        opcionesProy_jpnl.setLayout(opcionesProy_jpnlLayout);
        opcionesProy_jpnlLayout.setHorizontalGroup(
            opcionesProy_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesProy_jpnlLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(opcionesProy_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardarCLI_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarCLI_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editCLI_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevoCLI_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        opcionesProy_jpnlLayout.setVerticalGroup(
            opcionesProy_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesProy_jpnlLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(nuevoCLI_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editCLI_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(eliminarCLI_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(guardarCLI_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        listaCLI_jpnl.setBackground(java.awt.SystemColor.controlHighlight);
        listaCLI_jpnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista roles :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 153, 204))); // NOI18N

        buscarCLI_btn.setBackground(new java.awt.Color(0, 153, 204));
        buscarCLI_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buscarCLI_btn.setForeground(new java.awt.Color(255, 255, 255));
        buscarCLI_btn.setText("Buscar");
        buscarCLI_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCLI_btnActionPerformed(evt);
            }
        });

        roles_jTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Permiso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        roles_jTbl.getTableHeader().setReorderingAllowed(false);
        jScrollP_Proy.setViewportView(roles_jTbl);

        javax.swing.GroupLayout listaCLI_jpnlLayout = new javax.swing.GroupLayout(listaCLI_jpnl);
        listaCLI_jpnl.setLayout(listaCLI_jpnlLayout);
        listaCLI_jpnlLayout.setHorizontalGroup(
            listaCLI_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaCLI_jpnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listaCLI_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listaCLI_jpnlLayout.createSequentialGroup()
                        .addComponent(jScrollP_Proy, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(listaCLI_jpnlLayout.createSequentialGroup()
                        .addComponent(buscarCLI_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscarCLI_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        listaCLI_jpnlLayout.setVerticalGroup(
            listaCLI_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaCLI_jpnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listaCLI_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarCLI_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarCLI_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollP_Proy, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        datosPR_pnl.setBackground(java.awt.SystemColor.controlHighlight);
        datosPR_pnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 153, 204))); // NOI18N

        codPR_lbl.setText("ID:");

        jLabel1.setText("Nombre:");

        idCLI_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCLI_txtActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo ", "Nombre permiso", "Descripción"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout datosPR_pnlLayout = new javax.swing.GroupLayout(datosPR_pnl);
        datosPR_pnl.setLayout(datosPR_pnlLayout);
        datosPR_pnlLayout.setHorizontalGroup(
            datosPR_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosPR_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datosPR_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(codPR_lbl))
                .addGap(31, 31, 31)
                .addGroup(datosPR_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idCLI_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                    .addComponent(nomCLI_txt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        datosPR_pnlLayout.setVerticalGroup(
            datosPR_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosPR_pnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(datosPR_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idCLI_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codPR_lbl))
                .addGap(21, 21, 21)
                .addGroup(datosPR_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomCLI_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(284, 284, 284))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(datosPR_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcionesProy_jpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(listaCLI_jpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(datosPR_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(opcionesProy_jpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaCLI_jpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoCLI_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoCLI_btnActionPerformed

    }//GEN-LAST:event_nuevoCLI_btnActionPerformed

    private void idCLI_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCLI_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idCLI_txtActionPerformed

    private void buscarCLI_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCLI_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarCLI_btnActionPerformed

    private void guardarCLI_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCLI_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarCLI_btnActionPerformed

    private void salir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_btnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salir_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarCLI_btn;
    private javax.swing.JTextField buscarCLI_txt;
    private javax.swing.JLabel codPR_lbl;
    private javax.swing.JPanel datosPR_pnl;
    private javax.swing.JButton editCLI_btn;
    private javax.swing.JButton eliminarCLI_btn;
    private javax.swing.JButton guardarCLI_btn;
    private javax.swing.JTextField idCLI_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollP_Proy;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel listaCLI_jpnl;
    private javax.swing.JTextField nomCLI_txt;
    private javax.swing.JButton nuevoCLI_btn;
    private javax.swing.JPanel opcionesProy_jpnl;
    private javax.swing.JTable roles_jTbl;
    private javax.swing.JButton salir_btn;
    // End of variables declaration//GEN-END:variables
}
