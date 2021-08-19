
package quadrodeemprego;

public class Vaga {
    private String nome;
    private String descricao;
    private String nomeemp;
    private String ano;
    private String ramo;
    private String regimecontr;
    private String descricaore;
    private String jornada;
    private String vagas;
    private String remuneracao;
    public Vaga(Areadeatuacao area,EmpresadaVaga empresa,Regimedecontratacao regime){
        // Vem da area de atuação
        this.nome=area.getNome();
        this.descricao=area.getDescricao();    
        // Vem da Empresa da vaga
        this.nomeemp=empresa.getNomeemp();
        this.ano=empresa.getAno();
        this.ramo=empresa.getRamo();
        //Vem do regime de contratacao
        this.regimecontr=regime.getRegime();
        this.descricaore=regime.getDescricao();
        this.jornada=regime.getJornada();
        this.vagas=regime.getVagas();
        this.remuneracao=regime.getRemuneracao();
        
    }
   // get e set do nome da função
   String getNome(){
   return this.nome;
   }
   void setNome(String novo){
   this.nome=novo;
   }
   // get e set da decrição da area de atuação
    String getDescricaoare(){
   return this.descricao;
   }
   void setDescricaoare(String novo){
   this.descricao=novo;
   }
   // get e set do nome da empresa
   String getNomedaemp(){
   return this.nomeemp;
   }
   void setNomedaemp(String novo){
    this.nomeemp=novo;
   }
    // get e set do ano
   String getAno(){
   return this.ano;
   }
   void setAno(String novo){
   this.ano=novo;
   }
    // get e set do Ramo
   String getRamo(){
   return this.ramo;
   }
   void setRamo(String novo){
       this.ramo=novo;
   }
    // get e set do Regime
   String getRegime(){
   return this.regimecontr;
   }
   void setRegime(String novo){
   this.regimecontr=novo;
   }
    // get e set da Descrição do regime
   String getDescricaoregi(){
   return this.descricaore;
   }
   void setDescricaoregi(String novo){
   this.descricaore=novo;
   }
    // get e set da Jornada
   String getJornada(){
   return this.jornada;
   }
   void setJornada(String novo){
   this.jornada=novo;
   }
   // get e set da Vaga
   String getVagas(){
   return this.vagas;
   }
   void setVagas(String novo){
   this.vagas=novo;
   }
    // get e set da Remuneração
   String getRemunera(){
   return this.remuneracao;
   }
   void setRemunera(String novo){
   this.remuneracao=novo;
   }
   
   
   
}
