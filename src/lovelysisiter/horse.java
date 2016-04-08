package lovelysisiter;

class horse extends Animal {

	@Override
	public void reproduce() {
		System.out.println("I give painfully natual birth");
		
	}
	public static void main(String[] args) {
		
		pig p = new pig();	
		horse h = new horse();
		h.breathe();
		h.eat();
		h.reproduce();
		
		p.breathe();
		p.eat();
		p.reproduce();
	
}
	@Override
	public String creation() {
		// TODO Auto-generated method stub
		return "I was created as a horse";
	}
}
