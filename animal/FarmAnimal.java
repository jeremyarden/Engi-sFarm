package animal;

import game.Map;
import game.Point;
import game.Renderable;

public abstract class FarmAnimal implements Renderable{
    protected static int hungryCountdown;
    protected Point letak;
    
    FarmAnimal() {
        hungryCountdown = 5;
        letak = new Point(0,0);
    }
    public void move(Map m) {
        /* harus dicek dulu ada hewan atau sesuatu ga di dekatnya */
        if (canMove(m.getMapEl(letak.getX() -  1,letak.getY()))) { ///atas
        		if(letak.getX() -  1 > 0)
        		{
	            letak.setX(letak.getX() - 1);
	            letak.setY(letak.getY());
        		}
        }
        else if (canMove(m.getMapEl(letak.getX(),letak.getY() + 1))) { ///kanan
        		if(letak.getY() + 1 < m.getMapWidth())
        		{
	            letak.setX(letak.getX());
	            letak.setY(letak.getY() + 1);
        		}
        }
        else if (canMove(m.getMapEl(letak.getX() + 1,letak.getY()))) { ///bawah
        		if(letak.getX() + 1 < m.getMapLength())
        		{
	            letak.setX(letak.getX() + 1);
	            letak.setY(letak.getY());
        		}
        }
        else if (canMove(m.getMapEl(letak.getX(),letak.getY() - 1))) {
        		if(letak.getY() - 1 > 0)
        		{
	            letak.setX(letak.getX());
	            letak.setY(letak.getY() - 1);
        		}
        }
    }
    public Boolean isHungry() {
        return (getHungryCountdown() <= 5);
    }
    public void Eat(Map m) {
        if (isHungry()) { /* dicek dulu dia ada di grass apa ngga, kalo iya bakal ngereset hungryCountdown */
            if (m.getMapEl(letak.getX() - 1,letak.getY()) == '*') { ///atas
                m.getLandPos(letak.getX() - 1, letak.getY()).eaten();
                
            }
            else if (m.getMapEl(letak.getX(),letak.getY() + 1) == '*') { ///kanan
            		m.getLandPos(letak.getX(), letak.getY()+1).eaten();
            }
            else if (m.getMapEl(letak.getX() + 1,letak.getY()) == '*') { ///bawah
            		m.getLandPos(letak.getX()  + 1, letak.getY()).eaten();
            }
            else if (m.getMapEl(letak.getX(),letak.getY() - 1) == '*') {
            		m.getLandPos(letak.getX(), letak.getY()-1).eaten();
            }
        }
    }
    public int getHungryCountdown() {
        return hungryCountdown;
    }
    public Point getPetakBinatang() {
        return letak;
    }
    private boolean canMove(char c)
    {
    		return c == '-' || c == 'o' || c == 'x'; 
    }
	public abstract void render(Map m);
}