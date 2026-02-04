package main;

public class Student {
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int age, int htmlScore, int cssScore, int javaScore, double height, double weight,
			char gender, boolean isMajor) {
		super();
		this.name = name;
		this.age = age;
		this.htmlScore = htmlScore;
		this.cssScore = cssScore;
		this.javaScore = javaScore;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.isMajor = isMajor;
	}

	private String name;
	private int age;
	private int htmlScore;
	private int cssScore;
	private int javaScore;
	private double height;
	private double weight;
	private char gender;
	private boolean isMajor;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHtmlScore() {
		return htmlScore;
	}
	public void setHtmlScore(int htmlScore) {
		this.htmlScore = htmlScore;
	}
	public int getCssScore() {
		return cssScore;
	}
	public void setCssScore(int cssScore) {
		this.cssScore = cssScore;
	}
	public int getJavaScore() {
		return javaScore;
	}
	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public boolean isMajor() {
		return isMajor;
	}
	public void setMajor(boolean isMajor) {
		this.isMajor = isMajor;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", htmlScore=" + htmlScore + ", cssScore=" + cssScore
				+ ", javaScore=" + javaScore + ",\n height=" + height + ", weight=" + weight + ", gender=" + gender
				+ ", isMajor=" + isMajor + "]";
	}
	
	
	
}
