public class SelectionStatementsDemo {
    public static void main(String[] args) {
	int studentScore =82;

	if (studentScore >= 60) {
		System.out.println("You passed the exam!");
	}

	if (studentScore >=90) {
		System.out.println("Excellent Performance!");
	} else {
		System.out.println("Keep Improving!");
	}

	if (studentScore >=60) {
		if (studentScore >=90) {
			System.out.println("Grade: A");
		} else {
		if (studentScore >=75) {
			System.out.println("Grade: B");
	} else {
			System.out.println("Grade: C");
			}
		}
	} else {
		System.out.println("Grade: F");	
	}

	if (studentScore >=90) {
		System.out.println ("Multi-Way Grade: A");
	} else if (studentScore >= 80) {
		System.out.println ("Multi-Way Grade: B");
	} else if (studentScore >=70) {
		System.out.println ("Multi-Way Grade: C");
	} else if (studentScore >= 70) {
		System.out.println ("Multi-Way Grade: D");
	} else {
		System.out.println ("Multi-Way Grade: F");
	}
    }
}