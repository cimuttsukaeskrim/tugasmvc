/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;
import com.controller.controller_siswa;
import com.koneksi.koneksi;
import com.view.table;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class model_siswa implements controller_siswa{
String Jk;
    @Override
    public void Simpan(table tb) throws SQLException {
        if(tb.rbLaki.isSelected()){
            Jk = "Laki-laki";
        } else{
            Jk = "Perempuan";
        }
        try {
            Connection con = koneksi.getcon();
            String sql = "insert into tb values(?, ?, ?, ?)";
            PreparedStatement prepare = con.prepareStatement(sql);
            prepare.setString(1, tb.txtNIS.getText());
            prepare.setString(2, tb.txtNama.getText());
            prepare.setString(3, tb.txtJk.getText());
            prepare.setString(4, (String) tb.cbJurusan.getSelectedItem());
            prepare.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil diSimpan");
            prepare.close();
        } catch(Exception e){
            System.out.println(e);
        } 
    }

 
   
   
    @Override
    public void Ubah(table tb) throws SQLException {
        if (tb.rbLaki.isSelected()){
            Jk = "Laki-laki";
        } else {
            Jk = "Perempuan";
        } try {
            Connection con = koneksi.getcon();
           String sql = "UPDATE tb. SET nama=?, jenis_kelamin=?," + "jurusan=? WHERE NIS=?";
           PreparedStatement prepare = con.prepareStatement(sql);
           prepare.setString(4, tb.txtNIS.getText());
           prepare.setString(1, tb.txtNama.getText());
           prepare.setString(2, Jk);
           prepare.setString(3, (String)tb.cbJurusan.getSelectedItem());
           prepare.executeUpdate();
           JOptionPane.showMessageDialog(null, "Data Berhasil diubah");
           prepare.close();
        } catch (Exception e){
            System.out.println(e);
        }
        }

//    @Override
//   

    @Override
    public void Tampil(table tb) throws SQLException {
        try{
            Connection con = koneksi.getcon();
            Statement stt = con.createStatement();
            //Query menampilkan semua data pada tabel siswa
            //dengan urutan NIS dari kecil ke besar
            String sql ="SELECT * FROM tb ORDER BY NIS ASC";
            ResultSet res = stt.executeQuery(sql);
            while (res.next()){
                Object[] ob = new Object[8];
                ob[0] = res.getString(1);
                ob [1] = res.getString(2);
                ob [2] = res.getString(3);
                ob [3] = res.getString(4);
                tb.tblmodel.addRow(ob);
            }
        }catch (Exception e){
            System.out.println(e);
        }
           
    }

//    @Override
//    public void KlikTabel(table tb) throws SQLException {
//        try {
//            int pilih = tb.table.getSelectedRow();
//            if (pilih == -1){
//                return;
//            }
//            tb.txtNIS.setText(tb.tblmodel.getValueAt(pilih, 0).toString());
//            tb.txtNama.setText(tb.tblmodel.getValueAt(pilih, 1).toString());
//            tb.cbJurusan.setSelectedItem(tb.tblmodel.getValueAt(pilih, 3).toString());
//            Jk = String.valueOf(tb.tblmodel.getValueAt(pilih, 2));
//        } catch (Exception e){
//        }
//        //memberi nilai jk pada radio button
//        if(tb.rbLaki.getText().equalsIgnoreCase(Jk)){
//            tb.rbLaki.setSelected(true);
//        } else {
//            tb.rbPerempuan.setSelected(true);
//        }
//    }
//
//    @Override
//    public void Baru(table tb) throws SQLException {
//        tb.txtNIS.setText("");
//        tb.txtNama.setText("");
//        tb.rbLaki.setSelected(true);
//        tb.cbJurusan.setSelectedIndex(0);
//    }

    @Override
    public void Hapus(table tb) throws SQLException {
       
        try{
            Connection con = koneksi.getcon();
            String sql = "DELETE FROM tb WHERE NIS=?";
            PreparedStatement prepare = con.prepareStatement(sql);
            prepare.setString(1, tb.txtNIS.getText());
            prepare.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil diapus");
            prepare.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
    }

}

     
    

