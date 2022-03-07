public class Universidade {

    public static void main(String[] args){
        EstudanteGrad g1 = new EstudanteGrad("012.123.432-44","12411BSI382","Maria Joaquina");
        EstudanteGrad g2 = new EstudanteGrad("231.123.222-46","12421BSI082","Jaime Palillo");
        EstudanteGrad g3 = new EstudanteGrad("982.147.472-34","12421BSI142","Kokimoto Mishima");
        EstudantePosGrad p1 = new EstudantePosGrad("482.347.472-44","12313CCP105" ,"Cirilo Rivera");
        EstudantePosGrad p2 = new EstudantePosGrad("352.147.482-35","12213CCP055" ,"Valéria Ferreira");
        EstudantePosGrad p3 = new EstudantePosGrad("788.245.742-94","12213CCP048" ,"Helena Fernandes");

        g1.informacoesEstudanteGrad(); g2.informacoesEstudanteGrad(); g3.informacoesEstudanteGrad();
        p1.informacoesEstudantePos(); p2.informacoesEstudantePos(); p3.informacoesEstudantePos();



    }
}
