package com.example.visualnovel

import android.content.Context
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import kotlinx.android.synthetic.main.activity_resume.textView
import kotlinx.android.synthetic.main.activity_resume.textView2
import kotlinx.android.synthetic.main.activity_resume.textView3

class ResumeActivity : AppCompatActivity() {

    private lateinit var maze: Array<IntArray>
    private var currentRow = 1
    private var currentCol = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resume)

        maze = arrayOf(
            intArrayOf(10, 8, 10, 9),
            intArrayOf(28, 1, 0, 12),
            intArrayOf(12, 10, 9, 13),
            intArrayOf(6, 5, 6, 5)
        )

        updateButtonStates()
        setButtonListeners()
    }

    private fun setButtonListeners() {
        findViewById<Button>(R.id.leftButton).setOnClickListener {
            movePlayer(Direction.LEFT)
        }

        findViewById<Button>(R.id.rightButton).setOnClickListener {
            movePlayer(Direction.RIGHT)
        }

        findViewById<Button>(R.id.upButton).setOnClickListener {
            movePlayer(Direction.UP)
        }

        findViewById<Button>(R.id.downButton).setOnClickListener {
            movePlayer(Direction.DOWN)
        }
    }

    private fun updateButtonStates() {
        val currentValue = maze[currentRow][currentCol]
        updateButton(findViewById(R.id.leftButton), Direction.LEFT, currentValue)
        updateButton(findViewById(R.id.rightButton), Direction.RIGHT, currentValue)
        updateButton(findViewById(R.id.upButton), Direction.UP, currentValue)
        updateButton(findViewById(R.id.downButton), Direction.DOWN, currentValue)

        if (currentValue == 0) {
            startActivity(Intent(this, HomeNextDoor::class.java))
            finish()
        }
    }

    private fun updateButton(button: Button, direction: Direction, value: Int) {
        val canMove = canMoveInDirection(direction, value)
        button.isEnabled = canMove
        button.setBackgroundColor(if (canMove) Color.parseColor("#BE16DB") else Color.parseColor("#AAFF0000"))
        button.setTextColor(if (canMove) Color.WHITE else Color.BLACK)
        textView.text = currentRow.toString()
        textView2.text = currentCol.toString()

    }

    private fun movePlayer(direction: Direction) {
        if (canMoveInDirection(direction)) {
            when (direction) {
                Direction.LEFT -> currentCol--
                Direction.RIGHT -> currentCol++
                Direction.UP -> currentRow--
                Direction.DOWN -> currentRow++
            }
            updateButtonStates()
        }
    }

    private fun canMoveInDirection(direction: Direction, value: Int? = null): Boolean {
        val cellValue = value ?: maze[currentRow][currentCol]
        return (cellValue and direction.bitValue) != 0

    }

    companion object {
        fun startGame(context: Context) {
            val intent = Intent(context, ResumeActivity::class.java)
            context.startActivity(intent)
        }
    }

    enum class Direction(val bitValue: Int) {
        LEFT(1),
        RIGHT(2),
        UP(4),
        DOWN(8)
    }
}