package Entidad;

import java.io.File;

public class Usuario {
    private int iduser;
    private String nameuser;
    private String password;
    private String idurl;



    public String getIdurl() {
        return idurl;
    }
    public void setIdurl(String idurl) {
        this.idurl = idurl;
    }
    public File getFileurl() {
        return fileurl;
    }
    public void setFileurl(File fileurl) {
        this.fileurl = fileurl;
    }
    public byte getStringtobye() {
        return stringtobye;
    }
    public void setStringtobye(byte stringtobye) {
        this.stringtobye = stringtobye;
    }
    private File fileurl;
    private byte stringtobye;

    public Usuario() {
 
    }
    public Usuario(int iduser, String nameuser, String password) {
        this.iduser = iduser;
        this.nameuser = nameuser;
        this.password = password;
    }
   
    public int getIduser() {
        return iduser;
    }
    public void setIduser(int iduser) {
        this.iduser = iduser;
    }
    public String getNameuser() {
        return nameuser;
    }
    public void setNameuser(String nameuser) {
        this.nameuser = nameuser;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    
    public Usuario(int iduser, String nameuser, String idurl, File fileurl, byte stringtobye) {
        this.iduser = iduser;
        this.nameuser = nameuser;
        this.idurl = idurl;
        this.fileurl = fileurl;
        this.stringtobye = stringtobye;
    }
    public Usuario(int iduser, String nameuser, String password, String idurl, File fileurl, byte stringtobye) {
        this.iduser = iduser;
        this.nameuser = nameuser;
        this.password = password;
        this.idurl = idurl;
        this.fileurl = fileurl;
        this.stringtobye = stringtobye;
    }
    @Override
    public String toString() {
        return "Usuario id=" + iduser + ", Nombre Usuario=" + nameuser + ", Contrasena=" + password ;
    }
    
}

