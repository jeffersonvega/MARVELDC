package Entidad;

import java.io.File;
import java.util.Arrays;

public class Heroes {
    int  id;
    String nombre;
    File  fileurl;
    byte[] loadFile;
    String alterego;
    String fecha;
    String nemesis;




    public Heroes(int id, File fileurl) {
        this.id = id;
        this.fileurl = fileurl;
    }
    public Heroes(int id, String nombre, File fileurl, byte[] loadFile, String alterego, String fecha, String nemesis) {
        this.id = id;
        this.nombre = nombre;
        this.fileurl = fileurl;
        this.loadFile = loadFile;
        this.alterego = alterego;
        this.fecha = fecha;
        this.nemesis = nemesis;
    }
    public Heroes(int id, String nombre, byte[] loadFile, String alterego, String fecha, String nemesis) {
        this.id = id;
        this.nombre = nombre;
        this.loadFile = loadFile;
        this.alterego = alterego;
        this.fecha = fecha;
        this.nemesis = nemesis;
    }
    public Heroes(int id, String nombre, File fileurl, String alterego, String fecha, String nemesis) {
        this.id = id;
        this.nombre = nombre;
        this.fileurl = fileurl;
        this.alterego = alterego;
        this.fecha = fecha;
        this.nemesis = nemesis;
    }
    public String getAlterego() {
        return alterego;
    }
    public void setAlterego(String alterego) {
        this.alterego = alterego;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getNemesis() {
        return nemesis;
    }
    public void setNemesis(String nemesis) {
        this.nemesis = nemesis;
    }
    public byte[] getLoadFile() {
        return loadFile;
    }
    public void setLoadFile(byte[] loadFile) {
        this.loadFile = loadFile;
    }
    public Heroes(int id, byte[] loadFile) {
        this.id = id;
        this.loadFile = loadFile;
    }
    public Heroes(byte[] loadFile) {
        this.loadFile = loadFile;
    }

    public File getFileurl() {
        return fileurl;
    }

    public void setFileurl(File fileurl) {
        this.fileurl = fileurl;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Heroes() {
    }

    public Heroes(int id, String nombre, File fileurl) {
        this.id = id;
        this.nombre = nombre;
        this.fileurl = fileurl;
    }
    @Override
    public String toString() {
        return "Heroes [alterego=" + alterego + ", fecha=" + fecha + ", fileurl=" + fileurl + ", id=" + id
                + ", loadFile=" + Arrays.toString(loadFile) + ", nemesis=" + nemesis + ", nombre=" + nombre + "]";
    }

   


    
  
    
}
