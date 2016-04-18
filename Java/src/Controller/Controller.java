/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.FrmRide;
import View.FrmSignin;
import java.sql.SQLException;
 
/**
 *
 * @author x
 */
public interface Controller {
    public void Simpan(FrmSignin frm) throws SQLException; 
    public void SimpanR(FrmRide frma) throws SQLException; 
    public void View(FrmRide frma) throws SQLException; 
}
