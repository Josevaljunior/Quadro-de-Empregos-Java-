
public class Vaga {
 private Areadeatuacao area;
 private EmpresadaVaga empresa;
 private Regimedecontratacao regime;
 private Tipos tipos;
 private String jornada;
 private String vagas;
 private String remuneracao;

 
 public Vaga(Areadeatuacao area, EmpresadaVaga empresa,Regimedecontratacao regime,Tipos tipo, String jornada, String quantvagas,
         String remuneracao){
 this.area = area;
 this.empresa = empresa;
 this.regime = regime;
 this.setJornada(jornada);
 this.setVagas(quantvagas);
 this.setRemunera(remuneracao);
 this.tipos=tipo;
 
 }
 public void setJornada(String jornada){
this.jornada=jornada;
}
public String getJornada(){
return this.jornada;
}
public void setVagas(String vagas){
this.vagas = vagas;
}
public String getVagas(){
return this.vagas;
}
public void setRemunera(String remunera){
this.remuneracao=remunera;
}
public String getRemunera(){
return this.remuneracao;
}

//Objeto area 
public void setNome(String nome){
this.area.setNome(nome);
}
public String getNome(){
return this.area.getNome();
}
public void setArea(String area){
   this.area.setArea(area);
}
public String getArea(){
return this.area.getArea();
}
public void setDescricaoare(String descricao){
this.area.setDescricao(descricao);
}
public String getDescricaoare(){
return this.area.getDescricao();
}


//Objeto empresa
public void setNomedaemp(String nome){
this.empresa.setNomeemp(nome);
}
public String getNomedaemp(){
return this.empresa.getNomeemp();
}
public void setAno(String ano){
this.empresa.setAno(ano);
}
public String getAno(){
return this.empresa.getAno();
}
public void setRamo(String ramo){
this.empresa.setRamo(ramo);
}
public String getRamo(){
return this.empresa.getRamo();
}
//Objeto regime
public void setRegime(String regime){
this.regime.setRegime(regime);
}
public String getRegime(){
return this.regime.getRegime();
}
public void setDescricaoregi(String regime){
this.regime.setDescricao(regime);
}
public String getDescricaoregi(){
return this.regime.getDescricao();
}

//Objeto tipo
public String getDataini(){
return this.tipos.getDataInicio();
}
public String getDatafim(){
return this.tipos.getDatafim();
}

public void renova(){
int resultado=this.tipos.getTipo();;
switch(resultado){
    case 0:
    this.tipos.renovaAzul();
    break;
    case 1:
    this.tipos.renovaBronze();
    break;
    case 2:
    this.tipos.renovaPrata();
    break;
    case 3:
    this.tipos.renovaOuro();
    break; 
}
}


public String getRenova(){
return this.tipos.getRenova();
}

public String getTipo(){
return this.tipos.getTipoString();
}
}
