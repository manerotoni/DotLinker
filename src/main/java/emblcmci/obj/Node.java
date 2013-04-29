package emblcmci.obj;

import java.util.HashMap;

import ij.process.ImageProcessor;

/**
 * Node class extends NodeSimple with texture and image (binary and original) of a node 
 * Represents a single cell (particle) in a single time point.
 * All cell parameters will be stored in this object. 
 */
public class Node extends NodeSimple {
	
	ImageProcessor orgip;	// original image of the node
	ImageProcessor binip;	// binary image of the node

	boolean isInterpoleted = false;	// whether this Node is a node created by TrackFiller process. 
    /**
     * Texture variables
     */
	HashMap<?, ?> glcmResults;

	public HashMap<?, ?> getGlcmResults() {
		return glcmResults;
	}

	public void setGlcmResults(HashMap<?, ?> glcmResults) {
		this.glcmResults = glcmResults;
	}
	/////
	
	/**
	 * Constructor for Node
	 * @param x: coordinate in large image
	 * @param y: coordinate in large image
	 * @param frame: frame in large image
	 * @param id: id of node
	 */
	public Node(double x, double y, int frame,  int id){
		super(x ,y, frame, id);
	}
	
	public Node(double x, double y, int frame, int trackID, int id){
		super(x, y, frame, trackID, id);
	}
		
	public Node(double x, double y, int area, int frame, int trackID, double areafraction, int id){
		super(x, y, area, frame, trackID, areafraction, id);			
	}
	
	
	public ImageProcessor getOrgip() {
		return orgip;
	}

	public void setOrgip(ImageProcessor orgip) {
		this.orgip = orgip;
	}	
	
	public ImageProcessor getBinip() {
		return binip;
	}

	public void setBinip(ImageProcessor binip) {
		this.binip = binip;
	}

	public NodeSimple getNodeSimple() {
		return new NodeSimple(x, y, area, frame, trackID, areafraction, id);
	}
}

