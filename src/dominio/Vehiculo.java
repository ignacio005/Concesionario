package dominio;

public class Vehiculo {

    private String marca;
    private String modelo;
    private int plazas;
    private int preciobase;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPreciobase() {
        return preciobase;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

}

