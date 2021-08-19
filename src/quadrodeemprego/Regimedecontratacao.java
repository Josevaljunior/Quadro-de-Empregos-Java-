
package quadrodeemprego;

public class Regimedecontratacao {
 private String regime;
 private String descricao;
 private String jornada;
 private String vagas;
 private String remuneracao;
 
 void setRegime(String regime){
     this.regime=regime;     
 }
 String getRegime(){
   return this.regime;
 }
  void setDescricao(String descri){
     this.descricao= descri;  
 }
 String getDescricao(){
     return this.descricao;
 }
   void setJornada(String jorn){
     this.jornada= jorn;    
 }
  String getJornada(){
      return this.jornada;
  }
   void setVagas(String vaga){
     this.vagas= vaga;   
 }
  String getVagas(){
      return this.vagas;
  }
   void setRemuneracao(String remunera){
     this.remuneracao= remunera;   
 }
  String getRemuneracao(){
      return this.remuneracao;
  }
 
}
