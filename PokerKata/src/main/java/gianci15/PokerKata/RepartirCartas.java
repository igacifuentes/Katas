package gianci15.PokerKata;

public class RepartirCartas {

	RepartirCartas carta1;
	RepartirCartas carta2;
	RepartirCartas carta3;
	RepartirCartas carta4;
	RepartirCartas carta5;
	
	private String valorCarta;
	private String tipoCarta; 
	
	public void repartirMano(String c1, String c2, String c3,
			String c4) {
		
	carta1=new RepartirCartas();
	carta1.setNumeroCarta(c1);
	carta1.setTipoCarta(c1);
	
	carta2=new RepartirCartas();
	carta2.setNumeroCarta(c2);
	carta2.setTipoCarta(c2);
	
	carta3=new RepartirCartas();
	carta3.setNumeroCarta(c3);
	carta3.setTipoCarta(c3);
	
	carta4=new RepartirCartas();
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

}
