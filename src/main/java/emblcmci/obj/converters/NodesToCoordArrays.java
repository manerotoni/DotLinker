package emblcmci.obj.converters;

import java.util.ArrayList;

import emblcmci.obj.Node;

/** Converting emblcmci.obj.Node ArrayList to int[] arrays.
 * 
 * @author miura
 *
 */
public class NodesToCoordArrays {
	ArrayList<Node> nodes;
	int[] xA, yA, fA, idA;
	/**
	 * @param nodes
	 */
	public NodesToCoordArrays(ArrayList<Node> nodes) {
		super();
		this.nodes = nodes;
		this.idA = new int[nodes.size()];
		this.xA = new int[nodes.size()];
		this.yA = new int[nodes.size()];		
		this.fA = new int[nodes.size()];
		for (int i = 0; i < nodes.size(); i ++){
			idA[i] = nodes.get(i).getId();
			xA[i] = (int) nodes.get(i).getX();
			yA[i] = (int) nodes.get(i).getY();
			fA[i] = (int) nodes.get(i).getFrame();
		}
	}
	public int[] getidA() {
		return idA;
	}
	public int[] getxA() {
		return xA;
	}
	public int[] getyA() {
		return yA;
	}
	public int[] getfA() {
		return fA;
	}
		
	
}
