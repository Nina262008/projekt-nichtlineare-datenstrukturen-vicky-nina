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
  }