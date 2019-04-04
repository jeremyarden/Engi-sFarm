//
//  Map.hpp
//  Engi's Farm
//
//  Created by Abiyyu Ismunandar on 3/20/19.
//  Copyright © 2019 Abiyyu Ismunandar. All rights reserved.
//

#ifndef Map_hpp
#define Map_hpp
#include <string>
#include <stdio.h>
#include "Cell.h"
/**
 Map Class. Kelas untuk membuat peta yang digunakan untuk permainan.
 */
class Map{
private:
    Cell **map;
public:
    /**
     Constructor map yang membuat peta dari file eksternal
     */
    Map(std::string filename);
    
    /**
     Getter elemen peta 
     */
    Cell getMapEl(int i,int j);
    /**
     Prosedur yang akan menggambarkan peta dengan legend-legendnya sesuai
     dengan tipe Cellnya
     */
    void drawMap();
};
#endif /* Map_hpp */
