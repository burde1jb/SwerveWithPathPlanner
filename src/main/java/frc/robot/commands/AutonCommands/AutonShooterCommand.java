package frc.robot.commands.AutonCommands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.NewShooterSubsystem;

public class AutonShooterCommand extends Command {
    
    NewShooterSubsystem shooterSubsystem; 
    
    public AutonShooterCommand(NewShooterSubsystem shooterSubsystem)  {
        this.shooterSubsystem = shooterSubsystem;
        addRequirements(shooterSubsystem);
    }

    // @Override
    // public void execute()   {
    //     shooterSubsystem.shooterOn();
    // }

    @Override
    public boolean isFinished()    {
        return true;
    }

}
