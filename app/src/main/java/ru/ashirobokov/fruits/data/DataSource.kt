package ru.ashirobokov.fruits.data

import ru.ashirobokov.fruits.R
import ru.ashirobokov.fruits.model.Fruit

class DataSource {
    fun listOfFruits() : List<Fruit> {
        return listOf(
        Fruit(R.string.apple, R.drawable.apple_tree, R.string.type_tree, R.string.fruit_short_description, R.string.fruit_long_description),
        Fruit(R.string.grusha, R.drawable.pear_tree, R.string.type_tree, R.string.fruit_short_description, R.string.fruit_long_description),
        Fruit(R.string.sliva, R.drawable.plum_tree, R.string.type_kust, R.string.fruit_short_description, R.string.fruit_long_description),
        Fruit(R.string.cherry, R.drawable.cherry_tree, R.string.type_kust, R.string.fruit_short_description, R.string.fruit_long_description),
        Fruit(R.string.malina, R.drawable.raspberries, R.string.type_kustarnik, R.string.fruit_short_description, R.string.fruit_long_description),
        Fruit(R.string.granat, R.drawable.granate_tree, R.string.type_kust, R.string.fruit_short_description, R.string.fruit_long_description),
        Fruit(R.string.apricot, R.drawable.apricot_tree, R.string.type_tree, R.string.fruit_short_description, R.string.fruit_long_description),
        Fruit(R.string.grape, R.drawable.grape_tree, R.string.type_kustarnik, R.string.fruit_short_description, R.string.fruit_long_description),
        Fruit(R.string.persik, R.drawable.peach_tree, R.string.type_kust, R.string.fruit_short_description, R.string.fruit_long_description),
        Fruit(R.string.smorodina, R.drawable.blackberries, R.string.type_kustarnik, R.string.fruit_short_description, R.string.fruit_long_description),
        Fruit(R.string.ryabina, R.drawable.ryabina_tree, R.string.type_tree, R.string.fruit_short_description, R.string.fruit_long_description),
        Fruit(R.string.orange, R.drawable.orange_tree, R.string.type_tree, R.string.fruit_short_description, R.string.fruit_long_description),
        Fruit(R.string.mandarin, R.drawable.mandarin_tree, R.string.type_tree, R.string.fruit_short_description, R.string.fruit_long_description),
        Fruit(R.string.limon, R.drawable.citrus_limon_tree, R.string.type_tree, R.string.fruit_short_description, R.string.fruit_long_description)
        )
    }
}