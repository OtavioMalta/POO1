public class FolhaPagamento {


    public FolhaPagamento() {
    }

    public void getFolhaPagamento(Funcionario[] funcionarios){
        System.out.println("Funcioanrio \tSalario");
        for(Funcionario f : funcionarios){
            
            System.out.println(f.getNome() + "  \t"+ f.getSalario());
        }
    }
}
