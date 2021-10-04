



public class Areadeatuacao {
    public String nome;
    public String descricao;
    public String area;

 public Areadeatuacao(String nome, String area, String descricao){
  this.setNome(nome);
  this.setDescricao(descricao);
  this.setArea(area);
}
   public void setNome(String nome){
        this.nome= nome;
    }
    String getNome(){
        return this.nome;
    }
    void setArea(String area){
      this.area= area;
    }
    String getArea(){
    return this.area;
    }
    void setDescricao(String descricao){
        this.descricao = descricao;
    }
    String getDescricao(){
        return this.descricao;
    }
   
   
}




