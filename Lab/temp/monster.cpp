#include "monster.h"

int Monster::lastId = 0;
Monster::Monster() {
    id = ++lastId;
}
void Monster::decreaseHealth(int damage) {
    health -= damage;
}

const string WaterMon::type = "WaterMon";
const string FireMon::type = "FireMon";
const string GrassMon::type = "GrassMon";

string WaterMon::getType() {
    return type;
}
string FireMon::getType() {
    return type;
}
string GrassMon::getType() {
    return type;
}

void WaterMon::attack(Monster *monster) {
    if(typeid(*monster) == typeid(FireMon))
        monster->decreaseHealth(this->CRITICAL_DAMAGE);
    else
        monster->decreaseHealth(this->DEFAULT_DAMAGE);
}
void FireMon::attack(Monster *monster) {
    if(typeid(*monster) == typeid(GrassMon))
        monster->decreaseHealth(this->CRITICAL_DAMAGE);
    else
        monster->decreaseHealth(this->DEFAULT_DAMAGE);
}
void GrassMon::attack(Monster *monster) {
    if(typeid(*monster) == typeid(WaterMon))
        monster->decreaseHealth(this->CRITICAL_DAMAGE);
    else
        monster->decreaseHealth(this->DEFAULT_DAMAGE);
}

ostream &operator<<(ostream &os, Monster *m) { // Why not 'Monster::operator<<'?
    os << "[" << typeid(*m).name() << " " << m->id << ", health=" << m->health << "]";
    return os;
}
//ostream &operator<<(ostream &os, const Monster& m) {
//    os << "[" << typeid(m).name() << " " << m.id << ", health=" << m.health << "]";
//    return os;
//}
