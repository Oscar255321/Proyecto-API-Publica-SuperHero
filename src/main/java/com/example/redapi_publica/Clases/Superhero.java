package com.example.redapi_publica.Clases;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Superhero {

        @SerializedName("id")
        private String id;

        @SerializedName("name")
        private String name;

        @SerializedName("powerstats")
        private PowerStats powerstats;

        @SerializedName("biography")
        private Biography biography;

        @SerializedName("appearance")
        private Appearance appearance;

        @SerializedName("work")
        private Work work;

        @SerializedName("connections")
        private Connections connections;

        @SerializedName("image")
        private Image image;

        // Getters y Setters

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public PowerStats getPowerstats() {
            return powerstats;
        }

        public void setPowerstats(PowerStats powerstats) {
            this.powerstats = powerstats;
        }

        public Biography getBiography() {
            return biography;
        }

        public void setBiography(Biography biography) {
            this.biography = biography;
        }

        public Appearance getAppearance() {
            return appearance;
        }

        public void setAppearance(Appearance appearance) {
            this.appearance = appearance;
        }

        public Work getWork() {
            return work;
        }

        public void setWork(Work work) {
            this.work = work;
        }

        public Connections getConnections() {
            return connections;
        }

        public void setConnections(Connections connections) {
            this.connections = connections;
        }

        public Image getImage() {
            return image;
        }

        public void setImage(Image image) {
            this.image = image;
        }

    public static class PowerStats {
        @SerializedName("intelligence")
        private String intelligence;

        @SerializedName("strength")
        private String strength;

        @SerializedName("speed")
        private String speed;

        @SerializedName("durability")
        private String durability;

        @SerializedName("power")
        private String power;

        @SerializedName("combat")
        private String combat;

        // Getters y Setters

        public String getIntelligence() {
            return intelligence;
        }

        public void setIntelligence(String intelligence) {
            this.intelligence = intelligence;
        }

        public String getStrength() {
            return strength;
        }

        public void setStrength(String strength) {
            this.strength = strength;
        }

        public String getSpeed() {
            return speed;
        }

        public void setSpeed(String speed) {
            this.speed = speed;
        }

        public String getDurability() {
            return durability;
        }

        public void setDurability(String durability) {
            this.durability = durability;
        }

        public String getPower() {
            return power;
        }

        public void setPower(String power) {
            this.power = power;
        }

        public String getCombat() {
            return combat;
        }

        public void setCombat(String combat) {
            this.combat = combat;
        }
    }

    public static class Biography {
        @SerializedName("full-name")
        private String fullName;

        @SerializedName("place-of-birth")
        private String placeOfBirth;

        @SerializedName("aliases")
        private ArrayList<String> aliases;

        @SerializedName("alter-egos")
        private String alter_egos;

        @SerializedName("first-apparance")
        private String first_appearance;

        @SerializedName("publisher")
        private String publisher;

        @SerializedName("alignment")
        private String alignment;

        // Getters y Setters

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getPlaceOfBirth() {
            return placeOfBirth;
        }

        public void setPlaceOfBirth(String placeOfBirth) {
            this.placeOfBirth = placeOfBirth;
        }

        public ArrayList<String> getAliases() {
            return aliases;
        }

        public void setAliases(ArrayList<String> aliases) {
            this.aliases = aliases;
        }

        public String getAlter_egos() {
            return alter_egos;
        }

        public void setAlter_egos(String alter_egos) {
            this.alter_egos = alter_egos;
        }

        public String getFirst_appearance() {
            return first_appearance;
        }

        public void setFirst_appearance(String first_appearance) {
            this.first_appearance = first_appearance;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public String getAlignment() {
            return alignment;
        }

        public void setAlignment(String alignment) {
            this.alignment = alignment;
        }
    }

    public static class Appearance {
        @SerializedName("gender")
        private String gender;

        @SerializedName("race")
        private String race;

        @SerializedName("height")
        private ArrayList<String> height;

        @SerializedName("weight")
        private ArrayList<String> weight;

        @SerializedName("eye-color")
        private String eye_color;

        @SerializedName("hair-color")
        private String hair_color;

        // Getters y Setters

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getRace() {
            return race;
        }

        public void setRace(String race) {
            this.race = race;
        }
    }

    public static class Work {
        @SerializedName("occupation")
        private String occupation;

        @SerializedName("base")
        private String base;

        // Getters y Setters

        public String getOccupation() {
            return occupation;
        }

        public void setOccupation(String occupation) {
            this.occupation = occupation;
        }

        public String getBase() {
            return base;
        }

        public void setBase(String base) {
            this.base = base;
        }
    }

    public static class Connections {
        @SerializedName("group-affiliation")
        private String groupAffiliation;

        @SerializedName("relatives")
        private String relatives;

        // Getters y Setters

        public String getGroupAffiliation() {
            return groupAffiliation;
        }

        public void setGroupAffiliation(String groupAffiliation) {
            this.groupAffiliation = groupAffiliation;
        }

        public String getRelatives() {
            return relatives;
        }

        public void setRelatives(String relatives) {
            this.relatives = relatives;
        }
    }

    public static class Image {
        @SerializedName("url")
        private String url;

        // Getters y Setters

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}


