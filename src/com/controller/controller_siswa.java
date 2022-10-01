/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.view.table;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public interface controller_siswa {
    public void Simpan(table tb)throws SQLException;

    public void Ubah(table tb)throws SQLException;
    public void Hapus(table tb)throws SQLException;
    public void Tampil(table tb)throws SQLException;
    public void KlikTabel(table tb)throws SQLException;
    public void Baru(table tb)throws SQLException;

 
    public void Hapus(table tb) throws SQLException;

}
