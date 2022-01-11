package Veiculo;

public class Veiculo {
    private String marca;
    private String placa;
    private int kilometragem;
    public Veiculo(String m, String p, int k){
        marca = m;
        placa = p;
        kilometragem = k;
    }


    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getKilometragem() {
        return this.kilometragem;
    }

    public void setKilometragem(int kilometragem) {
        this.kilometragem = kilometragem;
    }

}  
