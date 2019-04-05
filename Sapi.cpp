#include "Sapi.hpp"

Sapi::Sapi() : susuSapi("susuSapi",4000,0), dagingSapi("dagingSapi",6000,1) {
    letak.setX(5);
    letak.setY(3);
} ///ctor

void Sapi::Talk() {
    printf("moo");
    susuSapi.addAmount();
} ///sapi mengeluarkan suara "moo"

bool Sapi::isSapiDead() {
    return (FarmAnimal::getHungryCountdown() < 1);
} ///penanda sapi hidup atau mati

Beef Sapi::getDagingSapi() const {
    return dagingSapi;
} ///getter daging sapi

CowMilk Sapi::getSusuSapi() const {
    return susuSapi;
} ///getter susu sapi

void Sapi::render() {
    Map::setMapEl(letak.getX(),letak.getY(),"S");
}