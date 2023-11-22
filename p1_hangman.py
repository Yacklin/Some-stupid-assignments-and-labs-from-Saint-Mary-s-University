import random
lettersGuessed = []
alphabet = "abcdefghijklmnopqrstuvwxyz"
num_guesses = 8
WORDLIST_FILENAME = "words.txt"
def loadWords():
    print("Loading word list from file...")
    inFile = open(WORDLIST_FILENAME, 'r')
    line = inFile.readline()
    wordlist = line.split()
    print("  ", len(wordlist), "words loaded.")
    return wordlist

def chooseWord(wordlist):
    return random.choice(wordlist)

wordlist = loadWords()
def isWordGuessed(secretWord, lettersGuessed):
    flag =True
    for i in secretWord:
        if i not in lettersGuessed:
            flag = False
        else:
            pass
    return flag

def getGuessedWord(secretWord, lettersGuessed):
    container = "_" * len(secretWord)
    for i in lettersGuessed:
        if i in list(secretWord):
            container=container[:list(secretWord).index(i)]+i+container[list(secretWord).index(i)+1:]
    return container

#Define a function called hangman that takes in a secretWord as an argument
def hangman(secretWord):
    #Declare global variables num_guesses and lettersGuessed
    global num_guesses, lettersGuessed
    #Print a welcome message
    print("Welcome to the game, Hangman!")
    #Print a statement about the secretWord
    print("i am thinking of a word that is " + str(len(secretWord)) + " letters long")
    #Print a separator
    print("-------------")
    #Loop until the secretWord is guessed or the number of guesses runs out
    while not isWordGuessed(secretWord, lettersGuessed) and num_guesses != 0:
        #Print the number of guesses left
        print("You have " + str(num_guesses) + " guesses left")
        #Print the available letters
        print("Available letters: ", alphabet)
        #Prompt the user for a guess
        tryPerRound = input("Please guess a letter: ").lower()
        #Check if the guess is in the secretWord
        if tryPerRound in secretWord:
            #If the guess is in the secretWord, add it to the list of lettersGuessed
            lettersGuessed.append(tryPerRound)
            #Remove the guess from the list of available letters
            alphabet.replace(tryPerRound, "")
            #Print a message indicating a correct guess
            print("Good guess:", getGuessedWord(secretWord,lettersGuessed))
            #Continue the loop
            continue
        #Check if the guess has already been guessed
        if tryPerRound in lettersGuessed:
            #If the guess has already been guessed, print a message indicating the guess
            print("Oops! You've already guessed that letter:", getGuessedWord(secretWord,lettersGuessed))
            #Continue the loop
            continue
        #Check if the guess is not in the secretWord
        if tryPerRound not in secretWord:
            #If the guess is not in the secretWord, remove it from the list of available letters
            alphabet.replace(tryPerRound, "")
            #Add the guess to the list of lettersGuessed
            lettersGuessed.append(tryPerRound)
            #Decrement the number of guesses
            num_guesses -= 1
            #Print a message indicating an incorrect guess
            print("Oops! That letter is not in my word: ", getGuessedWord(secretWord,lettersGuessed))
        #If the guess is in the secretWord, do nothing
        else:
            pass
        #Print a separator
        print("-------------")
    #If the number of guesses runs out
    if num_guesses==0:
        #Print a message indicating the user lost
        print("Sorry, you ran out of guesses. The word was ", secretWord)
    #If the secretWord is guessed
    else:
        #Print a message indicating the user won
        print("Congratulations, you won!")

#Call the hangman function with the secretWord from the chooseWord function
hangman(chooseWord(wordlist).lower())