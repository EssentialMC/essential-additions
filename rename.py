#! /usr/bin/env python3

from os import walk, path, rename
from re import findall

for root, _, files in walk(".\\"):
    for file in files:
        if file.endswith(".png"):
            nameSections = findall("[A-Z][^A-Z]*", file)
            newName = ""
            for section in nameSections:
                newName += section.lower() + "_"
            finalName = newName[:-1]
            print(path.join(root, file) + " ==> " + path.join(root, finalName))
            rename(path.join(root, file), path.join(root, finalName))
