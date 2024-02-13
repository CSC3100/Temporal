import weka.clusterers.*;
import weka.core.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;


class Main extends Application {	
private Professor professor;
private Student student;
	
	public static void main(String args[]) throws Exception {

		// Create a linked list of points
		LinkedList<Point> points = new LinkedList<Point>();
		points.add(new Point(50, 10));
		points.add(new Point(10, 20));
		points.add(new Point(20, 20));
		points.add(new Point(25, 10));

		// Create attributes
		ArrayList<Attribute> attributes = new ArrayList<Attribute>();
		attributes.add(new Attribute("x"));
		attributes.add(new Attribute("y"));

		// Create instances
		Instances data = new Instances("Example", attributes, points.size());
		for (Point point : points) {
			double[] values = new double[2];
			values[0] = point.getX();
			values[1] = point.getY();
			data.add(new DenseInstance(1.0, values));
		}

		// Print the instances
		System.out.println(data);

		// models
		SimpleKMeans model1 = new SimpleKMeans();
		model1.setNumClusters(2);
		model1.buildClusterer(data);
		System.out.println(model1);
		
		// show results
		for (int i = 0; i < data.numInstances(); i++) {
			int clsLabel = model1.clusterInstance(data.instance(i));
			System.out.printf("Instance %d -> Cluster %d \n", i, clsLabel);
		}
		
	}
}




