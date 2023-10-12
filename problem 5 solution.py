#Yilin Huang A00475433
Hourly_rate = float(input("Enter your hourly rate: "))
Consulting_time = float(input("Enter the time you used in consulting (minutes): "))
Income = float(input("Enter the income you made: "))


def Fee_Calculator(income, consulting_time, hourly_rate):
    charge = 0
    if income <= 20000:
        if consulting_time <= 60:
            pass
        else:
            charge += 0.4 * hourly_rate * (consulting_time - 60) / 60
    else:
        if consulting_time <= 30:
            pass
        else:
            charge += 0.8 * hourly_rate * (consulting_time - 30) / 60
    return charge


print(f"you will be charged ${Fee_Calculator(Income,Consulting_time,Hourly_rate)}")
# i haven't added the filters to filter out unreasonable inputs from user but i will do it in the future