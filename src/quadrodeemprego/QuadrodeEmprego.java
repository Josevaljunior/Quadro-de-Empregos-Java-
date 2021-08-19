
package quadrodeemprego;
import java.util.ArrayList;
import java.util.Scanner;

public class QuadrodeEmprego {

    public static void main(String[] args) {
    ArrayList<Vaga> listadevagas = new ArrayList<>();
     String nome;
     String descript;
     String nomedaemp;
     String anodeFundacao;
     String ramo;
     int entmenu=0;
     String regime;
     String descrire;
     String jornada;
     String vagas;
     String remuneracao;
     
     
    Scanner input = new Scanner(System.in);
    int contador=0;
   
    do{
     
     System.out.println("### Mini projeto 01/Quadro de empregos ###\n "+"Digite 1 para cadastrar uma nova empresa \n"+"2 para Editar alguma empresa \n"+"3 para ver as empresas cadastradas\n"+"-1 para finalizar o programa");
     
     entmenu=input.nextInt();
     input.nextLine();
    
    //estrutura de desizão do menu
    switch(entmenu){
     case 1:
    //instaciação dos objetos
    Areadeatuacao Atuacao = new Areadeatuacao();
    EmpresadaVaga Empresa = new EmpresadaVaga();
    Regimedecontratacao Regime = new  Regimedecontratacao();
     System.out.print("Digite o nome da fução: ");
      nome = input.nextLine(); 
      
      Atuacao.setNome(nome);
      //recolhe a dedcrição da area de atuação
     System.out.print("Digite a descrição da vaga: ");
      descript=input.nextLine();
      Atuacao.setDescricao(descript);
      
     
      
     //###Isso vai para a classe Empresa da vaga####
     //recolhe a empresa da vaga
     System.out.print("Digite a empresa da vaga: ");
      nomedaemp=input.nextLine();
      Empresa.setNomeemp(nomedaemp);
      //recolhe o ano de fundação
     System.out.print("Digite o ano da fundação da empresa: ");
      anodeFundacao=input.nextLine();
      Empresa.setAno(anodeFundacao);
      //recolhe o ramo da empresa
     System.out.print("Digite o ramo da empresa da vaga: ");
      ramo=input.nextLine();
      Empresa.setRamo(ramo);
      
      
      
     //##Isso entra na classe do regime de contratação
      // recolhe regime
     System.out.print("Digite a opção de regime de contratação (CLT ou PJ): ");
      regime=input.nextLine();
      Regime.setRegime(regime);     
      // recolhe a descrição do regime
     System.out.print("Digite a descrição do regime: ");
       descrire=input.nextLine();
       Regime.setDescricao(descrire);
       // recolhe a jornada de trabalho
     System.out.print("Digite a jornada de trabalho (Em horas semanais) ");
       jornada=input.nextLine();
       Regime.setJornada(jornada);
      //recolhe a quantidade de vagas
     System.out.print("Digite a quantidade de vagas: ");
       vagas=input.nextLine();
       Regime.setVagas(vagas);
       // recolhe a remuneração
     System.out.print("Digite a remuneração: ");
       remuneracao=input.nextLine();
       Regime.setRemuneracao(remuneracao);
    
     //## instancia objeto da classe vaga que recebera os objetos das outras classes
    
      Vaga vaga = new Vaga(Atuacao,Empresa,Regime);
      QuardaVagas vagaent = new QuardaVagas();
      listadevagas.add(vaga);
      
      
      
     break;
              
    
      
      
 
     case 2:
     //verifica se o array esta vasio
     if(listadevagas.isEmpty()){
     System.out.println("Erro!! Ainda não a nem uma vaga cadastrada (Digite 1 no menu para cadastrar uma vaga)");
     break;
     }
        int entradapmetodo=0;
        int paranetropedit=0;
        System.out.println("Qual vaga voce quer edirar ?");
        for(int i=0;i<listadevagas.size();i++){
        System.out.println("Digite "+i+" para editar a vaga de "+listadevagas.get(i).getNome()); 
        }
        entradapmetodo=input.nextInt();
         System.out.println(" ");
        //aqui eu vou colocar o metodo para receber o indici da empresa que quero editar indice da empresa que quero editar
        System.out.print("Digite 0 para editar o nome da função \n"+
        "Digite 1 para editar a a descrição da vaga\n"+"Digite 2 para editar a empresa da vaga\n"+
        "Digite 3 para editar o ano da fundação da empresa:\n"+"Digite 4 para editar  o ramo da empresa da vaga\n"+
        "Digite 5 para editar a opção de regime de contratação (CLT ou PJ)\n"+"Digite 6 para editar a descrição do regime\n"+
        "Digite 7 para editar a jornada de trabalho (Em horas semanais)\n"+"Digite 8 para editar a quantidade de vagas\n"+
        "Digite 9 para editar a remuneração\n"+"Digite 10 para remover a vaga \n");
        paranetropedit = input.nextInt();
        input.nextLine();
        String novo;
        //estrutura de desizão
        switch(paranetropedit){
            case 0:  
            // aqui eu escaneio o novo parametro para dentro da variavel novo e passo como parametro para o set(é isso em todos os outrosa cases)
            System.out.println("Digite o novo nome da função: ");
            novo=input.nextLine();
            listadevagas.get(entradapmetodo).setNome(novo);
            break;
            case 1:
            System.out.println("Digite a nova descrição da vaga ");
            novo=input.nextLine();
            listadevagas.get(entradapmetodo).setDescricaoare(novo);
            break;
            case 2:
            System.out.println("Digite o novo nome da empresa da vaga ");
            novo=input.nextLine();
            listadevagas.get(entradapmetodo).setNomedaemp(novo);
            break;
            case 3:
            System.out.println("Digite o novo ano de fundação da empresa ");
            novo=input.nextLine();
            listadevagas.get(entradapmetodo).setAno(novo);
            break;
            case 4:
            System.out.println("Digite o novo ramo da empresa ");
            novo=input.nextLine();
            listadevagas.get(entradapmetodo).setRamo(novo);
            break;
            case 5:
            System.out.println("Digite a nova opção de regime de contratação (CLT ou PJ) ");
            novo=input.nextLine();
            listadevagas.get(entradapmetodo).setRegime(novo);
            break;
            case 6:
            System.out.println("Digite a nova descrição do regime ");
            novo=input.nextLine();
            listadevagas.get(entradapmetodo).setDescricaoregi(novo);
            break;
            case 7:
            System.out.println("Digite a nova jornada de trabalho (Em horas semanais)");
            novo=input.nextLine();
            listadevagas.get(entradapmetodo).setJornada(novo);
            break;
            case 8:
            System.out.println("Digite a nova quantidade de vagas ");
            novo=input.nextLine();
            listadevagas.get(entradapmetodo).setVagas(novo);
            break;
            case 9:
            System.out.println("Digite a nova remuneração ");
            novo=input.nextLine();
            listadevagas.get(entradapmetodo).setRemunera(novo);
            break;
            case 10:
            listadevagas.remove(entradapmetodo);
            System.out.println("Removido com sucesso ");
        }
        //Aqui eu vou enviar para o metodo qual dessas opções eu quero
       break;
     case 3:
     // verifica se o array esta vazio
     if(listadevagas.isEmpty()){
     System.out.println("Erro!! Ainda não a nem uma vaga cadastrada (Digite 1 no menu para cadastrar uma vaga)");
     break;
     }
         for(int i=0; i<listadevagas.size();i++){
         System.out.println("########################################");
         System.out.println("Area de atuação: "+listadevagas.get(i).getNome());
         System.out.println("Descrição da area de atuação: "+listadevagas.get(i).getDescricaoare());
         System.out.println("Nome da empresa "+listadevagas.get(i).getNomedaemp());
         System.out.println("Ano da fundação da empresa "+listadevagas.get(i).getAno());
         System.out.println("Regime de contratação: "+listadevagas.get(i).getRegime());
         System.out.println("Descrição do regime de contratação: "+listadevagas.get(i).getDescricaoare());
         System.out.println("Jornada de trabalho (Em horas semanais) "+listadevagas.get(i).getJornada());
         System.out.println("Quantidade de vagas "+listadevagas.get(i).getVagas());
         System.out.println("Remuneração: "+listadevagas.get(i).getRemunera());
         }
         break;
     default:
         if(entmenu!=-1){
         System.out.println("!!! Digite uma opção valida para o menu\n");
         break;
         }
    }
    }while(entmenu!=-1); 
    
    System.out.println("Obrigado por usar nosso programa !! :) \n"+"Feito por Murilo e Joseval");
    
    
    
   
    
   
   
     
    
    }
        
}
