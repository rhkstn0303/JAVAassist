package ex3;

class TV {
	public String Tv_name;
	public int year;
	public int inch;
	public TV() {}
	public TV(String Tv_name,int year,int inch) {
		this.Tv_name = Tv_name;
		this.year = year;
		this.inch = inch;
	}
	public void show() {
		System.out.println(this.Tv_name+"에서 만든 "+year+"년형 "+inch+"인치 TV");
	}
}


public class Ex_1 {

	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
		System.out.println((char)0xAC00);
		System.out.println((char)0xD7A3);
	}

}

