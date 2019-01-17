package com.techlab.person;

public class Person {

	private int age;
	private String name;
	private double height;
	private double weight;
	private GenderOptions genderoption;
	private double bmi = 0;
	private String category;

	public Person(int age, String name, double height, double weight, GenderOptions genderoption) {
		this.age = age;
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.genderoption = genderoption;

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public GenderOptions getGenderoption() {
		return genderoption;
	}

	public void setGenderoption(GenderOptions genderoption) {
		this.genderoption = genderoption;
	}

	public double bmiScore() {
		this.bmi = ((this.weight) / (this.height * this.height));
		return bmi;
	}

	public void workout() {
		this.weight = weight - (300/weight);
	}

	public void eat() {
		this.weight = weight + (300/weight);
		this.height = height + (300/height);
	}

	public String bmiCategory() {
		if (this.bmi < 18.5) {
			return "Underweight";
		}
		if (this.bmi >= 18.5 && this.bmi <= 24.9) {
			return "normal";
		}
		return "Overweight";

	}

}
