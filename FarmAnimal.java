class FarmAnimal {
    protected static int hungryCountdown;
    protected static Point letak;
    
    FarmAnimal() {
        hungryCountdown = 5;
        letak(0,0);
    }
    public void move(Map m) {
        /* harus dicek dulu ada hewan atau sesuatu ga di dekatnya */
        if (m.getMapEl(letak.getX() -  1,letak.getY()) == '-') { ///atas
            letak.setX(letak.getX() - 1);
            letak.setY(letak.getY());
        }
        else if (m.getMapEl(letak.getX(),letak.getY() + 1) == '-') { ///kanan
            letak.setX(letak.getX());
            letak.setY(letak.getY() + 1);
        }
        else if (m.getMapEl(letak.getX() + 1,letak.getY()) == '-') { ///bawah
            letak.setX(letak.getX() + 1);
            letak.setY(letak.getY());
        }
        else if (m.getMapEl(letak.getX(),letak.getY() - 1) == '-') {
            letak.setX(letak.getX());
            letak.setY(letak.getY() - 1);
        }
    }
    public Boolean isHungry() {
        return (getHungryCountdown() <= 5);
    }
    public void Eat(Map m) {
        if (isHungry()) { /* dicek dulu dia ada di grass apa ngga, kalo iya bakal ngereset hungryCountdown */
            if (m.getMapEl(letak.getX() - 1,letak.getY()) == '*') { ///atas
                letak.setX(letak.getX() - 1);
                letak.setY(letak.getY());
               // m.getEntity(letak.getX(), letak.getY())->eatGrass();
            }
            else if (m.getMapEl(letak.getX(),letak.getY() + 1) == '*') { ///kanan
                letak.setX(letak.getX());
                letak.setY(letak.getY() + 1);
                //m.getEntity(letak.getX(), letak.getY()).eatGrass();
            }
            else if (m.getMapEl(letak.getX() + 1,letak.getY()) == '*') { ///bawah
                letak.setX(letak.getX() + 1);
                letak.setY(letak.getY());
                //Land::eatGrass();
            }
            else if (m.getMapEl(letak.getX(),letak.getY() - 1) == '*') {
                letak.setX(letak.getX());
                letak.setY(letak.getY() - 1);
                //Land::eatGrass();
            }
        }
    }
    public int getHungryCountdown() {
        return hungryCountdown;
    }
    public Point getPetakBinatang() {
        return letak;
    }
}