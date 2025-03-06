package ru.ashirobokov.fruits.data

import ru.ashirobokov.fruits.R
import ru.ashirobokov.fruits.model.Fruit

class DataSource {
    fun listOfFruits() : List<Fruit> {
        return listOf(
        Fruit(R.string.apple, R.drawable.apple_tree, R.string.type_tree, R.string.apple_short_description, R.string.apple_long_description),
        Fruit(R.string.grusha, R.drawable.pear_tree, R.string.type_tree, R.string.grusha_short_description, R.string.grusha_long_description),
        Fruit(R.string.sliva, R.drawable.plum_tree, R.string.type_kust, R.string.sliva_short_description, R.string.sliva_long_description),
        Fruit(R.string.cherry, R.drawable.cherry_tree, R.string.type_kust, R.string.cherry_short_description, R.string.cherry_long_description),
        Fruit(R.string.malina, R.drawable.raspberries, R.string.type_kustarnik, R.string.malina_short_description, R.string.malina_long_description),
        Fruit(R.string.granat, R.drawable.granate_tree, R.string.type_kust, R.string.granat_short_description, R.string.granat_long_description),
        Fruit(R.string.apricot, R.drawable.apricot_tree, R.string.type_tree, R.string.apricot_short_description, R.string.apricot_long_description),
        Fruit(R.string.grape, R.drawable.grape_tree, R.string.type_kustarnik, R.string.grape_short_description, R.string.grape_long_description),
        Fruit(R.string.persik, R.drawable.peach_tree, R.string.type_kust, R.string.persik_short_description, R.string.persik_long_description),
        Fruit(R.string.smorodina, R.drawable.blackberries, R.string.type_kustarnik, R.string.smorodina_short_description, R.string.smorodina_long_description),
        Fruit(R.string.ryabina, R.drawable.ryabina_tree, R.string.type_tree, R.string.ryabina_short_description, R.string.ryabina_long_description),
        Fruit(R.string.orange, R.drawable.orange_tree, R.string.type_tree, R.string.orange_short_description, R.string.orange_long_description),
        Fruit(R.string.mandarin, R.drawable.mandarin_tree, R.string.type_tree, R.string.mandarin_short_description, R.string.mandarin_long_description),
        Fruit(R.string.limon, R.drawable.citrus_limon_tree, R.string.type_tree, R.string.limon_short_description, R.string.limon_long_description)
        )
    }
}