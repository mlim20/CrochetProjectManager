package model;

import java.awt.*;
import java.time.LocalDateTime;

public class Project {
    private String name;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private int totalRows;
    private int currentRows;
    private Yarn[] yarns;
    private String[] otherMaterials;
    private double hookSize;

    private class Yarn {
        private String name;
        private Color color;
        private String brand;
    }
}
