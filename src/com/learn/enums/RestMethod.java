//$Id$
package com.learn.enums;

public class RestMethod {
	public static enum Method {
		HEAD(false),
		
		GET(false),
		
		POST(true),
		
		PUT(true),
		
		PATCH(true),
		
		DELETE(true);

		private final boolean isWritable;

		private Method(boolean flag) {
			isWritable = flag;
		}

		public boolean isWritable() {
			return isWritable;
		}
	}
	public static void main(String[] args) {
		System.out.println(Method.valueOf("POST"));
	}
}
