package com.crisdavidpz.training.streamapi.basics;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class StreamAPIBasics {
    public static void main(String[] args) {
        List<StudentExamResult> results = getStudentResults();
        System.out.println("This is the list of results by student: " + results);
    }

    private static List<StudentExamResult> getStudentResults() {
        Exam oracleCertificationAssociated = new Exam("Java Certification");
        Exam scalaAdvancedCertification = new Exam("Scala Advanced Certification");
        Exam awsArchitectSolutionsCertified = new Exam("AWS Architect Solutions certified");

        List<StudentExamResult> results = new LinkedList<>();

        results.add(new StudentExamResult(
                60, "Marisol", oracleCertificationAssociated));
        results.add(new StudentExamResult(
                95, "Marisol", awsArchitectSolutionsCertified));
        results.add(new StudentExamResult(
                90, "Martina", scalaAdvancedCertification));
        results.add(new StudentExamResult(
                90, "Cris", awsArchitectSolutionsCertified));
        results.add(new StudentExamResult(
                92, "Cris", scalaAdvancedCertification));
        results.add(new StudentExamResult(
                97, "Cris", oracleCertificationAssociated));

        return results;
    }

    static class StudentExamResult {
        int roundedPercentage;
        String name;
        Exam exam;

        public StudentExamResult(int roundedPercentage, String name, Exam exam) {
            this.roundedPercentage = roundedPercentage;
            this.name = name;
            this.exam = exam;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            StudentExamResult that = (StudentExamResult) o;
            return roundedPercentage == that.roundedPercentage && Objects.equals(name, that.name) && Objects.equals(exam, that.exam);
        }

        @Override
        public int hashCode() {
            return Objects.hash(roundedPercentage, name, exam);
        }

        @Override
        public String toString() {
            return "StudentExamResult{" +
                    "roundedPercentage=" + roundedPercentage +
                    ", name='" + name + '\'' +
                    ", exam=" + exam +
                    '}';
        }
    }

    static class Exam {
        String exam;

        public Exam(String exam) {
            this.exam = exam;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Exam exam1 = (Exam) o;
            return Objects.equals(exam, exam1.exam);
        }

        @Override
        public int hashCode() {
            return Objects.hash(exam);
        }

        @Override
        public String toString() {
            return "Exam{" +
                    "exam='" + exam + '\'' +
                    '}';
        }
    }
}
