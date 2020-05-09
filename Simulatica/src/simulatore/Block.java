package simulatore;

public interface Block {
	public enum Type{SOURCE,EXIT,AMPLIFIER,OPERATION,ACCUMULATOR,DIRAMATION,UNDEFINED}
	Block getPreviousBlock();
	boolean isNear(Block b);
	boolean isSource();
	boolean isExit();
	double getValue();
	void connect(Block b);
	void disconnect();
	Type getType();
	Block getNextBlock();

}
