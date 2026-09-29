Na classe Funcionario, se for feito nome = nome; e salario = salario; o valor sera null e não vai atualizar os atributos da classe (private String nome e private double salario). Para corrigir eu utilizei o cod this.


o método aumentarSalario está só somando o valor que existe (salario + percentual). Para resolver o aumento percentual precisa multiplicar o salário pela porcentagem (  salario = salario + (salario * percentual / 100);).

Foi necessario criar um 'private int percentual;' e criar o getter.

Na classe Main eu apenas apaguei o 'funcionario.aumentarSalario(10);' e adicionei o percentual na linha 'new Funcionario'