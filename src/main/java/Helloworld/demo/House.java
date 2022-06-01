package Helloworld.demo;


public class House {
    private int ID;
    private String Direccion;
    private String Propietario;
    private String Telefono;

    public House(int ID, String Direccion,String Propietario,String Telefono ) {
        this.ID = ID;
        this.Direccion = Direccion;
        this.Propietario = Propietario;
        this.Telefono = Telefono;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getPropietario() {
        return Propietario;
    }

    public void setPropietario(String propietario) {
        Propietario = propietario;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
}
