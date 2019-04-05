#include "FarmAnimal.hpp"
#include <stdlib.h>
#include "tesRand.cpp"

FarmAnimal::FarmAnimal() {
    letak.setX(random(1,50)); //harus diganti jadi sesuai ukuran barn
    letak.setY(random(1,50)); //harus diganti jadi sesuai ukuran barn
    hungryCountdown = random(5,10);
    ada = true;
}

void FarmAnimal::Move() {
    /* harus dicek dulu ada hewan atau sesuatu ga di dekatnya */
}

bool FarmAnimal::isHungry() {
    return (getHungryCountDown() <= 5);
}

void FarmAnimal::Eat() {
    if (isHungry()) { /* dicek dulu dia ada di grass apa ngga, kalo iya bakal ngereset hungryCountdown */
        if (el[X][Y] == "")
    }
}

int getHungryCountDown() const {
    return hungryCountdown;
}

Point FarmAnimal::getPetakBinatang() {
    return letak;
}