package simulatore;

public class SourceBlock extends AbstractBlock{
	long tempoIniziale=System.currentTimeMillis()/1000;
	double arg;
	double phase;
	Function function=Function.NONE;
	enum Function{SINE, COSINE, STEP, RAMP, NONE};
	
	public SourceBlock() {
		super(null, null,Block.Type.SOURCE);
	}

	public SourceBlock(Function f,double arg,double phase) {
		new SourceBlock();
		this.function=f;
		this.arg=arg;
		this.phase=phase;
		
	}
	public SourceBlock(Function f,double arg) {
		new SourceBlock(f,arg,0);
		this.function=f;
	}
	
	public SourceBlock(Function f) {
		new SourceBlock(f,1,0);
		this.arg=1;
		this.function=f;
	}
	
	
	public void setFunction(Function f) {
		this.function=f;
	}
	
	public void setArgument(double arg) {
		this.arg=arg;
	}
	
	@Override
	public double getValue() {
		double time=(double)(System.currentTimeMillis()/1000-tempoIniziale);
		this.t=time;
		switch (function) {
		case SINE: {
			value =(float)Math.sin((arg*t)+phase);
			break;
		}
		case COSINE: {
			value =(float)Math.cos((arg*t)+phase);
			break;
		}
		case RAMP:{
			value = (float) (t);
			break;
		}
		case STEP:{
			value= 1;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: "+function);
			
	}
	return value;
	}
		
	public void start() {
		this.t=0;
		long tempoIniziale=System.currentTimeMillis()/1000;
		switch (function) {
		case SINE: {
			value =(float)Math.sin(phase);
			break;
		}
		case COSINE: {
			value =(float)Math.cos(phase);
			break;
		}
		case RAMP:{
			value = (0);
			break;
		}
		case STEP:{
			value= 1;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: "+function);
		}
	}
}
