package com.demo.samples;


class CompanyJobRepository {
	public static String getJobPrediction(int age, String highestQualification) throws NotEligibleException{
		String s = null;
		try {
			if (age < 19) {
				throw new NotEligibleException("You are underage for any job");
			}
			if ((age >= 21 && age <=25) && highestQualification.equalsIgnoreCase("B.E")) {
				s = "We have openings for junior developer";
			} else if ((age >= 26)
					&& (highestQualification.equalsIgnoreCase("M.S") || highestQualification.equalsIgnoreCase("PhD"))) {
				s = "We have openings for senior developer";
			} else if ((age >= 19) && !((highestQualification.equalsIgnoreCase("B.E")
					|| highestQualification.equalsIgnoreCase("M.S") || highestQualification.equalsIgnoreCase("PhD")))) {
				throw new NotEligibleException("We do not have any job that matches your qualifications");
			}else
				s = "Sorry we have no openings for now";
		} catch (NotEligibleException ne) {
			throw ne;
			//ne.printStackTrace();
		}
		return s;
	}

}

public class Source {
	public String searchForJob(int age, String highestQualification) throws NotEligibleException {
		String s  = null;
		try {
			if ((age >= 200) || (age <= 0)) {
				throw new NotEligibleException("The age entered is not typical for a human being");
			}else {
				CompanyJobRepository cc = new CompanyJobRepository();
				s = cc.getJobPrediction(age, highestQualification);
			}
		} catch (NotEligibleException n) {
			throw new NotEligibleException("The age entered is not typical for a human being");
		}
		if(s == null)
			s = "The age entered is not typical for a human being";
		return s;

	}

	public static void main(String args[]) throws Exception {
		try {
			System.out.println("hiii");
		Source s = new Source();
		String job = s.searchForJob(35, "M.S");
		System.out.println("jobbb "+job);
		}catch(NotEligibleException ne){
			ne.printStackTrace();
		}
	}
}

class NotEligibleException extends Exception {
	public NotEligibleException(String errorMessage) {
		super(errorMessage);
	}
}