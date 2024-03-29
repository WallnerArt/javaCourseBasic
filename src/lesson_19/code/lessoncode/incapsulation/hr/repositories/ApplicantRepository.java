package lesson_19.code.lessoncode.incapsulation.hr.repositories;

import lesson_19.code.lessoncode.incapsulation.hr.entity.Applicant;

import java.util.Arrays;

public class ApplicantRepository {

    Applicant[] applicants;

    public ApplicantRepository() {
        this.applicants = new Applicant[50];
    }

    public Applicant[] getApplicants() {
        return applicants;
    }

    // CRUD
    /*
    - create
    - read (find)
    - update
    - delete
     */

    public void add(Applicant applicant){
        for (int i = 0; i < applicants.length; i++) {
            if (applicants[i] == null) {
                applicants[i] = applicant;
                break;
            }
            System.out.println("База данных переполненна!");
        }
    }

    public Applicant findByName(String name){
        return null;
    }

    @Override
    public String toString() {
        return "ApplicantRepository{" +
                "applicants=" + Arrays.toString(applicants) +
                '}';
    }
}

