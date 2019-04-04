#include "Babi.hpp"

Babi::Babi() : dagingBabi(5000,1) {

} ///ctor

void Babi::Talk() {
    printf("oink");
} ///babi mengeluarkan suara "oink"

bool Babi::isBabiDead() {
    return (FarmAnimal::getHungryCountdown() < 1);
} ///penanda babi hidup atau mati

Pork Babi::getDagingBabi() const {
    return dagingBabi;
} ///getter produk pork