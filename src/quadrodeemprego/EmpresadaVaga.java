
package quadrodeemprego;

public class EmpresadaVaga {
    private String nomedaemp;
    private String ano;
    private String ramo;
    

    
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
