package entities.concretes;

import entities.abstracts.Users;

import java.util.ArrayList;
import java.util.List;

public class Doctors extends Users {

    private List<String> titles = new ArrayList<>();
    private List<Branches> branches = new ArrayList<>();
    private List<DoctorSituation> doctorSituations = new ArrayList<>();

    public Doctors(List<String> titles, List<Branches> branches, List<DoctorSituation> doctorSituations) {
        this.titles = titles;
        this.branches = branches;
        this.doctorSituations = doctorSituations;
    }

    public Doctors(String ad, String soyAd, String id, List<String> titles, List<Branches> branches, List<DoctorSituation> doctorSituations) {
        super(ad, soyAd, id);
        this.titles = titles;
        this.branches = branches;
        this.doctorSituations = doctorSituations;
    }

    public List<String> getTitles() {
        return titles;
    }

    public void setTitles(List<String> titles) {
        this.titles = titles;
    }

    public List<Branches> getBranches() {
        return branches;
    }

    public void setBranches(List<Branches> branches) {
        this.branches = branches;
    }

    public List<DoctorSituation> getDoctorSituations() {
        return doctorSituations;
    }

    public void setDoctorSituations(List<DoctorSituation> doctorSituations) {
        this.doctorSituations = doctorSituations;
    }

    @Override
    public String toString() {
        return "titles=" + titles +
                ", branches=" + branches +
                ", doctorSituations=" + doctorSituations;
    }
}
