
package universidadgrupo28.Vistas;

 import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import universidadgrupo28.AccesoADatos.*;
import universidadgrupo28.Entidades.Alumno;

public class FormularioAlumno extends javax.swing.JInternalFrame {

    private AlumnoData ad;

 
    public FormularioAlumno() {
        initComponents();
        
        ad=new AlumnoData();
      
        desactivarCampos();
        jbGuardar.setEnabled(false);
        jbEliminar.setEnabled(false);
        jbModificar.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtDocumento = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jrbEstado = new javax.swing.JRadioButton();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jbBuscar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();

        setTitle("Formulario de Alumnos");

        jLabel1.setFont(new java.awt.Font("Californian FB", 1, 20)); // NOI18N
        jLabel1.setText("Alumno");

        jLabel2.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel2.setText("Documento");

        jLabel3.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel5.setText("Estado");

        jLabel6.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel6.setText("Fecha de Nacimiento");

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo28/Imagenes/search_find_lupa_21889.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo28/Imagenes/male-user-add_25347.png"))); // NOI18N
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo28/Imagenes/trash_empty_14645.png"))); // NOI18N
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo28/Imagenes/savedisk_floppydisk_guardar_1543.png"))); // NOI18N
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo28/Imagenes/cancellationbutton_exitneartheaction_botondecancelacion_salida_6335.png"))); // NOI18N
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo28/Imagenes/edit_pencil_6320.png"))); // NOI18N
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbEstado)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtApellido)
                                            .addComponent(jtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                                        .addGap(12, 12, 12)
                                        .addComponent(jbBuscar))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(42, 42, 42)
                                .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jbNuevo)
                        .addGap(28, 28, 28)
                        .addComponent(jbEliminar)
                        .addGap(38, 38, 38)
                        .addComponent(jbGuardar)
                        .addGap(29, 29, 29)
                        .addComponent(jbModificar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jbBuscar)))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jrbEstado))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbGuardar, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbNuevo)
                            .addComponent(jbSalir))))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        
         
        try{
            
               int dni=Integer.parseInt(jtDocumento.getText());
               Alumno estu=ad.buscarAlumnoPorDni(dni);
               if(estu != null){
                    jtApellido.setText(estu.getApellido());
                    jtNombre.setText(estu.getNombre());
                    jrbEstado.setSelected(estu.isEstado());
                    jdcFecha.setDate(Date.valueOf(estu.getFechaNac()));
                    
              activarCampos();
               jbEliminar.setEnabled(true);
                 jbGuardar.setEnabled(false);
                 jbModificar.setEnabled(true);
               }else{
                   limpiar();
                    activarCampos();
                     desactivarCampos();
                     
              
            
                   
               }
                
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Debe ingresar el documneto");
            jtDocumento.requestFocus();
            limpiar();
            desactivarCampos();
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
         activarCampos();
         limpiar();
         jtDocumento.requestFocus();
         jbEliminar.setEnabled(false);
         jbNuevo.setEnabled(false);
         jbGuardar.setEnabled(true);
         jtDocumento.setText("");
        
        
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
        
                      
    try {

        int dni = Integer.parseInt(jtDocumento.getText());
        Alumno estu=ad.buscarAlumnoPorDni(dni);
        if (estu !=null) {
             
            jtDocumento.setText(String.valueOf(estu.getDni()));
            jtApellido.setText(estu.getApellido());
            jtNombre.setText(estu.getNombre());
            jrbEstado.setSelected(estu.isEstado());
            jdcFecha.setDate(Date.valueOf(estu.getFechaNac()));
            
 
            ad.eliminarAlumnoPorDni(dni);   
        }
        limpiar();
        desactivarCampos();
        jbEliminar.setEnabled(false);
        jbModificar.setEnabled(false);
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "DNI invalido");
        limpiar();
        desactivarCampos();
        jbNuevo.setEnabled(true);
    }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        
       Alumno alu=new Alumno();
       try{
           
        int dni=Integer.parseInt(jtDocumento.getText());
        String apellido=jtApellido.getText();
        String nombre=jtNombre.getText();
        boolean estado=jrbEstado.isSelected();
       LocalDate fechaNac = jdcFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
       
        
        alu.setDni(dni);
        alu.setApellido(apellido);
        alu.setNombre(nombre);
        alu.setEstado(estado);
        alu.setFechaNac(fechaNac);
        
        
        ad.guardarAlumno(alu);
        
         limpiar(); 
         desactivarCampos();
         jbNuevo.setEnabled(true);
          jbGuardar.setEnabled(false);
 
          
        
          
        }catch(NumberFormatException a){
        JOptionPane.showMessageDialog(this, "No puede dejar campos vacios");
            
        }
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
          dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // TODO add your handling code here:
        
         try {
        int dni = Integer.parseInt(jtDocumento.getText());
        String apellido = jtApellido.getText();
        String nombre = jtNombre.getText();
        boolean estado = jrbEstado.isSelected();
        LocalDate fechaNac = jdcFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

       
        Alumno alu = ad.buscarAlumnoPorDni(dni); 

        if (alu == null) {
      
            alu = new Alumno(dni, apellido, nombre, fechaNac, estado);
            ad.guardarAlumno(alu);
        } else {
            alu.setApellido(apellido);
            alu.setNombre(nombre);
            alu.setFechaNac(fechaNac);
            ad.modificarAlumno(alu);
            
            limpiar(); 
        desactivarCampos();
         jbModificar.setEnabled(false);
         jbEliminar.setEnabled(false);
        }

        
        
        jbNuevo.setEnabled(true);
        jbGuardar.setEnabled(false);
        
          
    } catch (NumberFormatException a) {
        JOptionPane.showMessageDialog(this, "No puede dejar campos vacíos o ingresó un DNI inválido.");
    } 
    }//GEN-LAST:event_jbModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDocumento;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables


private void desactivarCampos(){
        jtApellido.setEnabled(false);
        jtNombre.setEnabled(false);
        jrbEstado.setEnabled(false);
        jdcFecha.setEnabled(false);
    }
    
    private void activarCampos (){
        jtDocumento.setEnabled(true);
        jtApellido.setEnabled(true);
        jtNombre.setEnabled(true);
        jrbEstado.setEnabled(true);
        jdcFecha.setEnabled(true);
    }
    
    public void limpiar(){
        jtDocumento.setText("");
        jtApellido.setText("");
        jtNombre.setText("");
        jrbEstado.setSelected(false);
        jdcFecha.setDate(null);
       
       
    }



}
