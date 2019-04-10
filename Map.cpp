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
                
                switch (*it)
                {
                    case 'o':
                        entity[(MAP_WIDTH*row)+col] = new Coop(*new Point(row,col));
                        break;
                    case '-':
                        entity[(MAP_WIDTH*row)+col] = new Grassland(*new Point(row,col));
                        break;
                    case 'x':
                        entity[(MAP_WIDTH*row)+col] = new Barn(*new Point(row,col)); 
                        break;
                    case 'T':
                        entity[(MAP_WIDTH*row)+col] = new Truck(*new Point(row,col));
                        break;
                    case 'M':
                        entity[(MAP_WIDTH*row)+col] = new Mixer(*new Point(row,col));
                        break;
                    case 'W':
                        entity[(MAP_WIDTH*row)+col] = new Truck(*new Point(row,col));
                        break;
                        /*
                    case 'C':
                        entity[(MAP_WIDTH*row)+col] = new Ayam(); 
                        break;
                    case 'P':
                        entity[(MAP_WIDTH*row)+col] = new Babi(); 
                        break;
                    case 'D':
                        entity[(MAP_WIDTH*row)+col] = new Bebek(); 
                        break;
                    case 'G':
                        entity[(MAP_WIDTH*row)+col] = new Kambing();
                        break;
                    case 'R':
                        entity[(MAP_WIDTH*row)+col] = new Kelinci();
                        break;
                    case 'S':
                        entity[(MAP_WIDTH*row)+col] = new Kelinci();
                        break;
                         */
                    default:
                        break;
                }
                col++;
            }
            col = 0;
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
            cout<<map[i][j];
        }
        cout<<endl;
    }
}

Renderable * Map::getEntity(int i, int j) 
{ 
    return entity[(i*MAP_WIDTH)+j];
}
