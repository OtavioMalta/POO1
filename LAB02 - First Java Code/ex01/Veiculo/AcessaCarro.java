package Veiculo;

public class AcessaCarro {
    public static void main(String[] args) {
        Veiculo meuCarro = new Veiculo("Escort","XYZ-3456", 60000);
        String marca;
        int kilometragem;
        
        marca = meuCarro.getMarca();
        System.out.println(marca);
        
        kilometragem = meuCarro.getKilometragem();
        System.out.println(kilometragem);

        meuCarro.setKilometragem(1000000);
        // System.out.println(kilometragem);
        System.out.println(meuCarro.getKilometragem());
    }
}
