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
    }

     
    

