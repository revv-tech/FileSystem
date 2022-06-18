/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneLayout;

/**
 *
 * @author Marco
 */
public class Explorer extends javax.swing.JFrame {

    Controller.Controlador controlador = new Controller.Controlador();
    
    boolean disc = false;
    
    /**
     * Creates new form Explorer
     */
    public Explorer() {
        initComponents();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        btnImprimirDisco.setEnabled(disc);
        btnCopiar.setEnabled(disc);
        btnEliminar.setEnabled(disc);
        btnImportar.setEnabled(disc);
        btnModArchivo.setEnabled(disc);
        btnVerPropiedades.setEnabled(disc);
        btnMover.setEnabled(disc);
        btnImportar.setEnabled(disc);
        btnExportar.setEnabled(disc);
               
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        CreateFileBtn2 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        CreateDiskBtn = new javax.swing.JButton();
        CreateDirBtn = new javax.swing.JButton();
        CreateFileBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnImprimirDisco = new javax.swing.JButton();
        directoryURL = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        FileList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        btnMover = new javax.swing.JButton();
        btnModArchivo = new javax.swing.JButton();
        btnVerPropiedades = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnImportar = new javax.swing.JButton();
        btnCopiar = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        CreateFileBtn2.setText("Crear Archivo");
        CreateFileBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateFileBtn2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(244, 244, 244));
        setName("escritorio"); // NOI18N
        setResizable(false);

        jDesktopPane1.setBackground(new java.awt.Color(102, 102, 255));

        CreateDiskBtn.setText("Crear Disco");
        CreateDiskBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateDiskBtnActionPerformed(evt);
            }
        });

        CreateDirBtn.setText("Crear Directorio");
        CreateDirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateDirBtnActionPerformed(evt);
            }
        });

        CreateFileBtn.setText("Crear Archivo");
        CreateFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateFileBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Files  System");

        btnImprimirDisco.setText("Imprimir disco");
        btnImprimirDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirDiscoActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(CreateDiskBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(CreateDirBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(CreateFileBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnImprimirDisco, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(CreateDiskBtn)
                .addGap(18, 18, 18)
                .addComponent(CreateDirBtn)
                .addGap(18, 18, 18)
                .addComponent(CreateFileBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnImprimirDisco)
                .addGap(42, 42, 42))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateDiskBtn)
                    .addComponent(CreateDirBtn)
                    .addComponent(CreateFileBtn)
                    .addComponent(jLabel1)
                    .addComponent(btnImprimirDisco))
                .addContainerGap())
        );

        directoryURL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        directoryURL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directoryURLActionPerformed(evt);
            }
        });

        FileList.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(FileList);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Ruta :");

        btnMover.setText("Mover");
        btnMover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoverActionPerformed(evt);
            }
        });

        btnModArchivo.setText("Modificar");
        btnModArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModArchivoActionPerformed(evt);
            }
        });

        btnVerPropiedades.setText("Ver Propiedades");

        btnEliminar.setText("Eliminar");

        btnImportar.setText("Importar");

        btnCopiar.setText("Copiar");

        btnExportar.setText("Exportar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVerPropiedades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImportar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCopiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(directoryURL, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(directoryURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnMover)
                        .addGap(26, 26, 26)
                        .addComponent(btnModArchivo)
                        .addGap(18, 18, 18)
                        .addComponent(btnVerPropiedades)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCopiar)
                        .addGap(18, 18, 18)
                        .addComponent(btnImportar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExportar)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CreateDiskBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateDiskBtnActionPerformed
        // TODO add your handling code here:
        CrearDisco ventana = new CrearDisco(this, true);
       
        ventana.setVisible(true);
        
        int cantSectores,tamSector;
        
        cantSectores = (Integer) ventana.cantSectores.getValue();
        tamSector = (Integer) ventana.tamSector.getValue();
       
        
        
        System.out.println(cantSectores);
        System.out.println(tamSector);
        
        //crear el disco aca
        controlador.crearDisco(tamSector, cantSectores);
        
        disc= true;
        btnImprimirDisco.setEnabled(disc);
        btnCopiar.setEnabled(disc);
        btnEliminar.setEnabled(disc);
        btnImportar.setEnabled(disc);
        btnModArchivo.setEnabled(disc);
        btnVerPropiedades.setEnabled(disc);
        btnMover.setEnabled(disc);
        btnImportar.setEnabled(disc);
        btnExportar.setEnabled(disc);
        
    }//GEN-LAST:event_CreateDiskBtnActionPerformed

    private void CreateDirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateDirBtnActionPerformed
        // TODO add your handling code here:
        
        String nombreDirectorio = JOptionPane.showInputDialog(this,"Ingrese el nombre del directorio nuevo: "); 
        System.out.println(nombreDirectorio);
        
        //aca se crea el nuevo directorio
        
        
    }//GEN-LAST:event_CreateDirBtnActionPerformed

    private void directoryURLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directoryURLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_directoryURLActionPerformed

    private void CreateFileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateFileBtnActionPerformed
        // TODO add your handling code here:
        CrearArchivo ventana = new CrearArchivo(this, true);
       
        ventana.setVisible(true);
        
        String nombre,extension,contenido;
        
        nombre = ventana.nombreArchivo.getText();
        extension = ventana.extensionArchivo.getText();
        contenido = ventana.contenidoArchivo.getText();
        
        
        System.out.println(nombre);
        System.out.println(extension);
        System.out.println(contenido);
        
        // hay que crear el archivo
        
       
    }//GEN-LAST:event_CreateFileBtnActionPerformed

    private void btnMoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMoverActionPerformed

    private void btnModArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModArchivoActionPerformed

    private void CreateFileBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateFileBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateFileBtn2ActionPerformed

    private void btnImprimirDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirDiscoActionPerformed
        // TODO add your handling code here:
        controlador.disco.toJson();
    }//GEN-LAST:event_btnImprimirDiscoActionPerformed

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
            java.util.logging.Logger.getLogger(Explorer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Explorer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Explorer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Explorer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Explorer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateDirBtn;
    private javax.swing.JButton CreateDiskBtn;
    private javax.swing.JButton CreateFileBtn;
    private javax.swing.JButton CreateFileBtn2;
    private javax.swing.JList<String> FileList;
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnImportar;
    private javax.swing.JButton btnImprimirDisco;
    private javax.swing.JButton btnModArchivo;
    private javax.swing.JButton btnMover;
    private javax.swing.JButton btnVerPropiedades;
    private javax.swing.JTextField directoryURL;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
