package simulatore;
/**
 * This is the first implementation for the Blocks
 * @author francescoPirox
 * @version 0.0.1
 */
public abstract class AbstractBlock implements Block {
	protected AbstractBlock next;
	protected AbstractBlock previous;
	protected Type type=Block.Type.UNDEFINED;
	
	
	public AbstractBlock(AbstractBlock next, AbstractBlock previous,Type type) {
		this.next = next;
		this.previous = previous;
		this.type=type;
	}
	
	public AbstractBlock() {
		this.next = null;
		this.previous = null;
		this.type=Block.Type.UNDEFINED;
	}
	
	public AbstractBlock(AbstractBlock b) {
		this.next = b.next;
		this.previous = b.previous;
		this.type=b.type;
	}
	
	public AbstractBlock(Type type) {
		this.next = null;
		this.previous = null;
		this.type=type;
	}

	@Override
	public Block getNextBlock() {
		return next;
	}
	@Override
	public Block getPreviousBlock() {
		return previous;
	}
	
	public Type getType() {
		return type;
	}
	
	public boolean isNear(Block b) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean isSource() {
		return this.type.equals(Block.Type.SOURCE);
	}

	@Override
	public boolean isExit() {
		return this.type.equals(Block.Type.EXIT);
	}
	
	public void connect(Block b) {
		if(b==null)
			return;
		AbstractBlock ab;
		try {
			ab=(AbstractBlock)b;
		}catch (Exception e) {
			throw new IllegalArgumentException();
		}
		this.next=ab;
		ab.previous=this;
		
	}

	@Override
	public void disconnect() {
		this.next=null;		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(obj==this)
			return true;
		if(!(obj instanceof Block))
			return false;
		AbstractBlock b=(AbstractBlock)obj;
		if(b.next==this.next &&
				b.next==this.previous &&
				b.getType().equals(this.getType()))
			return true;
		return false;
		
	}
	/**
	 * not so usefull hashCode
	 */
	@Override
	public int hashCode() {
		return this.getType().hashCode();
	}

	public abstract double getValue();
	/**
	 * Simple toString
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AbstractBlock [next=");
		builder.append(next);
		builder.append(", previous=");
		builder.append(previous);
		builder.append(", type=");
		builder.append(type);
		builder.append(", getValue()=");
		builder.append(getValue());
		builder.append("]");
		return builder.toString();
	}

}
