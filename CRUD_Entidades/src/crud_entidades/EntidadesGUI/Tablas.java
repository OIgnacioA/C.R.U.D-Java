package crud_entidades.EntidadesGUI;

import javax.swing.table.DefaultTableModel;


public class Tablas extends javax.swing.JFrame {

    
     
   DefaultTableModel modelo;
   String  Data1,Data2,Data3,Data4, DataBase;
   String  filtro = "";
   Integer Cant = 0; 
    
      
    
    
    public Tablas(){
        
         initComponents();
         
         
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Direccion de Entidades_C.R.U.D V3.  By ÑAky 2021");
        
        
        
    }

    public String getDataBase() {
        return DataBase;
    }

    public void setDataBase(String DataBase) {
        this.DataBase = DataBase;
    }

   

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jC_Filtro = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jT_filtro = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        setForeground(new java.awt.Color(153, 153, 255));

        jComboBox1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Entidad", "Telefono", "Contacto", "Domicilio", "e_mail", "Objeto_Social", "Categoria_L15192", "Localidad", "InscripcionDGPJ2", "Actualizadas", "N_Registro_Municipal", "Numero_de_Expediente", "Decreto", "Anio_de_Actualizacion", "Archivado", "Ultima_Actualizacion", "Fecha_Inscripcion_DGPJ", "Fecha_de_fundacion", "ayuda_desarrollo_social_al_31_12_2015", "Bajas", "CP", "Certificados_Retirados", "Cierre_de_Ejercicio_Segun_Estatuto", "Cuenta_con_Bienes Desactualizadas", "Exencion", "Pagina_Web", "Seccionales", "Suspendidas", "COD", "Id" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Entidad", "Telefono", "Contacto", "Domicilio", "e_mail", "Objeto_Social", "Categoria_L15192", "Localidad", "InscripcionDGPJ2", "Actualizadas", "N_Registro_Municipal", "Numero_de_Expediente", "Decreto", "Anio_de_Actualizacion", "Archivado", "Ultima_Actualizacion", "Fecha_Inscripcion_DGPJ", "Fecha_de_fundacion", "ayuda_desarrollo_social_al_31_12_2015", "Bajas", "CP", "Certificados_Retirados", "Cierre_de_Ejercicio_Segun_Estatuto", "Cuenta_con_Bienes Desactualizadas", "Exencion", "Pagina_Web", "Seccionales", "Suspendidas", "COD", "Id" }));

        jComboBox3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Entidad", "Telefono", "Contacto", "Domicilio", "e_mail", "Objeto_Social", "Categoria_L15192", "Localidad", "InscripcionDGPJ2", "Actualizadas", "N_Registro_Municipal", "Numero_de_Expediente", "Decreto", "Anio_de_Actualizacion", "Archivado", "Ultima_Actualizacion", "Fecha_Inscripcion_DGPJ", "Fecha_de_fundacion", "ayuda_desarrollo_social_al_31_12_2015", "Bajas", "CP", "Certificados_Retirados", "Cierre_de_Ejercicio_Segun_Estatuto", "Cuenta_con_Bienes Desactualizadas", "Exencion", "Pagina_Web", "Seccionales", "Suspendidas", "COD", "Id" }));

        jComboBox4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Entidad", "Telefono", "Contacto", "Domicilio", "e_mail", "Objeto_Social", "Categoria_L15192", "Localidad", "InscripcionDGPJ2", "Actualizadas", "N_Registro_Municipal", "Numero_de_Expediente", "Decreto", "Anio_de_Actualizacion", "Archivado", "Ultima_Actualizacion", "Fecha_Inscripcion_DGPJ", "Fecha_de_fundacion", "ayuda_desarrollo_social_al_31_12_2015", "Bajas", "CP", "Certificados_Retirados", "Cierre_de_Ejercicio_Segun_Estatuto", "Cuenta_con_Bienes Desactualizadas", "Exencion", "Pagina_Web", "Seccionales", "Suspendidas", "COD", "Id" }));

        jButton1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton1.setText("Abrir formulario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel2.setText("Elección de campos: ");

        jC_Filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Entidad", "Telefono", "Contacto", "Domicilio", "e_mail", "Objeto_Social", "Categoria_L15192", "Localidad", "InscripcionDGPJ2", "Actualizadas", "N_Registro_Municipal", "Numero_de_Expediente", "Decreto", "Anio_de_Actualizacion", "Archivado", "Ultima_Actualizacion", "Fecha_Inscripcion_DGPJ", "Fecha_de_fundacion", "ayuda_desarrollo_social_al_31_12_2015", "Bajas", "CP", "Certificados_Retirados", "Cierre_de_Ejercicio_Segun_Estatuto", "Cuenta_con_Bienes Desactualizadas", "Exencion", "Pagina_Web", "Seccionales", "Suspendidas", "COD", "Id" }));
        jC_Filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC_FiltroActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel3.setText("Filtro");

        jT_filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_filtroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox3, 0, 1, Short.MAX_VALUE)
                    .addComponent(jComboBox4, 0, 1, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jT_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jC_Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jC_Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       
       Data1 = jComboBox1.getSelectedItem().toString();  
       Data2 = jComboBox2.getSelectedItem().toString();
       Data3 = jComboBox3.getSelectedItem().toString();
       Data4 = jComboBox4.getSelectedItem().toString();
       
       
       
           //---  
        String DataText =  jT_filtro.getText(); 
        String DataCombo = jC_Filtro.getSelectedItem().toString();
       //--
     
     switch (DataCombo){
     
         //SELECT * FROM Libros ORDER BY Entidad ASC
         
         case "Todos":
    
           filtro = "SELECT * FROM Entidades_BD  WHERE Entidad LIKE "+"'" + "%"+ DataText + "%" + "'" 
           + "OR Decreto LIKE "+"'" + "%"+ DataText + "%" + "'"
           + "OR Localidad LIKE "+"'" + "%"+ DataText + "%" + "'"
           + "OR Categoria_L15192 LIKE "+"'" + "%"+ DataText + "%" + "'"
           + "OR Ultima_Actualizacion LIKE "+"'" + "%"+ DataText + "%" + "'"
           + "OR InscripcionDGPJ2 LIKE "+"'" + "%"+ DataText + "%" + "'"
           + "OR Telefono LIKE "+"'" + "%"+ DataText + "%" + "'" + "ORDER BY Entidad ASC" ;
                    
           
                 
                  break;
         default:
            
            filtro = "SELECT * FROM Entidades_BD  WHERE " + DataCombo + " Like " + "'"+"%"+ DataText +"%" +"'"+ "ORDER BY Entidad ASC";
                             

                  break;
                    

    }                      
       
       
       
       
       
       
         
    Impresion_2Seteada Formulario3 =new Impresion_2Seteada( Data1,Data2,Data3,Data4,DataBase, filtro ); 
      
    Formulario3.setVisible(true); 
        
        
    
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jC_FiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC_FiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jC_FiltroActionPerformed

    private void jT_filtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_filtroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_filtroActionPerformed

   
    
    public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablas().setVisible(true);
            }
            
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jC_Filtro;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jT_filtro;
    // End of variables declaration//GEN-END:variables
}
