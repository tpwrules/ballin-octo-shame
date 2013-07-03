#!/bin/bash

mkdir -p build

rm -r forge/mcp/src/minecraft/tpw_rules

cp -r src/tpw_rules forge/mcp/src/minecraft/tpw_rules

cd forge/mcp/bin
scalac -classpath client_161.jar -sourcepath ../src -d minecraft/ ../src/minecraft/tpw_rules/crappymod/*.scala
cd ..
./reobfuscate.sh

cd ../..

mkdir -p build/zip
rm -r build/zip/*
mkdir build/zip/tpw_rules

cp -r forge/mcp/reobf/minecraft/tpw_rules build/zip/

cp -r assets build/zip/assets

cp pack.mcmeta mcmod.info build/zip

cd build/zip
rm ../crappymod.zip
zip -r ../crappymod.zip *
cd ../..

cp build/crappymod.zip ~/Library/Application\ Support/minecraft/mods/