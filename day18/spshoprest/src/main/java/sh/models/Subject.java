package sh.models;

public class Subject {
	private String subject;
	public Subject() {
	}
	public Subject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Subject [subject=" + subject + "]";
	}
}
