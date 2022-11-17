package garbagecollection;
import java.util.*;
class GarbageCollection{
	public static void main(String[] args)throws Exception
	{
		Runtime rs=Runtime.getRuntime();
		System.out.println("Free memory in JVM Before Garbage collection"+rs.freeMemory());
		rs.gc();
		System.out.println("Free memory in JVM After Garbage collection"+rs.freeMemory());
	}
}