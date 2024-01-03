package com.example.recyclerview

data class Model(val image: Int,val description: String)


object MockList{
    fun getModel():List<Model>{
        val itemModel1 = Model(
            R.drawable.ic_launcher_background,
            "Lord Of The Rings",
        )
        val itemModel2 = Model(
            R.drawable.ic_launcher_background,
            "Harry Potter",
        )


        val itemModel3 = Model(
            R.drawable.ic_launcher_background,
            "Interstellar",
        )


        val itemModel4 = Model(
            R.drawable.ic_launcher_background,
            "Squid Game",
        )


        val itemModel5 = Model(
            R.drawable.ic_launcher_background,
            "How I Met Your Mother",
        )


        val itemModel6 = Model(
            R.drawable.ic_launcher_background,
            "Vikings",
        )

        val itemModel7 = Model(
            R.drawable.ic_launcher_background,
            "The Walking Dead",
        )

        val itemModel8 = Model(
            R.drawable.ic_launcher_background,
            "Spartacus",
        )
        val itemModel9 = Model(
            R.drawable.ic_launcher_background,
            "Rick and Morty",
        )
        val itemModel10 = Model(
            R.drawable.ic_launcher_background,
            "Hababam Sınıfı",
        )


        val itemList: ArrayList<Model> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)
        itemList.add(itemModel7)
        itemList.add(itemModel8)
        itemList.add(itemModel9)
        itemList.add(itemModel10)


        return itemList
    }
}
