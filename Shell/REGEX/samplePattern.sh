#!/bin/bash

shopt -s extglob
echo "read anythinh ends with thing"
read words

if [[ $words == +(some|any)thing ]] 
then 
	echo yes;
else
	echo no;
fi
