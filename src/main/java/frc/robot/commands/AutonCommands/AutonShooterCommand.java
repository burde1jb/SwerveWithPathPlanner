package frc.robot.commands.AutonCommands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ShooterSubsystem;

public class AutonShooterCommand extends Command {
    
    ShooterSubsystem shooterSubsystem; 
    
    public AutonShooterCommand(ShooterSubsystem shooterSubsystem)  {
        this.shooterSubsystem = shooterSubsystem;
        addRequirements(shooterSubsystem);
    }

    @Override
    public void execute()   {
        shooterSubsystem.shooterOn();
    }

    @Override
    public boolean isFinished()    {
        return true;
    }

}
