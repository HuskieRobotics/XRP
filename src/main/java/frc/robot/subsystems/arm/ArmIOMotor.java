package frc.robot.subsystems.arm;

import edu.wpi.first.wpilibj.xrp.XRPServo;

public class ArmIOMotor implements ArmIO{

    private final XRPServo armMotor = new XRPServo(4);

    @Override
    public void setAngle(double angleDeg) {
        armMotor.setAngle(angleDeg);
    }

    @Override
    public double getAngle() {
        return armMotor.getAngle();
    }

    @Override
    public void zeroPosition() {
        armMotor.setAngle(0);
    }
    
}
