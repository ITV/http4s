package org.http4s
package parser

import util.CaseInsensitiveString._

import org.specs2.mutable.Specification


class HeaderParserSpec extends Specification {

  "Header parsing should catch errors" in {
    val h2 = Header.Raw("Date".ci, "Fri, 06 Feb 0010 15:28:43 GMT") // Invalid year: must be >= 1800
    h2.parsed must not (throwA[Exception])
  }

}
