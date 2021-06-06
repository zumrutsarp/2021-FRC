// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

public static final class Intake_Constants{
public static  final  int  kIntake_Motor_Port=1;
}

public static  final class  Shooter_Constants{

public static final int kShooter_Motor_port1=2;
public static final int kShooter_Motor_port2=3;
}


public static final class Drive_Cnstants{

	public static final int Front_Right_Motor_Port = 4;
	public static final int Front_Left_Motor_Port = 5;
	public static final int Rear_Right_Motor_Port = 6;
	public static final int Rear_Left_Motor_Port = 7;
	public static final int Midle_Left_Motor_Port = 8;
	public static final int Midle_Right_Motor_Port = 9;
	public static int driver_contrller_motor_port=10;
	public static int oparator_contrller_motor_port=11;



}

public static final class Climb_Constants{

	public static final int Climb_Booster2_port = 0;
	public static final int Climb_Booster1_port = 0;
	public static final int Solenoid_Port1 = 0;
	public static final int Solenoid_Port2 = 0;
}
public static final class Hopper_Constants{

	public static final int Hopper_Motor_Port2 = 0;
	public static final int Hopper_Motor_Port1 = 0;


}

}
