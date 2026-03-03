public class Kinoprogramm {

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
  
    public static void Kinoprogramm(String[] args) {
    BinarySearchTree <Film> BstLaufzeit = new BinarySearchTree <Film> ();
    BstLaufzeit.insert(new Film (// hier die Attribute des Filmes einfügen));
    }
    
    public static void Kinoprogramm(String [] args) {
      BinarySearchTree <Film> BstPreis = new BinarySearchTree <Film> ();
      BstPreis.insert(new Film());
    }
    
    public static void Kinoprogramm(String [] args) {
      BinarySearchTree <Film> BstNaechsteVorstellung = new BinarySearchTree <Film> ();
      BstNaechsteVorstellung.insert(new Film());
    }  
    
    public static void Kinoprogramm(String [] args) {
      BinarySearchTree <Film> BstAltersfreigabe = new BinarySearchTree <Film> ();
      BstAltersfreigabe.insert(new Film());
    }
    
  }