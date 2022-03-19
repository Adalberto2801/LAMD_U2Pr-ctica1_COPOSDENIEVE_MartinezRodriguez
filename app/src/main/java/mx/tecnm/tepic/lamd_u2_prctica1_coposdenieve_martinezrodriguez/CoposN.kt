package mx.tecnm.tepic.lamd_u2_prctica1_coposdenieve_martinezrodriguez

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import kotlin.random.Random

class CoposN (l:Lienzo) {
    val l= l
    var x = 0f
    var y = 0f
    var t = 0f

    init{
        x = rand(2000)
        y = -rand(1000)
        t = rand(15)+10
    }

    private fun rand(hasta:Int) : Float{
        return Random.nextInt(hasta).toFloat()
    }

    fun mover(){
        y += t
        if(y>1000){
            y= -rand(2000)
            x= rand(2000)
        }

    }
    fun pintar(c: Canvas){
        val p = Paint()
        p.color = Color.WHITE
        c.drawCircle(x,y,t,p)
    }
}