#! /usr/bin/env python3

from os import walk, path, rename
from re import findall

textures_dir = "src\\main\\resources\\assets\\essentialadditions\\textures\\items"

for root, _, files in walk(textures_dir):
    for file in files:
        if file.endswith(".png"):
            name_sections = findall("[A-Z][^A-Z]*", file)
            new_name = "_".join(name_sections)
            final_name = new_name[:-1].lower()
            print(path.join(root, file) + " => renamed => " + path.join(root, final_name))
            rename(path.join(root, file), path.join(root, final_name))
