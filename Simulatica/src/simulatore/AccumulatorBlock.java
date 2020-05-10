package simulatore;

public class AccumulatorBlock extends AbstractBlock {
	double value;
	public AccumulatorBlock() {
		super(Type.ACCUMULATOR);
	
	}
	
	public double getValue() {
		value+= previous.getValue();
		return value;
	}

}
