

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drive_Train_Subsystem;

public class Drive_Joystick_command extends CommandBase {
  
 Drive_Train_Subsystem m_drive;
 DoubleSupplier  m_rotation;
 DoubleSupplier m_forward;


  public Drive_Joystick_command( Drive_Train_Subsystem  drive_Subsystem,DoubleSupplier  rotation,DoubleSupplier forward ) {
 this.m_drive=drive_Subsystem;
this.m_forward=forward;
this.m_rotation=rotation;
addRequirements(m_drive);
  }

  @Override
  public void initialize() {}

  
  @Override
  public void execute() {

    m_drive.arcade_Drive(m_forward.getAsDouble(), m_rotation.getAsDouble());
  }

  
  @Override
  public void end(boolean interrupted) {}

  
  @Override
  public boolean isFinished() {
    return false;
  }
}
