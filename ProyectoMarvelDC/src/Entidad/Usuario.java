package Entidad;

public class Usuario {
    private int iduser;
    private String nameuser;
    private String password;

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
    @Override
    public String toString() {
        return "Usuario id=" + iduser + ", Nombre Usuario=" + nameuser + ", Contrasena=" + password ;
    }
    
}
