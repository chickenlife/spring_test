package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {

	private Exam exam;
	
	
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}


	public GridExamConsole() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("----------------------------");
		System.out.printf("total is %d, avg is %f\n",exam.total(),exam.avg());
		System.out.println("----------------------------");
	}


	@Override
	public void setExam(Exam exam) {
		// TODO Auto-generated method stub
		this.exam = exam;
	}

}
