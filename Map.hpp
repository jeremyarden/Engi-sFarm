

#ifndef Map_hpp
#define Map_hpp
#include <string>
#include <iostream>
#include <fstream>
#include "Renderable.hpp"
#include "Coop.hpp"
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
};
#endif /* Map_hpp */
