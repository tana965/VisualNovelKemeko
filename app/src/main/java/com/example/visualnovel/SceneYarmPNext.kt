package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_scene_yarm_pnext.*

class SceneYarmPNext : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scene_yarm_pnext)

        buttonFire.setOnClickListener{
            buttonFire.visibility = View.INVISIBLE
            imageFire.visibility = View.INVISIBLE
            imageShadow.visibility= View.VISIBLE
            buttonCard.visibility= View.VISIBLE
            next.visibility= View.VISIBLE
        }

        buttonSun.setOnClickListener{
            buttonSun.visibility = View.INVISIBLE
            imageSun.visibility = View.INVISIBLE
            imageShadow.visibility= View.VISIBLE
            buttonCard2.visibility= View.VISIBLE
            next.visibility= View.VISIBLE
        }

        buttonStar.setOnClickListener{
            buttonStar.visibility = View.INVISIBLE
            imageStar.visibility = View.INVISIBLE
            imageShadow.visibility= View.VISIBLE
            buttonCard3.visibility= View.VISIBLE
            next.visibility= View.VISIBLE
        }

        buttonGrass.setOnClickListener{
            buttonGrass.visibility = View.INVISIBLE
            imageGrass.visibility = View.INVISIBLE
            imageShadow.visibility= View.VISIBLE
            buttonCard2.visibility= View.VISIBLE
            next.visibility= View.VISIBLE
        }

        buttonFlower.setOnClickListener{
            buttonFlower.visibility = View.INVISIBLE
            imageFlower.visibility = View.INVISIBLE
            imageShadow.visibility= View.VISIBLE
            buttonCard.visibility= View.VISIBLE
            next.visibility= View.VISIBLE
        }

        buttonLune.setOnClickListener{
            buttonLune.visibility = View.INVISIBLE
            imageLune.visibility = View.INVISIBLE
            imageShadow.visibility= View.VISIBLE
            buttonCard3.visibility= View.VISIBLE
            next.visibility= View.VISIBLE
        }

        next.setOnClickListener{
            val intent: Intent = Intent(this@SceneYarmPNext, SceneYarmPNext2::class.java)
            startActivity(intent)
            finish()
        }

        buttonNext3.setOnClickListener{
            buttonNext3.visibility= View.INVISIBLE
            imageWall3.visibility= View.INVISIBLE
            textStory3.visibility= View.INVISIBLE
        }

    }
}