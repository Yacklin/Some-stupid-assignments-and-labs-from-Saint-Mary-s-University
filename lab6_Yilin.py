
def Conversion_factor01(list_container) -> list:
    '''
    receive a list of values in degree Fahrenheit
    return a list of values in degree Celsius
    :param list_container:
    :return:
    '''
    for i in range(len(list_container)):
        list_container[i] = (list_container[i]-32)*5/9
    return list_container


def Conversion_factor02(list_container) -> list:
    '''
    receive a list of values in degree Celsius
    return a list of values in degree Fahrenheit
    :param list_container:
    :return:
    '''
    return [(Fahr-32)*9/5 for Fahr in list_container[:]]

original_list = [32, 21, 100, 1000, 101]

#original list should be like this
print(original_list)

# conversion02 will not change the list
print(Conversion_factor02(original_list))

print(original_list)

# but conversion01 will change the original list because use of indexing can change reference in the list
print((Conversion_factor01(original_list)))

print(original_list)