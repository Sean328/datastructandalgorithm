package com.sean.datastruct;

/**
 * Created by sean on 2017/12/21 10:34.
 */

public class HelloNative
{
	static
	{
		System.loadLibrary("HelloNative");
	}

	public static native void sayHello();

	@SuppressWarnings("static-access")
	public static void main(String[] args)
	{
		sayHello();
	}
}

