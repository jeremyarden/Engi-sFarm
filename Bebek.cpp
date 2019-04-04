#include "Bebek.hpp"

Bebek::Bebek() : telurBebek(3000,0), dagingBebek(4000,1) {

} ///ctor

void Bebek::Talk() {
    printf("kwek");
    telurBebek.addAmount();
} ///bebek mengeluarkan suara "kwek"

bool Bebek::isBebekDead() {
    return (FarmAnimal::getHungryCountdown() < 1);
} ///penanda bebek hidup atau mati

DuckEgg Bebek::getTelurBebek() const {
    return telurBebek;
} ///getter produk telur bebek

DuckMeat Bebek::getDagingBebek() const {
    return dagingBebek;
} ///getter produkk daging bebek