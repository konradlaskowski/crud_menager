#!/bin/bash

version=$(grep -oP '<version>\K[0-9]+\.[0-9]+\.[0-9]+(?=</version>)' pom.xml)

echo $version > wersja.txt
