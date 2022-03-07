# Exercício 01

Considere as classes Universidade, EstudanteGrad, EstudantePosGrad, que sevem para controlar as informações de alunos de graduação e pós-graduação de uma universidade.

 - Analise os atributos de cada classe e faça uma generalização do código
 - Altere a classe principal para utilizar um único vetor para armazenamento das informações dos alunos de graduação e pós-graduação.

# Exercício 02
Considerando a generalização obtida no exercício anterior, faça outra generalização utilizando abstração, criando a classe "Pessoa", e reescreva as classes atuais (de estudantes e professores) para que implementem "Pessoa".

- Todos os frequentadores da Universidade devem estar vacinados. Inclua uma nova funcionalidade no sistema que permita registrar esse tipo de informação
- Crie um método abstrato gerarCertificado. A chamada desse método implica nas seguintes mensagens
   - Professor: Certifico que o <*nome do professor*> é orientador de estudantes
   - Alunos de Graduação: Certifico que o <*nome do aluno*> realiza estágio em <*local do estágio*>
   - Alunos de Pós-Graduação: Certifico que o <*nome do aluno*> participa do projeto  <*nome do projeto*>

# Exercício 03
Modifique os métodos SET de carga horária de estudantes de Graduação para verificar se o valor informado ao método é positivo e menor ou igual a 3000. Para retornar o erro, crie uma classe de exceção baseada na classe IllegalArgumentException
- Mostre na classe principal um exemplo de tratamento da exceção 

# Exercício 04
Considere a interface Senioridade. Utilize-a para as classes dos estudantes e do professor. Para comparar a senioridade entre dois estudantes/professores, use:
- Professor: o professor é sênior caso trabalhe há mais tempo na universidade (dica: usar o método compareTo() do java.util.Date)
- Estudante de graduação: um estudante é sênior caso possua mais créditos
- Estudante de pós-graduação: um estudante é sênior caso esteja cursando doutorado.
