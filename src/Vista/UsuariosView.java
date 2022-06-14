/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import DAO.EmpresasCRUD;
import DAO.UsuariosCRUD;
import java.util.List;
import Modelo.UsuariosM;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author InaRu
 */
public class UsuariosView extends javax.swing.JPanel {
 private String accion = "guardar";
 
    
    /**
     * Creates new form NewJPanel
     */
    public UsuariosView() {
        initComponents();
        mostrarU("");
        codigoU_txt.setEnabled(false);
        
    }
    
    public void verUsuario ( UsuariosM usuario){
        System.out.println("Datos del usuario:"+usuario);
    }
    
    
    
    
    public void verUsuarios(List<UsuariosM> usuarios){
        for (UsuariosM usuario:usuarios){
            System.out.println ("Datos del usuario:"+ usuario);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datosUsuario_jpnl = new javax.swing.JPanel();
        nomUsuario_txt = new javax.swing.JTextField();
        emailU_txt = new javax.swing.JTextField();
        passUsuario_txt = new javax.swing.JTextField();
        nomUser_lbl = new javax.swing.JLabel();
        emailUser_lbl = new javax.swing.JLabel();
        passUser_lbl = new javax.swing.JLabel();
        empresaU_txt = new javax.swing.JTextField();
        empresaUser_lbl = new javax.swing.JLabel();
        rol_lbl = new javax.swing.JLabel();
        roles_combo = new javax.swing.JComboBox<>();
        codigoU_lbl = new javax.swing.JLabel();
        codigoU_txt = new javax.swing.JButton();
        opcionesUser_jpnl = new javax.swing.JPanel();
        nuevoUser_btn = new javax.swing.JButton();
        editUser_btn = new javax.swing.JButton();
        eliminarUser_btn = new javax.swing.JButton();
        guardarUser_btn = new javax.swing.JButton();
        listaUser_jpnl = new javax.swing.JPanel();
        buscarUser_txt = new javax.swing.JTextField();
        buscarUser_btn = new javax.swing.JButton();
        jScrollP_Users = new javax.swing.JScrollPane();
        usuario_jTbl = new javax.swing.JTable();

        setBackground(java.awt.SystemColor.controlHighlight);
        setMaximumSize(new java.awt.Dimension(750, 550));
        setMinimumSize(new java.awt.Dimension(750, 550));
        setPreferredSize(new java.awt.Dimension(750, 550));

        datosUsuario_jpnl.setBackground(java.awt.SystemColor.controlHighlight);
        datosUsuario_jpnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 102, 204))); // NOI18N

        nomUsuario_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomUsuario_txtActionPerformed(evt);
            }
        });

        nomUser_lbl.setText("Nombre:");

        emailUser_lbl.setText("Email:");

        passUser_lbl.setText("Contraseña: ");

        empresaUser_lbl.setText("Empresa:");

        rol_lbl.setText("Rol:");

        roles_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Coordinador", "MW", "TL ( Team Leader)" }));
        roles_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roles_comboActionPerformed(evt);
            }
        });

        codigoU_lbl.setText("Codigo");

        javax.swing.GroupLayout datosUsuario_jpnlLayout = new javax.swing.GroupLayout(datosUsuario_jpnl);
        datosUsuario_jpnl.setLayout(datosUsuario_jpnlLayout);
        datosUsuario_jpnlLayout.setHorizontalGroup(
            datosUsuario_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosUsuario_jpnlLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(datosUsuario_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomUser_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rol_lbl)
                    .addComponent(emailUser_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empresaUser_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passUser_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(datosUsuario_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datosUsuario_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(emailU_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                        .addComponent(empresaU_txt)
                        .addComponent(passUsuario_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nomUsuario_txt))
                    .addGroup(datosUsuario_jpnlLayout.createSequentialGroup()
                        .addComponent(roles_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(codigoU_lbl)
                        .addGap(18, 18, 18)
                        .addComponent(codigoU_txt)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        datosUsuario_jpnlLayout.setVerticalGroup(
            datosUsuario_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosUsuario_jpnlLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(datosUsuario_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoU_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(datosUsuario_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rol_lbl)
                        .addComponent(roles_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(codigoU_lbl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(datosUsuario_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomUser_lbl)
                    .addComponent(nomUsuario_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(datosUsuario_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailU_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailUser_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(datosUsuario_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empresaU_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empresaUser_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(datosUsuario_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passUsuario_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passUser_lbl))
                .addGap(11, 11, 11))
        );

        opcionesUser_jpnl.setBackground(java.awt.SystemColor.controlHighlight);
        opcionesUser_jpnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 102, 204))); // NOI18N

        nuevoUser_btn.setBackground(new java.awt.Color(0, 153, 204));
        nuevoUser_btn.setForeground(new java.awt.Color(255, 255, 255));
        nuevoUser_btn.setText("Nuevo");
        nuevoUser_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoUser_btnActionPerformed(evt);
            }
        });

        editUser_btn.setBackground(new java.awt.Color(0, 153, 204));
        editUser_btn.setForeground(new java.awt.Color(255, 255, 255));
        editUser_btn.setText("Editar");

        eliminarUser_btn.setBackground(new java.awt.Color(0, 153, 204));
        eliminarUser_btn.setForeground(new java.awt.Color(255, 255, 255));
        eliminarUser_btn.setText("Eliminar");

        guardarUser_btn.setBackground(new java.awt.Color(0, 153, 204));
        guardarUser_btn.setForeground(new java.awt.Color(255, 255, 255));
        guardarUser_btn.setText("Guardar");
        guardarUser_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarUser_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout opcionesUser_jpnlLayout = new javax.swing.GroupLayout(opcionesUser_jpnl);
        opcionesUser_jpnl.setLayout(opcionesUser_jpnlLayout);
        opcionesUser_jpnlLayout.setHorizontalGroup(
            opcionesUser_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesUser_jpnlLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(opcionesUser_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(guardarUser_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarUser_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(editUser_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nuevoUser_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        opcionesUser_jpnlLayout.setVerticalGroup(
            opcionesUser_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesUser_jpnlLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(nuevoUser_btn)
                .addGap(18, 18, 18)
                .addComponent(editUser_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eliminarUser_btn)
                .addGap(18, 18, 18)
                .addComponent(guardarUser_btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        listaUser_jpnl.setBackground(java.awt.SystemColor.controlHighlight);
        listaUser_jpnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista usuarios:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 102, 204))); // NOI18N

        buscarUser_btn.setBackground(new java.awt.Color(0, 153, 204));
        buscarUser_btn.setForeground(new java.awt.Color(255, 255, 255));
        buscarUser_btn.setText("Buscar");
        buscarUser_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarUser_btnActionPerformed(evt);
            }
        });

        usuario_jTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Rol", "Codigo", "Nombre", "Email", "Empresa", "Contraseña"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        usuario_jTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuario_jTblMouseClicked(evt);
            }
        });
        jScrollP_Users.setViewportView(usuario_jTbl);

        javax.swing.GroupLayout listaUser_jpnlLayout = new javax.swing.GroupLayout(listaUser_jpnl);
        listaUser_jpnl.setLayout(listaUser_jpnlLayout);
        listaUser_jpnlLayout.setHorizontalGroup(
            listaUser_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listaUser_jpnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(listaUser_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollP_Users)
                    .addGroup(listaUser_jpnlLayout.createSequentialGroup()
                        .addComponent(buscarUser_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(buscarUser_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        listaUser_jpnlLayout.setVerticalGroup(
            listaUser_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaUser_jpnlLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(listaUser_jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarUser_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarUser_btn))
                .addGap(18, 18, 18)
                .addComponent(jScrollP_Users, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listaUser_jpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(datosUsuario_jpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(opcionesUser_jpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(opcionesUser_jpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datosUsuario_jpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(listaUser_jpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nomUsuario_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomUsuario_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomUsuario_txtActionPerformed

    private void nuevoUser_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoUser_btnActionPerformed
        nomUsuario_txt.setText("");
        emailU_txt.setText("");
        passUsuario_txt.setText("");
        codigoU_txt.setText("");
        empresaU_txt.setText("");
        roles_combo.setSelectedItem(null);
         
    }//GEN-LAST:event_nuevoUser_btnActionPerformed

    private void guardarUser_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarUser_btnActionPerformed
        codigoU_txt.setEnabled(false);
        
        if (nomUsuario_txt.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Debes ingresar un nombre de usuario");
            nomUsuario_txt.requestFocus();
            return;
        }
        
        if (passUsuario_txt.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Debes ingresar una contraseña para el usuario");
            passUsuario_txt.requestFocus();
            return;
        }
        
        if (empresaU_txt.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Debes ingresar una empresa para el usuario");
            empresaU_txt.requestFocus();
            return;
        }
        
        
        UsuariosM uM = new UsuariosM();
        UsuariosCRUD uC = new UsuariosCRUD();
        
        uM.setNom_usuario(nomUsuario_txt.getText());
        uM.setPass(passUsuario_txt.getText());
        uM.setRol((String) roles_combo.getSelectedItem());
        uM.setEmail(emailU_txt.getText());
        uM.setEmpresa(empresaU_txt.getText());
        
        
        if (accion.equals("guardar")) {
          if (uC.anyadirUsuario(uM)) {
                JOptionPane.showMessageDialog(null, "El cliente fue registrado satisfactoriamente");
                mostrarU("");
            }
                
        }  
        else if (accion.equals("editar")){
            uM.setIdUsuario(Integer.parseInt(codigoU_txt.getText()));
            
            if (uC.modificar(uM)) {
                JOptionPane.showMessageDialog(null, "El cliente fue Editado satisfactoriamente");
                mostrarU("");
                
            }
        }
           
           
        
    }//GEN-LAST:event_guardarUser_btnActionPerformed

    private void buscarUser_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarUser_btnActionPerformed
        mostrarU(buscarUser_txt.getText());
    }//GEN-LAST:event_buscarUser_btnActionPerformed

    private void usuario_jTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuario_jTblMouseClicked

 
        
        codigoU_txt.setEnabled(false);
        accion="Modificar";
        int fila = usuario_jTbl.rowAtPoint(evt.getPoint());
       
        codigoU_txt.setText(usuario_jTbl.getValueAt(fila, 0).toString());
        nomUsuario_txt.setText(usuario_jTbl.getValueAt(fila, 1).toString());
        passUsuario_txt.setText(usuario_jTbl.getValueAt(fila, 2).toString());
        roles_combo.setSelectedItem(usuario_jTbl.getValueAt(fila, 3).toString());
        emailU_txt.setText(usuario_jTbl.getValueAt(fila, 4).toString());
        empresaU_txt.setText(usuario_jTbl.getValueAt(fila, 5).toString());
        
        
        


       
        
    }//GEN-LAST:event_usuario_jTblMouseClicked

    private void roles_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roles_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roles_comboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarUser_btn;
    private javax.swing.JTextField buscarUser_txt;
    private javax.swing.JLabel codigoU_lbl;
    private javax.swing.JButton codigoU_txt;
    private javax.swing.JPanel datosUsuario_jpnl;
    private javax.swing.JButton editUser_btn;
    private javax.swing.JButton eliminarUser_btn;
    private javax.swing.JTextField emailU_txt;
    private javax.swing.JLabel emailUser_lbl;
    private javax.swing.JTextField empresaU_txt;
    private javax.swing.JLabel empresaUser_lbl;
    private javax.swing.JButton guardarUser_btn;
    private javax.swing.JScrollPane jScrollP_Users;
    private javax.swing.JPanel listaUser_jpnl;
    private javax.swing.JLabel nomUser_lbl;
    private javax.swing.JTextField nomUsuario_txt;
    private javax.swing.JButton nuevoUser_btn;
    private javax.swing.JPanel opcionesUser_jpnl;
    private javax.swing.JLabel passUser_lbl;
    private javax.swing.JTextField passUsuario_txt;
    private javax.swing.JLabel rol_lbl;
    private javax.swing.JComboBox<String> roles_combo;
    private javax.swing.JTable usuario_jTbl;
    // End of variables declaration//GEN-END:variables


void mostrarU(String buscar) {
        try {
            DefaultTableModel modeloU;
            UsuariosCRUD uC = new UsuariosCRUD();
            modeloU= uC.mostrar(buscar);

            usuario_jTbl.setModel(modeloU);

        } catch (Exception e) {
         
            JOptionPane.showConfirmDialog(null, e);
        }
    }



}
