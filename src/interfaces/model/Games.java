package interfaces.model;

public interface Games
{
	void addGame(
			Object gameObject);
	
	void installGame();
	
	void startGame();
	
	void stopGame();
	
	void rageQuit(
			int angerLevel, String angerString);
	
	void emptyWallet();
}
