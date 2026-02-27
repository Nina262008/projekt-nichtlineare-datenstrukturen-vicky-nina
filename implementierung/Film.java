public class Film {
  
  private String name;
  private int laufzeit;
  private int preis;
  private int naechsteVorstellung;
  private int altersfreigabe;
  
  public Film (String pName, int pLaufzeit, int pPreis, int pNaechsteVorstellung, int pAltersfreigabe){
    this.name = pName;
    this.laufzeit = pLaufzeit;
    this.preis = pPreis;
    this.naechsteVorstellung = pNaechsteVorstellung;
    this.altersfreigabe = pAltersfreigabe;
    }
  
  
  public String getName(){
    return this.name;
    }
  
  public int getLaufzeit(){
    return this.laufzeit;
    }
    
  public int getPreis(){
    return this.preis;
    } 
    
  public int getNaechsteVorstellung(){
    return this.naechsteVorstellung;
    }  
  
  public int getAltersfreigabe(){
    return this.altersfreigabe;
    }
  }