package simulatore;

import java.util.ArrayList;

public class MergeBlock extends AbstractBlock {
	
	ArrayList<Duetto> diramazioni=new ArrayList<>();
	
	public MergeBlock() {
		super(Block.Type.DIRAMATION);
	}
	
	
	public void connect(Block b) {
		diramazioni.add(new Duetto(b,1));
	}
	
	public void connect(Block b,int segno) {
		diramazioni.add(new Duetto(b,segno));
	}
	
	@Override
	public double getValue() {
		float ret=0;
		for (Duetto duetto : diramazioni) {
			ret+=(Math.signum(duetto.segno)*duetto.b.getValue());
		}
		return ret;
	}
	
	private class Duetto{
		private Block b;
		private int segno;
		Duetto(Block b, int segno) {
			this.b = b;
			this.segno = segno;
		}
	}
	
}


	

