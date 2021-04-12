package com.mirwan.a.hakim.writerskatalog;

import java.util.ArrayList;

public class WritersData {
    private static String[] writerNames = {
            "Andrea Hirata",
            "Asma Nadia",
            "Rintik Sedu",
            "Dewi Lestari",
            "Fiersa Besari",
            "Habiburrahman El Shirazy",
            "Pidi Baiq",
            "Raditya Dika",
            "Sujiwo Tejo",
            "Tere Liye"
    };

    private static String[] writerDetails = {
            "Andrea Hirata lahir di Gantung, Belitung Timur, Bangka Belitung, 24 Oktober 1967; umur 52 tahun, adalah novelis yang telah merevolusi sastra Indonesia. Ia berasal dari Pulau Belitung, provinsi Bangka Belitung. Novel pertamanya adalah Laskar Pelangi yang menghasilkan tiga sekuel.",
            "Asmarani Rosalba yang dikenal dengan nama pena Asma Nadia adalah seorang penulis novel dan cerpen Indonesia. Ia dikenal sebagai pendiri Forum Lingkar Pena dan manajer dari Asma Nadia Publishing House.",
            "Rintik Sedu Lahir di Jakarta, 4 Mei 1998; umur 21 tahun. Rintik Sedu merupakan nama pena dari seorang penulis dan selebriti internet bernama asli Nadhifa Allya Tsana. Dalam karirnya, ia sudah menulis sepuluh judul buku.",
            "Dewi Lestari Simangunsong yang akrab dipanggil Dee adalah seorang penulis dan penyanyi asal Indonesia. Dee pertama kali dikenal masyarakat sebagai anggota trio vokal Rida Sita Dewi. Ia merupakan alumnus SMA Negeri 2 Bandung dan lulusan Universitas Parahyangan, jurusan Hubungan Internasional.",
            "Fiersa Besari adalah penulis dan pemusik Indonesia. Sebagai penulis, Fiersa telah menghasilkan enam novel. Ia juga terlibat sebagai salah satu pendiri Komunitas Pecandu Buku. Di bidang musik, Fiersa Besari memulai kariernya justru sebagai vokalis band indie.",
            "H. Habiburrahman El Shirazy, Lc. Pg.D., lahir di Semarang, Jawa Tengah, 30 September 1976; umur 43 tahun, adalah novelis Indonesia. Selain novelis, sarjana Universitas Al-Azhar, Kairo, Mesir ini juga dikenal sebagai sutradara, dai, penyair, sastrawan, pimpinan pesantren, dan penceramah.",
            "Pidi Baiq adalah seniman multitalenta asal Indonesia. Dia adalah penulis novel dan buku, dosen, ilustrator, komikus, musisi dan pencipta lagu. Namanya mulai dikenal melalui grup band The Panas Dalam yang didirikan tahun 1995.",
            "Dika Angkasaputra Moerwani Nasution yang lebih dikenal dengan Raditya Dika adalah seorang penulis, komedian, sutradara, dan aktor. Buku pertamanya berjudul Kambing Jantan masuk kategori best seller. Buku tersebut menampilkan kehidupan Dika saat kuliah di Australia.",
            "Agus Hadi Sudjiwo atau lebih dikenal dengan nama Sujiwo Tejo adalah seorang budayawan Indonesia. Ia pernah mengikuti kuliah di ITB, namun kemudian mundur untuk meneruskan karier di dunia seni yang lebih disenanginya.",
            "Tere Liye, dikenal sebagai penulis novel. Beberapa karyanya yang pernah diangkat ke layar kaca yaitu Hafalan Shalat Delisa dan Moga Bunda Disayang Allah.",

    };

    private static int[] writerImages = {
            R.drawable.andrea_hirata,
            R.drawable.asma_nadia,
            R.drawable.rintik_sedu,
            R.drawable.dewi_lestari,
            R.drawable.fiersa_besari,
            R.drawable.habiburahman,
            R.drawable.pidi_baiq,
            R.drawable.raditya_dika,
            R.drawable.sujiwo_tejo,
            R.drawable.tereliye
    };

    static ArrayList<Writer> getListData(){
        ArrayList<Writer> list = new ArrayList<>();
        for (int position = 0; position < writerNames.length; position++){
            Writer writer = new Writer();
            writer.setName(writerNames[position]);
            writer.setDetail(writerDetails[position]);
            writer.setPhoto(writerImages[position]);
            list.add(writer);
        }
        return list;
    };
}
