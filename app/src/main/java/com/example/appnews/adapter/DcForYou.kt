package com.example.appnews.adapter

import com.example.appnews.R

class DcForYou(val image : Int,
                val judul : String,
               val sumber : String,
               val waktu : String,
                val url : String){

    companion object {
        fun forYouSampleData(): ArrayList<DcForYou> {
            return arrayListOf(
                DcForYou(
                    R.drawable.img_sample_news1,
                    "Prabowo: RI Siap Tingkatkan Kerja Sama Pertahanan dengan Singapura",
                    "Detik NEWS",
                    "2 Jam",
                    "https://news.detik.com/berita/d-7369468/prabowo-ri-siap-tingkatkan-kerja-sama-pertahanan-dengan-singapura"
                ),
                DcForYou(
                    R.drawable.img_sample_news2,
                    "Israel Tetap Gempur Rafah Usau Joe Biden Bicara Rencana Gencatan Senjata",
                    "Detik NEWS",
                    "2 Jam",
                    "https://news.detik.com/internasional/d-7369488/israel-tetap-gempur-rafah-usai-joe-biden-bicara-rencana-gencatan-senjata"
                ),
                DcForYou(
                    R.drawable.img_sample_news3,
                    "Hotline Buat Pelanggan Cek Keaslian Emas Antam Imbas Cap Palsu 109 Ton",
                    "CNN Indonesia",
                    "2 Jam",
                    "https://www.cnnindonesia.com/ekonomi/20240601162433-92-1104645/hotline-buat-pelanggan-cek-keaslian-emas-antam-imbas-cap-palsu-109-ton"
                ),
                DcForYou(
                    R.drawable.img_sample_news4,
                    "Bobotoh Persib Diserang Oknum Suporter di Surabaya Hingga Rugikan Masyarakat, PSSI Minta Polisi Tindak Tegas!",
                    "BOLA SPORT",
                    "2 Jam",
                    "https://www.bolasport.com/read/314098536/bobotoh-persib-diserang-oknum-suporter-di-surabaya-hingga-rugikan-masyarakat-pssi-minta-polisi-tindak-tegas"
                ),
                DcForYou(
                    R.drawable.img_sample_news5,
                    "Dugaan Rasisme Bikin Selebgram Diusut Soal Ujaran Kebencian",
                    "DETIK NEWS",
                    "2 Jam",
                    "https://news.detik.com/berita/d-7369511/dugaan-rasisme-bikin-selebgram-diusut-soal-ujaran-kebencian"
                ),
                DcForYou(
                    R.drawable.img_sample_news5,
                    "Dugaan Rasisme Bikin Selebgram Diusut Soal Ujaran Kebencian",
                    "DETIK NEWS",
                    "2 Jam",
                    "https://news.detik.com/berita/d-7369511/dugaan-rasisme-bikin-selebgram-diusut-soal-ujaran-kebencian"
                ),
                DcForYou(
                    R.drawable.img_sample_news5,
                    "Dugaan Rasisme Bikin Selebgram Diusut Soal Ujaran Kebencian",
                    "DETIK NEWS",
                    "2 Jam",
                    "https://news.detik.com/berita/d-7369511/dugaan-rasisme-bikin-selebgram-diusut-soal-ujaran-kebencian"
                ),
                DcForYou(
                    R.drawable.img_sample_news5,
                    "Dugaan Rasisme Bikin Selebgram Diusut Soal Ujaran Kebencian",
                    "DETIK NEWS",
                    "2 Jam",
                    "https://news.detik.com/berita/d-7369511/dugaan-rasisme-bikin-selebgram-diusut-soal-ujaran-kebencian"
                )
            )
        }
    }
}