package com.bible.java.chapter12.donghwan.genericWild;

import java.util.Arrays;

public class WildEx {
	
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "수강생 : "+ Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "수강생 : "+ Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName()+" 수강생 : "+Arrays.toString(course.getStudents()));
	}
	
	public static void main(String args[]) {
		Course<Person> pCourse = new Course<>("일반인 과정", 5);
		pCourse.add(new Person("일반인"));
		pCourse.add(new Person("직장인"));
		pCourse.add(new Person("학생"));
		pCourse.add(new Person("고등학생"));
		
		Course<Worker> workerCourse = new Course<>("직장인 과정", 5);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> sCourse = new Course<>("학생 과정", 5);
		sCourse.add(new Student("학생"));
		sCourse.add(new HighStudent("고등학생"));
		
		Course<HighStudent> hCourse = new Course<>("고등학생 과정", 5);
		hCourse.add(new HighStudent("고등학생"));
		
		registerCourse(pCourse);
		registerCourseWorker(workerCourse);
		registerCourseStudent(sCourse);
	}
}
