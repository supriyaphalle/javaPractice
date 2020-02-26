#!/bin/bash -x
shopt -s extglob
echo "Enter Word ending with thing"
read word

pattern="^([1-9]*[a-zA-Z]{3}[0-9a-zA-Z]*)$"
pinCode="^[1-9]{1}[0-9]{2}[[:space:]]?{1}[0-9]{3}$"

emailPat="^[a-zA-Z]{3,}[0-9a-zA-Z_-.+]{3,}[@]{1}[a-zA-Z0-9]*[.][a-zA-Z]{2,4}$"
if [[ $word =~ $emailPat ]]
then
echo "Valid"
else
echo "InValid"
fi
