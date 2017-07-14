
public class BizServe {
	public void bizMethod(int i) throws BizException{
		System.out.println("Biz Method Start");

		if(i < 0){
			throw new BizException("Parameter i is more than 0");
		}
		
		
		System.out.println("Biz Method End");
	}
}
