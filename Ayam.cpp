#include "Ayam.hpp"

Ayam::Ayam() : telurAyam("telurAyam",2000,0), dagingAyam("dagingAyam",3000,1) {
    
} ///ctor

void Ayam::Talk() {
    printf("petok petok");
    telurAyam.addAmount();
} ///ayam mengeluarkan suara "petok"

bool Ayam::isAyamDead() {
    return (FarmAnimal::getHungryCountdown() < 1);
} ///penanda ayam hidup atau mati

ChickenEgg Ayam::getTelurAyam() const {
    return telurAyam;
} ///getter produk telur ayam

ChickenMeat Ayam::getDagingAyam() const {
    return dagingAyam;
} ///getter produkk daging ayam

void Ayam::render() {
    Map::setMapEl(letak.getX(),letak.getY(),"C");
}