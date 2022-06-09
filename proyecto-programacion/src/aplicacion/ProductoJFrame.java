
package aplicacion;


import aplicacion.modeloTabla.*;
import dao.exception.ErrorConectarDB;
import modelo.*;


public class ProductoJFrame extends javax.swing.JFrame {

    private Tienda tienda;

    public ProductoJFrame(Tienda tienda) throws ErrorConectarDB {
        this.tienda = tienda;
        initComponents();
        cargarTabla();
    }
    
    private void cargarTabla() {
        tablaAlimentacion.setModel(new ModeloAlimentacion());
        tablaGrafica.setModel(new ModeloGrafica());
        tablaRam.setModel(new ModeloRam());
        tablaCaja.setModel(new ModeloCaja());
        tablaDiscoDuro.setModel(new ModeloDiscoDuro());
        tablaPantalla.setModel(new ModeloPantalla());
        tablaPlacaBase.setModel(new ModeloPlacaBase());
        tablaProcesador.setModel(new ModeloProcesador());
        tablaRaton.setModel(new ModeloRaton());
        tablaRefrigeracion.setModel(new ModeloRefrigeracion());
        tablaTeclado.setModel(new ModeloTeclado());
       
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Alimentacion = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaAlimentacion = new javax.swing.JTable();
        Caja = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaCaja = new javax.swing.JTable();
        DiscoDuro = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaDiscoDuro = new javax.swing.JTable();
        Grafica = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaGrafica = new javax.swing.JTable();
        Pantalla = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablaPantalla = new javax.swing.JTable();
        PlacaBase = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaPlacaBase = new javax.swing.JTable();
        Procesador = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProcesador = new javax.swing.JTable();
        Ram = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tablaRam = new javax.swing.JTable();
        Raton = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tablaRaton = new javax.swing.JTable();
        Refrigeracion = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tablaRefrigeracion = new javax.swing.JTable();
        Teclado = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tablaTeclado = new javax.swing.JTable();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setSize(new java.awt.Dimension(400, 400));

        tablaAlimentacion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tablaAlimentacion);

        javax.swing.GroupLayout AlimentacionLayout = new javax.swing.GroupLayout(Alimentacion);
        Alimentacion.setLayout(AlimentacionLayout);
        AlimentacionLayout.setHorizontalGroup(
            AlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlimentacionLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        AlimentacionLayout.setVerticalGroup(
            AlimentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlimentacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Alimentacion", Alimentacion);

        tablaCaja.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(tablaCaja);

        javax.swing.GroupLayout CajaLayout = new javax.swing.GroupLayout(Caja);
        Caja.setLayout(CajaLayout);
        CajaLayout.setHorizontalGroup(
            CajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CajaLayout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        CajaLayout.setVerticalGroup(
            CajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CajaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Caja", Caja);

        tablaDiscoDuro.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(tablaDiscoDuro);

        javax.swing.GroupLayout DiscoDuroLayout = new javax.swing.GroupLayout(DiscoDuro);
        DiscoDuro.setLayout(DiscoDuroLayout);
        DiscoDuroLayout.setHorizontalGroup(
            DiscoDuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DiscoDuroLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        DiscoDuroLayout.setVerticalGroup(
            DiscoDuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DiscoDuroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Disco duro", DiscoDuro);

        tablaGrafica.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(tablaGrafica);

        javax.swing.GroupLayout GraficaLayout = new javax.swing.GroupLayout(Grafica);
        Grafica.setLayout(GraficaLayout);
        GraficaLayout.setHorizontalGroup(
            GraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GraficaLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        GraficaLayout.setVerticalGroup(
            GraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GraficaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Grafica", Grafica);

        tablaPantalla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane8.setViewportView(tablaPantalla);

        javax.swing.GroupLayout PantallaLayout = new javax.swing.GroupLayout(Pantalla);
        Pantalla.setLayout(PantallaLayout);
        PantallaLayout.setHorizontalGroup(
            PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        PantallaLayout.setVerticalGroup(
            PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pantalla", Pantalla);

        tablaPlacaBase.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tablaPlacaBase);

        javax.swing.GroupLayout PlacaBaseLayout = new javax.swing.GroupLayout(PlacaBase);
        PlacaBase.setLayout(PlacaBaseLayout);
        PlacaBaseLayout.setHorizontalGroup(
            PlacaBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlacaBaseLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        PlacaBaseLayout.setVerticalGroup(
            PlacaBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlacaBaseLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Placa base", PlacaBase);

        tablaProcesador.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaProcesador);

        javax.swing.GroupLayout ProcesadorLayout = new javax.swing.GroupLayout(Procesador);
        Procesador.setLayout(ProcesadorLayout);
        ProcesadorLayout.setHorizontalGroup(
            ProcesadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProcesadorLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        ProcesadorLayout.setVerticalGroup(
            ProcesadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProcesadorLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Procesador", Procesador);

        tablaRam.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane12.setViewportView(tablaRam);

        javax.swing.GroupLayout RamLayout = new javax.swing.GroupLayout(Ram);
        Ram.setLayout(RamLayout);
        RamLayout.setHorizontalGroup(
            RamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RamLayout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        RamLayout.setVerticalGroup(
            RamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RamLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ram", Ram);

        tablaRaton.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane11.setViewportView(tablaRaton);

        javax.swing.GroupLayout RatonLayout = new javax.swing.GroupLayout(Raton);
        Raton.setLayout(RatonLayout);
        RatonLayout.setHorizontalGroup(
            RatonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RatonLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        RatonLayout.setVerticalGroup(
            RatonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RatonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Raton", Raton);

        tablaRefrigeracion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane10.setViewportView(tablaRefrigeracion);

        javax.swing.GroupLayout RefrigeracionLayout = new javax.swing.GroupLayout(Refrigeracion);
        Refrigeracion.setLayout(RefrigeracionLayout);
        RefrigeracionLayout.setHorizontalGroup(
            RefrigeracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RefrigeracionLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        RefrigeracionLayout.setVerticalGroup(
            RefrigeracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RefrigeracionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Refrigeracion", Refrigeracion);

        tablaTeclado.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane9.setViewportView(tablaTeclado);

        javax.swing.GroupLayout TecladoLayout = new javax.swing.GroupLayout(Teclado);
        Teclado.setLayout(TecladoLayout);
        TecladoLayout.setHorizontalGroup(
            TecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TecladoLayout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        TecladoLayout.setVerticalGroup(
            TecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TecladoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Teclado", Teclado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Alimentacion;
    private javax.swing.JPanel Caja;
    private javax.swing.JPanel DiscoDuro;
    private javax.swing.JPanel Grafica;
    private javax.swing.JPanel Pantalla;
    private javax.swing.JPanel PlacaBase;
    private javax.swing.JPanel Procesador;
    private javax.swing.JPanel Ram;
    private javax.swing.JPanel Raton;
    private javax.swing.JPanel Refrigeracion;
    private javax.swing.JPanel Teclado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tablaAlimentacion;
    private javax.swing.JTable tablaCaja;
    private javax.swing.JTable tablaDiscoDuro;
    private javax.swing.JTable tablaGrafica;
    private javax.swing.JTable tablaPantalla;
    private javax.swing.JTable tablaPlacaBase;
    private javax.swing.JTable tablaProcesador;
    private javax.swing.JTable tablaRam;
    private javax.swing.JTable tablaRaton;
    private javax.swing.JTable tablaRefrigeracion;
    private javax.swing.JTable tablaTeclado;
    // End of variables declaration//GEN-END:variables
}
