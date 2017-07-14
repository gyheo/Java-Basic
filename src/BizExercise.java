
public class BizExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BizServe biz = new BizServe();
		try{
			biz.bizMethod(-100);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
