package simulatore;

public class OperationBlock extends AbstractBlock{
	public enum OperationType{ADD,MUL,POW,SQRT,NONE}
	private OperationType Operation=OperationType.NONE;
	private float value;
	public OperationBlock() {
		super(Type.OPERATION);
	}
	
	public OperationBlock(OperationType operation,float val) {
		super(Type.OPERATION);
		Operation=operation;
		value=val;
	}
	
	
	
	public double getValue() {
		double val= previous.getValue();
		switch (Operation) {
		case ADD:
			val+=value;
			break;
		case MUL:
			val *=value;
			break;
			
		case POW:
			val=(float) Math.pow(val, value);
			break;
			
		case SQRT:
			val = (float) Math.sqrt(val);
			break;
		case NONE:
			break;
		default:
			throw new IllegalArgumentException();
		}
		return val;
		
	}

}
