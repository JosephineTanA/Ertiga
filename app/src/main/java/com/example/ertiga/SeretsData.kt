package com.example.ertiga

object SeretsData {
    private val data = arrayOf(
        arrayOf(
            "Jojo recing",
            "Bocah kicik sakti dari Banyuwangi",
            "https://i.pinimg.com/564x/16/5f/8b/165f8bcf9127e133f29fc0515ff09949.jpg"
        ),
        arrayOf(
            "Nopek GTA",
            "Pentolan preman gta Magetan",
            "https://i.pinimg.com/564x/7a/dc/3a/7adc3aa7a183e743b4e4dc3e55c04f39.jpg"
        ),
        arrayOf(
            "Kendnenes",
            "Wong alim dari Magetan",
            "https://i.pinimg.com/564x/97/67/77/976777ae472feade1c5ceca3d304ee49.jpg"
        ),
        arrayOf(
            "Bunda Gijel",
            "Bundanya bunda rahma",
            "https://i.pinimg.com/564x/f4/f0/cb/f4f0cb9bce0d5da1bc0aabccd7a3f3b5.jpg"
        ),
        arrayOf(
            "Apip Cimol",
            "Suka cimol",
            "https://i.pinimg.com/564x/ef/a3/14/efa314a2a4ecab14dd515d37643567d3.jpg"
        ),
        arrayOf(
            "Ipiriwiw",
            "Orang beriman dari jombang",
            "https://i.pinimg.com/564x/7a/42/50/7a425087052e3d2c2c67a942dea0133e.jpg"
        ),
        arrayOf(
            "Arawrr",
            "Wong cidro abidin saleh",
            "https://i.pinimg.com/564x/b9/a4/14/b9a414d7d8dea8456115491e6a275233.jpg"
        ),
        arrayOf(
            "Dapins",
            "KKN BWI",
            "https://i.pinimg.com/564x/56/34/4e/56344ea54eec337dcf726c9f2d8d28d0.jpg"
        ),
        arrayOf(
            "Inggridd",
            "Neutrong kids",
            "https://i.pinimg.com/564x/43/72/7d/43727d10bc75c888bfa6a8e0d44fdcbf.jpg"
        )
    )

    val listData: ArrayList<Seret>
        get() {
            val list = arrayListOf<Seret>()
            for (aData in data) {
                val seret = Seret()
                seret.name = aData[0]
                seret.detail = aData[1]
                seret.photo = aData[2]

                list.add(seret)
            }
            return list
        }
}