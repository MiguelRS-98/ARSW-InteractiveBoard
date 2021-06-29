package edu.escuelaing.arsw.interactiveboard;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * This class is in charge of controlling the drawing of the board.
 * @author Miguel Angel Rodriguez Siachoque
 * @author Luis Daniel Benavides Navarro
 */
@RestController
public class BoardController 
{
    private PointsCache cache = PointsCache.getInstance();
    private Gson objectJSON= new Gson();
    /**
     * This method get the list of points to draw.
     * @param points Points to draw.
     */
    @PostMapping("/points")
    public void processPoints (@RequestBody String points)
    {
        cache.setPositionsArr(objectJSON.fromJson(points, ObjectJSON.class).getPointsArr());
    }
    /**
     * This method draws the list of points.
     * @return List of saved points.
     */
    @GetMapping("/points")
    public String drawingPointsArr ()
    {
        ObjectJSON pointsArrSave = new ObjectJSON();
        pointsArrSave.setPointsArr(cache.getPositionsArr());
        return objectJSON.toJson(pointsArrSave);
    }
}