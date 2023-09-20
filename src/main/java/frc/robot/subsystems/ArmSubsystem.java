package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsystem extends SubsystemBase {

  //add motors here
  TalonFX talon;
  public ArmSubsystem() {
    //make proper initializations
    talon = new TalonFX(69);
  }

  //consider what methods are necessary for the motor to run effectively
  public void setPower(double power) {
    talon.set(ControlMode.PercentOutput, power);
  }

  public void brake() {
    talon.setNeutralMode(NeutralMode.Brake);
  }
  public void coast() {
    talon.setNeutralMode(NeutralMode.Coast);
  }
  
  @Override
  public void periodic() {
    DriverStation.reportWarning("amogus", false);
  }
}
