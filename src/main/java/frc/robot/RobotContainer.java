// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


import edu.wpi.first.wpilibj.Joystick;
import frc.robot.Constants.Drive_Cnstants;
import frc.robot.commands.Back_Hopper;
import frc.robot.commands.Close_Climb;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.Rising_Climb;
import frc.robot.commands.Run_Hopper;
import frc.robot.commands.Run_Intake;
import frc.robot.commands.Run_Shooter;
import frc.robot.commands.Seating_Climb;
import frc.robot.subsystems.Climb_Subsystem;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.Hopper_Subsystem;
import frc.robot.subsystems.Intake_Subsystem;
import frc.robot.subsystems.Shooter_Subsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;


public class RobotContainer {

  private final Intake_Subsystem m_intake =new Intake_Subsystem();
  private final Shooter_Subsystem m_shooter =new Shooter_Subsystem();
  private final Hopper_Subsystem m_hopper =new Hopper_Subsystem();
  private final Climb_Subsystem m_climb=new Climb_Subsystem();
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);
  // Joystick tanımlıyoruz
  public Joystick m_drivercontroller=new Joystick(Drive_Cnstants.driver_contrller_motor_port);
  public Joystick m_oparatorcontroller=new Joystick(Drive_Cnstants.oparator_contrller_motor_port);


  public RobotContainer() {
  
    configureButtonBindings();
  }

  private void configureButtonBindings() {




    // Climb
    new JoystickButton(m_oparatorcontroller, 3).whenHeld(new  Rising_Climb(m_climb));
    new JoystickButton(m_oparatorcontroller, 4).whenHeld(new  Close_Climb(m_climb));
    new JoystickButton(m_oparatorcontroller, 5).whenHeld(new  Seating_Climb(m_climb));

    //HOPPER 
    new  JoystickButton(m_drivercontroller , 1).whenHeld(new Run_Hopper(m_hopper));
    new  JoystickButton(m_drivercontroller , 2).whenHeld(new Back_Hopper(m_hopper));
    

    // SHOOTER 
    new JoystickButton(m_oparatorcontroller, 1).whenHeld(new Run_Shooter(m_shooter, 0.25));

    // INTAKE
     new JoystickButton(m_oparatorcontroller, 2).whenHeld(new Run_Intake(m_intake, 0.45));
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    
    return m_autoCommand;
  }
}
