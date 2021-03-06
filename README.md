# mde2017
University exercises in Model-driven Engineering

## Branches
There are two active branches:

 * `master` is used to develop the UI-agnostic part of the exercises, for example the Ecore model and OCL constraints.
 * `gmf` contains the GMF diagram editor.

# Exercise 1
In exercise 1 I developed a domain model for representing coding contests, and some OCL constraints to go with that.
A diagram editor for creating coding contest models is maintained on branch `gmf`.

Tag `ue1` is what I handed in.

# Exercise 2
In exercise 2 I developed model-to-model and model-to-text transformations for the coding contest model.

Tag `ue2` is what I handed in.

# Exercise 3
In exercise 3 I developed a model validation script for the betting manager model.

Tag `ue3` is what I handed in.

# Exercise 4
In this exercise I evolved the coding contest model with the following changes.

 * Rename type `Entry` to `Team` and its attribute `teamName` to `name`.
 * Move attribute `localDate` from the `Contest` class to the `Location` class.
 * Remove the `category` attribute from the `Coder` class, and also remove the `Category` enum.
 * Change the multiplicity of the `organizer` containment reference to accept arbitrarily many organizers.
