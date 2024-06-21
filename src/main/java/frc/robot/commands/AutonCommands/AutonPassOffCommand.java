package frc.robot.commands.AutonCommands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.NewShooterSubsystem;

public class AutonPassOffCommand extends Command {
    
    IntakeSubsystem intakeSubsystem;
    NewShooterSubsystem newshooterSubsystem;

    public AutonPassOffCommand(IntakeSubsystem intakeSubsystem, NewShooterSubsystem newshooterSubsystem) {
        this.intakeSubsystem = intakeSubsystem;
        this.newshooterSubsystem = newshooterSubsystem;
        addRequirements(intakeSubsystem);
        addRequirements(newshooterSubsystem);
    }
    
    @Override
    public void execute()   {
        intakeSubsystem.intakeOn(true);
        newshooterSubsystem.indexAuton(true);
    }

    @Override
    public boolean isFinished() {
        if (!newshooterSubsystem.sensor.get())  {
            newshooterSubsystem.indexOff();
            return true;
        }
        return false;
    }

}
