// Code generated by gobind. DO NOT EDIT.

// Java class freeport.Freeport is a proxy for talking to a Go program.
//
//   autogenerated by gobind -lang=java TrojanCat/freeport
package freeport;

import go.Seq;

public abstract class Freeport {
	static {
		Seq.touch(); // for loading the native library
		_init();
	}
	
	private Freeport() {} // uninstantiable
	
	// touch is called from other bound packages to initialize this package
	public static void touch() {}
	
	private static native void _init();
	
	
	
	/**
	 * GetFreePort asks the kernel for a free open port that is ready to use.
	 */
	public static native long getFreePort() throws Exception;
	// skipped function GetFreePorts with unsupported parameter or return types
	
}
