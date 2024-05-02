package frc.robot.commands.AutonCommands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.IntakeSubsystem;

public class AutonIntakeCommand extends Command {
    
    IntakeSubsystem intakeSubsystem;

    public AutonIntakeCommand(IntakeSubsystem intakeSubsystem) {
        this.intakeSubsystem = intakeSubsystem;
        addRequirements(intakeSubsystem);
    }
    
    @Override
    public void execute()   {
        intakeSubsystem.intakeOn(true);
    }

    @Override
    public boolean isFinished() {
        if (!intakeSubsystem.sensor.get())  {
            intakeSubsystem.intakeOff();
            return true;
        }
        return false;
    }

}
