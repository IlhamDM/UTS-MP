package ac.id.poltektegal.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dashboard.*

class Dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        berita.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        tentang.setOnClickListener {
            startActivity(Intent(this, BiodataActivity::class.java))
        }
        keluar.setOnClickListener {
            moveTaskToBack(true)
            System.exit(1)
        }
    }
}