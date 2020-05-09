package simulatore;

public class AccumulatorBlock extends AbstractBlock {
	
	public AccumulatorBlock() {
		super(Type.ACCUMULATOR);
	
	}
	
	public double getValue() {
		value+= previous.getValue();
		return value;
	}

}
