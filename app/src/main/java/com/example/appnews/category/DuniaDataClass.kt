package com.example.appnews.category

import com.example.appnews.R

data class DuniaDataClass(
    var titleImage: Int,
    var authorNews: String,
    var titleNews: String,
    var url: String
) {
    companion object {
        fun duniaSampleData(): ArrayList<DuniaDataClass> {
            return arrayListOf(
                DuniaDataClass(
                    R.drawable.img_sample_news1,
                    "DETIK NEWS",
                    "Prabowo: RI Siap Tingkatkan Kerja Sama Pertahanan dengan Singapura",
                    "https://news.detik.com/berita/d-7369468/prabowo-ri-siap-tingkatkan-kerja-sama-pertahanan-dengan-singapura"
                ),
                DuniaDataClass(
                    R.drawable.img_sample_news2,
                    "DETIK NEWS",
                    "Israel Tetap Gempur Rafah Usau Joe Biden Bicara Rencana Gencatan Senjata",
                    "https://news.detik.com/internasional/d-7369488/israel-tetap-gempur-rafah-usai-joe-biden-bicara-rencana-gencatan-senjata"
                ),
                DuniaDataClass(
                    R.drawable.img_sample_news3,
                    "CNN INDONESIA",
                    "Hotline Buat Pelanggan Cek Keaslian Emas Antam Imbas Cap Palsu 109 Ton",
                    "https://www.cnnindonesia.com/ekonomi/20240601162433-92-1104645/hotline-buat-pelanggan-cek-keaslian-emas-antam-imbas-cap-palsu-109-ton"
                ),
                DuniaDataClass(
                    R.drawable.img_sample_news4,
                    "BOLA SPORT",
                    "Bobotoh Persib Diserang Oknum Suporter di Surabaya Hingga Rugikan Masyarakat, PSSI Minta Polisi Tindak Tegas!",
                    "https://www.bolasport.com/read/314098536/bobotoh-persib-diserang-oknum-suporter-di-surabaya-hingga-rugikan-masyarakat-pssi-minta-polisi-tindak-tegas"
                ),
                DuniaDataClass(
                    R.drawable.img_sample_news5,
                    "DETIK NEWS",
                    "Dugaan Rasisme Bikin Selebgram Diusut Soal Ujaran Kebencian",
                    "https://news.detik.com/berita/d-7369511/dugaan-rasisme-bikin-selebgram-diusut-soal-ujaran-kebencian"
                ),
            )
        }
    }
}