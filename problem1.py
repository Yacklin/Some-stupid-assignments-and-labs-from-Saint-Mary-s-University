"""This function calculates and return the windchill index for the given
       temperature `t` in degree celcius and wind velocity `v` in km/h using
       the following formula:
       13.12 + 0.6215 t  - 11.37 v^0.16 + 0.3965 t v^0.16
       Author: Yilin Huang A00475433
       Example:
       get_windchill_index(-10, 10)
       -15
       get_windchill_index(5, 80)
       -3
       get_windchill_index(5, 15)
       2
    """
temperature = float(input("please enter temperature in degree celcius."))
velocity = float(input("please enter velocity of wind in km/hour."))
def get_windchill_index(temp, velo):
    return 13.12+0.6215*temp-11.37*velo**0.16+0.3965*temp*velo**0.16
print(f"{get_windchill_index(temperature, velocity):0.0F}")

#test
print("---------------------")
print(f"{get_windchill_index(-10, 10):0.0F}")
print(f"{get_windchill_index(5, 80):0.0F}")
print(f"{get_windchill_index(5, 15):0.0F}")