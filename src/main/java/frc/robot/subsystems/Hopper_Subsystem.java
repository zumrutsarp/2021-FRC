package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.Hopper_Constants;

public class Hopper_Subsystem extends SubsystemBase {
 private final WPI_VictorSPX Hopper_Motor1=new WPI_VictorSPX(Hopper_Constants.Hopper_Motor_Port1);
 private final WPI_VictorSPX Hopper_Motor2=new WPI_VictorSPX(Hopper_Constants.Hopper_Motor_Port2);
  public Hopper_Subsystem() {

    
  }

  @Override
  public void periodic() {
  
  }
//  parametreler random 
public void run_hopper(){
 Hopper_Motor2.set(0.3);  
 Hopper_Motor1.set(0.3);
}

public void back_hopper(){
  Hopper_Motor1.set(-0.2);
  Hopper_Motor2.set(-0.2);


}
public void stop_hopper(){
 Hopper_Motor1.set(0);
 Hopper_Motor2.set(0);
}


}