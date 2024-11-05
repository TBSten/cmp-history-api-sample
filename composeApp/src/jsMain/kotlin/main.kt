import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import me.tbsten.sample.cmpHistoryApi.App
import org.jetbrains.skiko.wasm.onWasmReady
import kotlinx.browser.document

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    onWasmReady {
        val body = document.body ?: return@onWasmReady
        ComposeViewport(body) {
            App()
        }
    }
}
