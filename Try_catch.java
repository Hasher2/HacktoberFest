
import java.io.IOException; 
class Try_catch { 
	void m() throws IOException { 
		throw new IOException("device error"); 
	} 

	void n() throws IOException { 
		m(); 
	} 
	void p() { 
		try { 
			try{
                n();
            }
            catch (Exception e){
                System.out.println("nested Exception");
            
			}

			
            System.out.println("normal tryblock");
		} 
		catch (Exception e) { 
			System.out.println("Normal try block exception handled"); 
		} 
	} 

	public static void main(String args[]) { 
		Try_catch obj = new Try_catch(); 
		obj.p(); 
		System.out.println("normal flow..."); 
	} 
} 
