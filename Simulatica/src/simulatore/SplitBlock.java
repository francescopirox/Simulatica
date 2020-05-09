package simulatore;

public class SplitBlock extends AbstractBlock{
	public SplitBlock() {
		super(Block.Type.DIRAMATION);
	}
	@Override
	public double getValue() {
		return previous.getValue();
	}
	
	

}
