package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.event.EventLoop;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.RobotConstants;
import frc.robot.subsystems.*;

public class NewShooterCommand extends Command {
    NewShooterSubsystem NewshooterSubsystem;

    XboxController controller2;
    public NewShooterCommand(NewShooterSubsystem shooterSubsytem, XboxController controller2){

        this.NewshooterSubsystem = NewshooterSubsystem;
        this.controller2 = controller2;
        addRequirements(NewshooterSubsystem);
    }

    @Override
    public void execute()   {
        if (controller2.getLeftTriggerAxis() > 0.2) {
            NewshooterSubsystem.newshooterOn();
        }
        else    {
            NewshooterSubsystem.newstopshooter();
        }

        if (controller2.getRightTriggerAxis() > 0.2)    {
            NewshooterSubsystem.indexOn();
        }
        else if (controller2.getBackButton())   {
            NewshooterSubsystem.indexOut();
        }
        else    {
            NewshooterSubsystem.indexOff();
        }

        if (controller2.getLeftY() > 0.2){
            NewshooterSubsystem.goToshot(RobotConstants.longshot);
        }
        else if (controller2.getLeftY() < -0.2){
            NewshooterSubsystem.goToshot(RobotConstants.shortshot);
        }
        else{
            NewshooterSubsystem.tiltstop();
        }

        }


    }
