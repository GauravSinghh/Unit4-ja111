package question_2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class EmployeeBonus {

	double getBonus(String joinDate) throws InvalidAgeException {
		LocalDate ld = LocalDate.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy");
		try {
			LocalDate dt = LocalDate.parse(joinDate, df);
			Period p = Period.between(dt, ld);
			
			if (p.getYears() < 1&&p.getYears()>=0) {
				return 5000;
			} else if (p.getYears() > 2) {
				return 10000;
			} else if (p.getYears() <= 2 && p.getYears() >= 1) {
				return 8000;
			} else {
				InvalidAgeException iae = new InvalidAgeException("Age should not be in future.");
				throw iae;
			}
		} catch (DateTimeException dte) {
			InvalidAgeException iae = new InvalidAgeException("Please pass the date in the correct format");
			throw iae;
		}

	}

}
