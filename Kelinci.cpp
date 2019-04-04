#include "Kelinci.hpp"

Kelinci::Kelinci() : dagingKelinci(4000,1) {

} ///ctor

void Kelinci::Talk() {
    printf("cit cit")
} ///kelinci berbicara "cit cit"

bool Kelinci::isKelinciDead() {
    return (FarmAnimal::getHungryCountdown() < 1);
} ///penanda kelinci hidup atau mati

RabbitMeat Kelinci::getDagingKelinci() const {
    return dagingKelinci;
} ///getter daging kelinci