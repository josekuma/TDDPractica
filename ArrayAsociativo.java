import java.util.*;
public class ArrayAsociativo {
  public  class Primitive{
public String Key;
public String Value;
public Primitive(String n, String m){
	Key=n;
	Value=m;
}
public Primitive(){
	Key=null;
	Value=null;
}

public void SetValue(String val){
	Value=val;
}
}
	List<Primitive> array;
	
	public ArrayAsociativo(){
		array=new LinkedList<Primitive>();
	}
  public void put(String clave,String valor){
	   /* if(containsKey(clave)){
	    	array.set(getIndex(clave), SetValue(valor);
	    }*/
		array.add(new Primitive(clave,valor));
		
	}

public int getIndex(String clave)throws ArrayAsException{
	  int i=0;
	  boolean founded=false;
	  while(i<array.size() && founded==false){
		  if((array.get(i).Key==clave)){
			  founded=true;
		  }else{
			  i++;
		  }	  
	  }
	  if(founded==false){
			 throw new ArrayAsException();
		 }
	  return i;
  }
  public String get(String clave) throws ArrayAsException{
	  int i=0;
	  boolean founded=false;
	  while(i<array.size() && founded==false){
		  if((array.get(i).Key==clave)){
			  founded=true;
		  }else{
			  i++;
		  }
		  
	  }
	 if(founded==false){
		 throw new ArrayAsException();
	 }
	 return array.get(i).Value;
  }
  public String getOrElse(String clave, String Default){
	  int i=0;
	  boolean founded=false;
	  while(i<array.size() && founded==false){
		  if((array.get(i).Key==clave)){
			  founded=true;
		  }else{
			  i++;
		  }
		  
	  }
	 if(founded==false){
		return Default;
	 }else{
	 return array.get(i).Value;}
  }
  public boolean containsKey(String clave){
	  int i=0;
	  boolean founded=false;
	  while(i<array.size() && founded==false){
		  if((array.get(i).Key==clave)){
			  founded=true;
		  }else{
			  i++;
		  }
		  
	  }
	  return founded;
  }
  public boolean remove(String clave){
	  int i=0;
	  boolean founded=false;
	  while(i<array.size() && founded==false){
		  if((array.get(i).Key==clave)){
			  founded=true;
			  array.remove(i);
		  }else{
			  i++;
		  }
		  
	  }
	  return founded;
  }
  public int size(){
	  return array.size();
  }
	public static void main(String[] args) {
		

	}

}
