
player1 = input("What is Player 1's name? ")
player2 = input("What is Player 2's name? ")


player1_answer = input(player1 + ", do you want to choose rock, paper or scissors? ").lower()
player2_answer = input(player2 + ", do you want to choose rock, paper or scissors? ").lower()


if player1_answer == player2_answer:
    print("Tie")
elif player1_answer == 'rock':
    if player2 == 'scissors':
        print("The player who chose rock wins")
    else:
        print("The player who chose paper wins")
elif player1_answer == 'scissors':
    if player2_answer == 'paper':
        print("The player who chose scissors wins")
    else:
        print("The player who chose rock wins")
elif player1_answer == 'paper':
    if player2_answer == 'rock':
        print("The player who chose paper wins")
    else:
        print("The player who chose scissors wins")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")