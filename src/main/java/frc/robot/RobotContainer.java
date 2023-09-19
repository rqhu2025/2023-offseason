package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.MoveArmWithJoystick;
import frc.robot.subsystems.arm.ArmSubsystem;

public class RobotContainer {
  private final XboxController driverJoystick = new XboxController(0);
  private final XboxController operatorJoystick = new XboxController(1);

  // Subsystems
  private final ArmSubsystem armSubsystem = new ArmSubsystem();
  private final MoveArmWithJoystick moveArmWithJoystick = new MoveArmWithJoystick(armSubsystem, driverJoystick);
  // // Commands

//   private final ArmToSetpoint armToIntakeSetpoint = new ArmToSetpoint(armSubsystem, ArmConstants.intakeSetpoint);

//   private final ArmToSetpoint armToScoreSetpoint = new ArmToSetpoint(armSubsystem, ArmConstants.scoreSetpoint);

  // private final ElevatorToSetpoint elevatorToGround =
  // new ElevatorToSetpoint(elevatorSubsystem, NodeState.GROUND);
  // private final ElevatorToSetpoint elevatorToSubstation =
  // new ElevatorToSetpoint(elevatorSubsystem, NodeState.SUBSTATION);
  // private final ElevatorToSetpoint elevatorToLow =
  // new ElevatorToSetpoint(elevatorSubsystem, NodeState.LOW);
  // private final ElevatorToSetpoint elevatorToHigh =
  // new ElevatorToSetpoint(elevatorSubsystem, NodeState.HIGH);

  // private final SmartWrist smartWrist = new SmartWrist(wristSubsystem, 10000);

  // private final RunGripperWithJoystick runGripperWithJoystick =
  // new RunGripperWithJoystick(gripperSubsystem, operatorJoystick, ledSubsystem);

  // private final ElevatorToSetpointWithFeedForward elevatorPIDHigh = new
  // ElevatorToSetpointWithFeedForward(elevatorSubsystem, NodeState.HIGH);
  // private final ElevatorToSetpointWithFeedForward elevatorPIDGround = new
  // ElevatorToSetpointWithFeedForward(elevatorSubsystem, NodeState.RES);
  // private final ElevatorToSetpointWithFeedForward elevatorToReset =

  // NodeConstants.NodeState.HIGH.elevatorSetpoint);
  // private final ElevatorToSetpoint elevatorToSubstation =
  // new ElevatorToSetpoint(elevatorSubsystem, NodeState.SUBSTATION);
  // private final ElevatorToSetpoint elevatorToLow =
  // new ElevatorToSetpoint(elevatorSubsystem, NodeState.LOW);
  // private final ElevatorToSetpoint elevatorToHigh =

  // private final ElevatorToSetpointWithFeedForward elevatorPIDHigh = new
  // ElevatorToSetpointWithFeedForward(elevatorSubsystem, NodeState.HIGH);
  // private final ElevatorToSetpointWithFeedForward elevatorPIDGround = new
  // ElevatorToSetpointWithFeedForward(elevatorSubsystem, NodeState.GROUND);

  // private final IntakePiece intakePieceGround =
  // new IntakePiece(elevatorSubsystem, armSubsystem, NodeState.RESET);

  // private final IntakePiece intakePieceSubstation =
  // new IntakePiece(elevatorSubsystem, armSubsystem, NodeState.SUBSTATION);

//   private final ScorePiece scorePieceLow = new ScorePiece(elevatorSubsystem, armSubsystem, gripperSubsystem,
//       NodeState.LOW);

//   private final OnePiece onePiece = new OnePiece(driveBaseSubsystem, elevatorSubsystem,
//       armSubsystem, gripperSubsystem);
//   private final TwoPiece twoPiece = new TwoPiece(driveBaseSubsystem, elevatorSubsystem,
//       armSubsystem, gripperSubsystem);
//   private final ThreePiece threePiece = new ThreePiece(driveBaseSubsystem, elevatorSubsystem,
//       armSubsystem, gripperSubsystem);

  public RobotContainer() {
    configureButtonBindings();
    configureAutoSelector();
  }

  private void configureButtonBindings() {
    // Button.kY.value).onTrue(elevatorToReset);
    // new JoystickButton(driverJoystick,
    // Button.kA.value).whileTrue(turn180RobotRelative);

    // new JoystickButton(operatorJoystick,
    // Button.kLeftBumper.value).onTrue(scorePieceHigh);

    // new JoystickButton(operatorJoystick,
    // Button.kB.value).onTrue(intakePieceGround);
    // new JoystickButton(operatorJoystick,
    // Button.kY.value).onTrue(intakePieceSubstation);

    // new JoystickButton(operatorJoystick,
    // Button.kRightBumper.value).onTrue(wristToSetpointWithFeedforwardReset);
    // new JoystickButton(operatorJoystick,
    // Button.kLeftBumper.value).onTrue(wristToSetpointWithFeedforwardReset);
    // new JoystickButton(operatorJoy)
    // new JoystickButton(operatorJoystick,
    // Button.kB.value).onTrue(wristToSetpointWithFeedforwardReset);
    // new JoystickButton(operatorJoystick,
    // Button.kY.value).onTrue(wristToSetpointWithFeedforwardLow);
    // new JoystickButton(operatorJoystick,
    // Button.kA.value).onTrue(wristToSetpointWithFeedforwardHigh);
    // new JoystickButton(operatorJoystick, 
    // Button.kX.value).onTrue(wristToSetpointWithFeedforwardSubstation);

    // new JoystickButton(driverJoystick, XboxController.Button.kX.value).onTrue(new InstantCommand(driveBaseSubsystem::brake));

    // new JoystickButton(operatorJoystick, XboxController.Button.kX.value).onTrue(new ElevatorWithMotionMagic(elevatorSubsystem, 150000));
    // new JoystickButton(operatorJoystick, XboxController.Button.kB.value).onTrue(new ElevatorWithMotionMagic(elevatorSubsystem, 7500));
    // new JoystickButton(operatorJoystick, XboxController.Button.kX.value).onTrue(new ElevatorWithMotionMagic(elevatorSubsystem, 320000));
  }

  private void configureAutoSelector() {

  }

  public Command getAutonomousCommand() {
    // return balance;
    // return new Mobility(driveBaseSubsystem);
    // return mobility;xxxxxxxxxxxxxxxxx
    // return new MobilityBalance(driveBaseSubsystem, gyroSubsystem);
    // return new AutoHigh(driveBaseSubsystem, elevatorSubsystem, armSubsystem, wristSubsystem, gripperSubsystem, gyroSubsystem, NodeState.HIGH);
    // return new Balance(driveBaseSubsystem, gyroSubsystem);
    return new WaitCommand(5);
  }

  public void setDefaultCommands() {
    armSubsystem.setDefaultCommand(moveArmWithJoystick);
  }

}
