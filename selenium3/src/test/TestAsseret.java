package test;

public class TestAsseret {
	
	public static void main(String[] args){
		String s="hhhh";
		assert s!=null?true:false;
		//assert false;
		System.out.println("end");
		
		
		TestAsseret at = new TestAsseret();  
      //  at.assertMe(true);  
        at.assertMe(false);  
			
	}
	
	
	
    public void assertMe(boolean foo) {  
        assert foo ? true : false;  
        System.out.println("in true condition");  
    }  
  
}
