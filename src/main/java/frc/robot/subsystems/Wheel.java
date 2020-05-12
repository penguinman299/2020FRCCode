/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Wheel extends SubsystemBase {
  PWMVictorSPX wheel = new PWMVictorSPX(Constants.WHEEL_MOTOR_ID);

  public Wheel() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void setWheelSpeed(){
    wheel.set(Constants.WHEEL_SPEED);
  }
  public void endSpinning(){
    wheel.set(0);
  }
}
