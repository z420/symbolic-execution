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

package rjc;

public class v_Control_Law3 {
  private double Value732 = 0;
  private double Gain854 = 0;
  private double Value867 = 0;
  private double Value879 = 0;
  private double Gain971 = 0;
  private double Gain1013 = 0;
  private double Gain1127 = 0;
  private SimpleCounter SimpleCounter_member7 = new SimpleCounter();
  private Subsystem320 Subsystem3_100000724_class_member8 = new Subsystem320();
  private Subsystem221 Subsystem2_100000720_class_member9 = new Subsystem221();
  private Subsystem122 Subsystem1_100000716_class_member10 = new Subsystem122();
  private Subsystem23 Subsystem_100000712_class_member11 = new Subsystem23();
  private Chart Chart_member12 = new Chart();
  private Jet_On_TIme_Counter25 Jet_On_TIme_Counter_100000673_class_member13 = new Jet_On_TIme_Counter25();

  public void Main5( double Position_2, double Rate_3, double[] Jet_Command_4)
  {
    int sig_0 = 0;
    double sig_1 = 0;
    double sig_2 = 0;
    double sig_3 = 0;
    double sig_4 = 0;
    double sig_5[] = new double[ 1 ];
    double sig_6[] = new double[ 1 ];
    double sig_7[] = new double[ 1 ];
    boolean sig_8 = false;
    double sig_9 = 0;
    double sig_10 = 0;
    double[] sig_11 = new double[2];
    double sig_12 = 0;
    double sig_13 = 0;
    double sig_14 = 0;
    boolean sig_15[] = new boolean[ 1 ];
    boolean sig_16 = false;
    boolean sig_17 = false;
    double[] sig_18 = new double[2];
    double sig_19 = 0;
    double sig_20 = 0;
    double sig_21 = 0;
    int sig_22[] = new int[ 1 ];
    double sig_23 = 0;
    double sig_24 = 0;
    double sig_25[] = new double[ 1 ];
    double sig_26[] = new double[ 1 ];
    double sig_27[] = new double[ 1 ];
    double sig_28[] = new double[ 1 ];
    double sig_29 = 0;
    double sig_30 = 0;
    int ix932 = 0;
    int ix_16 = 0;
    int ix_19 = 0;

    SimpleCounter_member7.Main( sig_22 );
    sig_19 = Value732;
    sig_18[ (int)( 0 ) ] = Position_2;
    sig_18[ (int)( 1 ) ] = Rate_3;
    Subsystem3_100000724_class_member8.Main30( sig_18, sig_19, sig_28 );
    Subsystem2_100000720_class_member9.Main31( sig_18, sig_19, sig_27 );
    Subsystem1_100000716_class_member10.Main32( sig_18, sig_19, sig_26 );
    Subsystem_100000712_class_member11.Main33( sig_18, sig_19, sig_25 );
    sig_13 = (double)( sig_22[ 0 ] ) * Gain854;
    sig_10 = Value867;
    sig_4 = Value879;
    sig_12 = (double)( 1 ) / sig_19 / sig_4 * sig_10;
    ix932 = 0;
    while( ix932 < 2 )
    {
      sig_11[ (int)( ix932 ) ] = sig_18[ (int)( ix932 ) ] / sig_4 / sig_19;
      ++ix932;
    }

    sig_21 = sig_11[ (int)( 1 ) ];
    sig_23 = sig_21 * sig_21;
    sig_30 = sig_23 * Gain971;
    sig_20 = sig_11[ (int)( 0 ) ];
    sig_3 = (double)( Math.abs( sig_20 ) );
    sig_29 = sig_30 + sig_3 - sig_12;
    sig_1 = sig_29 * Gain1013;
    sig_2 = sig_1 * (  ( sig_1 >= 0 ) ? 1 : 0  );
    sig_24 = (double)( Math.sqrt( sig_2 ) );
    Chart_member12.Main( sig_19, sig_18, sig_25[ 0 ], sig_26[ 0 ], sig_27[ 0 ], sig_28[ 0 ], sig_21, sig_24, sig_5, sig_6, sig_7 );
    sig_8 = sig_6[ 0 ] != 0;
    sig_0 = (int)( Math.floor( sig_22[ 0 ] / 160.0 ) ) * 160;
    sig_14 = (double)( sig_0 ) * Gain1127;
    Jet_On_TIme_Counter_100000673_class_member13.Main34( sig_7[ 0 ], sig_13, sig_14, sig_15 );
    sig_16 = !( sig_8 || sig_15[ 0 ] );
    sig_17 = sig_16 || sig_15[ 0 ];
    sig_9 = (double)(  ( sig_17 ) ? 1 : 0  );
    Jet_Command_4[ 0 ] = sig_5[ 0 ] * sig_9;
  }
  public void Init9(  )
  {
    Value732 = 2;
    Gain854 = 0.000625;
    Value867 = 0.00523599;
    Value879 = 0.000785534;
    Gain971 = 0.5;
    Gain1013 = 0.181818;
    Gain1127 = 0.000625;
    Jet_On_TIme_Counter_100000673_class_member13.Init35(  );
    Subsystem_100000712_class_member11.Init36(  );
    Subsystem1_100000716_class_member10.Init37(  );
    Subsystem2_100000720_class_member9.Init38(  );
    Subsystem3_100000724_class_member8.Init39(  );
    Chart_member12.Init(  );
    SimpleCounter_member7.Init(  );
  }
}
