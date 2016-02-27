package beans;

public class BeanArquitectura {
	
	private int dividendo;
	private int divisor;
	
	public int getDividendo() {
		return dividendo;
	}
	
	public void setDividendo(int dividendo) {
		this.dividendo = dividendo;
	}
	
	public int getDivisor() {
		return divisor;
	}
	
	public void setDivisor(int divisor) {
		this.divisor = divisor;
	}
	
	public float division(){
		if(this.divisor <= 0 ){
			return 0;
		}else{
			return this.dividendo/this.divisor;
		}
	}
	
	

}
