import kotlin.browser.document

/**
 * Created by plter on 7/14/17.
 */
val electron: dynamic = js("require('electron')")
val path: dynamic = js("require('path')")

class FirstRenderer {

    companion object {
        val renderPath: String = path.join(APP_PATH, "web", "production", "First", "index.html")
    }
    fun main(args: Array<String>) {
        document.body?.innerHTML = "<h1>Hello World</h1>"
    }
}
