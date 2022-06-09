package aplicacion;

import dao.DAOTienda;
import dao.exception.ErrorConectarDB;
import modelo.*;

public class TiendaJFrame extends javax.swing.JFrame {

    private Empleado user;
    private Tienda tienda;

    public TiendaJFrame(Empleado user) throws ErrorConectarDB {
        this.user = user;
        this.tienda = new Tienda();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        producto = new javax.swing.JButton();
        empleado = new javax.swing.JButton();
        compra = new javax.swing.JButton();
        venta = new javax.swing.JButton();
        cerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(400, 400));

        jPanel1.setLayout(null);

        producto.setText("Productos");
        producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoActionPerformed(evt);
            }
        });
        jPanel1.add(producto);
        producto.setBounds(0, 0, 290, 170);

        empleado.setText("empleados");
        empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadoActionPerformed(evt);
            }
        });
        jPanel1.add(empleado);
        empleado.setBounds(290, 0, 290, 170);

        compra.setText("Compra");
        jPanel1.add(compra);
        compra.setBounds(0, 180, 290, 90);

        venta.setText("Venta");
        jPanel1.add(venta);
        venta.setBounds(295, 180, 280, 90);

        cerrarSesion.setText("Cerrar sesión");
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(cerrarSesion);
        cerrarSesion.setBounds(250, 320, 100, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoActionPerformed
        try {
            //this.setVisible(false);
            ProductoJFrame productos = new ProductoJFrame(tienda);
            productos.setVisible(true);
        } catch (ErrorConectarDB ex) {

        }

    }//GEN-LAST:event_productoActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadoActionPerformed
        try {
            //this.setVisible(false);
            EmpleadoJFrame empleados = new EmpleadoJFrame(tienda);
            empleados.setVisible(true);
        } catch (ErrorConectarDB ex) {

        }
    }//GEN-LAST:event_empleadoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JButton compra;
    private javax.swing.JButton empleado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton producto;
    private javax.swing.JButton venta;
    // End of variables declaration//GEN-END:variables
}
