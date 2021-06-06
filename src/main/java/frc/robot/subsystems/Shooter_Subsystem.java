// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.Shooter_Constants;

public class Shooter_Subsystem extends SubsystemBase {
 
private final  WPI_VictorSPX Shooter_Motor1=new WPI_VictorSPX(Shooter_Constants.kShooter_Motor_port1);
private final  WPI_VictorSPX Shooter_Motor2=new WPI_VictorSPX(Shooter_Constants.kShooter_Motor_port2);
  public Shooter_Subsystem() {


    Shooter_Motor1.setInverted(true);
Shooter_Motor2.setInverted(true);// bu kısımdan emin değilim + reverseOutput kullanmamak konusunda kararsızım
Shooter_Motor2.follow(Shooter_Motor1);
  }



  @Override
  public void periodic() {
  
  }
public void run_Shooter(double speed){
  Shooter_Motor1.set(speed);
 
}


}
