package ru.job4j.collection;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(profile -> profile.getAddress()).collect(Collectors.toList());
    }

    public static List<Address> collector(List<Address> profile) {
        Comparator<Address> list = Comparator.comparing(Address::getCity);

        return profile.stream().distinct().sorted(list).collect(Collectors.toList());
    }
}
