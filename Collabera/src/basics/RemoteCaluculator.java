package basics;

public class RemoteCaluculator implements Caluculator{

	@Override
	public int add(int... arr) {
		int sum=0;
		for(int a: arr) {
			sum= sum+ a;
		}
		return sum;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int mulitiply(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
