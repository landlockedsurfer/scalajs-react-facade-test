package reactjs

import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.{UndefOr, JSApp}
import dom.document
import japgolly.scalajs.react._

case class ReactInputTags() {

  def toJS = {
    val p = js.Dynamic.literal()
    p
  }

  def apply(children: ReactNode*):ReactComponentU_ = {
    val f = js.Dynamic.global.ReactTagsInput // access real js component
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}

object FacadeTestApp extends JSApp {

  def main(): Unit = {
    import japgolly.scalajs.react.vdom.all._

    val element = document.getElementById("content")
    React.render(ReactInputTags()(), element)
  }
}
