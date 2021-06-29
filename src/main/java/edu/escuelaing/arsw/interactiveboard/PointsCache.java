package edu.escuelaing.arsw.interactiveboard;

import java.util.ArrayList;

/**
 * This is the cache class for assigning point positions.
 * @author Miguel Angel Rodriguez Siachoque
 * @author Luis Daniel Benavides Navarro
 */
public class PointsCache 
{
    private static PointsCache _instance = new PointsCache();
    private ArrayList<ArrayList<String>> pointsPosition = new ArrayList<>();
    /**
     * This method assigns the singleton.
     * @return singleton.
     */
    public static PointsCache getInstance ()
    {
        return _instance;
    }
    /**
     * This method assigns point positions in the list.
     * @param newPointsPosition New user points.
     */
    public void setPositionsArr (ArrayList<ArrayList<String>> newPointsPosition) 
    {
        newPointsPosition.stream().filter((point) -> (!pointsPosition.contains(point))).forEachOrdered((point) -> {
            pointsPosition.add(point);
        });
    }
    /**
     * This method gets the position of the points in the list.
     * @return List of points.
     */
    public ArrayList<ArrayList<String>> getPositionsArr () 
    {
        return pointsPosition;
    }
}