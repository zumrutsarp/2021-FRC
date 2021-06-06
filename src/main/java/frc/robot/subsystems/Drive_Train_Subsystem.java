
package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;


import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.Drive_Cnstants;

public class Drive_Train_Subsystem extends SubsystemBase {
  // 6 motorlu differantial drive için kodlanıyor


  
// 6 motorlu       için sol          motor        grubumuz
  private final WPI_VictorSPX Front_Left_motor = new WPI_VictorSPX(Drive_Cnstants.Front_Left_Motor_Port);
  private final WPI_VictorSPX Midle_Left_motor = new WPI_VictorSPX(Drive_Cnstants.Midle_Left_Motor_Port);
  private final WPI_VictorSPX Rear_Left_motor = new WPI_VictorSPX(Drive_Cnstants.Rear_Left_Motor_Port);
  SpeedControllerGroup m_leftControllerGroup=new SpeedControllerGroup(Front_Left_motor,Midle_Left_motor,Rear_Left_motor);// sol motorları gruplandır 



  // 6  tekerlekli  için  sağ motor grubumuz   
  private final WPI_VictorSPX Front_Right_motor = new WPI_VictorSPX(Drive_Cnstants.Front_Right_Motor_Port);
  private final WPI_VictorSPX Midle_Right_motor = new WPI_VictorSPX(Drive_Cnstants.Midle_Right_Motor_Port);               
  private final WPI_VictorSPX Rear_Right_motor = new WPI_VictorSPX(Drive_Cnstants.Rear_Right_Motor_Port);
  SpeedControllerGroup m_rightControllerGroup=new SpeedControllerGroup(Front_Right_motor,Midle_Right_motor,Rear_Right_motor);


  

    private final DifferentialDrive  m_drive=new DifferentialDrive  (m_leftControllerGroup, m_rightControllerGroup);


  public Drive_Train_Subsystem() {

     
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

public void arcade_Drive(double fwd,double rot){

m_drive.arcadeDrive(fwd, rot,true);

}
}



// OTONOM SIRASINDA YAZILACAK KODLAR  BUAYA GELECEK 