package com.csc205.project2;

public class Cylinder implements ThreeDimensionalShape
{
    private double height;
    private double radius;

    // Basic constructor for the cylinder class
    public Cylinder()
    {
        super();
        this.height = 0.0;
        this.radius = 0.0;
    }

    // Constructor for the cylinder class that takes a height and radius parameter
    public Cylinder(double h, double r)
    {
        this.height = h;
        this.radius = r;
    }

    // Getter method for the height of the cylinder
    public double getHeight()
    {
        return height;
    }

    //Getter method for the radius of the cylinder
    public double getRadius()
    {
        return radius;
    }

    //Setter method for the height of the cylinder
    public void setHeight(double h)
    {
        this.height = h;
    }

    //Setter method for the radius of the cylinder
    public void setRadius(double r)
    {
        this.radius = r;
    }

    // Method to calculate the surface area of the cylinder
    public double surfaceArea()
    {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Method to calculate the volume of the cylinder
    public double volume()
    {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // Method to return a string representation of the cylinder
    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
