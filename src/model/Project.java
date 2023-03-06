package model;

import java.awt.*;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;

    // what if project has more than one part?
//    private int totalRows;
//    private int currentRows;
    private List<Yarn> yarns;
    private List<Hook> hooks;
    private List<String> otherMaterials;

    // pattern or link to pattern?

    public Project(String name) {
        this.name = name;
        yarns = new ArrayList<>();
        otherMaterials = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public List<Yarn> getYarns() {
        return yarns;
    }

    public List<Hook> getHooks() {
        return hooks;
    }

    public List<String> getOtherMaterials() {
        return otherMaterials;
    }

    public void setName(String n) {
        name = n;
    }

    public void setStartDateTime(LocalDateTime ldt) {
        startDateTime = ldt;
    }

    public void setEndDateTime(LocalDateTime ldt) {
        endDateTime = ldt;
    }

    public void setYarns(List<Yarn> y) {
        yarns = y;
    }

    public void setHooks(List<Hook> h) {
        hooks = h;
    }

    public void setOtherMaterials(List<String> s) {
        otherMaterials = s;
    }

    private class Yarn {
        private String name;
        private Color color;
        private String brand;

        public Yarn(String name, Color color, String brand) {
            this.name = name;
            this.color = color;
            this.brand = brand;
        }
    }

    public class Hook {
        private double size;
        public Hook(double size) {
            this.size = size;
        }
    }

    public class Pattern {
        private String name;
        private URL link;

        public Pattern(String name, URL link) {
            this.name = name;
            this.link = link;
        }
    }
}
