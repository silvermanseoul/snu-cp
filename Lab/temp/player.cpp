#include "player.h"

void Player::add_monster(string monster_type) {
    if(monster_type == "WaterMon")
        monsters[++lastNum] = new WaterMon;
    else if(monster_type == "FireMon")
        monsters[++lastNum] = new FireMon;
    else if(monster_type == "GrassMon")
        monsters[++lastNum] = new GrassMon;
    else
        cout << "Invalid monster type" << endl;
}
void Player::attack(Player player, int attack_monster_number, int defense_monster_number) {
    monsters[attack_monster_number]->attack(player.monsters[defense_monster_number]);
}

ostream &operator<<(ostream &os, const Player &p) { // Why not 'Player::operator<<'?
    for(int i = 1; i <= p.lastNum; i++) {
        os << p.monsters[i];
//        os << *(p.monsters[i]);
    }
    return os;
}
