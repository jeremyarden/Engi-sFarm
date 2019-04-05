

#include "Map.hpp"


Map::Map(std::string filename)
{
    std::string line;
    std::ifstream file(filename);
    int row,col;
    if(file.is_open())
    {
        row = 0;col = 0;
        while (std::getline(file,line))
        {
            std::string::iterator it;
            for(it = line.begin(); it!=line.end();it++)
            {
                map[row][col] = *it;
                col++;
            }
            row++;
        }
        file.close();
    }
}

char Map::getMapEl(int i, int j)
{
    return map[i][j];
}

void Map::setMapEl(int i, int j, char El)
{
    map[i][j] = El;
}

void Map::drawMap()
{
    for(int i = 0;i<MAP_LENGTH;i++)
    {
        for(int j = 0;j<MAP_WIDTH;j++)
        {
            std::cout<<map[i][j];
        }
        std::cout<<std::endl;
    }
}
