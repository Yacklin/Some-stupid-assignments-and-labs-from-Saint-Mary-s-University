# Yilin Huang A00475433

#create empty list to help us calculate
container = []

#accept the values from user
for i in range(5):
    number = int(input(f"please enter number {i+1}"))
    container.append(number)
# calculate the average of the given numbers
average = sum(container)/len(container)

# calculate the standard deviation of the given numbers
temp = 0
for k in container:
    temp += (k - average)**2

print(f"the average of given values is {average}")
print(f"the standard deviation of it is {(temp/len(container))**0.5}")
