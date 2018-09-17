/*
 * Copyright (C) 2014, United States Government, as represented by the
 * Administrator of the National Aeronautics and Space Administration.
 * All rights reserved.
 *
 * Symbolic Pathfinder (jpf-symbc) is licensed under the Apache License, 
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0. 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 */

package gov.nasa.jpf.symbc;

public class ExSymExe25 {
	
  public static void main (String[] args) {
	  int a = 3;
	  ExSymExe25 inst = new ExSymExe25();
	  int b = 8;
	  inst.test(a, b, a);
  }

  /*
   * test IFLE & IADD bytecodes and mixture of symbolic and concrete parameters
   * (con#sym#sym)
   */
  public void test (int x, int y, int z) {
	  System.out.println("Testing ExSymExe25");
	  y = z + 1;
	  z = z + x;
	  x = x + 3;
	  if (z > 0)
		  System.out.println("branch FOO1");
	  else
		  System.out.println("branch FOO2");
	  if (x > 0)
		  System.out.println("branch BOO1");
	  else
		  System.out.println("branch BOO2");

	  //assert false;

  }
}

