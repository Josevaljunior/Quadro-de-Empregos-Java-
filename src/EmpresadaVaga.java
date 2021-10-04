


public class EmpresadaVaga {
    private String nomedaemp;
    private String ano;
    private String ramo;
    
public EmpresadaVaga(String nomedaemp, String ano, String ramo){
this.setNomeemp(nomedaemp);
this.setAno(ano);
this.setRamo(ramo);

}
    void setNomeemp(String nome){
        this.nomedaemp= nome;
    }
    String getNomeemp(){
        return this.nomedaemp;
    }
    void setAno(String ano){
        this.ano= ano;
    }
    String getAno(){
        return this.ano;
    }
    void setRamo(String ramo){
        this.ramo=ramo;
    }
    String getRamo(){
        return this.ramo;
    }   

}
