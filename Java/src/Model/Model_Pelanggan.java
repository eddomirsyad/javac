package Model;
/**
 *
 * @author x
 */
import Controller.Controller;
import Koneksi.KoneksiDB;
import Koneksi.UserSession;
import View.FrmRide;
import View.FrmSignin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Model_Pelanggan implements Controller {
     int uid = UserSession.getU_id_pelanggan();
    String username = UserSession.getU_username();
    String password = UserSession.getU_password();
    String nama = UserSession.getU_nama();
    String phone = UserSession.getU_phone();
    String current = UserSession.getU_current();
    String destination = UserSession.getU_destination();
    int jarak = UserSession.getU_jarak();
    int harga = UserSession.getU_harga();
    String status = UserSession.getU_status();
    
    private Connection koneksi;
    private KoneksiDB db = new KoneksiDB();
    
    public void Simpan(FrmSignin frm) throws SQLException {
        //To change body of generated methods, choose Tools | Templates.
        try {
            Connection con = KoneksiDB.getKoneksi();
            String sql = "INSERT into users(username,password,nama,phone) VALUES ( ?, ?, ?, ?)";
            PreparedStatement prepare = con.prepareStatement(sql);

            prepare.setString(1, frm.txtUsername.getText());
            prepare.setString(2, frm.txtPassword.getText());
            prepare.setString(3, frm.txtNama.getText());
            prepare.setString(4, frm.txtPhone.getText());
            prepare.executeUpdate();

            JOptionPane.showMessageDialog(null, "Data Berhasil di Simpan");
            prepare.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void SimpanR(FrmRide frma) throws SQLException {
        //To change body of generated methods, choose Tools | Templates.
        try {
            Connection con = KoneksiDB.getKoneksi();
            db.koneksiDatabase(); 
            String sql = "update users set current= ?, destination = ? where id_pelanggan= " +uid ;
            //String sql = "update users set destination= ? where id_pelanggan= '" +uid ;
            PreparedStatement prepare = con.prepareStatement(sql);

            prepare.setString(1, frma.menuCurrent.getSelectedItem().toString());
            prepare.setString(2, frma.menuDestination.getSelectedItem().toString());
   
            prepare.executeUpdate();

            JOptionPane.showMessageDialog(null, "Alamat asal dan tujuan berhasil dikirm");
            prepare.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
    public void View(FrmRide frma) throws SQLException {
        //To change body of generated methods, choose Tools | Templates.
        try {
            Connection con = KoneksiDB.getKoneksi();
            db.koneksiDatabase(); 
            String sql = "select * from users" ;
            
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
