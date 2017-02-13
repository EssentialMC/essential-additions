#! /usr/bin/env python3

from os import walk, path
from json import dump

textures_dir = "src\\main\\resources\\assets\\essentialadditions\\textures\\items"
models_path = "src\\main\\resources\\assets\\essentialadditions\\models\\item"

item_model = {"parent": "builtin/generated", "textures": {"layer0": ""}, "display": {"thirdperson": {"rotation": [-90, 0, 0], "translation": [0, 1, -3], "scale": [0.55, 0.55, 0.55]}, "firstperson": {"rotation": [0, -135, 25], "translation": [0, 4, 2], "scale": [1.7, 1.7, 1.7]}}}

for root, _, files in walk(textures_dir):
    for file in files:
        if file.endswith(".png"):
            base_name = file.replace(".png", "")
            new_model = item_model
            new_model["textures"]["layer0"] = "essentialadditions:items/" + base_name
            with open(path.join(models_path, base_name + ".json"), "w") as model:
                dump(new_model, model, indent=4)
            print(path.join(root, file) + " <= mapped => " +
                  path.join(models_path, base_name + ".json"))
