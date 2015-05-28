public class TestTrueFalseExam
{
	public static void main(String[] args)
	{
		ExamEvaluator eval = new ExamEvaluator("TTFFTFFTFT");
		TrueFalseExam exam = new TrueFalseExam(687, "TFTTFTTFTF");
		eval.add(exam);
		exam = new TrueFalseExam(180, "TTTFTFTTFT");
		eval.add(exam);
		exam = new TrueFalseExam(340, "FTFTFTTTFF");
		eval.add(exam);
		exam = new TrueFalseExam(341, "FTTFTTTTTT");
		eval.add(exam);
		exam = new TrueFalseExam(401, "TTFFTFFTTT");
		eval.add(exam);
		exam = new TrueFalseExam(462, "TTFTTTFFTF");
		eval.add(exam);
		exam = new TrueFalseExam(463, "TTTTTTTTTT");
		eval.add(exam);
		exam = new TrueFalseExam(464, "FTFFTFFTFT");
		eval.add(exam);
		exam = new TrueFalseExam(512, "TFTFTFTFTF");
		eval.add(exam);
		exam = new TrueFalseExam(618, "TTTFFTTFTF");
		eval.add(exam);
		exam = new TrueFalseExam(619, "FFFFFFFFFF");
		eval.add(exam);
		exam = new TrueFalseExam(700, "FTFFTTFFFT");
		eval.add(exam);
		exam = new TrueFalseExam(712, "FTFTFTFTFT");
		eval.add(exam);
		exam = new TrueFalseExam(837, "TFTFTTFTFT");
		eval.add(exam);
		
		System.out.println(eval);
		eval.showGrades();
	}
}
