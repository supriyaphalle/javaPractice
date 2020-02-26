#!/bin/bash

shopt -s extglob

read -p "Enter pattern " pattern

if [[ $pattern =~ ^([0-9]*[A-Za-z]{3}[0-9A-Za-z]*)$ ]]
then
	echo valid;
else
	echo Invalid;
fi
