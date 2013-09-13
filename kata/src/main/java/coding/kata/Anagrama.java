package coding.kata;

import java.util.ArrayList;
import java.util.Iterator;

public class Anagrama {
	
	
	ArrayList<String> lista=new ArrayList<String>();
	

	public Boolean buscar_Palabra(String anagrama) {
		
		boolean verificacion=false;
		Iterator<String>iteracion=lista.iterator();
		while(iteracion.hasNext()){
		
		if(iteracion.next().equals(anagrama)){
			verificacion=true;
		}
		}
		return verificacion;
	}

	public void llenarAnagramas(String palabra) {
		
		int opciones=0;
        String aux="";
       
       while(opciones<24){
    	   
        for(int i=0;i<palabra.length();i++){
        int numero=(int)(Math.random()*(palabra.length()-0))+0;
       
          if(aux.contains(""+palabra.charAt(numero))){
          i--;   
          }else{
            aux=aux+palabra.charAt(numero);
          }
        }
        
        if(lista.contains(aux)){
            
        }else{
            lista.add(aux);
            opciones++;
        }
       aux="";
       }

		}
		
	}

