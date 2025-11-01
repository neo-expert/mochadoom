#!/bin/bash

mvn package &&
java -jar target/mochadoom-1.jar $@

