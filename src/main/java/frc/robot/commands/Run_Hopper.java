
package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.Hopper_Subsystem;

public class Run_Hopper extends CommandBase {
  private final Hopper_Subsystem m_hopper;

  public Run_Hopper( Hopper_Subsystem hopper ) {
 this.m_hopper=hopper;
  }

  @Override
  public void initialize() {}

  
  @Override
  public void execute() {
  m_hopper.run_hopper();
  }

  @Override
  public void end(boolean interrupted) {
    m_hopper.stop_hopper();
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
// Hopper commandlerim git kazasına urban gidiyor .Düşünmeden yazmaya başladım :(