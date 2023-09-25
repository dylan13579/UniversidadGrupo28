
package universidadgrupo28.Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadgrupo28.AccesoADatos.AlumnoData;
import universidadgrupo28.AccesoADatos.InscripcionData;
import universidadgrupo28.AccesoADatos.MateriaData;

import universidadgrupo28.Entidades.Alumno;
import universidadgrupo28.Entidades.Inscripciones;
import universidadgrupo28.Entidades.Materia;


public class FormularioInscripcion extends javax.swing.JInternalFrame {
    
    private List<Materia> listarM;
    private List<Alumno> listarA;
    
    
    private InscripcionData insData;
    private MateriaData matData;
    private AlumnoData aluData;
    
    
    private DefaultTableModel modelo;
    
    
    
    public FormularioInscripcion() {
        initComponents();
          
        aluData = new AlumnoData();
        listarA = aluData.listarAlumnos();
        modelo = new DefaultTableModel();
        insData = new InscripcionData();
        matData = new MateriaData();
        
        
        cargarAlumno();
        armarTabla();
        
        
        jbAnularIns.setEnabled(false);
        jbInscribir.setEnabled(false);
        jrbNoInscriptas.setSelected(false);
        
  
      
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
        jrbInscriptas = new javax.swing.JRadioButton();
        jrbNoInscriptas = new javax.swing.JRadioButton();
        jbInscribir = new javax.swing.JButton();
        jbAnularIns = new javax.swing.JButton();
        jbSalirInsc = new javax.swing.JButton();
        jcbAlumno = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Formulario de Inscripcion");

        jLabel1.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel1.setText("Seleccione un alumno:");

        jLabel2.setFont(new java.awt.Font("Californian FB", 1, 20)); // NOI18N
        jLabel2.setText("Inscripciones");

        jLabel3.setFont(new java.awt.Font("Californian FB", 1, 20)); // NOI18N
        jLabel3.setText("Lista de Materia");

        jrbInscriptas.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jrbInscriptas.setText("Materias Inscriptas");
        jrbInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInscriptasActionPerformed(evt);
            }
        });

        jrbNoInscriptas.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jrbNoInscriptas.setText("Materias no Inscriptas");
        jrbNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNoInscriptasActionPerformed(evt);
            }
        });

        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbAnularIns.setText("Anular Inscripcion");
        jbAnularIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularInsActionPerformed(evt);
            }
        });

        jbSalirInsc.setText("Salir");
        jbSalirInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirInscActionPerformed(evt);
            }
        });

        jcbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnoActionPerformed(evt);
            }
        });

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbInscriptas)
                                .addGap(49, 49, 49)
                                .addComponent(jrbNoInscriptas)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(182, 182, 182))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jbInscribir)
                        .addGap(105, 105, 105)
                        .addComponent(jbAnularIns)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalirInsc)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbNoInscriptas)
                    .addComponent(jrbInscriptas))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbInscribir)
                    .addComponent(jbAnularIns)
                    .addComponent(jbSalirInsc))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirInscActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirInscActionPerformed

    private void jrbInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInscriptasActionPerformed
        // TODO add your handling code here:
        
        borrarFilasTabla();
        jrbNoInscriptas.setSelected(false);
        cargarDatosInscripcion();
        jbAnularIns.setEnabled(true);
        jbInscribir.setEnabled(false);
    }//GEN-LAST:event_jrbInscriptasActionPerformed

    private void jrbNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNoInscriptasActionPerformed
        // TODO add your handling code here:
        borrarFilasTabla();
        jrbInscriptas.setSelected(false);
        cargarDatosNoInscriptas();
        jbAnularIns.setEnabled(false);
        jbInscribir.setEnabled(true);
    }//GEN-LAST:event_jrbNoInscriptasActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        // TODO add your handling code here:
        
        int fSelect=jtTabla.getSelectedRow();
        
        if(fSelect != -1){
            
        Alumno a=(Alumno)jcbAlumno.getSelectedItem();
        
        int idMateria=(Integer)modelo.getValueAt(fSelect, 0);
        
        String nombreMateria =(String) modelo.getValueAt(fSelect, 1);
        
        int anio=(Integer)modelo.getValueAt(fSelect, 2);
        
        Materia m = new Materia(idMateria,nombreMateria,anio,true);
        
        Inscripciones i = new Inscripciones(a,m,0);
        insData.guardarInscripcion(i);
        
        borrarFilasTabla();
        
        }
        
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbAnularInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularInsActionPerformed
        // TODO add your handling code here:
        int fSelect=jtTabla.getSelectedRow();
        if(fSelect != -1){
            
            Alumno a= (Alumno)jcbAlumno.getSelectedItem();
            int idMateria=(Integer)modelo.getValueAt(fSelect, 0);
        
            insData.borrarIncripcion(a.getIdAlumno(), idMateria);
            borrarFilasTabla();
        }
    }//GEN-LAST:event_jbAnularInsActionPerformed

    private void jcbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbAlumnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAnularIns;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalirInsc;
    private javax.swing.JComboBox<Alumno> jcbAlumno;
    private javax.swing.JRadioButton jrbInscriptas;
    private javax.swing.JRadioButton jrbNoInscriptas;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables


    private void cargarAlumno(){
        for(Alumno item : listarA){
            jcbAlumno.addItem(item);
        }
    }
    
    private void armarTabla(){
        ArrayList<Object> fCabecera = new ArrayList<>();
        
        fCabecera.add("ID");
        fCabecera.add("Nombre");
        fCabecera.add("Año");
        
          modelo = new DefaultTableModel();
                    
        for(Object it : fCabecera){
            
            modelo.addColumn(it);
            
        }
        jtTabla.setModel(modelo);
    }
    
    


    private void borrarFilasTabla(){
        int lineas = modelo.getRowCount() - 1;

    if (lineas >= 0) { 
        for(int i = lineas -1; i >= 0 ; i--){
            modelo.removeRow(i);
        }
    }
        
    }
    
    
    private void cargarDatosNoInscriptas(){
       
         DefaultTableModel modelo = (DefaultTableModel) jtTabla.getModel();
        
        Alumno selec = (Alumno) jcbAlumno.getSelectedItem();
        
        listarM = insData.obternerMateriasNoCursadas(selec.getIdAlumno());
        
        for(Materia m : listarM){
            
            modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAnioMateria()});
        }
    }
    
    
    private void cargarDatosInscripcion(){

       Alumno selec = (Alumno) jcbAlumno.getSelectedItem();

      if(selec != null){
       List<Materia> lista = insData.obternerMateriasCursadas(selec.getIdAlumno());
       
        for (Materia m : lista) {
        modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAnioMateria()});
        
      
       }
      }
    }
   

   
    
}
