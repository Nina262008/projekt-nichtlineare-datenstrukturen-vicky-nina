public class Verwaltung  {
  import Film;
  import java.util.Date;
  
  private Stack <Film> lzStack;
  private Stack <Film> kostenStack;
  private Stack <Film> nvStack;
  private Stack <Film> afStack;
  
  public static void traverse(BinarySearchTree<Film> pBst)
    {
        if(pBst.getLeftTree().getContent() != null)
        {
            traverse(pBst.getLeftTree());
        }
        System.out.println("Name : " + pBst.getContent().getName() + ", Laufzeit: " + pBst.getContent().getLaufzeit());
        if(pBst.getRightTree().getContent() != null)
        {
            traverse(pBst.getRightTree());
        }
    }
    
  public static void traverseRightTree(BinarySearchTree<Film> pBst) {
    if (pBst.getRightTree().getContent() != null)
        {
            traverse(pBst.getRightTree());
        }
    }
  
  
  public Stack <Film> sucheLaufzeit(int pLaufzeit){
    if (pLaufzeit <= this.getLaufzeit()) {
      traverseRightTree(BstLaufzeit);
      lzStack.push(this.getName(), this.getLaufzeit()) ;
      return lzStack;
    } 
    
  }
  
  public Stack <Film> suchePreis (int pPreis) {
    if (pPreis <= this.getPreis()) {
      traverseRightTree(BstPreis);
      kostenStack.push(this.getName, this.getPreis);
      return kostenStack;
    } 
    
  }
  
  public Stack <Film> sucheNaechsteVorstellungen (int pDatum){
    if (this.isEmpty() || pNaechsteVorstellung == null) {
      // Abbrechen, da es kein Element zu suchen gibt.
      return null;
    } 
    Film naechsterFilm = this.getNaechsteVorstellung();
    if (pDatum.isLess(naechste Vorstellung)) {
      traverseRightTree(BstNaechsteVorstellung);
      nvStack.push(this.getName, this.getNaechsteVorstellung);
      return nvStack;
    } 
    
    } 
  public Stack sucheAltersfreigabe(int pAlter){
    if (this.isEmpty() || pAltersfreigabe == null) {
      // Abbrechen, da es kein Element zu suchen gibt.
      // is ne nullPointerException oder wie das auch geschrieben wird (hr.Hüttemann hat gesagt das wichtig und richtig)
      return null;
    } 
    
    if(pAlter =< this.getAltersfreigabe){
      traverseRightTree(BstAltersfreigabe);
      afStack.push(this.getName, this.getAltersfreigabe);
      return afStack;
      }
  }
    
}  // Ende der Verwaltung 

    // ToDo`s:
    // Film, BST, Stack importieren
    // Datum als Typ einfügen (googeln und das ergebnis aus der KI nehmen)
    // Bäume für die einzelnen Methoden erstellen:
    // Laufzeit, Preis, nächste Vorstellung, Altersfreigabe
    // die erstellten Bäume importieren
    // Fenster erstellen lassen, damit die Benutzer*innen hiermit arbeiten können 
    
    