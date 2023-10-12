# Yilin Huang A00475433
# calculation function of fibonacci
def fibonacci(number):
    # base case
    if number == 1:
        return 1
    if number == 2:
        return 1
    else:
        return fibonacci(number-1) + fibonacci(number-2)


# main
while True:
    # filter out unsuitable number from user and keep asking until suitable
    userInput = int(input("please enter an integer greater than 0"))
    if userInput <= 0:
        print("sorry, it is not allowed. Try again please.")
        continue
    else:
        break
print(fibonacci(userInput))