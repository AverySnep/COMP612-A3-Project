package shapes;

import util.obj.ObjObject;
import util.Vector3;
import util.obj.ObjMtl;

public class Tri {
    public Vector3 v1, v2, v3, normal;
    public int[] vertexPos;
    // TODO: ensure this isn't used
	//public ColorRGB color;
	public ObjMtl material;
	public boolean useMtl;
	@SuppressWarnings("unused") // Field is referenced outside of local context
	private ObjObject obj;
	
	/**
	 * Default constructor for a tris face, creates an empty tri face
	 */
	public Tri() {
		this.vertexPos = new int[3];
		this.obj = null;
		this.useMtl = false;
		this.material = null;
	}
	
	/**
	 * Constructor for a tris face
	 * @param vertexPosition
	 * @param obj
	 */
	public Tri(int[] vertexPosition, ObjObject obj) {
		this.vertexPos = vertexPosition;
		this.obj = obj;
		this.useMtl = false;
		this.material = null;
	}
}