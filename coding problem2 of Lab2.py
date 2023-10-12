#this is a triangle area calculator
#interactive version
#prepared by Yilin Huang A00475433

#accept value from user

def Area_Calculator_of_Triangle1():
    x1 = int(input("please enter the X co-ordinate of first point"))
    y1 = int(input("please enter the Y co-ordinate of first point"))
    x2 = int(input("please enter the X co-ordinate of second point"))
    y2 = int(input("please enter the Y co-ordinate of secon "))
    x3 = int(input("please enter the X co-ordinate of third point"))
    y3 = int(input("please enter the Y co-ordinate of third point"))
    #print out the area
    print(f"the area of the triangle given is {0.5*abs(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))}")


def Area_Calculator_of_Triangle2():
    x1 = int(input("please enter the X co-ordinate of first point"))
    y1 = int(input("please enter the Y co-ordinate of first point"))
    x2 = int(input("please enter the X co-ordinate of second point"))
    y2 = int(input("please enter the Y co-ordinate of secon "))
    x3 = int(input("please enter the X co-ordinate of third point"))
    y3 = int(input("please enter the Y co-ordinate of third point"))
    # print out the area
    return (0.5 * abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)))

#put the A,B,C given in description then we can get 10.0
print(f"the area is {Area_Calculator_of_Triangle2()}")
Area_Calculator_of_Triangle1()

