
/**
 * This class calculates the surface area and total cost of the PaintJob.
 *
 * @author Umasathvik Pantham
 * @version 02/27/2021
 */
public class PaintJob
{
    // instance variables
    private double length;
    private double width;
    public static final int SQ_INCHES_PER_SQ_FOOT = 144;
    public static final double WALL_HEIGHT_IN_FEET = 8;
    public static final double DOOR_HEIGHT_IN_INCHES = 80;
    public static final double DOOR_WIDTH_IN_INCHES = 32;
    public static final double WINDOW_HEIGHT_IN_FEET = 5;
    public static final double WINDOW_WIDTH_IN_FEET = 4;
    
    /**
     * Constructs a paint job with the given length and width.
     * 
     * @param theLength the length of the paint job
     * @param theWidth the width of the paint job
     */
    public PaintJob(double theLength, double theWidth)
    {
        length = theLength;
        width = theWidth;
    }

    /**
     * Gets the length of the paint job.
     *
     * @return the length of the paint job
     */
    public double getLength()
    {
        return length;
    }
    
    /**
     * Gets the width of the paint job.
     *
     * @return the width of the paint job
     */
    public double getWidth()
    {
        return width;
    }
    
    /**
     * Sets the dimensions of length and width to feet for the room.
     *
     * @param newLength the new length in feet
     * @param newWidth the new width in feet
     */
    public void setDimensions(double newLength, double newWidth)
    {
        length = newLength;
        width = newWidth;
    }
    
    /**
     * Paints the surface area excluding the door and window.
     *
     * @return the surface area of the paint job
     */
    public double surfaceArea()
    {
        return 2 * (WALL_HEIGHT_IN_FEET * length) + 2 * (WALL_HEIGHT_IN_FEET * width)
               + (length * width) - (WINDOW_HEIGHT_IN_FEET * WINDOW_WIDTH_IN_FEET)
               - ((DOOR_HEIGHT_IN_INCHES * DOOR_WIDTH_IN_INCHES) / SQ_INCHES_PER_SQ_FOOT);
    }
    
    /**
     * Gets the cost of the paint job.
     *
     * @return the cost of the paint job
     */
    public double costOfPaint()
    {
        return (surfaceArea() / 300) * 31.95;
    }
    
    /**
     * Gets the total cost of the paint job.
     *
     * @return the total cost of the paint job
     */
    public double totalJobCost()
    {
        return (costOfPaint() + 100);
    }
}
