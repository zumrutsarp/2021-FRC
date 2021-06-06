package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;


import edu.wpi.first.wpilibj.DoubleSolenoid;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.Climb_Constants;

public class Climb_Subsystem extends SubsystemBase {
 




private final WPI_VictorSPX Climb_Booster1=new WPI_VictorSPX(Climb_Constants.Climb_Booster1_port);// sağ arka (ilerletici )
private final WPI_VictorSPX Climb_Booster2=new WPI_VictorSPX(Climb_Constants.Climb_Booster2_port);// sol  arka 

private final  DoubleSolenoid Climb_Solenoid=new DoubleSolenoid(Climb_Constants.Solenoid_Port1 ,Climb_Constants.Solenoid_Port2);// Tek ayak  tırmanıcam bu yüzden tekli soloneid


  public Climb_Subsystem() {}

  @Override
  public void periodic() {

  }
// ayaklar  ile tırmanma 
  public void Start_rising(){
    Climb_Solenoid.set(Value.kForward);
  }
  // tırmanma mekanizmasının kapanışı 
public void Start_subside(){
  Climb_Solenoid.set(Value.kReverse);
}
//  tırmanmayı durdurma 
 public void Stop_climb(){
   Climb_Solenoid.set(Value.kOff);
 }
// ayaklar ile standa yerleşme (yürüme )
public void Seating_Stand(){
   Climb_Booster1.set(0.1);
   Climb_Booster2.set(0.1);
 }
//  ayaklar ile ilerlemeyi durdurmak 
public void stoping_Stand(){
  Climb_Booster1.set(0);
  Climb_Booster2.set(0);
}
}
//  2019 climb denemeye çalışıyorum 
// kefil olamayacağım tek birleşim organı  Climb ,biraz deneyimsel oldu
// Climb konusunda gelişmek için deniyorum .Bu climb kodlarını ciddiye almayın