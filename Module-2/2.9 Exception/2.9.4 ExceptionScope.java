package com.exception;
// valid
//public class Demo5 {
//	void show() throws ArithmeticException{
//		
//	}
//}
//class B extends Demo5{
//	void show() throws ArithmeticException{
//		
//	}
//}
// not valid because parent have low priority Exception
//public class Demo5 {
//	void show() throws ArithmeticException{
//		
//	}
//}
//class B extends Demo5{
//	void show() throws Exception{
//		
//	}
//}

// low priority for child is valid
public class ExceptionScope {
void show() throws Exception{
	
}
}
class B extends ExceptionScope{
void show() throws ArithmeticException{
	
}
}





