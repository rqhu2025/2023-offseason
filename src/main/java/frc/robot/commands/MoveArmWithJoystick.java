package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ArmSubsystem;

public class MoveArmWithJoystick extends CommandBase {
  /** Creates a new MoveArmWithJoystick. */

  //initialize your subsystems, controllers
  ArmSubsystem armSubsystem;
  XboxController joystick1;
  public MoveArmWithJoystick(ArmSubsystem armSubsystem, XboxController joystick1) {
    //add your parameters to the command
    this.armSubsystem = armSubsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    this.joystick1 = joystick1;
    addRequirements(armSubsystem);
  }

  @Override
  public void initialize() {
    armSubsystem.coast();
  }

  @Override
  public void execute() {
    double joystickArmPower = joystick1.getLeftY(); //use this joystick armpower to set power to your motors
    armSubsystem.setPower(joystickArmPower);
  }


  @Override
  public void end(boolean interrupted) {
    armSubsystem.setPower(0);
    armSubsystem.brake();
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
