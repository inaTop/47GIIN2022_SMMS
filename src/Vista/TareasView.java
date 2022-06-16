/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

/**
 *
 * @author InaRu
 */
public class TareasView extends javax.swing.JPanel {

    /**
     * Creates new form ProyectosView
     */
    public TareasView() {
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
        nuevaTA_btn = new javax.swing.JButton();
        editTA_btn = new javax.swing.JButton();
        eliminarTA_btn = new javax.swing.JButton();
        guardarTA_btn = new javax.swing.JButton();
        salir_btn = new javax.swing.JButton();
        listaProy_jpnl = new javax.swing.JPanel();
        buscarTA_txt = new javax.swing.JTextField();
        buscarTA_btn = new javax.swing.JButton();
        jScrollP_Proy = new javax.swing.JScrollPane();
        tareas_jTbl = new javax.swing.JTable();
        datosPR_pnl = new javax.swing.JPanel();
        codPR_lbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        idTA_txt = new javax.swing.JTextField();
        usuarioTA_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        estadoTA_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fechainiTA_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fechafinTA_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        proyectoTA_txt = new javax.swing.JTextField();
        nomTA_txt = new javax.swing.JTextField();

        setBackground(java.awt.SystemColor.controlHighlight);
        setMaximumSize(new java.awt.Dimension(750, 550));
        setMinimumSize(new java.awt.Dimension(750, 550));
        setPreferredSize(new java.awt.Dimension(750, 550));

        opcionesProy_jpnl.setBackground(java.awt.SystemColor.controlHighlight);
        opcionesProy_jpnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 102, 204))); // NOI18N

        nuevaTA_btn.setBackground(new java.awt.Color(0, 153, 204));
        nuevaTA_btn.setForeground(new java.awt.Color(255, 255, 255));
        nuevaTA_btn.setText("Nueva");
        nuevaTA_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaTA_btnActionPerformed(evt);
            }
        });

        editTA_btn.setBackground(new java.awt.Color(0, 153, 204));
        editTA_btn.setForeground(new java.awt.Color(255, 255, 255));
        editTA_btn.setText("Editar");

        eliminarTA_btn.setBackground(new java.awt.Color(0, 153, 204));
        eliminarTA_btn.setForeground(new java.awt.Color(255, 255, 255));
        eliminarTA_btn.setText("Eliminar");

        guardarTA_btn.setBackground(new java.awt.Color(0, 153, 204));
        guardarTA_btn.setForeground(new java.awt.Color(255, 255, 255));
        guardarTA_btn.setText("Guardar");
        guardarTA_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarTA_btnActionPerformed(evt);
            }
        });

        salir_btn.setBackground(new java.awt.Color(0, 153, 204));
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
                    .addComponent(guardarTA_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarTA_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editTA_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevaTA_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        opcionesProy_jpnlLayout.setVerticalGroup(
            opcionesProy_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesProy_jpnlLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(nuevaTA_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editTA_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(eliminarTA_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(guardarTA_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        listaProy_jpnl.setBackground(java.awt.SystemColor.controlHighlight);
        listaProy_jpnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista tareas:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 153, 204))); // NOI18N

        buscarTA_btn.setBackground(new java.awt.Color(0, 153, 204));
        buscarTA_btn.setForeground(new java.awt.Color(255, 255, 255));
        buscarTA_btn.setText("Buscar");
        buscarTA_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarTA_btnActionPerformed(evt);
            }
        });

        tareas_jTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Estado", "Nombre", "Proyecto", "Fecha inicio", "Fecha entrega", "Usuario"
            }
        ));
        jScrollP_Proy.setViewportView(tareas_jTbl);

        javax.swing.GroupLayout listaProy_jpnlLayout = new javax.swing.GroupLayout(listaProy_jpnl);
        listaProy_jpnl.setLayout(listaProy_jpnlLayout);
        listaProy_jpnlLayout.setHorizontalGroup(
            listaProy_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaProy_jpnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listaProy_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listaProy_jpnlLayout.createSequentialGroup()
                        .addComponent(jScrollP_Proy, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(listaProy_jpnlLayout.createSequentialGroup()
                        .addComponent(buscarTA_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscarTA_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        listaProy_jpnlLayout.setVerticalGroup(
            listaProy_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaProy_jpnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listaProy_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarTA_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarTA_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollP_Proy, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        datosPR_pnl.setBackground(java.awt.SystemColor.controlHighlight);
        datosPR_pnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 153, 204))); // NOI18N

        codPR_lbl.setText("ID:");

        jLabel1.setText("Nombre:");

        idTA_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTA_txtActionPerformed(evt);
            }
        });

        jLabel2.setText("Estado:");

        jLabel3.setText("Fecha inicio: ");

        jLabel4.setText("Fecha entrega:");

        jLabel5.setText("Usuario:");

        jLabel7.setText("Proyecto:");

        javax.swing.GroupLayout datosPR_pnlLayout = new javax.swing.GroupLayout(datosPR_pnl);
        datosPR_pnl.setLayout(datosPR_pnlLayout);
        datosPR_pnlLayout.setHorizontalGroup(
            datosPR_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosPR_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datosPR_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(datosPR_pnlLayout.createSequentialGroup()
                        .addGroup(datosPR_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(codPR_lbl))
                        .addGap(28, 28, 28)
                        .addGroup(datosPR_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(datosPR_pnlLayout.createSequentialGroup()
                                .addComponent(idTA_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel2)
                                .addGap(50, 50, 50)
                                .addComponent(estadoTA_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nomTA_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(datosPR_pnlLayout.createSequentialGroup()
                        .addGroup(datosPR_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGroup(datosPR_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(datosPR_pnlLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fechainiTA_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(fechafinTA_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(datosPR_pnlLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(proyectoTA_txt))
                            .addGroup(datosPR_pnlLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(usuarioTA_txt)))))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        datosPR_pnlLayout.setVerticalGroup(
            datosPR_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosPR_pnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(datosPR_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codPR_lbl)
                    .addComponent(idTA_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(estadoTA_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(datosPR_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(nomTA_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(datosPR_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(proyectoTA_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(datosPR_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fechainiTA_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(fechafinTA_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(datosPR_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(usuarioTA_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
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
                .addComponent(listaProy_jpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(listaProy_jpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nuevaTA_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaTA_btnActionPerformed

    }//GEN-LAST:event_nuevaTA_btnActionPerformed

    private void guardarTA_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarTA_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarTA_btnActionPerformed

    private void salir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_btnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salir_btnActionPerformed

    private void idTA_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTA_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTA_txtActionPerformed

    private void buscarTA_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTA_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarTA_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarTA_btn;
    private javax.swing.JTextField buscarTA_txt;
    private javax.swing.JLabel codPR_lbl;
    private javax.swing.JPanel datosPR_pnl;
    private javax.swing.JButton editTA_btn;
    private javax.swing.JButton eliminarTA_btn;
    private javax.swing.JTextField estadoTA_txt;
    private javax.swing.JTextField fechafinTA_txt;
    private javax.swing.JTextField fechainiTA_txt;
    private javax.swing.JButton guardarTA_btn;
    private javax.swing.JTextField idTA_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollP_Proy;
    private javax.swing.JPanel listaProy_jpnl;
    private javax.swing.JTextField nomTA_txt;
    private javax.swing.JButton nuevaTA_btn;
    private javax.swing.JPanel opcionesProy_jpnl;
    private javax.swing.JTextField proyectoTA_txt;
    private javax.swing.JButton salir_btn;
    private javax.swing.JTable tareas_jTbl;
    private javax.swing.JTextField usuarioTA_txt;
    // End of variables declaration//GEN-END:variables
}
