class Demo{
	public String toString() {
		return "I am Batman!";
	}
	public static void main(String[] args) {
		System.out.println(args[0] + " Maharana");
	}	
}

class Alchemist{
	public static void main(String[] name) {
		System.out.println(name[2] + " Alechemist");
	}
}

class Test {

	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d);
		String name[] = {"Dev", "Ashish", "Fullmetal"};
		Demo.main(name);
		Alchemist.main(name);
		Wrapper.main(new String[0]);
		
	}
}

class Wrapper {
    public static void main(String[] args) {
        String s = "aa";
        System.out.println(s.hashCode());
        Boolean bo = false;
        System.out.println(bo.hashCode());
    }
}
