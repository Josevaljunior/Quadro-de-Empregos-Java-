
public abstract class Anuncio {
public int dia;
public int mes;
public int ano;
public int tipo;
public int diasparafim;
public int diafim=0;
public int mesfim=0;
public int anofim=0;  
public String resultado;

public Anuncio(int tipo, int dia, int mes, int ano){
this.setTipo(tipo);
this.setDataIni(dia,mes,ano);
}
    
public void setDataIni(int dia, int mes, int ano){
this.dia=dia;
this.mes=mes;
this.ano=ano;
}
public void setTipo(int tipo){
this.tipo=tipo;
    }
public int getTipo(){
return this.tipo;
}
public String getTipoString(){
String resultado="";
switch(tipo){
    case 0:
    resultado="Azul";
    break;
    case 1:
    resultado="Bronze";
    break;
    case 2:
    resultado="Prata";
    break;
    case 3:
    resultado="Ouro";
    break;
}
return resultado;
}
 public String getDataInicio(){
   
   resultado=Integer.toString(dia)+"/"+Integer.toString(mes)+"/"+Integer.toString(ano);
   return resultado;
   
   } 
 
    
  public String getDatafim(){
   
   resultado=Integer.toString(diafim)+"/"+Integer.toString(mesfim)+"/"+Integer.toString(anofim);
   return resultado;
   }
public abstract void setDatafim(int duracao);


 
}
