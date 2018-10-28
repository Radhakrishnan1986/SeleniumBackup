package finalizeTest;

public class FinalizeTest {

	public void finalize() {
		
		System.out.println("Finalize executer");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalizeTest a = new FinalizeTest();
		FinalizeTest b = new FinalizeTest();
		a = null;
		b = null;
		System.gc();
		
//To note, Results will or will not be displayed, based on the speed of respective Machine
	}

}
