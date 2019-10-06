package sortersTesterClasses;

public class Entero implements Comparable<Entero> {
	 private int value; 
     public Entero(int v) { value = v; }
     public int getValue() { return value; } 
     public String toString() { return value + ""; }
     
     public int compareTo(Entero other) { 
         if (other == null) throw new IllegalArgumentException("...");
         return this.value - other.value;  
      } 
     
     

	

}
