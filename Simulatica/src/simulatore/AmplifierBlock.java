package simulatore;

public class AmplifierBlock extends AbstractBlock {
	private float amplification;
	double value;
	public AmplifierBlock() {
		
		super(Block.Type.AMPLIFIER);
		this.value=0;
		this.amplification=1;
	}
	
	public AmplifierBlock(float amplificazione) {
		super(Block.Type.AMPLIFIER);
		this.value=0;
		this.amplification=amplificazione;
	}
	
	public void setAmplificationFactor(float amplificazione) {
		this.amplification=amplificazione;
	}
	public void setAmplificationGain(float fb) {
		//TODO
	}
	
	@Override
	public double getValue() {
		double f= previous.getValue();
		return f*amplification;
	}
}