package com.minesummit.plugin;

public class Vector3f {

	    private float x;
	    private float y;
	    private float z;

	    public Vector3f(float x, float y, float z) {

	        this.x = x;
	        this.y = y;
	        this.z = z;
	    }

	    // getter and setters
	    public float GetX () {
	    	return x;
	    }
	    
	    public void SetX (float x)
	    {
	    	this.x = x;
	    }
	    
	    public float GetY () {
	    	return y;
	    }
	    
	    public void SetY (float y)
	    {
	    	this.y = y;
	    }
	    
	    public float GetZ () {
	    	return z;
	    }
	    
	    public void SetZ (float z)
	    {
	    	this.z = z;
	    }

}
