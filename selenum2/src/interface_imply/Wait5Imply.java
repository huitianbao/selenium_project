package interface_imply;

import interfacehtb.Wait;

public class Wait5Imply implements Wait{

	@Override
	public void wait5() {
		// TODO Auto-generated method stub
		
		// ���� �ȴ�
		try {
			Thread.sleep(5*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// ���� �ȴ�   to do ..................
		
		
	}

}
