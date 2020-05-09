package simulatore;

public class ExitBlock extends AbstractBlock {
	
	public ExitBlock() {
		super(null,null,Block.Type.EXIT);
	}
	@Override
	public double getValue() {
		return previous.getValue();
	}
	
	public void print() {
		System.out.println(previous.getValue()+"");
	}
	
}
