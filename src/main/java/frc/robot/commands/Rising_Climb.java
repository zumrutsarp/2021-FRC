// yükselme mekanızmasını açılışı
package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Climb_Subsystem;

public class Rising_Climb extends CommandBase {
 private final Climb_Subsystem m_climb;

  
  public Rising_Climb(Climb_Subsystem climb) {
   
    this.m_climb=climb;
    addRequirements(m_climb);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    m_climb.Start_rising();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_climb.Stop_climb();// tırmanmayı durdur 
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}