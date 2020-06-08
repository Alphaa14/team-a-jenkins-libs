#!/usr/bin/env groovy
def call(name) {
	node() {
		echo String.format(“Hello ${name}”)
	}
}
