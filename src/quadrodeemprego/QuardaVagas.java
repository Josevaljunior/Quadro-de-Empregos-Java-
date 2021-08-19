
package quadrodeemprego;

import java.util.ArrayList;

public class QuardaVagas {
    public ArrayList<Vaga> listadevagas = new ArrayList<>();
    private String retorno;
  
   
void getListadeVagas(){
    // esse for vai servir para imprimir os atributos de cada ogjeto vaga armazenado no Array list
   for(int i=0;i<this.listadevagas.size();i++){
retorno=listadevagas.get(i).getNome();
System.out.println("Area de atuação: "+retorno);
retorno=listadevagas.get(i).getDescricaoare();
System.out.println("Descrição da area de atuação: "+retorno);
retorno=listadevagas.get(i).getNomedaemp();
System.out.println("Nome da empresa: "+retorno);
retorno=listadevagas.get(i).getAno();
System.out.println("Ano de fundação da empresa: "+retorno);
retorno=listadevagas.get(i).getRegime();
System.out.println("Regime de contratação: "+retorno);
retorno=listadevagas.get(i).getDescricaoregi();
System.out.println("Descrição do regime de contratação: "+retorno);
retorno=listadevagas.get(i).getJornada();
System.out.println("Jornada de trabalho em horas semanais: "+retorno);
retorno=listadevagas.get(i).getVagas();
System.out.println("Quantidade de Vagas: "+retorno);
retorno=listadevagas.get(i).getRemunera();
System.out.println("Remuneração: "+retorno);
System.out.println("tamanho da lista");

   }
}

    
}

