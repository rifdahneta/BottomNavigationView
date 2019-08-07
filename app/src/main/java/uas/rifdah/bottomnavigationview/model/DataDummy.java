package uas.rifdah.bottomnavigationview.model;

import java.util.ArrayList;

import uas.rifdah.bottomnavigationview.R;

public class DataDummy {
    public static ArrayList<DataItem> generateDummy(){
        ArrayList<DataItem> dataItems = new ArrayList<>();

        dataItems.add(new DataItem("Sukarno",
                "Dr. Ir. H. Soekarno adalah Presiden pertama Republik Indonesia yang menjabat pada periode 1945–1967. Ia memainkan peranan penting dalam memerdekakan bangsa Indonesia dari penjajahan Belanda. Ia adalah Proklamator Kemerdekaan Indonesia yang terjadi pada tanggal 17 Agustus 1945.",
                R.drawable.sukar));

        dataItems.add(new DataItem("Hatta",
                "Dr. Drs. H. Mohammad Hatta adalah tokoh pejuang, negarawan, ekonom, dan juga Wakil Presiden Indonesia yang pertama. Ia bersama Soekarno memainkan peranan penting untuk memerdekakan bangsa Indonesia dari penjajahan Belanda sekaligus memproklamirkannya pada 17 Agustus 1945",
                R.drawable.hatta));

        dataItems.add(new DataItem("Sutomo",
                "Sutomo lebih dikenal dengan sapaan akrab oleh rakyat sebagai Bung Tomo, adalah pahlawan yang terkenal karena peranannya dalam membangkitkan semangat rakyat untuk melawan kembalinya penjajah Belanda",
                R.drawable.sutomo));
        dataItems.add(new DataItem("Pattimura",
                "Pattimura lahir di Haria, pulau Saparua, Maluku, 8 Juni 1783 – meninggal di Ambon, Maluku, 16 Desember 1817 pada umur 34 tahun, juga dikenal dengan nama Kapitan Pattimura adalah Pahlawan nasional Indonesia dari Maluku.",
                R.drawable.patimura));
        dataItems.add(new DataItem("Sudirman",
                "Jenderal Besar Raden Soedirman adalah seorang perwira tinggi Indonesia pada masa Revolusi Nasional Indonesia. Sebagai panglima besar Tentara Nasional Indonesia pertama, ia adalah sosok yang dihormati di Indonesia.",
                R.drawable.sudirman));
        dataItems.add(new DataItem("Diponegoro",
                "Bendara Pangeran Harya Dipanegara adalah salah seorang pahlawan nasional Republik Indonesia. Pangeran Diponegoro terkenal karena memimpin Perang Diponegoro/Perang Jawa melawan pemerintah Hindia Belanda. Perang tersebut tercatat sebagai perang dengan korban paling besar dalam sejarah Indonesia.",
                R.drawable.diponegoro));
        dataItems.add(new DataItem("Teuku Umar",
                "Teuku Umar adalah pahlawan asal Aceh yang berjuang dengan cara berpura-pura bekerjasama dengan Belanda dan terkenal akan strategi perang gerilyanya. Ia melawan Belanda ketika telah mengumpulkan senjata dan uang yang cukup banyak",
                R.drawable.umar));
        dataItems.add(new DataItem("Dewantara",
                "Raden Mas Soewardi Soerjaningrat adalah aktivis pergerakan kemerdekaan Indonesia, kolumnis, politisi, dan pelopor pendidikan bagi kaum pribumi Indonesia dari zaman penjajahan Belanda.",
                R.drawable.dewantara));
        dataItems.add(new DataItem("Cut Nyak Dien",
                "Cut Nyak Dhien adalah seorang Pahlawan Nasional Indonesia dari Aceh yang berjuang melawan Belanda pada masa Perang Aceh. Setelah wilayah VI Mukim diserang, ia mengungsi, sementara suaminya Ibrahim Lamnga  bertempur melawan Belanda.",
                R.drawable.dhien));
        dataItems.add(new DataItem("Cut Nyak Mutia",
                "Tjoet Nyak Meutia adalah pahlawan nasional Indonesia dari daerah Aceh. Ia dimakamkan di Alue Kurieng, Aceh. Ia menjadi pahlawan nasional Indonesia berdasarkan Surat Keputusan Presiden Nomor 107/1964 pada tahun 1964",
                R.drawable.mutia));
        return dataItems;
    }
}
