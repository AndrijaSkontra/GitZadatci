package model;

import lombok.Getter;

import java.util.ArrayList;

public class Programmer {

    @Getter private String firstName;
    @Getter private String lastName;
    @Getter private String bestLanguage;
    @Getter private ArrayList<String> experiencedIn;
    @Getter private String workingTime;

    private Programmer(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.bestLanguage = builder.bestLanguage;
        this.experiencedIn = builder.experiencedIn;
        this.workingTime = builder.workingTime;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String bestLanguage;
        private ArrayList<String> experiencedIn;
        private String workingTime;

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withBestLanguage(String bestLanguage) {
            this.bestLanguage = bestLanguage;
            return this;
        }

        public Builder withExperience(ArrayList<String> experiencedIn) {
            this.experiencedIn = experiencedIn;
            return this;
        }

        public Builder withWorkingTime(String workingTime) {
            this.workingTime = workingTime;
            return this;
        }

        public Programmer build() {
            return new Programmer(this);
        }
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bestLanguage='" + bestLanguage + '\'' +
                ", experiencedIn=" + experiencedIn +
                ", workingTime='" + workingTime + '\'' +
                '}';
    }
}