# uri-template [![Build Status](https://travis-ci.org/NewMotion/uri-template.png?branch=master)](https://travis-ci.org/NewMotion/uri-template)

URI Template
=============
Complete implementation of [RFC-6570 (uri-templates)](http://tools.ietf.org/html/rfc6570) in Scala

[Apache 2 Licenced](http://www.apache.org/licenses/LICENSE-2.0)

Example of usage (see the tests for more)
--------------------------------------------------

	import uritemplate._
	import Syntax._
	
	val template = URITemplate("http://example.com/hello/{variable}")
	val expanded = template expand ("variable" := "world")
	
	expanded == "http://example.com/hello/world"

Dependencies
------------

SBT:
	
	libraryDependencies += "com.newmotion" %% "uri-template" % "1.0.3-SNAPSHOT"