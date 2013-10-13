package gianci15.PokerKata;

public class Cartas {

	Cartas carta1;
	Cartas carta2;
	Cartas carta3;
	Cartas carta4;
	Cartas carta5;
	
	Cartas carta[] = new Cartas [5];
	
	private String valorCarta;
	private String tipoCarta; 
	
	public void valoresMano(String c1, String c2, String c3,
			String c4) {
		
	carta1=new Cartas();
	carta1.setNumeroCarta(c1);
	carta1.setTipoCarta(c1);
	
	carta2=new Cartas();
	carta2.setNumeroCarta(c2);
	carta2.setTipoCarta(c2);
	
	carta3=new Cartas();
	carta3.setNumeroCarta(c3);
	carta3.setTipoCarta(c3);
	
	carta4=new Cartas();
	carta4.setNumeroCarta(c4);
	carta4.setTipoCarta(c4);
		
	}

	public String verMano() {
		String mano=carta1.getValorCarta()+carta1.getTipoCarta()+" "+
				    carta2.getValorCarta()+carta2.getTipoCarta()+" "+
				    carta3.getValorCarta()+carta3.getTipoCarta()+" "+
				    carta4.getValorCarta()+carta4.getTipoCarta();
		return mano;
	}

	public String getCarta(){
		
		return getValorCarta()+getTipoCarta();
		
	}
	public String getValorCarta() {
		return valorCarta;
	}

	public void setNumeroCarta(String numeroCarta) {
		int valor;
		
		if(numeroCarta.length()>2)
			valor=Integer.parseInt(numeroCarta.substring(0, 2));
		    
		else
			valor=Integer.parseInt(numeroCarta.substring(0, 1));
				
		switch(valor){
		case 1:
			numeroCarta="A";
			break;
		case 11:
			numeroCarta="J";
			break;
		case 12:
			numeroCarta="Q";
			break;
		case 13:
			numeroCarta="K";
			break;
		default :
			numeroCarta=""+valor;
				
		}
		
		this.valorCarta = numeroCarta;
	}

	public String getTipoCarta() {
		return tipoCarta;
	}

	public void setTipoCarta(String tipoCarta) {
		int palo;
		if(tipoCarta.length()>2)
			palo=Integer.parseInt(tipoCarta.substring(2,3));
		else
			palo=Integer.parseInt(tipoCarta.substring(1,2));
		
		switch(palo){
		
		case 1:
			tipoCarta="T";
			break;
		case 2:
			tipoCarta="P";
			break;
		case 3:
			tipoCarta="D";
			break;
		case 4:
			tipoCarta="C";
			break;
				
		}
		
		this.tipoCarta = tipoCarta;
	}
	
	public void repartirMano(){
	
		
		String aux[]=new String[5];
		String mano="";
		int aux2=0;
		
		do{
			
		int numeroCarta =(int)(Math.round(Math.random() * (13-1))) + 1;
		int paloCarta =  (int)(Math.round(Math.random() * (4-1))) + 1;
		boolean repite=false;

		System.out.print(numeroCarta+""+paloCarta+" ");
		
		try{
	       for(int i=0;i<4;i++){
	    	  if(aux[i].equals(numeroCarta+""+paloCarta))   
	    		  repite=true;
	       }
		}catch(Exception ex){}
		
			if(repite==false){
				Cartas temp = new Cartas();
				temp.setNumeroCarta(""+numeroCarta+""+paloCarta);
				temp.setTipoCarta(""+numeroCarta+""+paloCarta);
				carta[aux2]=temp;
				aux[aux2]=numeroCarta+""+paloCarta;
				aux2++;
			}
		
		}while(aux2<5);
			
	}

}
