#include "FarmAnimal.hpp"
#include <stdlib.h>
#include "tesRand.cpp"

FarmAnimal::FarmAnimal() {
    hungryCountdown = random(5,10);
}

void FarmAnimal::Move() {
    /* harus dicek dulu ada hewan atau sesuatu ga di dekatnya */
    if (Map::getMapEl(letak.getX() -  1,letak.getY()) == "-") { ///atas
        letak.setX(letak.getX() - 1);
        letak.setY(letak.getY());
    }
    else if (Map::getMapEl(letak.getX(),letak.getY() + 1) == "-") { ///kanan
        letak.setX(letak.getX());
        letak.setY(letak.getY() + 1);
    }
    else if (Map::getMapEl(letak.getX() + 1,letak.getY()) == "-") { ///bawah
        letak.setX(letak.getX() + 1);
        letak.setY(letak.getY());
    }
    else if (Map::getMapEl(letak.getX(),letak.getY() - 1) == "-") {
        letak.setX(letak.getX());
        letak.setY(letak.getY() - 1);
    }
}

bool FarmAnimal::isHungry() {
    return (FarmAnimal::getHungryCountdown() <= 5);
}

void FarmAnimal::Eat() {
    if (isHungry()) { /* dicek dulu dia ada di grass apa ngga, kalo iya bakal ngereset hungryCountdown */
        if (Map::getMapEl(letak.getX() - 1,letak.getY()) == "*") { ///atas
            letak.setX(letak.getX() - 1);
            letak.setY(letak.getY());
            Land::eatGrass();
        }
        else if (Map::getMapEl(letak.getX(),letak.getY() + 1) == "*") { ///kanan
            letak.setX(letak.getX());
            letak.setY(letak.getY() + 1);
            Land::eatGrass();
        }
        else if (Map::getMapEl(letak.getX() + 1,letak.getY()) == "*") { ///bawah
            letak.setX(letak.getX() + 1);
            letak.setY(letak.getY());
            Land::eatGrass();
        }
        else if (Map::getMapEl(letak.getX(),letak.getY() - 1) == "*") {
            letak.setX(letak.getX());
            letak.setY(letak.getY() - 1);
            Land::eatGrass();
        }
    }
}

int getHungryCountDown() {
    return hungryCountdown;
}

Point FarmAnimal::getPetakBinatang() {
    return letak;
}
