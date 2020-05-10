package simulatore;
/**
 * A java interface for the type Block.
 * The Block interface has the basic method for all Block type.
 * This inteface specify the enum Type that will be used for all the type of BLock.
 * 
 * @author FrancescoPirox
 * @version 0.0.1
 */

public interface Block {
	/**
	 * @author fpiro
	 * This enum will be placed in abstractBlock
	 */
	public enum Type{SOURCE,EXIT,AMPLIFIER,OPERATION,ACCUMULATOR,DIRAMATION,UNDEFINED}
	/**
	 * Return the previous block.
	 * @return return the previous logical block.
	 */
	Block getPreviousBlock();
	/*
	 * Return the next block.
	 * @return return the next logical block.
	 */
	Block getNextBlock();
	/**
	 *  This function returns a boolean.
	 * @param b Any block.
	 * @return If the block b is "one step" from the block that call this function returns true, false otherwise.
	 */
	boolean isNear(Block b);
	/**
	 * Return a boolean.
	 * Source Blocks are usefull for generating the signal 
	 * @return True if the block is a source block, false otherwise
	 */
	boolean isSource();
	/**
	 * Return a bolean
	 * @return True if the block is an exit block, false otherwise
	 */
	boolean isExit();
	/**
	 * Maybe in AbstractBlock
	 * @return the internal counter value 
	 * 
	 */
	double getValue();
	/**
	 * Used for connecting one block to another
	 * @param b Block after this  
	 */
	void connect(Block b);
	/**
	 * Used to disconnect Blocks
	 */
	void disconnect();
	
	

}
