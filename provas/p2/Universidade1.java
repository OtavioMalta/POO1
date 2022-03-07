public class Universidade1 {

    public static void main(String[] args){
        
        Estudante1 estudantes[] = new Estudante1[6];
        estudantes[0] = new EstudanteGrad1("012.123.432-44","12411BSI382","Maria Joaquina");
        estudantes[1] = new EstudanteGrad1("231.123.222-46","12421BSI082","Jaime Palillo");
        estudantes[2] = new EstudanteGrad1("982.147.472-34","12421BSI142","Kokimoto Mishima");
        estudantes[3] = new EstudantePosGrad1("482.347.472-44","12313CCP105" ,"Cirilo Rivera");
        estudantes[4] = new EstudantePosGrad1("352.147.482-35","12213CCP055" ,"Valéria Ferreira");
        estudantes[5] = new EstudantePosGrad1("788.245.742-94","12213CCP048" ,"Helena Fernandes");

        for(Estudante1 e: estudantes ){
            System.out.println("\n----------------");
            e.informacoesEstudanteGrad();
        }

    }
}
