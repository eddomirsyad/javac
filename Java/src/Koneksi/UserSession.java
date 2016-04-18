package Koneksi;
/**
 *
 * @author x
 */
public class UserSession {

    
    private static String u_username;
    private static String u_password;
    private static String u_nama;
    private static String u_phone;
    private static int u_id_pelanggan;
    private static String u_current;
    private static String u_destination;
    private static int u_jarak;
    private static int u_harga;
    private static String u_status;
    
    
    

    
    public static int getU_id_pelanggan() {
        return u_id_pelanggan;
    }

    public static void setU_id_pelanggan(int u_id_pelanggan) {
        UserSession.u_id_pelanggan = u_id_pelanggan;
    }

    public static String getU_username() {
        return u_username;
    }

    public static void setU_username(String u_username) {
        UserSession.u_username = u_username;
    }

    public static String getU_password() {
        return u_password;
    }

    public static void setU_password(String u_password) {
        UserSession.u_password = u_password;
    }

    public static String getU_nama() {
        return u_nama;
    }

    public static void setU_nama(String u_nama) {
        UserSession.u_nama = u_nama;
    }

    public static String getU_phone() {
        return u_phone;
    }

    public static void setU_phone(String u_phone) {
        UserSession.u_phone = u_phone;
    }
    
    public static String getU_current() {
        return u_current;
    }

    public static void setU_current(String u_current) {
        UserSession.u_current = u_current;
    }
    
    public static String getU_destination() {
        return u_destination;
    }

    public static void setU_destination(String u_destination) {
        UserSession.u_destination = u_destination;
    }
    
    public static int getU_jarak() {
        return u_jarak;
    }

    public static void setU_jarak(int u_jarak) {
        UserSession.u_jarak = u_jarak;
    }
    
    public static int getU_harga() {
        return u_harga;
    }

    public static void setU_harga(int u_harga) {
        UserSession.u_harga = u_harga;
    }
    
    public static String getU_status() {
        return u_status;
    }

    public static void setU_status(String u_status) {
        UserSession.u_status = u_status;
    }
}