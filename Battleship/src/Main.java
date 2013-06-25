import view.gui.BattleshipGUI;
import controller.Controller;

public class Main {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		
		Controller controller = new Controller(0);
		// TUI tui = new TUI(controller);
		BattleshipGUI gui = new BattleshipGUI(controller);
		
		controller.gameLoop();
	}
}
