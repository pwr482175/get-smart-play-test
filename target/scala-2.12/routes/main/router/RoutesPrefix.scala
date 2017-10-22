
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/mokry/get-smart-play/conf/routes
// @DATE:Sun Oct 22 12:48:34 CEST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
