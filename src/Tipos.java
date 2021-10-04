
public class Tipos extends Anuncio implements  AnuncioAzul, AnuncioBronze, AnuncioPrata, AnuncioOuro{
    private int contador;
    private int duracao=0;
    private String statusRenovo;
    private String resultReno;
    
    public Tipos(int tipo, int dia, int mes, int ano){
    super(tipo, dia, mes, ano);
    this.setTipoDura(tipo);
    
    }
   public void setTipoDura(int tipo){
   switch(tipo){
       case 0:
       
       duracao=duracaotazul;
       break;
       case 1:
      
       duracao=duracaotBronze;
       break;
       case 2:
       
       duracao=duracaotPrata;
       break;
       case 3:
       
       duracao=duracaotOuro;
       
       break;
   }
   this.setDatafim(duracao);
  
   }
   
    public void renovaAzul(){
    
    }
    public void renovaBronze(){
        if(contador<1){
            this.statusRenovo="Renovado com sucesso ";
      contador++;
      switch(mes){
        case 1:
        diasparafim =  31;
        break;
        case 2:
        diasparafim =  28;
        break;
        case 3:
        diasparafim = 31;
        break;
        case 4:
        diasparafim = 30;
        break;
        case 5:
        diasparafim = 31;
        break;
        case 6:
        diasparafim = 30;
        break;
        case 7:
        diasparafim = 31;
        break;
        case 8:
        diasparafim = 31;
        break;
        case 9:
        diasparafim =  30;
        break;
        case 10:
        diasparafim = 31;
        break;
        case 11:
        diasparafim = 30;
        case 12:
        diasparafim = 31;
        break;
       }
       if(diafim+duracao>diasparafim && mesfim+1>12){
       anofim=anofim+1;
       mesfim=mesfim+1-12;
       diafim=diafim+duracao-diasparafim;
       }else{
       if(diafim+duracao>diasparafim){
       diafim=diafim+duracao-diasparafim;
       mesfim=mesfim+1;
       anofim=anofim;
       }else{
       diafim=diafim+duracao;
       mesfim=mesfim;
       anofim=anofim;
       }
       }
     
    }else{
        this.statusRenovo="Voce exedeu o limite de renovações para anuncios do tipo Bronze ";
        }
        
    }
    
    public void renovaPrata(){
    if(contador<2){
         this.statusRenovo="Renovado com sucesso ";
      contador++;
      switch(mes){
        case 1:
        diasparafim =  31;
        break;
        case 2:
        diasparafim =  28;
        break;
        case 3:
        diasparafim = 31;
        break;
        case 4:
        diasparafim = 30;
        break;
        case 5:
        diasparafim = 31;
        break;
        case 6:
        diasparafim = 30;
        break;
        case 7:
        diasparafim = 31;
        break;
        case 8:
        diasparafim = 31;
        break;
        case 9:
        diasparafim =  30;
        break;
        case 10:
        diasparafim = 31;
        break;
        case 11:
        diasparafim = 30;
        case 12:
        diasparafim = 31;
        break;
       }
       if(diafim+duracao>diasparafim && mesfim+1>12){
       anofim=anofim+1;
       mesfim=mesfim+1-12;
       diafim=diafim+duracao-diasparafim;
       }else{
       if(diafim+duracao>diasparafim){
       diafim=diafim+duracao-diasparafim;
       mesfim=mesfim+1;
       anofim=anofim;
       }else{
       diafim=diafim+duracao;
       mesfim=mesfim;
       anofim=anofim;
       }
       }
    }else{
    this.statusRenovo="Voce exedeu o limite de renovações para os Anuncios do tipo Prata ";
    }
    }
    
    public void renovaOuro(){
     if(contador<3){
            this.statusRenovo="Renovado com sucesso ";
      contador++;
      switch(mes){
        case 1:
        diasparafim =  31;
        break;
        case 2:
        diasparafim =  28;
        break;
        case 3:
        diasparafim = 31;
        break;
        case 4:
        diasparafim = 30;
        break;
        case 5:
        diasparafim = 31;
        break;
        case 6:
        diasparafim = 30;
        break;
        case 7:
        diasparafim = 31;
        break;
        case 8:
        diasparafim = 31;
        break;
        case 9:
        diasparafim =  30;
        break;
        case 10:
        diasparafim = 31;
        break;
        case 11:
        diasparafim = 30;
        case 12:
        diasparafim = 31;
        break;
       }
       if(diafim+duracao>diasparafim && mesfim+1>12){
       anofim=anofim+1;
       mesfim=mesfim+1-12;
       diafim=diafim+duracao-diasparafim;
       }else{
       if(diafim+duracao>diasparafim){
       diafim=diafim+duracao-diasparafim;
       mesfim=mesfim+1;
       anofim=anofim;
       }else{
       diafim=diafim+duracao;
       mesfim=mesfim;
       anofim=anofim;
       }
       }
    }else{
     this.statusRenovo="Voce exedeu o limite de renovações para Anuncios do tipo Ouro ";
     }
    }
    
    
    
    public String getRenova(){
    return this.statusRenovo;
    }

    public void setDatafim(int duracao){
    switch(mes){
        case 1:
        diasparafim =  31;
        break;
        case 2:
        diasparafim =  28;
        break;
        case 3:
        diasparafim = 31;
        break;
        case 4:
        diasparafim = 30;
        break;
        case 5:
        diasparafim = 31;
        break;
        case 6:
        diasparafim = 30;
        break;
        case 7:
        diasparafim = 31;
        break;
        case 8:
        diasparafim = 31;
        break;
        case 9:
        diasparafim =  30;
        break;
        case 10:
        diasparafim = 31;
        break;
        case 11:
        diasparafim = 30;
        case 12:
        diasparafim = 31;
        break;
       }
       if(dia+duracao>diasparafim && mes+1>12){
       anofim=ano+1;
       mesfim=mes+1-12;
       diafim=dia+duracao-diasparafim;
       }else{
       if(dia+duracao>diasparafim){
       diafim=dia+duracao-diasparafim;
       mesfim=mes+1;
       anofim=ano;
       }else{
       diafim=dia+duracao;
       mesfim=mes;
       anofim=ano;
       }
       }
    
    }
    
}
