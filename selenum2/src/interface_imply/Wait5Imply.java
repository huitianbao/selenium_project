package interface_imply;

import interfacehtb.Wait;

public class Wait5Imply implements Wait{

	@Override
	public void wait5() {
		// TODO Auto-generated method stub
		
		// 显性 等待
		try {
			Thread.sleep(5*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// 隐性 等待   to do ..................
		
		
	}

}
