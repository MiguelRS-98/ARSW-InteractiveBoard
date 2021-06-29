package edu.escuelaing.arsw.interactiveboard;

import java.util.ArrayList;

/**
 * This class is in charge of better configuring the JSON content.
 * @author Miguel Angel Rodriguez Siachoque
 */
public class ObjectJSON {
    private ArrayList<ArrayList<String>> pointsarr;
    /**
     * This method is responsible for obtaining the list of points.
     * @return User point list.
     */
    public ArrayList<ArrayList<String>> getPointsArr ()
    {
        this.pointsarr = pointsarr;
        return pointsarr;
    }
    /**
     * This method is responsible for assigning the list of points.
     * @param newPoints New user point list.
     */
    public void setPointsArr (ArrayList<ArrayList<String>> newPoints)
    {
        this.pointsarr = newPoints;
    }
}