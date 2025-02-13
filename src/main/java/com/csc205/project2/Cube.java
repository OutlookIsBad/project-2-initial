package com.csc205.project2;

public class Cube implements ThreeDimensionalShape
{
    private double width;


    // Basic constructor for the cube class
    public Cube()
    {
        super();
        this.width = 0.0;

    }

    // Constructor for the cube class that takes a width parameter
    public Cube(double w)
    {
        this.width = w;
    }

    // Getter method for the width of the cube
    public double getWidth()
    {
        return width;
    }

    // Setter method for the width of the cube
    public void setWidth(double w)
    {
        this.width = w;
    }

    // Method to calculate the surface area of the cube
    public double surfaceArea()
    {
        return 6 * Math.pow(width, 2);
    }

    // Method to calculate the volume of the cube
    public double volume()
    {
        return Math.pow(width, 3);
    }

    // Method to return a string representation of the cube
    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
