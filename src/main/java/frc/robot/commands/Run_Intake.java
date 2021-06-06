// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake_Subsystem;

public class Run_Intake extends CommandBase {
  

private final double m_speed;
private final  Intake_Subsystem m_intake;



  public Run_Intake(Intake_Subsystem intake ,double speed) {
    this.m_speed= speed;
    this.m_intake= intake;
    
    addRequirements(m_intake);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {// başlangıç ve bitiş dışında  kalan tüm zamanlar


    m_intake.run_Intake(m_speed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {

    m_intake.run_Intake(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
