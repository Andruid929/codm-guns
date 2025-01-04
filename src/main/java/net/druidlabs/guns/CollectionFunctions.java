package net.druidlabs.guns;

import java.util.Collection;
import java.util.List;
import java.util.Set;

abstract class CollectionFunctions {

    static List<Weapon> weaponsToList(Set<Weapon> collection) {
        return collection.stream().toList();
    }

    static List<String> getMasteryNamesOnly(Collection<Weapon> collection) {
        return collection.stream().map(Weapon::getMasteryName).toList();
    }

}
