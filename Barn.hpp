//
//  Barn.hpp
//  Engi's Farm
//
//  Created by Abiyyu Ismunandar on 4/5/19.
//  Copyright © 2019 Abiyyu Ismunandar. All rights reserved.
//

#ifndef Barn_hpp
#define Barn_hpp
#include "Land.hpp"
#include "Point.hpp"
#include "Renderable.hpp"
#include <stdio.h>

class Barn : public Land, public Renderable
{
public:
    Barn(Point P);
    void render();
};

#endif /* Barn_hpp */
