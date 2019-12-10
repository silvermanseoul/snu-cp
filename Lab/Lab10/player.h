#ifndef LAB10_PLAYER_H
#define LAB10_PLAYER_H

#include <iostream>
#include "monster.h"

class Player {
private:
    Monster *monsters[6];
public:
    void add_monster(string monster_type);
    void attack(Player player, int attack_monster_number, int defense_monster_number);
};

#endif //LAB10_PLAYER_H
