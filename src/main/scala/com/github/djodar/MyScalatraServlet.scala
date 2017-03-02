package com.github.djodar

import org.scalatra._

class MyScalatraServlet extends ScalatraplaygroundStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

}
