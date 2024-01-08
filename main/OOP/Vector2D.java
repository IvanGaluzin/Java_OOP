package OOP;
public class Vector2D {
    
    int posX, posY;

    public Vector2D(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }
    public float rangeEnemy(Vector2D posEnemy){
        double distance = Math.sqrt(Math.pow(posEnemy.posY-posY,2)+Math.pow(posEnemy.posX-posX,2));
        return (float)distance;
    }
}