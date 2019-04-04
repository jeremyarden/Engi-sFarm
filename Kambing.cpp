#include "Kambing.hpp"

Kambing::Kambing() : susuKambing(4000,0), dagingKambing(5000,1) {

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