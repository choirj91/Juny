package File_Object;

import java.io.Serializable;

public class Grade implements Serializable {
	private String subject;
	private int score;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	@Override
	public String toString() {
		return "Grade [subject=" + subject + ", score=" + score + "]";
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	

}
