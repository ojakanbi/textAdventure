import java.util.ArrayList;

/**
 * Represents a tile in a 2-dimensional game map.
 */

public class MapTile {
    private int x;
    private int y;

    /**
     * Constructs a new MapTile instance with the specified x and y coordinates.
     *
     * @param x - the x-coordinate of the MapTile
     * @param y - the y-coordinate of the MapTile
     */

    public MapTile(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns an ArrayList of MapTile objects representing the adjacent tiles to the current tile.
     *
     * @return an ArrayList of MapTile objects representing the adjacent tiles to the current tile
     */
    public ArrayList<MapTile> adjacentMoves() {
        ArrayList<MapTile> adjacent = new ArrayList<>();

        // adds the adjacent tiles to the array list to see where user can move to
        adjacent.add(new MapTile(x-1, y)); // shows left
        adjacent.add(new MapTile(x+1, y)); // shows right
        adjacent.add(new MapTile(x, y-1)); // shows up
        adjacent.add(new MapTile(x, y+1)); // shows down
        return adjacent;
    }
}

