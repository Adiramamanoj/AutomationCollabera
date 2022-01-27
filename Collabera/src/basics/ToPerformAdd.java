package basics;

public class ToPerformAdd {

	public static void main(String[] args) {
		Caluculator toPerformAdd= new RemoteCaluculator();
		System.out.println(toPerformAdd.add(10,20,30,40));
		System.out.println(toPerformAdd.add(2,3,4,5,6,7));
	}

}
