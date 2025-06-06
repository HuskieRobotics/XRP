package frc.robot.subsystems.arm;

import edu.wpi.first.wpilibj.xrp.XRPServo;

public interface ArmIO {

    public default void setAngle(double angleDeg){}

    public default double getAngle(){
            return 0;
        }

    public default void zeroPosition() {}
}
    
