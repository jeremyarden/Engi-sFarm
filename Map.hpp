#ifndef Map_hpp
#define Map_hpp
#include <string>
#include <iostream>
#include <fstream>
#include "Point.hpp"
#include "Renderable.hpp"

/*
class Coop;
class Barn;
class Truck;
class Mixer;
class Grassland;
class Bebek;
class Kambing;
class Kelinci;
class Ayam;
class Babi;
#include "Ayam.hpp"
#include "Babi.hpp"
#include "Bebek.hpp"
#include "Kambing.hpp"
#include "Kelinci.hpp"
*/

#include "Coop.hpp"
#include "Barn.hpp"
#include "Truck.hpp"
#include "Mixer.hpp"
#include "Grassland.hpp"


/**
 Map Class. Kelas untuk membuat peta yang digunakan untuk permainan.
 */
class Map{
private:
    const static int MAP_LENGTH = 10;
    const static int MAP_WIDTH = 11;
    char map[MAP_LENGTH][MAP_WIDTH];
    Renderable * entity[MAP_LENGTH*MAP_WIDTH];
public:
    /**
     Constructor map yang membuat peta dari file eksternal
     */
    Map(std::string filename);
    
    /**
     Getter elemen peta 
     */
    char getMapEl(int i,int j);
    /**
     */
    void setMapEl(int i,int j, char El);
    /**
     Prosedur yang akan menggambarkan peta dengan legend-legendnya sesuai
     dengan isinya
     */
    void drawMap();
    Renderable* getEntity(int i, int j);
};
#endif /* Map_hpp */
