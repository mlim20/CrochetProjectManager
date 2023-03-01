package model;

import java.awt.*;
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

    private class Yarn {
        private String name;
        private Color color;
        private String brand;

        public Yarn(String name, Color color, String brand) {
            name = this.name;
            color = this.color;
            brand = this.brand;
        }
    }

    public class Hook {
        private double size;

        public Hook(double size) {
            size = this.size;
        }
    }
}
