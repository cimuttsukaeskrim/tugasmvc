/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;
import com.model.model_siswa;
import com.view.table.tblmodel;
import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
public class table extends javax.swing.JFrame {
    public DefaultTableModel tblmodel;
    String header[] = {"NIS", "Nama", "Jenis Kelamin", "Jurusan"};
    
    public table() throws SQLException{
        initComponents();
        tblmodel = new DefaultTableModel(null, header);
        table.setModel((TableModel) tblmodel);
        table.setAutoResizeMode(table.AUTO_RESIZE_OFF);
        model.Tampil(this);
        setLebarKolom();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtJk = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNIS = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        btnBaru = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        rbLaki = new javax.swing.JRadioButton();
        rbPerempuan = new javax.swing.JRadioButton();
        cbJurusan = new javax.swing.JComboBox<>();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NIS :");

        jLabel2.setText("Nama :");

        txtJk.setText("Jenis Kelamin :");

        jLabel4.setText("Jurusan :");

        btnBaru.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBaru.setText("Baru");
        btnBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaruActionPerformed(evt);
            }
        });

        btnSimpan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSimpan.setText("Simpan");

        rbLaki.setText("Laki-laki");

        rbPerempuan.setText("Perempuan");

        cbJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rekayasa Perangkat Lunak", "Teknik Komputer dan Jaringan", "Multimedia", " " }));
        cbJurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJurusanActionPerformed(evt);
            }
        });

        btnUbah.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUbah.setText("Ubah");

        btnHapus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnHapus.setText("Hapus");

        btnKeluar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnKeluar.setText("Keluar");

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNama)
                                    .addComponent(txtNIS)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtJk)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbLaki)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbPerempuan))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnBaru)
                                        .addGap(49, 49, 49)
                                        .addComponent(btnSimpan)))))
                        .addGap(54, 54, 54)
                        .addComponent(btnUbah)
                        .addGap(47, 47, 47)
                        .addComponent(btnHapus)
                        .addGap(55, 55, 55)
                        .addComponent(btnKeluar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJk)
                    .addComponent(rbLaki)
                    .addComponent(rbPerempuan))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBaru)
                    .addComponent(btnSimpan)
                    .addComponent(btnUbah)
                    .addComponent(btnKeluar)
                    .addComponent(btnHapus))
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    model_siswa model = new model_siswa();
    public void setColumnWidth(int kolom){
        DefaultTableColumnModel dtcm = (DefaultTableColumnModel) table.getColumnModel();
        TableColumn kolomtabel = dtcm.getColumn(kolom);
        int lebar = 0;
        int margin = 10;
        int a;
        TableCellRenderer renderer = kolomtabel.getHeaderRenderer();
        if (renderer == null){
            renderer = table.getTableHeader().getDefaultRenderer();
            
        }
        Component komponen = renderer.getTableCellRendererComponent(table, kolomtabel.getHeaderValue(), false, false, 0, 0);
        lebar = komponen.getPreferredSize().width;
        for (a = 0; a < table.getRowCount(); a++){
            renderer = table.getCellRenderer(a, kolom);
            komponen = renderer.getTableCellRendererComponent(table, table.getValueAt(a, kolom), false, false, a, kolom);
            int lebarkolom = komponen.getPreferredSize().width;
            lebar = Math.max(lebar, lebarkolom);
        }
        lebar = lebar + margin;
        kolomtabel.setPreferredWidth(lebar);
    }
    public void setLebarKolom(){
        int a;
        for (a = 0; a < table.getColumnCount(); a++){
            setColumnWidth(a);
        }
    }
    private void cbJurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbJurusanActionPerformed

    private void btnBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBaruActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    new table().setVisible(true); 
                } catch (SQLException ex){
                Logger.getLogger(table.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        });
    }
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBaru;
    public javax.swing.JButton btnHapus;
    public javax.swing.JButton btnKeluar;
    public javax.swing.JButton btnSimpan;
    public javax.swing.JButton btnUbah;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JComboBox<String> cbJurusan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JRadioButton rbLaki;
    public javax.swing.JRadioButton rbPerempuan;
    public javax.swing.JTable table;
    public javax.swing.JLabel txtJk;
    public javax.swing.JTextField txtNIS;
    public javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables

    public class tblmodel {

        public tblmodel() {
        }
    }
}
