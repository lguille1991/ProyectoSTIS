/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Validaciones;
import conexion.Conexion;
import controlador.ControlHorario;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Horario;

/**
 *
 * @author lguil
 */
public class FrmHorario extends javax.swing.JInternalFrame {
     private int editar=0;//Bandera para diferenciar si el BtnGuardar hará un INSERT o un UPDATE
    private int nuevo=0;//Bandera para determinar evitar que se ingrese el mismo registro más de una vez
    TableRowSorter tbs ;
    DefaultTableModel model;
    Validaciones val=new Validaciones();
    /**
     * Creates new form FrmHorario
     */
    public FrmHorario() {
        initComponents();
        mostrar();
    }
    
    public void insertar(){
        Horario hor = new Horario();
        ControlHorario ch = new ControlHorario();
        //String hora = this.jComboHora.getSelectedItem().toString()+":"+this.jComboMinutos.getSelectedItem().toString()+" "+this.jComboTurno.getSelectedItem().toString();
        try{
            hor.setDia(this.jComboDia.getSelectedItem().toString());
            hor.setHora(this.jComboHora.getSelectedItem().toString()+":"+this.jComboMinutos.getSelectedItem().toString()+" "+this.jComboTurno.getSelectedItem().toString());
            
            String msj=ch.agregarHorario(hor);
            JOptionPane.showMessageDialog(rootPane, msj, "Confirmación", JOptionPane.INFORMATION_MESSAGE);
            mostrar();
            limpiar();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        //System.err.println(hora);
    }
    
    public void modificar(){
        Horario hor=new Horario();
        ControlHorario ch=new ControlHorario();
        String hora = this.jComboHora.getSelectedItem().toString()+":"+this.jComboMinutos.getSelectedItem().toString()+" "+this.jComboTurno.getSelectedItem().toString();
        try{
            hor.setIdHorario(Integer.parseInt(this.jTxtCodigo.getText()));
            hor.setDia(this.jComboDia.getSelectedItem().toString());
            hor.setHora(hora);
            int SiONo=JOptionPane.showConfirmDialog(this, "Desea modificar el registro", "Modificar Horario", JOptionPane.YES_NO_OPTION);
            if(SiONo==0){
                String msj=ch.modificarHorario(hor);
                JOptionPane.showMessageDialog(rootPane, msj, "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                mostrar();
                limpiar();
            }else{
                limpiar();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }    
    }
    
    public void eliminar(){
        Horario hor = new Horario();
        ControlHorario ch=new ControlHorario();
        try{
            hor.setIdHorario(Integer.parseInt(this.jTxtCodigo.getText()));
            int SiONo=JOptionPane.showConfirmDialog(this, "Desea eliminar el registro", "Eliminar Horario", JOptionPane.YES_NO_OPTION);
            if(SiONo==0){
                String msj=ch.eliminarHorario(hor);
                JOptionPane.showMessageDialog(rootPane, msj, "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                mostrar();
                limpiar();
            }else{
                limpiar();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public DefaultTableModel mostrar(){
        String []columnas={"Código","Día","Hora"};
        Object[]obj=new Object[4];
        DefaultTableModel tabla = new DefaultTableModel(null,columnas);
        Horario hor = new Horario();
        ControlHorario ch = new ControlHorario();
        List ls;
        try{
            ls=ch.mostrarHorario();
            for(int i=0;i<ls.size();i++){
                hor=(Horario)ls.get(i);
                obj[0]=hor.getIdHorario();
                obj[1]=hor.getDia();
                obj[2]=hor.getHora();
                tabla.addRow(obj);
            }
            ls=ch.mostrarHorario();
            this.jTablaHorario.setModel(tabla);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error al mostrar datos" + e.toString());
        }
        return tabla;
    }
    
    public void limpiar(){
        this.jTxtCodigo.setText("");
        this.jTxtBusqueda.setText("");
    }
    
    public boolean habilitarInput(boolean opcion, boolean opcion2){//Habilita o deshabilita los campos del formulario
        this.jTxtBusqueda.setEnabled(opcion2);
        this.jComboDia.setEnabled(opcion);
        this.jComboHora.setEnabled(opcion);
        this.jComboMinutos.setEnabled(opcion);
        this.jComboTurno.setEnabled(opcion);
        this.jComboBuscar.setEnabled(opcion2);
        return opcion;
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
        jTxtCodigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaHorario = new javax.swing.JTable();
        BtnBuscar = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        BtnNuevo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTxtBusqueda = new javax.swing.JTextField();
        jComboDia = new javax.swing.JComboBox<>();
        jComboTurno = new javax.swing.JComboBox<>();
        jComboHora = new javax.swing.JComboBox<>();
        jComboMinutos = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBuscar = new javax.swing.JComboBox<>();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Horarios");

        jLabel2.setText("Código:");

        jLabel3.setText("Día:");

        jLabel4.setText("Hora:");

        jTxtCodigo.setEnabled(false);
        jTxtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtCodigoKeyTyped(evt);
            }
        });

        jTablaHorario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Día", "Hora"
            }
        ));
        jTablaHorario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaHorarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaHorario);

        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar.png"))); // NOI18N
        BtnBuscar.setText("Buscar");
        BtnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnBuscarMouseClicked(evt);
            }
        });

        BtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        BtnEditar.setText("Editar");
        BtnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEditarMouseClicked(evt);
            }
        });

        BtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.png"))); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnGuardarMouseClicked(evt);
            }
        });

        BtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEliminarMouseClicked(evt);
            }
        });

        BtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCancelarMouseClicked(evt);
            }
        });

        BtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar.png"))); // NOI18N
        BtnNuevo.setText("Nuevo");
        BtnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnNuevoMouseClicked(evt);
            }
        });

        jLabel5.setText("Buscar:");

        jTxtBusqueda.setEnabled(false);
        jTxtBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtBusquedaActionPerformed(evt);
            }
        });
        jTxtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxtBusquedaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtBusquedaKeyTyped(evt);
            }
        });

        jComboDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" }));

        jComboTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Turno", "A.M.", "P.M." }));

        jComboHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hora", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "12" }));

        jComboMinutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minutos", "00", "15", "30", "45" }));

        jLabel6.setText(":");

        jComboBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno", "Código", "Día", "Hora" }));
        jComboBuscar.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboDia, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28)
                        .addComponent(jComboHora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnCancelar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTxtBusqueda))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(9, 9, 9))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBuscar)
                    .addComponent(BtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEditar)
                    .addComponent(BtnEliminar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardar)
                    .addComponent(BtnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jComboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtCodigoKeyTyped
        //Validación solo números
        Character s = evt.getKeyChar();
        if(!Character.isDigit(s)){
            evt.consume();
        }
    }//GEN-LAST:event_jTxtCodigoKeyTyped

    private void BtnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBuscarMouseClicked
        habilitarInput(false,true);
    }//GEN-LAST:event_BtnBuscarMouseClicked

    private void BtnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEditarMouseClicked
        if(this.jComboDia.getSelectedItem().toString().equals("Seleccione uno") && this.jComboHora.getSelectedItem().toString().equals("Hora") && this.jComboMinutos.getSelectedItem().toString().equals("Minutos") && this.jComboTurno.getSelectedItem().toString().equals("Turno")){//No permite editar sin haber seleccionado un registro
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un registro a editar", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            habilitarInput(true,false);
            editar=1;
        }
    }//GEN-LAST:event_BtnEditarMouseClicked

    private void BtnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarMouseClicked
        if(nuevo==1 && this.jComboDia.getSelectedItem().toString().equals("Seleccione uno") && this.jComboHora.getSelectedItem().toString().equals("Hora") && this.jComboMinutos.getSelectedItem().toString().equals("Minutos") && this.jComboTurno.getSelectedItem().toString().equals("Turno")){//No permite guardar si el campo está vacío
            JOptionPane.showMessageDialog(rootPane, "Complete los campos requeridos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            if(editar==0 && nuevo==1){
                insertar();
            }else if(editar==1){
                modificar();
            }else if(nuevo==0 && this.jComboDia.getSelectedItem().toString().equals("Seleccione uno") && this.jComboHora.getSelectedItem().toString().equals("Hora") && this.jComboMinutos.getSelectedItem().toString().equals("Minutos") && this.jComboTurno.getSelectedItem().toString().equals("Turno")){
                JOptionPane.showMessageDialog(rootPane, "Clic en NUEVO para ingresar un Horario", "ERROR", JOptionPane.ERROR_MESSAGE);
            }else if(editar==0 && nuevo==0){
                JOptionPane.showMessageDialog(rootPane, "Clic en EDITAR para guardar los cambios ó en NUEVO para crear un nuevo registro", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        habilitarInput(false,false);
    }//GEN-LAST:event_BtnGuardarMouseClicked

    private void BtnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseClicked
        if(this.jComboDia.getSelectedItem().toString().equals("Seleccione uno") && this.jComboHora.getSelectedItem().toString().equals("Hora") && this.jComboMinutos.getSelectedItem().toString().equals("Minutos") && this.jComboTurno.getSelectedItem().toString().equals("Turno")){//No permite eliminar sin haber seleccionado un registro
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un registro a eliminar", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            eliminar();
        }
    }//GEN-LAST:event_BtnEliminarMouseClicked

    private void BtnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCancelarMouseClicked
        habilitarInput(false,true);
        limpiar();
    }//GEN-LAST:event_BtnCancelarMouseClicked

    private void BtnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNuevoMouseClicked
        habilitarInput(true,false);
        limpiar();
        nuevo=1;
    }//GEN-LAST:event_BtnNuevoMouseClicked

    private void jTxtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtBusquedaActionPerformed

    private void jTxtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtBusquedaKeyReleased

    }//GEN-LAST:event_jTxtBusquedaKeyReleased

    private void jTxtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtBusquedaKeyTyped
        this.jTxtBusqueda.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (jComboBuscar.getSelectedItem().equals("Código")){               
                 tbs.setRowFilter(RowFilter.regexFilter("(?i)"+jTxtBusqueda.getText(), 0));
                } else if (jComboBuscar.getSelectedItem().equals("Día")){               
                 tbs.setRowFilter(RowFilter.regexFilter("(?i)"+jTxtBusqueda.getText(), 1));
                } else if (jComboBuscar.getSelectedItem().equals("Hora")){               
                 tbs.setRowFilter(RowFilter.regexFilter("(?i)"+jTxtBusqueda.getText(), 2));
                } 
            }
        });
        DefaultTableModel tablas = mostrar();
        tbs = new TableRowSorter(tablas);
        jTablaHorario.setRowSorter(tbs);
    }//GEN-LAST:event_jTxtBusquedaKeyTyped

    private void jTablaHorarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaHorarioMouseClicked
        int fila=this.jTablaHorario.getSelectedRow();
        this.jTxtCodigo.setText(String.valueOf(this.jTablaHorario.getValueAt(fila, 0)));
        this.jComboDia.setSelectedItem(String.valueOf(this.jTablaHorario.getValueAt(fila, 1).toString()));
        this.jComboHora.setSelectedItem("Hora");
        this.jComboMinutos.setSelectedItem("Minutos");
        this.jComboTurno.setSelectedItem("Turno");
    }//GEN-LAST:event_jTablaHorarioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JComboBox<String> jComboBuscar;
    private javax.swing.JComboBox<String> jComboDia;
    private javax.swing.JComboBox<String> jComboHora;
    private javax.swing.JComboBox<String> jComboMinutos;
    private javax.swing.JComboBox<String> jComboTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaHorario;
    private javax.swing.JTextField jTxtBusqueda;
    private javax.swing.JTextField jTxtCodigo;
    // End of variables declaration//GEN-END:variables
}
