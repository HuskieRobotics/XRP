package frc.robot.subsystems.arm;

import edu.wpi.first.wpilibj.xrp.XRPServo;

public interface ArmIO {

    public static class ArmIOInputs {
        
        public double positionDeg = 0.0;
    
    }

    public default void updateInputs(ArmIOInputs inputs){}

    public default void setAngle(double angleDeg){}
}
    
