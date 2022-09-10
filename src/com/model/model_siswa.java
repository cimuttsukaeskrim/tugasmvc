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
            Jk= "Laki-laki";
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
            Baru(tb);
        } catch(Exception e){
            System.out.println(e);
        } finally {
        Tampil(tb);
    }
    }

    @Override
    public void Ubah(table tb) {
    }

    @Override
    public void Hapus(table tb) throws SQLException {
    }

    @Override
    public void Tampil(table tb) throws SQLException {
    }

    @Override
    public void Baru(table tb) throws SQLException {
        tb.txtNIS.setText("");
        tb.txtNama.setText("");
        tb.rbLaki.setSelected(true);
        tb.cbJurusan.setSelectedIndex(0);
    }

    @Override
    public void KlikTabel(table tb) throws SQLException {
    }
    
}
