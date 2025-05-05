package com.example.uts_pemmob1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DashboardActivity : AppCompatActivity() {

//    private lateinit var listView: ListView
            private lateinit var recyclerView: RecyclerView
            private lateinit var newsAdapter: NewsAdapter
            private lateinit var newsList: ArrayList<NewsItem>

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_dashboard)

//        Fungsi untuk membuat tampilan dashboard mengggunakan recyclerview dan arraylist
        recyclerView = findViewById(R.id.newsRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        newsList = arrayListOf(
            NewsItem(
                "https://cdn.pixabay.com/photo/2025/03/31/21/30/italy-9505446_1280.jpg",
                "Bangunan Bersejarah di Italia",
                "Colosseum adalah bangunan bersejarah yang berada di negara Italia, Bangunan ini masuk dalam salah satu keajaiban sejarah dunia."
            ),
            NewsItem(
                "https://cdn.pixabay.com/photo/2017/12/15/13/51/polynesia-3021072_1280.jpg",
                "Bora Bora, Tahiti",
                "Pulau tropis di Polinesia Prancis, terkenal dengan laguna biru dan resor mewah."
            ),
            NewsItem(
                "https://cdn.pixabay.com/photo/2021/01/31/19/56/utah-5968412_960_720.jpg",
                "Grand Canyon, AS",
                "Ngarai raksasa di Arizona, terbentuk oleh sungai Colorado selama jutaan tahun."
            ),
            NewsItem(
                "https://cdn.pixabay.com/photo/2018/01/21/01/46/architecture-3095716_1280.jpg",
                "Menara Eiffel, Paris",
                "Ikon Paris setinggi 324 meter, dibangun untuk Pameran Dunia 1889."
            ),
            NewsItem(
                "https://cdn.pixabay.com/photo/2013/05/24/16/25/architecture-113299_1280.jpg",
                "Brandenburg Gate, Berlin",
                "Gerbang bersejarah simbol penyatuan Jerman, dibangun abad ke-18."
            ),
            NewsItem(
                "https://cdn.pixabay.com/photo/2016/11/08/05/20/sunset-1807524_1280.jpg",
                "Pantai Santorini, Yunani",
                "Pantai dengan bangunan putih dan biru khas Yunani, terkenal dengan matahari terbenamnya yang memukau."
            ),
            NewsItem(
                "https://cdn.pixabay.com/photo/2012/04/26/22/48/machu-picchu-43387_1280.jpg",
                "Machu Picchu, Peru",
                "Situs Inca kuno di ketinggian Andes, dijuluki 'Kota Inca yang Hilang'."
            ),
            NewsItem(
                "https://cdn.pixabay.com/photo/2017/01/20/00/30/maldives-1993704_1280.jpg",
                "stana Alhambra, Spanyol",
                "Istana megah peninggalan Dinasti Nasrid dengan arsitektur Moorish yang detail."
            ),
            NewsItem(
                "https://cdn.pixabay.com/photo/2017/08/13/17/30/plitvice-2637917_1280.jpg",
                "Danau Plitvice, Kroasia",
                "Taman nasional dengan danau berjenjang dan air terjun kristal berwarna pirus."
            )
        )

        newsAdapter = NewsAdapter(newsList)
        recyclerView.adapter = newsAdapter
    }
}




