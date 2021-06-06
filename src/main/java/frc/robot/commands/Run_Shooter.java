// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Shooter_Subsystem;

public class Run_Shooter extends CommandBase {
 
 private final double m_speed;
 private final Shooter_Subsystem m_shooter; 
  public Run_Shooter(Shooter_Subsystem shooter,double speed) {
  this.m_shooter=shooter;
  this.m_speed=speed;

    addRequirements(m_shooter);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
  m_shooter.run_Shooter(m_speed);
  }

  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
