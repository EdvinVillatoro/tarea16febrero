package Modelos;

public class equipo {
    String Marca;
    String Modelo;
    String Computadora;
    String Problema;

    public equipo(String Marca, String Modelo, String Computadora, String Problema) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Computadora = Computadora;
        this.Problema = Problema;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getComputadora() {
        return Computadora;
    }

    public void setComputadora(String Computadora) {
        this.Computadora = Computadora;
    }    
    
      public String getProblema() {
        return Problema;
    }
    
     public void setProblema(String Problema) {
        this.Problema = Problema;
    }    
   
}
