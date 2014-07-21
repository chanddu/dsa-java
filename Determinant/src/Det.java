
public class Det {
	public static void main(String args[]){
		Determinant d = new Determinant();
		d.setOrder();
		int order = d.getOrder();
		d.setMatrix();
		int matrix[][] = d.getMatrix();
		int det = d.calcDet(matrix, order);
		System.out.print(det);
	}

}
