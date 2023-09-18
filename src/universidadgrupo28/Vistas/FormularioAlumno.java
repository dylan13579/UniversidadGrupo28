/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo28.Vistas;


import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;



import javax.swing.JOptionPane;
import universidadgrupo28.AccesoADatos.AlumnoData;
import universidadgrupo28.Entidades.*;





/**
 *
 * @author myria
 */
public class FormularioAlumno extends javax.swing.JInternalFrame {
private AlumnoData ad;

    /**
     * Creates new form FormularioAlumno
     */
    public FormularioAlumno() {
        ad=new AlumnoData();
        initComponents();
        desactivarCampos();
        jbGuardar.setEnabled(false);
        jbEliminar.setEnabled(false);
        
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
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jbBuscar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalirAlumno = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jrbActivo = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle(" Formulario de Alumno");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Alumno");

        jLabel2.setText("Documento");

        jLabel3.setText("Apellido");

        jLabel4.setText("Nombre");

        jLabel5.setText("Estado");

        jLabel6.setText("Fecha de Nacimiento");

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search_find_lupa_21889.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalirAlumno.setText("Salir");
        jbSalirAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirAlumnoActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jrbActivo.setText("Activo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbNuevo)
                        .addGap(30, 30, 30)
                        .addComponent(jbEliminar)
                        .addGap(32, 32, 32)
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalirAlumno))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbBuscar))
                                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jrbActivo, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                        .addComponent(jtNombre, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addComponent(jLabel1)))
                        .addGap(0, 35, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jbBuscar)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jrbActivo))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalirAlumno)
                    .addComponent(jbEliminar))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirAlumnoActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirAlumnoActionPerformed

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

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        
        try{
            
               int dni=Integer.parseInt(jtDocumento.getText());
               Alumno estu=ad.buscarAlumnoPorDni(dni);
               if(estu != null){
                    jtApellido.setText(estu.getApellido());
                    jtNombre.setText(estu.getNombre());
                    jrbActivo.setSelected(estu.isEstado());
                    jdcFecha.setDate(Date.valueOf(estu.getFechaNac()));
                    
                activarCampos();
                jbEliminar.setEnabled(true);
                
               }else{
                   limpiar();
                   desactivarCampos();
                   jbGuardar.setEnabled(false);
                   
               }
                
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Debe ingresar el documneto");
            jtDocumento.requestFocus();
            limpiar();
            desactivarCampos();
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        
        Alumno alu=new Alumno();
       try{
        int dni=Integer.parseInt(jtDocumento.getText());
        String apellido=jtApellido.getText();
        String nombre=jtNombre.getText();
        boolean estado=jrbActivo.isSelected();
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
          jbGuardar.setEnabled(true);
        
          
        }catch(NumberFormatException a){
        JOptionPane.showMessageDialog(this, "No puede dejar campos vacios");
            
        }
        
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
        
                  
    try {

        int dni = Integer.parseInt(jtDocumento.getText());
        Alumno estu=ad.buscarAlumnoPorDni(dni);
        if (estu !=null) {
             
            jtDocumento.setText(String.valueOf(estu.getDni()));
            jtApellido.setText(estu.getApellido());
            jtNombre.setText(estu.getNombre());
            jrbActivo.setSelected(estu.isEstado());
            jdcFecha.setDate(Date.valueOf(estu.getFechaNac()));
            
            
            limpiar();
            desactivarCampos();
            
           
            ad.eliminarAlumnoPorDni(dni);
        
           
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún alumno con ese DNI.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "DNI invalido");
        limpiar();
        desactivarCampos();
        jbNuevo.setEnabled(true);
    }
    }//GEN-LAST:event_jbEliminarActionPerformed


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
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalirAlumno;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JRadioButton jrbActivo;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDocumento;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables

    private void desactivarCampos(){
        jtApellido.setEnabled(false);
        jtNombre.setEnabled(false);
        jrbActivo.setEnabled(false);
        jdcFecha.setEnabled(false);
    }
    
    private void activarCampos (){
        jtDocumento.setEnabled(true);
        jtApellido.setEnabled(true);
        jtNombre.setEnabled(true);
        jrbActivo.setEnabled(true);
        jdcFecha.setEnabled(true);
    }
    
    public void limpiar(){
        jtDocumento.setText("");
        jtApellido.setText("");
        jtNombre.setText("");
        jrbActivo.setSelected(false);
        jdcFecha.setDate(null);
       
       
    }

    

    
}
