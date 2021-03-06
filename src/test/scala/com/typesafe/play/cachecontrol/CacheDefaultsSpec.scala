/*
 * Copyright (C) Lightbend Inc. <https://www.lightbend.com>
 */

package com.typesafe.play.cachecontrol

import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpec

class CacheDefaultsSpec extends AnyWordSpec with Matchers {
  "isCacheableMethod" should {
    "return true for GET" in {
      val defaults = new StubCache(false)
      defaults.isCacheableMethod("GET") must be(true)
    }

    "return true for HEAD" in {
      val defaults = new StubCache(false)
      defaults.isCacheableMethod("HEAD") must be(true)
    }

    "return false for POST" in {
      val defaults = new StubCache(false)
      defaults.isCacheableMethod("POST") must be(false)
    }
  }
}
