/**
 * Building Blocks - Java
 * 
 * Write a class Block that creates a block (Duh..)
 * 
 * ##Requirements
 * The constructor should take an array as an argument, this will contain 3 integers of the form
 * [width, length, height] from which the Block should be created.
 * 
 * Define these methods:
 * `getWidth()` return the width of the `Block`
 * `getLength()` return the length of the `Block`
 * `getHeight()` return the height of the `Block`
 * `getVolume()` return the volume of the `Block`
 * `getSurfaceArea()` return the surface area of the `Block`
 * 
 * @author Unai de la O
 */
public class BuildingBlocks {
    // Attributes
    private int width;
    private int length;
    private int height;
    private int volume;
    private int surface;
    
    // Constructor
    public BuildingBlocks(int[] arr) {
        width = arr[0];
        length = arr[1];
        height = arr[2];
    }
    
    // Getters
    public int getWidth() {
        return this.width;
    }
    public int getLength() {
        return this.length;
    }
    public int getHeight() {
        return this.height;
    }
    public int getVolume() {
        return width * length * height;
    }
    public int getSurfaceArea() {
        return (2 * (height * length)) + (2 * (height * width)) + (2 * (length * width));
    }
}