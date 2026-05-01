public class Rectangle {

		private double length;
		private double width;
	
	//con
	public Rectangle (double length, double width){
			this.length = length;
			this.width = width;

	}
	//get
	public double getLength(){
		return this.length;
	}

	
	public double getWidth(){
		return this.width;
	}
	
	
	//func
	public double area(){
		return this.width * this.length;
		
	}

	public double perimeter(){
	if(width == 0){

		return 0;

	}

		return 2*(this.length + this.width);

	
	
	}
}
