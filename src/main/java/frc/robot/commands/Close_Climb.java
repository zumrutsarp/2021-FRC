package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Climb_Subsystem;

public class Close_Climb extends CommandBase {
  
  private final  Climb_Subsystem m_climb;
  public Close_Climb(Climb_Subsystem climb) {
   
    this.m_climb=climb;
    addRequirements(m_climb);
  }

  
  @Override
  public void initialize() {}

  
  @Override
  public void execute() {
    m_climb.Start_subside();
  }

  
  @Override
  public void end(boolean interrupted) {

  }

  @Override
  public boolean isFinished() {
    return false;
  }
}