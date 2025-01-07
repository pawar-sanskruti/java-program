package sample;

public class ExaminationGracing {

    public static String determineGrade(int totalMarks, int aggregateMarks, int passingMarks, 
                                        boolean hasGraceMarksBenefit, boolean passesAllSubjects) {
        int graceLimit = Math.min((int) Math.ceil(0.01 * aggregateMarks), 10); // Minimum of 1% of aggregate or 10
        boolean qualifiesForGracing = passesAllSubjects && hasGraceMarksBenefit;

        if (qualifiesForGracing) {
            if (totalMarks + graceLimit >= passingMarks && totalMarks < aggregateMarks) {
                // Candidate qualifies for higher grade
                return "Next Higher Class or Grade";
            } else {
                // Grace marks not applicable
                return "Not Eligible for Gracing";
            }
        } else {
            // Candidate does not qualify for grace marks benefit
            return "Grace Not Applicable";
        }
    }

    public static void main(String[] args) {
        // Example inputs
        int totalMarks = 800;
        int aggregateMarks = 700;
        int passingMarks = 595;
        boolean hasGraceMarksBenefit = true;
        boolean passesAllSubjects = true;

        // Determine the result
        String result = determineGrade(totalMarks, aggregateMarks, passingMarks, 
                                       hasGraceMarksBenefit, passesAllSubjects);
        System.out.println("Result: " + result);
    }
}
