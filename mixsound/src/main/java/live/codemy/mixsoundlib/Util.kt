package live.codemy.mixsoundlib

import android.content.Context
import android.os.Build
import android.speech.tts.TextToSpeech
import android.widget.Toast


/**     Code with ❤
╔════════════════════════════╗
║  Created by Gökhan ÖZTÜRK  ║
╠════════════════════════════╣
║ GokhanOzturk@AndroidEdu.IO ║
╠════════════════════════════╣
║     08/02/2020 - 22:48     ║
╚════════════════════════════╝
 */

infix fun String.toast(context: Context?) = Toast.makeText(context, this, Toast.LENGTH_SHORT).show()

@Suppress("DEPRECATION")
fun TextToSpeech.speak() = when {
    Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP -> {
        this.speak(MixSound.recordSound, TextToSpeech.QUEUE_FLUSH, null, null)
    }
    else -> this.speak(MixSound.recordSound, TextToSpeech.QUEUE_FLUSH, null)
}