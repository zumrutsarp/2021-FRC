// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.Intake_Constants;


public class Intake_Subsystem extends SubsystemBase {
 





private final WPI_VictorSPX Intake_Motor=new WPI_VictorSPX(Intake_Constants. kIntake_Motor_Port);// sabit bir intake olduğu için sadece motoru tanımladım 
 
public boolean intakeState=false;
  public Intake_Subsystem() {



    
  }

  @Override
  public void periodic() {
   
  }

public void run_Intake( double m_speed){
Intake_Motor.set( m_speed);// m speed vermem gerek commanden gelen
 }

public void stop_Intake(){
  Intake_Motor.set(0);
}




}
