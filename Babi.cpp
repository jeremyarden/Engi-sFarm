#include "Babi.hpp"

Babi::Babi() : dagingBabi("dagingBabi",5000,1) {
    letak.setX(8);
    letak.setY(2);
} ///ctor

void Babi::Talk() {
    printf("oink");
} ///babi mengeluarkan suara "oink"

bool Babi::isBabiDead() {
    return (FarmAnimal::getHungryCountdown() < 1);
} ///penanda babi hidup atau mati

Pork Babi::getDagingBabi(){
    return dagingBabi; 
} ///getter produk pork

void Babi::render(Map m) {
    m.setMapEl(letak.getX(),letak.getY(),'P');
}
