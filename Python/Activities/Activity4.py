#Rock,scissiors,paper game,continue play
while True:
    player1 = input("Enter player1 name: ")
    player2 = input("Enter player2 name: ")
    player1_answer = input(player1 + ",do you want to choose Rock, paper or scissors? ").lower()
    player2_answer = input(player2 + ",do you want to choose Rock, paper or scissors? ").lower()
    if player1_answer==player2_answer:
        print("Both answered: "+player1_answer )
    elif player1_answer =='rock' :
        if player2_answer =='scissors':
            print("Rock wins")
        else:
            print("Paper wins")
    elif player1_answer =='scissors':
        if  player2_answer =='paper':
            print("Scisors wins")
        else:
            print("Rock wins")
    elif player1_answer =='paper' :
        if player2_answer =='rock' :
            print("paper wins") 
        else:
            print("Scissors wins") 
    else:
        print("invalid input try again")

    repeat = input("Would you like to plan again? Yes/No: ").lower()
    if(repeat == "yes"):
        pass
    elif(repeat == "no"):
        raise SystemExit
    else:
        print("Entered invalid option.exiting from game")
        raise SystemExit



