package com.dicoding.mycar

object CarsData {
    private val names = arrayOf(
        "Civic",
        "kia Seltos",
        "VW Beetle",
        "Vw All New",
        "Vw Vintage",
        "yaris",
        "Audi A7",
        "BMW X5",
        "Bugatti Veyron",
        "McLaren 720s",
    )

    private val years = arrayOf(
        2020,
        2021,
        2022,
        2019,
        2015,
        2022,
        2022,
        2019,
        2015,
        2022,
    )

    private val prices = arrayOf(
        "Rp 285.000.000",
        "Rp 200.000.000",
        "Rp 350.000.000",
        "Rp 300.000.000",
        "Rp 320.000.000",
        "Rp 175.000.000",
        "Rp 650.000.000",
        "Rp 800.000.000",
        "Rp 920.000.000",
        "Rp 1.075.000.000",
    )

    private val brands = arrayOf("Honda", "Kia", "Volkswagen", "Volkswagen", "Volkswagen", "Toyota", "Audi", "BMW", "Bugatti", "McLaren")

    private val negos = arrayOf(true, false, false, true, false, false, true, false, true, true)

    private val descs = arrayOf(
        "Honda Civic adalah mobil yang diproduksi oleh Honda Motor Company. Pertama kali diperkenalkan pada Juli 1972 sebagai coupé 2 pintu, diikuti dengan versi hatchback 3 pintu pada September tahun itu juga. Mobil ini menganut sistem gerak roda depan, di mana mesinnya diletakan melintang, sehingga dapat menyediakan ruang interior yang cukup luas walaupun dimensi mobil terbilang kecil.",
        "The Seltos is designated as a global product with three variations introduced for different markets. The first variation is the largest version of the Seltos, which is manufactured in South Korea (codename: SP2) mainly aimed for developed markets, including North America and Australasia. The two other variations are the Indian-made Seltos (codename: SP2i) and the closely related Chinese version badged as the Kia KX3 (codename: SP2c). The SP2i and SP2c models are the low-cost versions of the Seltos to penetrate emerging markets, built on the Hyundai-Kia K2 platform and closely related to the second-generation Hyundai Creta/ix25. Despite being a globally marketed model, the Seltos is not sold in the European market.",
        "Volkswagen Beetle, atau Volkswagen Tipe 1, adalah sebuah mobil kecil yang diproduksi oleh Volkswagen. Juga dikenal dengan VW Kodok di Indonesia atau Bug di Amerika Serikat, atau Käfer di Jerman. VW Kodok merupakan salah satu mobil yang paling mudah dikenal di dunia, dikarenakan oleh bentuknya yang khas, bunyinya yang unik, dan kehandalannya.\n" +
                "\n" +
                "VW Kodok diproduksi mulai tahun 1938 sampai 2003, walau sempat terhenti oleh Perang Dunia II. Pada rentang masa yang panjang ini, lebih dari 21 juta VW Kodok dibuat.",
        "Volkswagen Beetle, atau Volkswagen Tipe 1, adalah sebuah mobil kecil yang diproduksi oleh Volkswagen. Juga dikenal dengan VW Kodok di Indonesia atau Bug di Amerika Serikat, atau Käfer di Jerman. VW Kodok merupakan salah satu mobil yang paling mudah dikenal di dunia, dikarenakan oleh bentuknya yang khas, bunyinya yang unik, dan kehandalannya.\n" +
                "\n" +
                "VW Kodok diproduksi mulai tahun 1938 sampai 2003, walau sempat terhenti oleh Perang Dunia II. Pada rentang masa yang panjang ini, lebih dari 21 juta VW Kodok dibuat.",
        "Volkswagen Beetle, atau Volkswagen Tipe 1, adalah sebuah mobil kecil yang diproduksi oleh Volkswagen. Juga dikenal dengan VW Kodok di Indonesia atau Bug di Amerika Serikat, atau Käfer di Jerman. VW Kodok merupakan salah satu mobil yang paling mudah dikenal di dunia, dikarenakan oleh bentuknya yang khas, bunyinya yang unik, dan kehandalannya.\n" +
                "\n" +
                "VW Kodok diproduksi mulai tahun 1938 sampai 2003, walau sempat terhenti oleh Perang Dunia II. Pada rentang masa yang panjang ini, lebih dari 21 juta VW Kodok dibuat.",
        "Toyota Yaris atau Toyota Vitz adalah mobil hatchback kecil yang diproduksi oleh Toyota. Yaris diluncurkan pertama kali pada tahun 1999 di Eropa dengan desain, performa mesin, dan jaminan keselamatan serta konsumsi bahan bakar yang optimal, untuk memasuki pangsa pasar Eropa. Satu tahun setelah awal peluncurannya, tepatnya pada tahun 2000 Yaris memperoleh penghargaan European Car of The Year Award. Bukan hanya itu saja Yaris juga diakui sebagai standar model kendaraan Compact two box di Jepang dan Amerika Utara.",
        "Audi A7 Sportback (kode produksi Typ 4G) adalah sebuah mobil koupe eksekutif 5 pintu yang diproduksi oleh Audi. Mobil ini menggunakan platform MLB seperti Audi A6. Mobil ini diumumkan di museum Pinakothek der Moderne di Munich tanggal 27 Juli 2010 dan memulai debutnya di Paris Motor Show 2010. Mobil ini sebelumnya sudah pernah tampil dalam bentuk mobil konsep Audi Sportback Konsep yang diperlihatkan tahun 2009 di Detroit Auto Show.[1] Mobil ini akhirnya diluncurkan di AS pada New York Auto Show bulan April 2011.",
        "BMW X5 adalah SUV mewah (segmen J di Eropa) yang diproduksi oleh BMW. Generasi pertama dari X5, dengan kode sasis E53, dijual pertama kali pada tahun 1999. X5 merupakan SUV pertama BMW yang menggunakan sistem penggerak 4WD penggerak seluruh roda. Pada tahun 2005 generasi kedua mobil ini diluncurkan dengan kode sasis E70.",
        "Bugatti Veyron 16.4(juga dikenal sebagaiEB 16/4 Veyron) adalah sebuah mobil terkuat di dunia (pada 2005). Mobil ini dibuat oleh anak perusahaan Volkswagen AG, Bugatti Automobiles SAS di pabriknya di Molsheim, Prancis, dan dijual dengan merek Bugatti. Nama mobil ini diambil dari nama seorang pembalap dari Prancis, Pierre Veyron yang berhasil memenangkan 24 hours of Le Mans pada 1939 sebagai pembalap yang mewakili perusahaan Bugatti. Menurut Top Gear, mobil ini dibuat Perusahaan untuk eksperimen b'ahwa kecepatan mobil 100 km/jam dapat ditempuh dibawah 3 detik. Dibuat secara terbatas dan memang tidak ditujukan untuk komersial, sehingga anda jangan heran jika perusahaan asuransi tidak berani menjamin.",
        "McLaren Racing Limited merupakan sebuah tim balap mobil yang berkantor pusat di McLaren Technology Centre di Woking, Surrey, Inggris. McLaren dikenal sebagai tim kontruktor Formula Satu tertua kedua yang masih aktif hingga saat ini dan tim paling sukses kedua setelah Ferrari. McLaren telah memenangi 12 gelar juara dunia pembalap dan 8 gelar juara dunia konstruktor. Selain Formula Satu, McLaren juga berkompetisi di kejuaraan balap mobil roda terbuka Amerika sebagai tim dan konstruktor sasis, serta pernah berhasil memenangkan kejuaraan balap mobil sport Canadian-American Challenge Cup (Can-Am). Tim ini merupakan anak perusahaan dari McLaren Group selaku pemegang saham terbesarnya.",
    )

    private val photos = intArrayOf(
        R.drawable.civic,
        R.drawable.kia,
        R.drawable.vw_blue,
        R.drawable.vw_new,
        R.drawable.vw_orange,
        R.drawable.yaris,
        R.drawable.audi_a7,
        R.drawable.bmw_x5,
        R.drawable.bugatti_veyron,
        R.drawable.mclaren_7202,
    )

    val listData: ArrayList<Car>
        get() {
            val list = arrayListOf<Car>()
            for (position in names.indices) {
                val car = Car()
                car.name = names[position]
                car.year = years[position]
                car.photo = photos[position]
                car.brand = brands[position]
                car.price = prices[position]
                car.nego = negos[position]
                car.desc = descs[position]
                list.add(car)
            }

            return list
        }
}