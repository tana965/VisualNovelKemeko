package com.example.visualnovel

import android.content.Intent
import android.graphics.Point
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatDelegate
import com.example.visualnovel.databinding.ActivityBallRunBinding
import kotlinx.android.synthetic.main.activity_ball_run.b
import kotlinx.android.synthetic.main.activity_main.imageButton
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking
import java.lang.Math.abs

class BallRun : AppCompatActivity() {

    private lateinit var binding: ActivityBallRunBinding

    private val sensorManager by lazy { getSystemService(SENSOR_SERVICE) as SensorManager }
    private val sensor by lazy { sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER) }
    private val pointEnd by lazy { Point(binding.container.width, binding.container.height) }
    private var lastEvent: SensorEvent? = null
    private val scope = CoroutineScope(Dispatchers.IO)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBallRunBinding.inflate(layoutInflater)
        setContentView(binding.root)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        b.setOnClickListener {

            val intent = Intent(this@BallRun, SceneYarmPNext::class.java)
            startActivity(intent)
            finish()
        }

    }

    private val listener = object : SensorEventListener {
        override fun onSensorChanged(event: SensorEvent?) {
            Log.d("TTT", "$event")
            lastEvent = event
        }

        override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {

        }
    }

    override fun onResume() {
        super.onResume()
        sensorManager.registerListener(listener, sensor, SensorManager.SENSOR_DELAY_GAME)
        movementBoll()
    }

    private fun periodTimer(): Flow<Unit> = flow {
        while (true) {
            delay(50)
            emit(Unit)
        }
    }.flowOn(Dispatchers.IO)


    override fun onPause() {
        super.onPause()
        sensorManager.unregisterListener(listener)
    }

    private fun movementBoll() {
        periodTimer().onEach {
            lastEvent?.let {

                Log.d("TTT","Ball With -> ${binding.ball.width * (it.values[0] / 5)}")

                binding.ball.x -= binding.ball.width * (it.values[0] / 5)

                Log.d("TTT","Ball X -> ${binding.ball.x} ")

                if (binding.ball.x < 0) binding.ball.x = 0f
                if (binding.ball.x > pointEnd.x - binding.ball.width) binding.ball.x =
                    (pointEnd.x - binding.ball.width).toFloat()

                binding.ball.y += binding.ball.height * (it.values[1] / 5)

                if (binding.ball.y < 0f) binding.ball.y = 0f
                if (binding.ball.y > pointEnd.y - binding.ball.height) binding.ball.y =
                    (pointEnd.y - binding.ball.height).toFloat()

                win()
            }
        }.launchIn(scope)
    }

    private fun win() {
        binding.apply {
            val ballCenterX = ball.x + ball.width / 2
            val ballCenterY = ball.y + ball.height / 2
            val deepCenterX = deep.x + deep.width / 2
            val deepCenterY = deep.y + deep.height / 2
            val _height = abs(ballCenterY - deepCenterY)
            val _width = abs(ballCenterX - deepCenterX)

            if (_width <= (ball.width / 2) && _height <= (ball.height / 2)) {

                runBlocking(Dispatchers.Main) {
                    ball.animate()
                        .setDuration(100)
                        .scaleX(0f)
                        .scaleY(0f)
                        .withEndAction {
                            ball.apply {
                                x = 0f
                                y = 1f
                                scaleX = 1f
                                scaleY = 1f
                            }
                        }
                        .start()
                    b.visibility = View.VISIBLE
                }
            }
        }
    }

}