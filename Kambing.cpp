#include "Kambing.hpp"

Kambing::Kambing() : susuKambing("susuKambing",4000,0), dagingKambing("dagingKambing",5000,1) {
    letak.setX(5);
    letak.setY(6);
} ///ctor

void Kambing::Talk() {
    printf("mbek")
    susuKambing.addAmount();
} ///kambing mengeluarkan suara "mbek"

bool Kambing::isKambingDead() {
    return (FarmAnimal::getHungryCountdown() < 1);
} ///penanda kambing hidup atau mati
        
GoatMilk Kambing::getSusuKambing() const {
    return susuKambing;
} ///getter susu kambing

GoatMeat Kambing::getDagingKambing() const {
    return dagingKambing;
} ///getter daging kambing

void Kambing::render() {
    Map::setMapEl(letak.getX(),letak.getY(),"G");
}