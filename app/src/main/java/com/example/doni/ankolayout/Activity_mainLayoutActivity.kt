import android.app.*
import android.view.*
import android.widget.*
import org.jetbrains.anko.*
import android.os.Bundle
import com.example.doni.ankolayout.R

class SomeActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super<Activity>.onCreate(savedInstanceState)

        linearLayout {
            imageView(R.mipmap.ic_launcher).
                    lparams(width= matchParent) {
                        padding = dip(20)
                        margin = dip(15)
                    }

            val name = editText(){
                hint = "What's your name?"
            }

            button("Say Hello")
        }
    }
}