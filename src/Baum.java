public class Baum {
    Wortknoten root;

    public void insert(Wortknoten eintrag){
        if(root == null) root = eintrag;
        else einfuegen(root, eintrag);
    }

    private void einfuegen(Wortknoten temp, Wortknoten eintrag){
        if(eintrag.getWort().compareTo(temp.getWort()) < 0){
            if(temp.left == null) temp.left = eintrag;
            else einfuegen(temp.left, eintrag);
        }
        else{
            if(temp.right == null) temp.right = eintrag;
            else einfuegen(temp.right, eintrag);
        }
    }

    public void print(){
        baumAusgeben(root);
    }

    private void baumAusgeben(Wortknoten temp) {
        if(temp.left != null) baumAusgeben(temp.left);
        System.out.println(temp.getWort());
        if (temp.right != null) baumAusgeben(temp.right);
    }

    public String search(String wort){
        return suchen(root, wort);
    }

    private String suchen(Wortknoten temp, String wort) {
        if(temp == null) return null;
        if(temp.getWort().equals(wort)) return temp.bedeutung;
        if(wort.compareTo(temp.getWort()) < 0) return suchen(temp.left, wort);
        else return suchen(temp.right, wort);
    }


    public void delete(Wortknoten k){
        if(root == k && root.left == null && root.right == null)
            root = null;
        else
            delete(root, root, k);
    }

    private void delete(Wortknoten temp, Wortknoten oldtemp, Wortknoten k){
     if(temp == null) return;
     if(root == k){
         if(root.left != null){
             if(root.right != null){
                 Wortknoten right = root.right;
                 root = root.left;
                 insert(right);
             }else{
                 root = root.left;
             }
         }
         else if(root.right != null){
             root = root.right;
         }
         return;
     }
     if(temp == k){
         if(oldtemp.right == temp){
             if(temp.right != null){
                 oldtemp.right = temp.right;
             }
             else oldtemp.right = null;
             if(temp.left != null){
                 insert(temp.left);
             }
         }
         if(oldtemp.left == temp){
             if(temp.right != null){
                 oldtemp.left = temp.right;
             }else oldtemp.left = null;
             if(temp.left != null){
                 insert(temp.left);
             }
         }
     }
     else{
         if(k.getWort().compareTo(temp.getWort()) < 0){
             delete(temp.left, temp, k);
         }else
             delete(temp.right, temp, k);
     }
    }






}

