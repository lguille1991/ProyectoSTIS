package vista;

import controlador.ControlAcceder;
import controlador.Validaciones;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author TOSHIBA
 */
public class FrmAcceder extends javax.swing.JFrame {
    Validaciones val=new Validaciones();
    /**
     * Creates new form FrmAcceder
     */
    public FrmAcceder() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../iconos/icon.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        desktopPane = new javax.swing.JDesktopPane();
        jTxtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtPassword = new javax.swing.JPasswordField();
        jBtnIngresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTxtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtUsuarioKeyTyped(evt);
            }
        });
        desktopPane.add(jTxtUsuario);
        jTxtUsuario.setBounds(310, 70, 130, 30);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña :");
        desktopPane.add(jLabel2);
        jLabel2.setBounds(210, 130, 79, 17);

        jTxtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtPasswordKeyTyped(evt);
            }
        });
        desktopPane.add(jTxtPassword);
        jTxtPassword.setBounds(310, 130, 130, 30);

        jBtnIngresar.setText("Ingresar");
        jBtnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnIngresarMouseClicked(evt);
            }
        });
        desktopPane.add(jBtnIngresar);
        jBtnIngresar.setBounds(250, 190, 150, 40);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario :");
        desktopPane.add(jLabel1);
        jLabel1.setBounds(210, 80, 54, 17);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/user-group.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        desktopPane.add(jLabel4);
        jLabel4.setBounds(40, 50, 130, 120);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
        public void autenticacion()
        {
            ControlAcceder ca = new ControlAcceder();
            String usuario  = this.jTxtUsuario.getText();
            String clave    = this.jTxtPassword.getText();
            int idrol = ca.verificarUsuario(usuario, clave);
            if(idrol == 1)
             {
                   FrmMenu menu= new FrmMenu();
                   menu.setVisible(true);
                   this.dispose();
             }else if(idrol == 2  || idrol==3){
                 
                   FrmMenuUsuario menu= new FrmMenuUsuario();//cambiar formulario de menu 
                   menu.setVisible(true);
                   this.dispose();
             }else{
                 JOptionPane.showMessageDialog(this,"Usuario y/o Contraseña con incorrectas","Error",1);
             } 
        }
    
       
    private void jBtnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnIngresarMouseClicked
        //No permite guardar si el campo está vacío
        if(this.jTxtUsuario.getText().isEmpty() && this.jTxtPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Complete los campos requeridos", "ERROR", JOptionPane.ERROR_MESSAGE); 
       }else{ 
            autenticacion();
        }
    }//GEN-LAST:event_jBtnIngresarMouseClicked

    private void jTxtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtUsuarioKeyTyped
        // validar usuario
        val.validarUsuario(evt);
    }//GEN-LAST:event_jTxtUsuarioKeyTyped

    private void jTxtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtPasswordKeyTyped
        //validar contraseña
        val.validarContrasena(evt);
    }//GEN-LAST:event_jTxtPasswordKeyTyped

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
            java.util.logging.Logger.getLogger(FrmAcceder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAcceder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAcceder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAcceder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAcceder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jBtnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField jTxtPassword;
    private javax.swing.JTextField jTxtUsuario;
    // End of variables declaration//GEN-END:variables

}
