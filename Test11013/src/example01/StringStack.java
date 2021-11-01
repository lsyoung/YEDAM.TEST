package example01;

public class StringStack implements Stack {
	
	private String[]stack;
	private int size;
	private int set;
	//생성자
	public StringStack(int size) {
		this.size = size;
		stack = new String[size];
		this.set = 0;
	}
	// 현재 스택에 저장된 개수 리턴
	@Override
	public int length() {
		return set;
	}
	// 스택의 전체 저장 가능한 개수 리턴
	@Override
	public int capacity() {
		return stack.length;
	}
	//스택의 톱(top)에 저장된 값을 가져옴
	@Override
	public String pop() {
		//set이 가질 수 있는 최대값: size
		//set이 가질 수 있는 최소값: 0
		if(set == 0) {
			return null;
		}
		return stack[--set];
	}
	// 스택의 톱(top)에 값을 저장함.
	@Override
	public boolean push(String val) {
		if(set<size) {
			stack[set++] = val;
			return true;
		}else {
		return false;
	}
	}
	                       
	

}
