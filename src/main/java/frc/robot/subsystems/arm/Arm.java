package frc.robot.subsystems.arm;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase {
    private final ArmIO io;

    public Arm(ArmIO io) {
        this.io = io;
        zeroPosition();
    }

    @Override
    public void periodic() {
        // This will be called every 20 ms but we don't have anything specific to do here yet (update inputs)
    }

    public void goToAngle(double angleDeg) {
        io.setAngle(angleDeg);
    }

    public double getAngle() {
        return io.getAngle();
    }

    public void zeroPosition() {
        io.zeroPosition();
    }
}