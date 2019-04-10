#include "Kelinci.hpp"

Kelinci::Kelinci() : dagingKelinci("dagingKelinci",4000,1) {
    letak.setX(6);
    letak.setY(6);
} ///ctor

void Kelinci::Talk() {
    printf("cit cit");
} ///kelinci berbicara "cit cit"

bool Kelinci::isKelinciDead() {
    return (FarmAnimal::getHungryCountdown() < 1);
} ///penanda kelinci hidup atau mati

RabbitMeat Kelinci::getDagingKelinci() const {
    return dagingKelinci;
} ///getter daging kelinci

void Kelinci::render() {
    //Map::setMapEl(letak.getX(),letak.getY(),"R");
}
