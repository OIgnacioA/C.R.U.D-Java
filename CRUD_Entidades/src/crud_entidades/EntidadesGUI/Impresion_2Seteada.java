
package crud_entidades.EntidadesGUI;

import crud_entidades.EntidadesDAL.conexion;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.ResultSet;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class Impresion_2Seteada extends javax.swing.JFrame {

   DefaultTableModel modelo2; 
   Integer Cant3 = 0; 

                               // C:\Users\lacab\Desktop\CRUD_JavaSQLite\Base de Datos\Entidades.db";
   

    public Impresion_2Seteada(String Data1, String Data2, String Data3, String Data4, String Datto, String busqueda) {
        initComponents();
        
        String Datta = "jdbc:sqlite:" + Datto;  
        String SqL = busqueda;
        

        String[] titulos= { Data1, Data2, Data3, Data4};
        modelo2 = new  DefaultTableModel(null, titulos);
        jTable2.setModel(modelo2);  // titulos
       
   
       //CONTENIDO________________________________________________
              
       conexion objConexion = new conexion(Datta);

        
         try {
            ResultSet Resultado = objConexion.consultarRegistros(SqL); 
            
            modelo2.setRowCount(0);
            
            
            while (Resultado.next()){//relleno de la tabla: con el next* 
           
                 Object [] oEntidadx={Resultado.getString(Data1), Resultado.getString(Data2),  Resultado.getString(Data3), Resultado.getString(Data4)};
            
                 //Cant++;
                /* Centrar el contenido de la columna   :
                     DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();         
                    tcr.setHorizontalAlignment(SwingConstants.CENTER);
                    jTable2.getColumnModel().getColumn(0).setCellRenderer(tcr);               
                     jTable2.setRowHeight(0, 100);
                 //getContentPane().add(new JScrollPane(jTable2));       
                 // jTable2.getModel().setValueAt("holas", 0, 1);               
                */
            
             jTable2.setFont(new java.awt.Font("Tahoma", 0, 10));
             
             Cant3+=1;  

            modelo2.addRow(oEntidadx);
            }
            
            
             jTextCantidad.setText(String.valueOf(Cant3));
             
           Cant3 = 0 ;
            
            objConexion.Respuesta.close();
            
        } catch (Exception e) {
            
             System.out.println("hay un error en la tabla" + e);
             
        }
       

        
      //EXTRAS________________________________________________
      
      
        
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Direccion de Entidades_C.R.U.D V3.2  By ÑAky 2021");
        
    }

  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextCantidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
        jScrollPane1.setViewportView(jTable2);

        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextCantidad.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel1.setText("Total: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(jTextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
     MessageFormat header  = new MessageFormat ("Item Report");
        
        
        try {
            
            jTable2.print(JTable.PrintMode.NORMAL, header, null );
            
            
            
        } catch (Exception e) {
        
        
        JOptionPane.showMessageDialog(rootPane, e);
        
        }
         
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

  
    
    

    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Impresion_2Seteada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextCantidad;
    // End of variables declaration//GEN-END:variables

    private void nderer(DefaultTableCellRenderer tcr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
