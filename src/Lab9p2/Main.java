package Lab9p2;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        
        jp_clerigo.setVisible(false);
        jp_mago.setVisible(false);
        jp_barbaro.setVisible(false);
        jp_picaro.setVisible(false);
        File archivo = new File("./Personajes");
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jp_clerigo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jt_dd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jt_inv = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jc_tipo = new javax.swing.JComboBox<>();
        jc_clase = new javax.swing.JComboBox<>();
        jp_mago = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jc_magia = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jc_tipo1 = new javax.swing.JComboBox<>();
        jp_barbaro = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jc_arma = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jt_xp = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jc_tipo2 = new javax.swing.JComboBox<>();
        jp_picaro = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jc_inst = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jt_robos = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jc_tipo3 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jt_nombre = new javax.swing.JTextField();
        jc_Raza = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jt_descripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jt_estatura = new javax.swing.JTextField();
        jLabel6peso = new javax.swing.JLabel();
        jt_Peso = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jt_edad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jc_nac = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jb_crear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jc_peliminar = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Seleccione la clase de personaje");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel3.setText("Dios o demonio en el que cree");

        jLabel6.setText("Tipo de invocacion");

        jLabel15.setText("Tipo de personaje");

        jc_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lead" }));

        javax.swing.GroupLayout jp_clerigoLayout = new javax.swing.GroupLayout(jp_clerigo);
        jp_clerigo.setLayout(jp_clerigoLayout);
        jp_clerigoLayout.setHorizontalGroup(
            jp_clerigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_clerigoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_clerigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jt_dd, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jt_inv)
                    .addComponent(jLabel15)
                    .addComponent(jc_tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jp_clerigoLayout.setVerticalGroup(
            jp_clerigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_clerigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jt_dd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jt_inv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jc_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel1.add(jp_clerigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        jc_clase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clerigo", "Barbaro", "Mago", "Picaro" }));
        jc_clase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_claseActionPerformed(evt);
            }
        });
        jPanel1.add(jc_clase, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 171, -1));

        jLabel10.setText("Tipo de Magia");

        jc_magia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mago Blanco", "Mago negro", "Mago Sanador" }));
        jc_magia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_magiaActionPerformed(evt);
            }
        });

        jLabel16.setText("Tipo de personaje");

        jc_tipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Support", "Tank" }));

        javax.swing.GroupLayout jp_magoLayout = new javax.swing.GroupLayout(jp_mago);
        jp_mago.setLayout(jp_magoLayout);
        jp_magoLayout.setHorizontalGroup(
            jp_magoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_magoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_magoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addComponent(jc_magia, 0, 206, Short.MAX_VALUE)
                    .addComponent(jLabel16)
                    .addComponent(jc_tipo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jp_magoLayout.setVerticalGroup(
            jp_magoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_magoLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jc_magia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jc_tipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jp_mago, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 71, 350, 210));

        jLabel11.setText("Tipo de arma");

        jc_arma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pesada", "Ligera", "Escudo" }));

        jLabel12.setText("Nivel de XP");

        jLabel17.setText("Tipo de personaje");

        jc_tipo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lead", "Support", "Offensive" }));

        javax.swing.GroupLayout jp_barbaroLayout = new javax.swing.GroupLayout(jp_barbaro);
        jp_barbaro.setLayout(jp_barbaroLayout);
        jp_barbaroLayout.setHorizontalGroup(
            jp_barbaroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_barbaroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_barbaroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11)
                    .addComponent(jc_arma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addComponent(jt_xp, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jLabel17)
                    .addComponent(jc_tipo2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jp_barbaroLayout.setVerticalGroup(
            jp_barbaroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_barbaroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jc_arma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jt_xp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jc_tipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jp_barbaro, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 68, 350, 210));

        jLabel13.setText("Tipo de instrumento ");

        jc_inst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amuleto", "Arma", "Piedra Antigua" }));

        jLabel14.setText("Cantidad de robos exitosos realizados");

        jLabel18.setText("Tipo de personaje");

        jc_tipo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Spammer", "Tank" }));

        javax.swing.GroupLayout jp_picaroLayout = new javax.swing.GroupLayout(jp_picaro);
        jp_picaro.setLayout(jp_picaroLayout);
        jp_picaroLayout.setHorizontalGroup(
            jp_picaroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_picaroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_picaroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jc_inst, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jt_robos)
                    .addComponent(jLabel18)
                    .addComponent(jc_tipo3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jp_picaroLayout.setVerticalGroup(
            jp_picaroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_picaroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jc_inst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jt_robos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jc_tipo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jp_picaro, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 71, 360, 210));

        jLabel2.setText("Descripcion:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 180, -1));
        jPanel1.add(jt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 160, -1));

        jc_Raza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mediano", "Enano", "Elfo", "Humano" }));
        jPanel1.add(jc_Raza, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 160, -1));

        jLabel4.setText("Seleccione la raza de su personaje:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 190, -1));
        jPanel1.add(jt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 160, -1));

        jLabel5.setText("Estatura:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 180, -1));
        jPanel1.add(jt_estatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 160, -1));

        jLabel6peso.setText("Peso:");
        jPanel1.add(jLabel6peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 180, -1));
        jPanel1.add(jt_Peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 160, -1));

        jLabel7.setText("Edad:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 180, -1));
        jPanel1.add(jt_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 160, -1));

        jLabel8.setText("Nombre:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 60, -1));

        jc_nac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Norfair", "Brinstar", "Maridia", "Zebes", "Crateria" }));
        jPanel1.add(jc_nac, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 200, -1));

        jLabel9.setText("Nacionalidad:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 80, -1));

        jb_crear.setText("Crear");
        jb_crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearMouseClicked(evt);
            }
        });
        jPanel1.add(jb_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        jTabbedPane1.addTab("Crear Personajes", jPanel1);

        jLabel20.setText("Seleccione un Personaje");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ver atributos de un personaje", jPanel3);

        jLabel19.setText("Seleccionar Personaje que desea Eliminar");

        jc_peliminar.setToolTipText("");
        jScrollPane1.setViewportView(jc_peliminar);

        jButton1.setText("Eliminar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jButton1)))
                .addContainerGap(175, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar personajes", jPanel4);

        jLabel21.setText("Seleccione Modo de Juego");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(229, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 232, 232))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(337, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Combate", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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

    private void jc_claseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc_claseActionPerformed
        // TODO add your handling code here:
        String clase = jc_clase.getSelectedItem().toString();
        if (clase.equals("Clerigo")) {
        jp_clerigo.setVisible(true);    
        jp_mago.setVisible(false);
        jp_barbaro.setVisible(false);
        jp_picaro.setVisible(false);
            
        }
        if (clase.equals("Barbaro")) {
            jp_barbaro.setVisible(true);
            jp_clerigo.setVisible(false);
        jp_mago.setVisible(false);
       
        jp_picaro.setVisible(false);
        }
        
        if (clase.equals("Mago")) {
            jp_mago.setVisible(true);
            jp_clerigo.setVisible(false);
        
        jp_barbaro.setVisible(false);
        jp_picaro.setVisible(false);
        }
        if (clase.equals("Picaro")) {
            jp_picaro.setVisible(true);
            jp_clerigo.setVisible(false);
        jp_mago.setVisible(false);
        jp_barbaro.setVisible(false);
        
        }
    }//GEN-LAST:event_jc_claseActionPerformed

    private void jc_magiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc_magiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jc_magiaActionPerformed

    private void jb_crearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearMouseClicked
        // TODO add your handling code here:,,
        String dios,invocacion,magia,arma,instrumento,tipo;
        int xp=0,robos =0;
        String clase = jc_clase.getSelectedItem().toString();
        String nombre = jt_nombre.getText();
        String raza = jc_Raza.getSelectedItem().toString();
        int estatura = Integer.parseInt(jt_estatura.getText());
        int peso = Integer.parseInt(jt_Peso.getText());
        int edad= Integer.parseInt(jt_edad.getText());
        int hp=0 ,ac = 0;
        String descripcion = jt_descripcion.getText();
        String nacionalidad = jc_nac.getSelectedItem().toString();
        
         if (clase.equals("Clerigo")) {
             dios = jt_dd.getText();
             invocacion = jt_inv.getText();
             tipo = jc_tipo.getSelectedItem().toString();
             Personajes.add(new Clerigo(dios, invocacion, nombre, raza, estatura, peso, edad, hp, descripcion, nacionalidad,tipo,ac));
             
         }
         if (clase.equals("Barbaro")) {
             arma = jc_arma.getSelectedItem().toString();
             tipo = jc_tipo2.getSelectedItem().toString();
             xp = Integer.parseInt(jt_xp.getText());
             Personajes.add(new Barbaro(arma, xp, nombre, raza, estatura, peso, edad, hp, descripcion, nacionalidad, tipo, ac));
             
         }
         if (clase.equals("Mago")) {
             magia = jc_magia.getSelectedItem().toString();
             tipo = jc_tipo1.getSelectedItem().toString();
             Personajes.add(new Mago(magia, nombre, raza, estatura, peso, edad, hp, descripcion, nacionalidad, tipo, ac));
         }
        if (clase.equals("Picaro")) {
             instrumento = jc_inst.getSelectedItem().toString();
             robos = Integer.parseInt(jt_robos.getText());
             tipo = jc_tipo3.getSelectedItem().toString();
             Personajes.add(new Picaro(instrumento, robos, nombre, raza, estatura, peso, edad, hp, descripcion, nacionalidad, tipo, ac));
         }
        JOptionPane.showMessageDialog(this, "Personaje Creado exitosamente");
        
        File personaje = new File("//Personajes//"+nombre+".txt");
        
    }//GEN-LAST:event_jb_crearMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
private ArrayList <Personajes> Personajes = new ArrayList();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel6peso;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jb_crear;
    private javax.swing.JComboBox<String> jc_Raza;
    private javax.swing.JComboBox<String> jc_arma;
    private javax.swing.JComboBox<String> jc_clase;
    private javax.swing.JComboBox<String> jc_inst;
    private javax.swing.JComboBox<String> jc_magia;
    private javax.swing.JComboBox<String> jc_nac;
    private javax.swing.JList<String> jc_peliminar;
    private javax.swing.JComboBox<String> jc_tipo;
    private javax.swing.JComboBox<String> jc_tipo1;
    private javax.swing.JComboBox<String> jc_tipo2;
    private javax.swing.JComboBox<String> jc_tipo3;
    private javax.swing.JPanel jp_barbaro;
    private javax.swing.JPanel jp_clerigo;
    private javax.swing.JPanel jp_mago;
    private javax.swing.JPanel jp_picaro;
    private javax.swing.JTextField jt_Peso;
    private javax.swing.JTextField jt_dd;
    private javax.swing.JTextField jt_descripcion;
    private javax.swing.JTextField jt_edad;
    private javax.swing.JTextField jt_estatura;
    private javax.swing.JTextField jt_inv;
    private javax.swing.JTextField jt_nombre;
    private javax.swing.JTextField jt_robos;
    private javax.swing.JTextField jt_xp;
    // End of variables declaration//GEN-END:variables
}
