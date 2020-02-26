#!/bin/bash -x

echo "Welcome to the Snake and Ladder Simulation"
declare -A  position

#CONSTANT
NO_PLAY=0;
LADDER=1
SNAKE=2;
WINNING_POSITION=8

#Variables
#position[$player]=0
dice=0
player


function playOption() {
	die=$((RANDOM%6+1))
	option=$((RANDOM%3))
	((dice++))
	case $option in
		$NO_PLAY)
				position[$player]=${position[$player]}
				;;
		$LADDER)
				position[$player]=$((${position[$player]}+$die))
				;;
		$SNAKE)
				position[$player]=$((${position[$player]}-$die))
	esac
}

function checkPosition() {
	if ((${position[$player]}<0))
	then
		position[$player]=0
	elif ((${position[$player]} >$WINNING_POSITION))
	then
			position[$player]=$((${position[$player]}-$die))
	fi
}

function switchPlayer() {
	if (( $player==1))
	then
		player=2
	else
		player=1
	fi
}

function startGame() {
	player=1
	position[$player]=0
	player=2
	position[$player]=0
while (( ${position[$player]}<$WINNING_POSITION))
do
	playOption
	echo $dice
	checkPosition
	if ((${position[$player]} == $WINNING_POSITION))
	then
		echo " Winner is $player"
		break;
	fi
	switchPlayer
done
}


startGame
