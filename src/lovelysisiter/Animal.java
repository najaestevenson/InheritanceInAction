
package lovelysisiter;
import javax.swing.JOptionPane;

public  abstract class Animal implements Evolution{
	// Animal class doesn't implement the methods in the Evolution interface cause it's abstract.
	//Non-abstract classes must implement the methods in the Evolution interface.
	public void breathe(){
		System.out.println("I'm breathing");
	}
	 
	public void eat(){
System.out.println("I can eat");
	}

	public abstract void reproduce();
	
	
}
