package mx.tecnm.tepic.lamd_u2_prctica1_coposdenieve_martinezrodriguez

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Lienzo (este:MainActivity) : View(este) {
    var este = este
    val copos = Array<CoposN>(80,{ CoposN(this) })
    val corutina = GlobalScope.launch{
        while (true){
            este.runOnUiThread{
                invalidate()
            }
            delay(50L)
        }
    }
    override fun onDraw(c: Canvas){
        super.onDraw(c)
        val p = Paint()
        //fondo
        c.drawColor(Color.BLACK)

        //Luna
        p.color = Color.WHITE
        c.drawCircle(950f,200f,100f,p)
        p.color = Color.BLACK
        c.drawCircle(975f,235f,75f,p)

        //llano
        p.color = Color.GREEN
        c.drawOval(2300f,600f,-800f,1000f,p)
        //NIVE en el llano xd
        p.color = Color.WHITE
        c.drawOval(2300f,825f,-800f,1000f,p)
        //casa
        p.color = Color.rgb(117,207,240)
        p.style = Paint.Style.FILL
        c.drawRect(250f,400f,800f,800f,p)
        p.color = Color.GRAY
        c.drawRect(350f,600f,450f,800f,p)
        p.color = Color.YELLOW
        c.drawCircle(430f,700f,10f,p)
        p.color = Color.WHITE
        c.drawRect(280f,430f,450f,550f,p)
        p.color = Color.WHITE
        c.drawRect(500f,430f,680f,550f,p)
        //ARBOLes
        p.color = Color.rgb(180,114,20)
        c.drawRect(100f,650f,150f,800f,p)
        p.color = Color.rgb(35,148,16)
        c.drawOval(50f,700f,200f,500f,p)

        p.color = Color.rgb(180,114,20)
        c.drawRect(950f,600f,1000f,800f,p)
        p.color = Color.rgb(35,148,16)
        c.drawOval(850f,350f,1100f,645f,p)

        p.color = Color.rgb(180,114,20)
        c.drawRect(1450f,600f,1500f,800f,p)
        p.color = Color.rgb(35,148,16)
        c.drawOval(1350f,350f,1600f,645f,p)
        //Cerca
        p.color = Color.rgb(180,114,20)
        c.drawRect(800f,700f,2000f,750f,p)
        p.color = Color.rgb(180,114,20)
        c.drawRect(850f,650f,900f,800f,p)
        p.color = Color.rgb(180,114,20)
        c.drawRect(950f,650f,1000f,800f,p)
        p.color = Color.rgb(180,114,20)
        c.drawRect(1050f,650f,1100f,800f,p)
        p.color = Color.rgb(180,114,20)
        c.drawRect(1150f,650f,1200f,800f,p)
        p.color = Color.rgb(180,114,20)
        c.drawRect(1250f,650f,1300f,800f,p)
        p.color = Color.rgb(180,114,20)
        c.drawRect(1350f,650f,1400f,800f,p)
        p.color = Color.rgb(180,114,20)
        c.drawRect(1450f,650f,1500f,800f,p)
        p.color = Color.rgb(180,114,20)
        c.drawRect(1550f,650f,1600f,800f,p)
        p.color = Color.rgb(180,114,20)
        c.drawRect(1650f,650f,1700f,800f,p)
        p.color = Color.rgb(180,114,20)
        c.drawRect(1750f,650f,1800f,800f,p)

        //estrellitas
        p.color = Color.YELLOW
        c.drawCircle(50f,400f,5f,p)
        c.drawCircle(70f,200f,5f,p)
        c.drawCircle(200f,500f,5f,p)
        c.drawCircle(350f,150f,5f,p)
        c.drawCircle(500f,100f,5f,p)
        c.drawCircle(700f,150f,5f,p)
        c.drawCircle(900f,50f,5f,p)
        c.drawCircle(1100f,50f,5f,p)
        c.drawCircle(1150f,200f,5f,p)
        c.drawCircle(1300f,550f,5f,p)
        c.drawCircle(1500f,50f,5f,p)
        c.drawCircle(1600f,200f,5f,p)
        for(copo_n in copos){
            copo_n.mover()
            copo_n.pintar(c)
        }
    }
}