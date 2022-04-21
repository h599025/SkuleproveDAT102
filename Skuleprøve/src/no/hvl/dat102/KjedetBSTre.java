package no.hvl.dat102;

public class KjedetBSTre<T extends Comparable<T>> implements BSTreADT<T>  {

	private int antall; 
	private BinaerTreNode<T> rot; 
  
	public KjedetBSTre() { 
		antall = 0; 
		rot = null; 
	} 
 
    public void visPostorden() { 
    	visRekPostorden(rot); 
    	System.out.println(); 
    } 
    
    private void visRekPostorden(BinaerTreNode<T> p) { 
    	
    	
    } 
     
    public T finn(T element) { 
    	return finnRek(element, rot); 
    } 
 
    private T finnRek(T element, BinaerTreNode<T> p) { 
    	return null; 
    } 
 
    public boolean erIdentisk(KjedetBSTre<T> t){ 
      return erIdentiskRek(rot, t.rot); 
    }  
      
    private boolean erIdentiskRek(BinaerTreNode<T> t1, BinaerTreNode<T> t2) { 
    	if (t1.getElement().compareTo(t2.getElement()) == 0) {
            if (t1.getVenstre().getElement() != null || t2.getVenstre().getElement() != null) {
                erIdentiskRek(t1.getVenstre(), t2.getVenstre());
            }
            if (t1.getHoyre().getElement() != null || t2.getHoyre().getElement() != null) {
                 erIdentiskRek(t1.getHoyre(), t2.getHoyre());
            }
         } else {
             return false;
         }
         return true; 
    } 
}
