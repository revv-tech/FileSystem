/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View;

import Model.Archivo;
import Model.Directorio;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author David Castro Holguin
 */
public class CopiarArchivo extends javax.swing.JDialog {

    /**
     * Creates new form CrearArchivo
     */
    DefaultListModel<String> modelo = new DefaultListModel<>();
    Controller.Controlador controlador;
    Archivo archivoActual;
    Directorio newPadre;

    boolean disc = false;

    Directorio dirActual;
    
    public CopiarArchivo(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
        initComponents();
        FileList.setModel(modelo);
        
    }
    
    public void llenarFileList() {
        this.nombreArchivo.setText(this.archivoActual.getNombre());
        ArrayList<Directorio> directorios = controlador.getDirectoriosDirActual(dirActual.getIdDirectorio());
        directoryURL.setText(dirActual.getRuta());
        modelo.clear();
        for (Directorio directorio : directorios) {
            modelo.addElement("[Directorio]" + directorio.getNombre());
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

        jLabel1 = new javax.swing.JLabel();
        nombreArchivo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        FileList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        directoryURL = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        btnPegar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Nombre del Archivo: ");

        nombreArchivo.setEditable(false);
        nombreArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreArchivoActionPerformed(evt);
            }
        });

        FileList.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        FileList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FileListMouseClicked(evt);
            }
        });
        FileList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FileListKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(FileList);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Ruta :");

        directoryURL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        directoryURL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directoryURLActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnPegar.setText("Pegar");
        btnPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPegarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPegar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombreArchivo))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(directoryURL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnVolver)))))
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(directoryURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnVolver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPegar)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FileListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FileListMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            String nombre = FileList.getSelectedValue();
            String[] parts = nombre.split("\\]");
            if (parts[0].contains("Directorio")) {
                dirActual = controlador.getDirPorNombre(dirActual.getIdDirectorio(), parts[1]);
                llenarFileList();
            } 
        }
    }//GEN-LAST:event_FileListMouseClicked

    private void directoryURLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directoryURLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_directoryURLActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:

        dirActual = controlador.directorios.get(dirActual.getIdDirectorioPadre());
        llenarFileList();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPegarActionPerformed
        controlador.crearArchivo(archivoActual.getNombre()+"_copia", archivoActual.getExt(), archivoActual.getContenido(), dirActual.getIdDirectorio());
        
        this.dispose();
    }//GEN-LAST:event_btnPegarActionPerformed

    private void nombreArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreArchivoActionPerformed

    private void FileListKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FileListKeyPressed
        
    }//GEN-LAST:event_FileListKeyPressed
    
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
            java.util.logging.Logger.getLogger(CopiarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CopiarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CopiarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CopiarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CopiarArchivo dialog = new CopiarArchivo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> FileList;
    private javax.swing.JButton btnPegar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField directoryURL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField nombreArchivo;
    // End of variables declaration//GEN-END:variables
}