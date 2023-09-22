/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package laboratorio05;

import javax.swing.JOptionPane;

/**
 *
 * @author mco_a
 */
public class FrameDatosEstudiante extends javax.swing.JFrame {

    private FrameListaEstudiante padre;
    private Estudiante estudianteSelec;
    private int indiceEditar;
    boolean edit = false;
    
    public FrameDatosEstudiante(){
        initComponents();
    }
    
    public FrameDatosEstudiante(
            FrameListaEstudiante padre){
        initComponents();
        this.padre = padre;
    }
    
    public FrameDatosEstudiante(FrameListaEstudiante padre, 
            Estudiante estudiante) {
        initComponents();
        this.padre = padre;
        estudianteSelec = estudiante;
        txtNombre.setText(estudianteSelec.getNombre());
        txtApellido.setText(estudianteSelec.getApellidos());
        txtDNI.setText(estudianteSelec.getDNI());
        edit = true;
    }

    
    public FrameDatosEstudiante(
            FrameListaEstudiante padre,
            int indiceEditar,
            Estudiante estudiante 
    ){
        initComponents();
        this.padre = padre;
        this.indiceEditar = indiceEditar;
        estudianteSelec = estudiante;
        
        txtNombre.setText(estudiante.getNombre());
        txtApellido.setText(estudiante.getApellidos());
        txtDNI.setText(estudiante.getDNI());
        
        edit=true;
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
        btnCancelar = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDNI = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblTítulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/Boton-Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 285, 62, 50));

        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/Boton-Guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 285, 62, 50));

        lblApellido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(0, 0, 0));
        lblApellido.setText("Apellido:");
        jPanel1.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 70, 30));

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Nombre:");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 70, 30));

        lblDNI.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDNI.setForeground(new java.awt.Color(0, 0, 0));
        lblDNI.setText("DNI:");
        jPanel1.add(lblDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 70, 30));

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido.setBorder(null);
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 156, 130, 20));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 106, 130, 20));

        txtDNI.setBackground(new java.awt.Color(255, 255, 255));
        txtDNI.setBorder(null);
        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });
        jPanel1.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 206, 130, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/TextBox.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 150, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/TextBox.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 150, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/TextBox.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 148, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/Icono-FrameDatosEstudiante.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 60, 60));

        lblTítulo.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblTítulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTítulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTítulo.setText("DATOS DE ESTUDIANTE");
        jPanel1.add(lblTítulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 190, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/Fondo-TituloFrameDatosEstudiante.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 190, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/Fondo-DatosEstudiante.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 367));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed
    
    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        
        String nombre = txtNombre.getText();
        String apellidos = txtApellido.getText();
        String DNI = txtDNI.getText();

        if (nombre.isEmpty() || apellidos.isEmpty() || DNI.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                    "Completa todos los campos");
            return; // No continuamos si los campos están vacíos
        }

        if (edit == false) {
            Estudiante estudiante = new Estudiante(
                nombre, 
                apellidos,
                DNI
            );
            this.padre.agregarEstudiante(estudiante);
        } else {
            Estudiante estudiante = new Estudiante(
                nombre, 
                apellidos,
                DNI
            );
            this.padre.editarEstudianteSeleccionado(
                    indiceEditar,
                    estudiante
            );
        }

        this.padre.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        btnGuardar.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/IMGS/AzulOscuro.png"))
        );
        btnGuardar.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        btnGuardar.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/IMGS/AzulPalido.png"))
        );
        btnGuardar.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
       
        this.dispose();
        this.padre.setVisible(true);
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        btnCancelar.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/IMGS/RojoOscuro.png"))
        );
        btnCancelar.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        btnCancelar.setIcon(new javax.swing.ImageIcon(
                getClass().getResource(
                        "/IMGS/RojoPalido.png"))
        );
        btnCancelar.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_btnCancelarMouseExited

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
            java.util.logging.Logger.getLogger(FrameDatosEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameDatosEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameDatosEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameDatosEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new FrameDatosEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
