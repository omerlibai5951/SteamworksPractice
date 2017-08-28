package SteamworksPractice.src.HPGear;


import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
* A command group For the HP Gear subsystem
* it contains the two group commands- OpenHPGear and CloseHPGear
* It releases and pushes the gear  and then
* It raises the gear and brings back in the piston 
*/

public class PutGetGear extends CommandGroup {
	public PutGetGear() {
		addSequential(new PutGear());
		addSequential(new WaitCommand(0.5));
		addSequential(new GetGear());
	}
	
}